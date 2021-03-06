// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface FreePRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.FreePRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   ** the path of the file or directory 
   * </pre>
   *
   * <code>optional string path = 1;</code>
   */
  boolean hasPath();
  /**
   * <pre>
   ** the path of the file or directory 
   * </pre>
   *
   * <code>optional string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <pre>
   ** the path of the file or directory 
   * </pre>
   *
   * <code>optional string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>optional .alluxio.grpc.file.FreePOptions options = 2;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.file.FreePOptions options = 2;</code>
   */
  alluxio.grpc.FreePOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.file.FreePOptions options = 2;</code>
   */
  alluxio.grpc.FreePOptionsOrBuilder getOptionsOrBuilder();
}
