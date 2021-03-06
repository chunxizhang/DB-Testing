// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PersonFactory.proto

package com.phei.netty.skread.server;

public final class MessageReadReturnProto {
  private MessageReadReturnProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MessageReadReturnOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required int32 msgID = 1;
    /**
     * <code>required int32 msgID = 1;</code>
     */
    boolean hasMsgID();
    /**
     * <code>required int32 msgID = 1;</code>
     */
    int getMsgID();

    // required int64 timestamp = 2;
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    boolean hasTimestamp();
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    long getTimestamp();

    // required float tps = 3;
    /**
     * <code>required float tps = 3;</code>
     */
    boolean hasTps();
    /**
     * <code>required float tps = 3;</code>
     */
    float getTps();

    // required float time1 = 4;
    /**
     * <code>required float time1 = 4;</code>
     */
    boolean hasTime1();
    /**
     * <code>required float time1 = 4;</code>
     */
    float getTime1();

    // required float time2 = 5;
    /**
     * <code>required float time2 = 5;</code>
     */
    boolean hasTime2();
    /**
     * <code>required float time2 = 5;</code>
     */
    float getTime2();

    // required float time3 = 6;
    /**
     * <code>required float time3 = 6;</code>
     */
    boolean hasTime3();
    /**
     * <code>required float time3 = 6;</code>
     */
    float getTime3();

    // required float time4 = 7;
    /**
     * <code>required float time4 = 7;</code>
     */
    boolean hasTime4();
    /**
     * <code>required float time4 = 7;</code>
     */
    float getTime4();

    // required float time5 = 8;
    /**
     * <code>required float time5 = 8;</code>
     */
    boolean hasTime5();
    /**
     * <code>required float time5 = 8;</code>
     */
    float getTime5();
  }
  /**
   * Protobuf type {@code MessageReadReturn}
   */
  public static final class MessageReadReturn extends
      com.google.protobuf.GeneratedMessage
      implements MessageReadReturnOrBuilder {
    // Use MessageReadReturn.newBuilder() to construct.
    private MessageReadReturn(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MessageReadReturn(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MessageReadReturn defaultInstance;
    public static MessageReadReturn getDefaultInstance() {
      return defaultInstance;
    }

    public MessageReadReturn getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MessageReadReturn(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              msgID_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              timestamp_ = input.readInt64();
              break;
            }
            case 29: {
              bitField0_ |= 0x00000004;
              tps_ = input.readFloat();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000008;
              time1_ = input.readFloat();
              break;
            }
            case 45: {
              bitField0_ |= 0x00000010;
              time2_ = input.readFloat();
              break;
            }
            case 53: {
              bitField0_ |= 0x00000020;
              time3_ = input.readFloat();
              break;
            }
            case 61: {
              bitField0_ |= 0x00000040;
              time4_ = input.readFloat();
              break;
            }
            case 69: {
              bitField0_ |= 0x00000080;
              time5_ = input.readFloat();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.phei.netty.skread.server.MessageReadReturnProto.internal_static_MessageReadReturn_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.phei.netty.skread.server.MessageReadReturnProto.internal_static_MessageReadReturn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn.class, com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn.Builder.class);
    }

    public static com.google.protobuf.Parser<MessageReadReturn> PARSER =
        new com.google.protobuf.AbstractParser<MessageReadReturn>() {
      public MessageReadReturn parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageReadReturn(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MessageReadReturn> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required int32 msgID = 1;
    public static final int MSGID_FIELD_NUMBER = 1;
    private int msgID_;
    /**
     * <code>required int32 msgID = 1;</code>
     */
    public boolean hasMsgID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 msgID = 1;</code>
     */
    public int getMsgID() {
      return msgID_;
    }

    // required int64 timestamp = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long timestamp_;
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 timestamp = 2;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }

    // required float tps = 3;
    public static final int TPS_FIELD_NUMBER = 3;
    private float tps_;
    /**
     * <code>required float tps = 3;</code>
     */
    public boolean hasTps() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required float tps = 3;</code>
     */
    public float getTps() {
      return tps_;
    }

    // required float time1 = 4;
    public static final int TIME1_FIELD_NUMBER = 4;
    private float time1_;
    /**
     * <code>required float time1 = 4;</code>
     */
    public boolean hasTime1() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required float time1 = 4;</code>
     */
    public float getTime1() {
      return time1_;
    }

    // required float time2 = 5;
    public static final int TIME2_FIELD_NUMBER = 5;
    private float time2_;
    /**
     * <code>required float time2 = 5;</code>
     */
    public boolean hasTime2() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required float time2 = 5;</code>
     */
    public float getTime2() {
      return time2_;
    }

    // required float time3 = 6;
    public static final int TIME3_FIELD_NUMBER = 6;
    private float time3_;
    /**
     * <code>required float time3 = 6;</code>
     */
    public boolean hasTime3() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required float time3 = 6;</code>
     */
    public float getTime3() {
      return time3_;
    }

    // required float time4 = 7;
    public static final int TIME4_FIELD_NUMBER = 7;
    private float time4_;
    /**
     * <code>required float time4 = 7;</code>
     */
    public boolean hasTime4() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>required float time4 = 7;</code>
     */
    public float getTime4() {
      return time4_;
    }

    // required float time5 = 8;
    public static final int TIME5_FIELD_NUMBER = 8;
    private float time5_;
    /**
     * <code>required float time5 = 8;</code>
     */
    public boolean hasTime5() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>required float time5 = 8;</code>
     */
    public float getTime5() {
      return time5_;
    }

    private void initFields() {
      msgID_ = 0;
      timestamp_ = 0L;
      tps_ = 0F;
      time1_ = 0F;
      time2_ = 0F;
      time3_ = 0F;
      time4_ = 0F;
      time5_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasMsgID()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimestamp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTps()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime1()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime2()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime3()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime4()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTime5()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, msgID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, timestamp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFloat(3, tps_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeFloat(4, time1_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFloat(5, time2_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeFloat(6, time3_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeFloat(7, time4_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeFloat(8, time5_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, msgID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, timestamp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, tps_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, time1_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, time2_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, time3_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, time4_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(8, time5_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code MessageReadReturn}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturnOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.phei.netty.skread.server.MessageReadReturnProto.internal_static_MessageReadReturn_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.phei.netty.skread.server.MessageReadReturnProto.internal_static_MessageReadReturn_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn.class, com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn.Builder.class);
      }

      // Construct using com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        msgID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        tps_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        time1_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000008);
        time2_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000010);
        time3_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000020);
        time4_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000040);
        time5_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.phei.netty.skread.server.MessageReadReturnProto.internal_static_MessageReadReturn_descriptor;
      }

      public com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn getDefaultInstanceForType() {
        return com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn.getDefaultInstance();
      }

      public com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn build() {
        com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn buildPartial() {
        com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn result = new com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.msgID_ = msgID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.tps_ = tps_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.time1_ = time1_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.time2_ = time2_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.time3_ = time3_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.time4_ = time4_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.time5_ = time5_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn) {
          return mergeFrom((com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn other) {
        if (other == com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn.getDefaultInstance()) return this;
        if (other.hasMsgID()) {
          setMsgID(other.getMsgID());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasTps()) {
          setTps(other.getTps());
        }
        if (other.hasTime1()) {
          setTime1(other.getTime1());
        }
        if (other.hasTime2()) {
          setTime2(other.getTime2());
        }
        if (other.hasTime3()) {
          setTime3(other.getTime3());
        }
        if (other.hasTime4()) {
          setTime4(other.getTime4());
        }
        if (other.hasTime5()) {
          setTime5(other.getTime5());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMsgID()) {
          
          return false;
        }
        if (!hasTimestamp()) {
          
          return false;
        }
        if (!hasTps()) {
          
          return false;
        }
        if (!hasTime1()) {
          
          return false;
        }
        if (!hasTime2()) {
          
          return false;
        }
        if (!hasTime3()) {
          
          return false;
        }
        if (!hasTime4()) {
          
          return false;
        }
        if (!hasTime5()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.phei.netty.skread.server.MessageReadReturnProto.MessageReadReturn) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required int32 msgID = 1;
      private int msgID_ ;
      /**
       * <code>required int32 msgID = 1;</code>
       */
      public boolean hasMsgID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 msgID = 1;</code>
       */
      public int getMsgID() {
        return msgID_;
      }
      /**
       * <code>required int32 msgID = 1;</code>
       */
      public Builder setMsgID(int value) {
        bitField0_ |= 0x00000001;
        msgID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 msgID = 1;</code>
       */
      public Builder clearMsgID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        msgID_ = 0;
        onChanged();
        return this;
      }

      // required int64 timestamp = 2;
      private long timestamp_ ;
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000002;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 timestamp = 2;</code>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      // required float tps = 3;
      private float tps_ ;
      /**
       * <code>required float tps = 3;</code>
       */
      public boolean hasTps() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required float tps = 3;</code>
       */
      public float getTps() {
        return tps_;
      }
      /**
       * <code>required float tps = 3;</code>
       */
      public Builder setTps(float value) {
        bitField0_ |= 0x00000004;
        tps_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float tps = 3;</code>
       */
      public Builder clearTps() {
        bitField0_ = (bitField0_ & ~0x00000004);
        tps_ = 0F;
        onChanged();
        return this;
      }

      // required float time1 = 4;
      private float time1_ ;
      /**
       * <code>required float time1 = 4;</code>
       */
      public boolean hasTime1() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required float time1 = 4;</code>
       */
      public float getTime1() {
        return time1_;
      }
      /**
       * <code>required float time1 = 4;</code>
       */
      public Builder setTime1(float value) {
        bitField0_ |= 0x00000008;
        time1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float time1 = 4;</code>
       */
      public Builder clearTime1() {
        bitField0_ = (bitField0_ & ~0x00000008);
        time1_ = 0F;
        onChanged();
        return this;
      }

      // required float time2 = 5;
      private float time2_ ;
      /**
       * <code>required float time2 = 5;</code>
       */
      public boolean hasTime2() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required float time2 = 5;</code>
       */
      public float getTime2() {
        return time2_;
      }
      /**
       * <code>required float time2 = 5;</code>
       */
      public Builder setTime2(float value) {
        bitField0_ |= 0x00000010;
        time2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float time2 = 5;</code>
       */
      public Builder clearTime2() {
        bitField0_ = (bitField0_ & ~0x00000010);
        time2_ = 0F;
        onChanged();
        return this;
      }

      // required float time3 = 6;
      private float time3_ ;
      /**
       * <code>required float time3 = 6;</code>
       */
      public boolean hasTime3() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required float time3 = 6;</code>
       */
      public float getTime3() {
        return time3_;
      }
      /**
       * <code>required float time3 = 6;</code>
       */
      public Builder setTime3(float value) {
        bitField0_ |= 0x00000020;
        time3_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float time3 = 6;</code>
       */
      public Builder clearTime3() {
        bitField0_ = (bitField0_ & ~0x00000020);
        time3_ = 0F;
        onChanged();
        return this;
      }

      // required float time4 = 7;
      private float time4_ ;
      /**
       * <code>required float time4 = 7;</code>
       */
      public boolean hasTime4() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>required float time4 = 7;</code>
       */
      public float getTime4() {
        return time4_;
      }
      /**
       * <code>required float time4 = 7;</code>
       */
      public Builder setTime4(float value) {
        bitField0_ |= 0x00000040;
        time4_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float time4 = 7;</code>
       */
      public Builder clearTime4() {
        bitField0_ = (bitField0_ & ~0x00000040);
        time4_ = 0F;
        onChanged();
        return this;
      }

      // required float time5 = 8;
      private float time5_ ;
      /**
       * <code>required float time5 = 8;</code>
       */
      public boolean hasTime5() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>required float time5 = 8;</code>
       */
      public float getTime5() {
        return time5_;
      }
      /**
       * <code>required float time5 = 8;</code>
       */
      public Builder setTime5(float value) {
        bitField0_ |= 0x00000080;
        time5_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required float time5 = 8;</code>
       */
      public Builder clearTime5() {
        bitField0_ = (bitField0_ & ~0x00000080);
        time5_ = 0F;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MessageReadReturn)
    }

    static {
      defaultInstance = new MessageReadReturn(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MessageReadReturn)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageReadReturn_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MessageReadReturn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023PersonFactory.proto\"\215\001\n\021MessageReadRet" +
      "urn\022\r\n\005msgID\030\001 \002(\005\022\021\n\ttimestamp\030\002 \002(\003\022\013\n" +
      "\003tps\030\003 \002(\002\022\r\n\005time1\030\004 \002(\002\022\r\n\005time2\030\005 \002(\002" +
      "\022\r\n\005time3\030\006 \002(\002\022\r\n\005time4\030\007 \002(\002\022\r\n\005time5\030" +
      "\010 \002(\002B6\n\034com.phei.netty.skread.serverB\026M" +
      "essageReadReturnProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_MessageReadReturn_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_MessageReadReturn_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_MessageReadReturn_descriptor,
              new java.lang.String[] { "MsgID", "Timestamp", "Tps", "Time1", "Time2", "Time3", "Time4", "Time5", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
