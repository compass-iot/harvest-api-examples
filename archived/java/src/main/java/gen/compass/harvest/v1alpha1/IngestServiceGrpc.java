package compass.harvest.v1alpha1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: compass/harvest/v1alpha1/ingest.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IngestServiceGrpc {

  private IngestServiceGrpc() {}

  public static final String SERVICE_NAME = "compass.harvest.v1alpha1.IngestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent,
      com.google.protobuf.Empty> getInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Insert",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent,
      com.google.protobuf.Empty> getInsertMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent, com.google.protobuf.Empty> getInsertMethod;
    if ((getInsertMethod = IngestServiceGrpc.getInsertMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertMethod = IngestServiceGrpc.getInsertMethod) == null) {
          IngestServiceGrpc.getInsertMethod = getInsertMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("Insert"))
              .build();
        }
      }
    }
    return getInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng,
      com.google.protobuf.Empty> getInsertPartialLatLngMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialLatLng",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng,
      com.google.protobuf.Empty> getInsertPartialLatLngMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng, com.google.protobuf.Empty> getInsertPartialLatLngMethod;
    if ((getInsertPartialLatLngMethod = IngestServiceGrpc.getInsertPartialLatLngMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialLatLngMethod = IngestServiceGrpc.getInsertPartialLatLngMethod) == null) {
          IngestServiceGrpc.getInsertPartialLatLngMethod = getInsertPartialLatLngMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialLatLng"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialLatLng"))
              .build();
        }
      }
    }
    return getInsertPartialLatLngMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration,
      com.google.protobuf.Empty> getInsertPartialEventAccelerationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialEventAcceleration",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration,
      com.google.protobuf.Empty> getInsertPartialEventAccelerationMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration, com.google.protobuf.Empty> getInsertPartialEventAccelerationMethod;
    if ((getInsertPartialEventAccelerationMethod = IngestServiceGrpc.getInsertPartialEventAccelerationMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialEventAccelerationMethod = IngestServiceGrpc.getInsertPartialEventAccelerationMethod) == null) {
          IngestServiceGrpc.getInsertPartialEventAccelerationMethod = getInsertPartialEventAccelerationMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialEventAcceleration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialEventAcceleration"))
              .build();
        }
      }
    }
    return getInsertPartialEventAccelerationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro,
      com.google.protobuf.Empty> getInsertPartialEventGyroMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialEventGyro",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro,
      com.google.protobuf.Empty> getInsertPartialEventGyroMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro, com.google.protobuf.Empty> getInsertPartialEventGyroMethod;
    if ((getInsertPartialEventGyroMethod = IngestServiceGrpc.getInsertPartialEventGyroMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialEventGyroMethod = IngestServiceGrpc.getInsertPartialEventGyroMethod) == null) {
          IngestServiceGrpc.getInsertPartialEventGyroMethod = getInsertPartialEventGyroMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialEventGyro"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialEventGyro"))
              .build();
        }
      }
    }
    return getInsertPartialEventGyroMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo,
      com.google.protobuf.Empty> getInsertPartialEventOdoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialEventOdo",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo,
      com.google.protobuf.Empty> getInsertPartialEventOdoMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo, com.google.protobuf.Empty> getInsertPartialEventOdoMethod;
    if ((getInsertPartialEventOdoMethod = IngestServiceGrpc.getInsertPartialEventOdoMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialEventOdoMethod = IngestServiceGrpc.getInsertPartialEventOdoMethod) == null) {
          IngestServiceGrpc.getInsertPartialEventOdoMethod = getInsertPartialEventOdoMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialEventOdo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialEventOdo"))
              .build();
        }
      }
    }
    return getInsertPartialEventOdoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge,
      com.google.protobuf.Empty> getInsertPartialEventFuelOrChargeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialEventFuelOrCharge",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge,
      com.google.protobuf.Empty> getInsertPartialEventFuelOrChargeMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge, com.google.protobuf.Empty> getInsertPartialEventFuelOrChargeMethod;
    if ((getInsertPartialEventFuelOrChargeMethod = IngestServiceGrpc.getInsertPartialEventFuelOrChargeMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialEventFuelOrChargeMethod = IngestServiceGrpc.getInsertPartialEventFuelOrChargeMethod) == null) {
          IngestServiceGrpc.getInsertPartialEventFuelOrChargeMethod = getInsertPartialEventFuelOrChargeMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialEventFuelOrCharge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialEventFuelOrCharge"))
              .build();
        }
      }
    }
    return getInsertPartialEventFuelOrChargeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV,
      com.google.protobuf.Empty> getInsertPartialEventMetadataKVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialEventMetadataKV",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV,
      com.google.protobuf.Empty> getInsertPartialEventMetadataKVMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV, com.google.protobuf.Empty> getInsertPartialEventMetadataKVMethod;
    if ((getInsertPartialEventMetadataKVMethod = IngestServiceGrpc.getInsertPartialEventMetadataKVMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialEventMetadataKVMethod = IngestServiceGrpc.getInsertPartialEventMetadataKVMethod) == null) {
          IngestServiceGrpc.getInsertPartialEventMetadataKVMethod = getInsertPartialEventMetadataKVMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialEventMetadataKV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialEventMetadataKV"))
              .build();
        }
      }
    }
    return getInsertPartialEventMetadataKVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON,
      com.google.protobuf.Empty> getInsertPartialEventMetadataJSONMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialEventMetadataJSON",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON,
      com.google.protobuf.Empty> getInsertPartialEventMetadataJSONMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON, com.google.protobuf.Empty> getInsertPartialEventMetadataJSONMethod;
    if ((getInsertPartialEventMetadataJSONMethod = IngestServiceGrpc.getInsertPartialEventMetadataJSONMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialEventMetadataJSONMethod = IngestServiceGrpc.getInsertPartialEventMetadataJSONMethod) == null) {
          IngestServiceGrpc.getInsertPartialEventMetadataJSONMethod = getInsertPartialEventMetadataJSONMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialEventMetadataJSON"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialEventMetadataJSON"))
              .build();
        }
      }
    }
    return getInsertPartialEventMetadataJSONMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV,
      com.google.protobuf.Empty> getInsertPartialVehicleMetadataKVMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialVehicleMetadataKV",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV,
      com.google.protobuf.Empty> getInsertPartialVehicleMetadataKVMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV, com.google.protobuf.Empty> getInsertPartialVehicleMetadataKVMethod;
    if ((getInsertPartialVehicleMetadataKVMethod = IngestServiceGrpc.getInsertPartialVehicleMetadataKVMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialVehicleMetadataKVMethod = IngestServiceGrpc.getInsertPartialVehicleMetadataKVMethod) == null) {
          IngestServiceGrpc.getInsertPartialVehicleMetadataKVMethod = getInsertPartialVehicleMetadataKVMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialVehicleMetadataKV"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialVehicleMetadataKV"))
              .build();
        }
      }
    }
    return getInsertPartialVehicleMetadataKVMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON,
      com.google.protobuf.Empty> getInsertPartialVehicleMetadataJSONMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertPartialVehicleMetadataJSON",
      requestType = compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON,
      com.google.protobuf.Empty> getInsertPartialVehicleMetadataJSONMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON, com.google.protobuf.Empty> getInsertPartialVehicleMetadataJSONMethod;
    if ((getInsertPartialVehicleMetadataJSONMethod = IngestServiceGrpc.getInsertPartialVehicleMetadataJSONMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getInsertPartialVehicleMetadataJSONMethod = IngestServiceGrpc.getInsertPartialVehicleMetadataJSONMethod) == null) {
          IngestServiceGrpc.getInsertPartialVehicleMetadataJSONMethod = getInsertPartialVehicleMetadataJSONMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertPartialVehicleMetadataJSON"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("InsertPartialVehicleMetadataJSON"))
              .build();
        }
      }
    }
    return getInsertPartialVehicleMetadataJSONMethod;
  }

  private static volatile io.grpc.MethodDescriptor<compass.harvest.v1alpha1.Ingest.BatchInsertRequest,
      compass.harvest.v1alpha1.Ingest.BatchInsertResponse> getBatchInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BatchInsert",
      requestType = compass.harvest.v1alpha1.Ingest.BatchInsertRequest.class,
      responseType = compass.harvest.v1alpha1.Ingest.BatchInsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<compass.harvest.v1alpha1.Ingest.BatchInsertRequest,
      compass.harvest.v1alpha1.Ingest.BatchInsertResponse> getBatchInsertMethod() {
    io.grpc.MethodDescriptor<compass.harvest.v1alpha1.Ingest.BatchInsertRequest, compass.harvest.v1alpha1.Ingest.BatchInsertResponse> getBatchInsertMethod;
    if ((getBatchInsertMethod = IngestServiceGrpc.getBatchInsertMethod) == null) {
      synchronized (IngestServiceGrpc.class) {
        if ((getBatchInsertMethod = IngestServiceGrpc.getBatchInsertMethod) == null) {
          IngestServiceGrpc.getBatchInsertMethod = getBatchInsertMethod =
              io.grpc.MethodDescriptor.<compass.harvest.v1alpha1.Ingest.BatchInsertRequest, compass.harvest.v1alpha1.Ingest.BatchInsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BatchInsert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.Ingest.BatchInsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  compass.harvest.v1alpha1.Ingest.BatchInsertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IngestServiceMethodDescriptorSupplier("BatchInsert"))
              .build();
        }
      }
    }
    return getBatchInsertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IngestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IngestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IngestServiceStub>() {
        @java.lang.Override
        public IngestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IngestServiceStub(channel, callOptions);
        }
      };
    return IngestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IngestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IngestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IngestServiceBlockingStub>() {
        @java.lang.Override
        public IngestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IngestServiceBlockingStub(channel, callOptions);
        }
      };
    return IngestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IngestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IngestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IngestServiceFutureStub>() {
        @java.lang.Override
        public IngestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IngestServiceFutureStub(channel, callOptions);
        }
      };
    return IngestServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class IngestServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void insert(compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialLatLng(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialLatLngMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialEventAcceleration(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialEventAccelerationMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialEventGyro(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialEventGyroMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialEventOdo(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialEventOdoMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialEventFuelOrCharge(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialEventFuelOrChargeMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialEventMetadataKV(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialEventMetadataKVMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialEventMetadataJSON(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialEventMetadataJSONMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialVehicleMetadataKV(compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialVehicleMetadataKVMethod(), responseObserver);
    }

    /**
     */
    public void insertPartialVehicleMetadataJSON(compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertPartialVehicleMetadataJSONMethod(), responseObserver);
    }

    /**
     */
    public void batchInsert(compass.harvest.v1alpha1.Ingest.BatchInsertRequest request,
        io.grpc.stub.StreamObserver<compass.harvest.v1alpha1.Ingest.BatchInsertResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBatchInsertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInsertMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT)))
          .addMethod(
            getInsertPartialLatLngMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_LAT_LNG)))
          .addMethod(
            getInsertPartialEventAccelerationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_EVENT_ACCELERATION)))
          .addMethod(
            getInsertPartialEventGyroMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_EVENT_GYRO)))
          .addMethod(
            getInsertPartialEventOdoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_EVENT_ODO)))
          .addMethod(
            getInsertPartialEventFuelOrChargeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_EVENT_FUEL_OR_CHARGE)))
          .addMethod(
            getInsertPartialEventMetadataKVMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_EVENT_METADATA_KV)))
          .addMethod(
            getInsertPartialEventMetadataJSONMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_EVENT_METADATA_JSON)))
          .addMethod(
            getInsertPartialVehicleMetadataKVMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_VEHICLE_METADATA_KV)))
          .addMethod(
            getInsertPartialVehicleMetadataJSONMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON,
                com.google.protobuf.Empty>(
                  this, METHODID_INSERT_PARTIAL_VEHICLE_METADATA_JSON)))
          .addMethod(
            getBatchInsertMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                compass.harvest.v1alpha1.Ingest.BatchInsertRequest,
                compass.harvest.v1alpha1.Ingest.BatchInsertResponse>(
                  this, METHODID_BATCH_INSERT)))
          .build();
    }
  }

  /**
   */
  public static final class IngestServiceStub extends io.grpc.stub.AbstractAsyncStub<IngestServiceStub> {
    private IngestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IngestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IngestServiceStub(channel, callOptions);
    }

    /**
     */
    public void insert(compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialLatLng(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialLatLngMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialEventAcceleration(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialEventAccelerationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialEventGyro(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialEventGyroMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialEventOdo(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialEventOdoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialEventFuelOrCharge(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialEventFuelOrChargeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialEventMetadataKV(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialEventMetadataKVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialEventMetadataJSON(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialEventMetadataJSONMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialVehicleMetadataKV(compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialVehicleMetadataKVMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertPartialVehicleMetadataJSON(compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertPartialVehicleMetadataJSONMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void batchInsert(compass.harvest.v1alpha1.Ingest.BatchInsertRequest request,
        io.grpc.stub.StreamObserver<compass.harvest.v1alpha1.Ingest.BatchInsertResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBatchInsertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IngestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<IngestServiceBlockingStub> {
    private IngestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IngestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IngestServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty insert(compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialLatLng(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialLatLngMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialEventAcceleration(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialEventAccelerationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialEventGyro(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialEventGyroMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialEventOdo(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialEventOdoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialEventFuelOrCharge(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialEventFuelOrChargeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialEventMetadataKV(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialEventMetadataKVMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialEventMetadataJSON(compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialEventMetadataJSONMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialVehicleMetadataKV(compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialVehicleMetadataKVMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty insertPartialVehicleMetadataJSON(compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertPartialVehicleMetadataJSONMethod(), getCallOptions(), request);
    }

    /**
     */
    public compass.harvest.v1alpha1.Ingest.BatchInsertResponse batchInsert(compass.harvest.v1alpha1.Ingest.BatchInsertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBatchInsertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IngestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<IngestServiceFutureStub> {
    private IngestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IngestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IngestServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insert(
        compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialLatLng(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialLatLngMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialEventAcceleration(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialEventAccelerationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialEventGyro(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialEventGyroMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialEventOdo(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialEventOdoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialEventFuelOrCharge(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialEventFuelOrChargeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialEventMetadataKV(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialEventMetadataKVMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialEventMetadataJSON(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialEventMetadataJSONMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialVehicleMetadataKV(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialVehicleMetadataKVMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> insertPartialVehicleMetadataJSON(
        compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertPartialVehicleMetadataJSONMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<compass.harvest.v1alpha1.Ingest.BatchInsertResponse> batchInsert(
        compass.harvest.v1alpha1.Ingest.BatchInsertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchInsertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSERT = 0;
  private static final int METHODID_INSERT_PARTIAL_LAT_LNG = 1;
  private static final int METHODID_INSERT_PARTIAL_EVENT_ACCELERATION = 2;
  private static final int METHODID_INSERT_PARTIAL_EVENT_GYRO = 3;
  private static final int METHODID_INSERT_PARTIAL_EVENT_ODO = 4;
  private static final int METHODID_INSERT_PARTIAL_EVENT_FUEL_OR_CHARGE = 5;
  private static final int METHODID_INSERT_PARTIAL_EVENT_METADATA_KV = 6;
  private static final int METHODID_INSERT_PARTIAL_EVENT_METADATA_JSON = 7;
  private static final int METHODID_INSERT_PARTIAL_VEHICLE_METADATA_KV = 8;
  private static final int METHODID_INSERT_PARTIAL_VEHICLE_METADATA_JSON = 9;
  private static final int METHODID_BATCH_INSERT = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IngestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IngestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSERT:
          serviceImpl.insert((compass.harvest.v1alpha1.PositionEventOuterClass.PositionEvent) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_LAT_LNG:
          serviceImpl.insertPartialLatLng((compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventLatLng) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_EVENT_ACCELERATION:
          serviceImpl.insertPartialEventAcceleration((compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventAcceleration) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_EVENT_GYRO:
          serviceImpl.insertPartialEventGyro((compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventGyro) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_EVENT_ODO:
          serviceImpl.insertPartialEventOdo((compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventOdo) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_EVENT_FUEL_OR_CHARGE:
          serviceImpl.insertPartialEventFuelOrCharge((compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventFuelOrCharge) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_EVENT_METADATA_KV:
          serviceImpl.insertPartialEventMetadataKV((compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataKV) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_EVENT_METADATA_JSON:
          serviceImpl.insertPartialEventMetadataJSON((compass.harvest.v1alpha1.PositionEventOuterClass.PartialEventMetadataJSON) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_VEHICLE_METADATA_KV:
          serviceImpl.insertPartialVehicleMetadataKV((compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataKV) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INSERT_PARTIAL_VEHICLE_METADATA_JSON:
          serviceImpl.insertPartialVehicleMetadataJSON((compass.harvest.v1alpha1.PositionEventOuterClass.PartialVehicleMetadataJSON) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH_INSERT:
          serviceImpl.batchInsert((compass.harvest.v1alpha1.Ingest.BatchInsertRequest) request,
              (io.grpc.stub.StreamObserver<compass.harvest.v1alpha1.Ingest.BatchInsertResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class IngestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IngestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return compass.harvest.v1alpha1.Ingest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IngestService");
    }
  }

  private static final class IngestServiceFileDescriptorSupplier
      extends IngestServiceBaseDescriptorSupplier {
    IngestServiceFileDescriptorSupplier() {}
  }

  private static final class IngestServiceMethodDescriptorSupplier
      extends IngestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IngestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (IngestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IngestServiceFileDescriptorSupplier())
              .addMethod(getInsertMethod())
              .addMethod(getInsertPartialLatLngMethod())
              .addMethod(getInsertPartialEventAccelerationMethod())
              .addMethod(getInsertPartialEventGyroMethod())
              .addMethod(getInsertPartialEventOdoMethod())
              .addMethod(getInsertPartialEventFuelOrChargeMethod())
              .addMethod(getInsertPartialEventMetadataKVMethod())
              .addMethod(getInsertPartialEventMetadataJSONMethod())
              .addMethod(getInsertPartialVehicleMetadataKVMethod())
              .addMethod(getInsertPartialVehicleMetadataJSONMethod())
              .addMethod(getBatchInsertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
