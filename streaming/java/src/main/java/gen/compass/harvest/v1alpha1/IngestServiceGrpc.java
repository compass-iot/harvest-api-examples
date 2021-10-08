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
    public com.google.common.util.concurrent.ListenableFuture<compass.harvest.v1alpha1.Ingest.BatchInsertResponse> batchInsert(
        compass.harvest.v1alpha1.Ingest.BatchInsertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBatchInsertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSERT = 0;
  private static final int METHODID_BATCH_INSERT = 1;

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
              .addMethod(getBatchInsertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
