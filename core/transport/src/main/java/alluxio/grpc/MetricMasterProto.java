// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/metric_master.proto

package alluxio.grpc;

public final class MetricMasterProto {
  private MetricMasterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_metric_MetricsHeartbeatPOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_metric_ClientMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_metric_ClientMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_metric_MetricsHeartbeatPRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_alluxio_grpc_metric_MetricsHeartbeatPResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030grpc/metric_master.proto\022\023alluxio.grpc" +
      ".metric\032\021grpc/common.proto\"U\n\030MetricsHea" +
      "rtbeatPOptions\0229\n\rclientMetrics\030\001 \003(\0132\"." +
      "alluxio.grpc.metric.ClientMetrics\"Z\n\rCli" +
      "entMetrics\022\020\n\010clientId\030\001 \001(\t\022\020\n\010hostname" +
      "\030\002 \001(\t\022%\n\007metrics\030\003 \003(\0132\024.alluxio.grpc.M" +
      "etric\"Z\n\030MetricsHeartbeatPRequest\022>\n\007opt" +
      "ions\030\001 \001(\0132-.alluxio.grpc.metric.Metrics" +
      "HeartbeatPOptions\"\033\n\031MetricsHeartbeatPRe" +
      "sponse2\217\001\n\032MetricsMasterClientService\022q\n" +
      "\020MetricsHeartbeat\022-.alluxio.grpc.metric." +
      "MetricsHeartbeatPRequest\032..alluxio.grpc." +
      "metric.MetricsHeartbeatPResponseB#\n\014allu" +
      "xio.grpcB\021MetricMasterProtoP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          alluxio.grpc.CommonProto.getDescriptor(),
        }, assigner);
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_metric_MetricsHeartbeatPOptions_descriptor,
        new java.lang.String[] { "ClientMetrics", });
    internal_static_alluxio_grpc_metric_ClientMetrics_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_alluxio_grpc_metric_ClientMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_metric_ClientMetrics_descriptor,
        new java.lang.String[] { "ClientId", "Hostname", "Metrics", });
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_metric_MetricsHeartbeatPRequest_descriptor,
        new java.lang.String[] { "Options", });
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_alluxio_grpc_metric_MetricsHeartbeatPResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_alluxio_grpc_metric_MetricsHeartbeatPResponse_descriptor,
        new java.lang.String[] { });
    alluxio.grpc.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
