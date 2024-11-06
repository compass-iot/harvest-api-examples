package main

import (
	"context"
	"fmt"
	"log"
	"net/http"

	"buf.build/gen/go/compassiot/harvest/connectrpc/go/compass/harvest/v1alpha1/harvestv1alpha1connect"
	harvestv1alpha1 "buf.build/gen/go/compassiot/harvest/protocolbuffers/go/compass/harvest/v1alpha1"
	compassv1 "buf.build/gen/go/compassiot/model/protocolbuffers/go/compassiot/compass/v1"
	"connectrpc.com/connect"
	"github.com/davecgh/go-spew/spew"
	"google.golang.org/protobuf/types/known/timestamppb"
)

type authInterceptor struct {
	apikey string
}

func NewAuthInterceptor(key string) connect.Interceptor {
	return &authInterceptor{key}
}

func (interceptor authInterceptor) injectApiKey(h http.Header) {
	h.Set("Authorization", fmt.Sprintf("apikey %s", interceptor.apikey))
}

func (interceptor authInterceptor) WrapUnary(next connect.UnaryFunc) connect.UnaryFunc {
	return func(ctx context.Context, req connect.AnyRequest) (connect.AnyResponse, error) {
		interceptor.injectApiKey(req.Header())
		return next(ctx, req)
	}
}

func (interceptor authInterceptor) WrapStreamingClient(next connect.StreamingClientFunc) connect.StreamingClientFunc {
	return func(ctx context.Context, s connect.Spec) connect.StreamingClientConn {
		conn := next(ctx, s)
		interceptor.injectApiKey(conn.RequestHeader())
		return conn
	}
}

func (interceptor authInterceptor) WrapStreamingHandler(next connect.StreamingHandlerFunc) connect.StreamingHandlerFunc {
	return func(ctx context.Context, shc connect.StreamingHandlerConn) error {
		interceptor.injectApiKey(shc.RequestHeader())
		return next(ctx, shc)
	}
}

func main() {
	harvestUrl := "https://harvest.compassiot.cloud"
	apikey := "bc8760b6f6f12b8ada9fdfd4503e847f" // test API key
	opts := connect.WithInterceptors(NewAuthInterceptor(apikey))

	client := harvestv1alpha1connect.NewIngestServiceClient(http.DefaultClient, harvestUrl, opts)
	ctx := context.Background()

	// Prefer to use Insert() and BatchInsert(), compat variants are for old SDK
	// client.InsertCompat()
	// client.BatchInsertCompat()

	pe := compassv1.PositionEvent{
		VehicleId:     "abc123",
		VehicleType:   ptr(compassv1.VehicleType_CAR),
		TransportType: ptr(compassv1.TransportType_PRIVATE),
		Timestamp:     timestamppb.Now(),
		Acceleration: &compassv1.Acceleration{
			X: ptr(1.0),
			Y: ptr(2.0),
			Z: ptr(3.0),
		},
		Position: &compassv1.Position{
			Latlng: &compassv1.LatLng{
				Lat: 45,
				Lng: 90,
			},
			Speed: ptr(60.0),
		},
		Labels: map[string]string{
			"make":      "toyota",
			"something": "nice",
		},
	}

	// Single insert
	_, err := client.Insert(ctx, &connect.Request[compassv1.PositionEvent]{
		Msg: &pe,
	})
	if err != nil {
		log.Fatal(err)
	}

	// Batch insert
	res, err := client.BatchInsert(ctx, &connect.Request[harvestv1alpha1.BatchInsertRequest]{
		Msg: &harvestv1alpha1.BatchInsertRequest{
			Events: []*compassv1.PositionEvent{&pe, &pe},
		},
	})
	// For batch insert, err should be nil unless it's a network / transport error
	if err != nil {
		log.Fatal(err)
	}
	// For batch insert, if Msg.Errors is empty, it means there are no errors
	if len(res.Msg.Errors) > 0 {
		spew.Dump(res.Msg.Errors)
	}
	spew.Dump("Success writing to Harvest")
}

// Utility function to get the pointer of a value
func ptr[T any](x T) *T {
	return &x
}
