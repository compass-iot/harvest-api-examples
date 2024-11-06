package com.compassiot;

import build.buf.gen.compass.harvest.v1alpha1.BatchInsertRequest;
import build.buf.gen.compass.harvest.v1alpha1.IngestServiceGrpc;
import build.buf.gen.compassiot.compass.v1.*;
import com.google.common.base.Verify;
import com.google.protobuf.Timestamp;
import io.grpc.*;
import io.grpc.stub.MetadataUtils;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1. Setup auth
        String apiKey = "bc8760b6f6f12b8ada9fdfd4503e847f";
        Metadata headers = new Metadata();
        Metadata.Key<String> key = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
        headers.put(key, String.format("apikey %s", apiKey));
        ClientInterceptor authInterceptor =  MetadataUtils.newAttachHeadersInterceptor(headers);

        // 2. Setup client
        String url = "harvest.compassiot.cloud";
        Channel channel = ManagedChannelBuilder.forAddress(url, 443)
                .intercept(authInterceptor)
                .build();
        IngestServiceGrpc.IngestServiceBlockingStub client = IngestServiceGrpc.newBlockingStub(channel);

        // 3. Construct position event
        Instant now = Instant.now();
        Map<String, String> labels = new HashMap<>();
        labels.put("make", "toyota");
        labels.put("something", "nice");
        PositionEvent pe = PositionEvent.newBuilder()
                .setVehicleId("abcd123")
                .setVehicleType(VehicleType.CAR)
                .setTransportType(TransportType.PRIVATE)
                .setTimestamp(Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build())
                .setPosition(Position.newBuilder()
                        .setLatlng(LatLng.newBuilder()
                                .setLat(45)
                                .setLng(90)
                                .build())
                        .setSpeed(60.0)
                        .build())
                .setAcceleration(Acceleration.newBuilder()
                        .setX(1)
                        .setY(2)
                        .setZ(3)
                        .build())
                .putAllLabels(labels)
                .build();
        BatchInsertRequest batch = BatchInsertRequest.newBuilder()
                .addEvents(pe)
                .build();

        // For insert() need to catch exception to figure out cause
        try {
            client.insert(pe);
        } catch (Exception e) {
            // Do something with exception, see following for example:
            // https://github.com/grpc/grpc-java/blob/master/examples/src/main/java/io/grpc/examples/errorhandling/ErrorHandlingClient.java
            Status status = Status.fromThrowable(e);
            Verify.verify(status.getCode() == Status.Code.INTERNAL);
        }

        // batchInsert() will not throw an exception. Any errors will be propagated in batchResponse.errors
        var batchResponse = client.batchInsert(batch);
        if (batchResponse.getErrorsCount() > 0) {
            // Do error handling here
            System.out.println(batchResponse.getErrorsList());
        }
        System.out.println("Success writing to Harvest");
    }
}