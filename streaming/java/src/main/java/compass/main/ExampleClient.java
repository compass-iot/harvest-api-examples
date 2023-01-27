package compass.main;

import com.google.protobuf.Timestamp;
import compass.harvest.v1alpha1.IngestServiceGrpc;
import compass.harvest.v1alpha1.PositionEventOuterClass.*;
import compass.harvest.v1alpha1.Ingest.*;
import compass.type.geo.Geo;
import io.grpc.*;
import io.grpc.stub.MetadataUtils;

public class ExampleClient {

    public static void main(String[] args) {

        String url = "harvest-grpc.compassiot.cloud";
        String apiKey = "apikey bc8760b6f6f12b8ada9fdfd4503e847f";

        Channel ch = ManagedChannelBuilder.forAddress(url, 443).build();
        IngestServiceGrpc.IngestServiceBlockingStub client = IngestServiceGrpc.newBlockingStub(ch);

        Metadata header = new Metadata();
        Metadata.Key<String> key = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
        header.put(key, apiKey);
        client = MetadataUtils.attachHeaders(client, header);

        // See below for more extensive example usage of the partial harvest api
        // if you are NOT using the partial api and just using the start PositionEvent api
        // you may ignore this
        // https://github.com/compass-iot/harvest-api-examples/tree/main/streaming/curl
        PartialEventLatLng partialLatLngEvt = PartialEventLatLng
                .newBuilder()
                .setVehicleId("abc123")
                .setRegion("AUS")
                .setTimestamp(System.currentTimeMillis() / 1000)
                .setLatitude(-33.0)
                .setLongitude(151.0)
                .build();

        PositionEvent evt = PositionEvent
                .newBuilder()
                .setVehicleId("abc123")
                .setVehicleType(VehicleType.CAR)
                .setTransportType(TransportType.PRIVATE)
                .setTimestamp(Timestamp
                        .newBuilder()
                        .setSeconds(System.currentTimeMillis() / 1000)
                        .build())
                .setAcceleration(Acceleration
                        .newBuilder()
                        .setX(1)
                        .setY(2)
                        .setZ(3)
                        .build())
                .setPosition(Position
                        .newBuilder()
                        .setLatlng(Geo.LatLng
                                .newBuilder()
                                .setLatitude(45)
                                .setLongitude(90))
                        .setSpeed(60)
                )
                .setGyro(Gyro
                        .newBuilder()
                        .setRoll(-1)
                        .setPitch(-2)
                        .setYaw(-3))
                .putLabels("make", "toyota")
                .putLabels("something", "nice")
                .build();

        BatchInsertRequest evts = BatchInsertRequest
                .newBuilder()
                .addEvents(evt)
                .build();
        try {
            client.insert(evt);
            client.batchInsert(evts);
            client.insertPartialLatLng(partialLatLngEvt);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        System.out.println("Successfully pushed events via GRPC API!");
    }
}
