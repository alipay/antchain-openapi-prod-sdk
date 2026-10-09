// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class PushBlockchainBotIotagentAudioscribeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // string
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    @NameInMap("type")
    @Validation(required = true)
    public String type;

    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    @NameInMap("target_plugin_id")
    @Validation(required = true)
    public String targetPluginId;

    // 如： audio_push、status_query、detail_query、asr_retry、summary_retry
    @NameInMap("message_type")
    @Validation(required = true)
    public String messageType;

    // 业务字段，JSON格式
    @NameInMap("payload")
    @Validation(required = true)
    public String payload;

    // Unix Epoch 毫秒
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static PushBlockchainBotIotagentAudioscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBlockchainBotIotagentAudioscribeRequest self = new PushBlockchainBotIotagentAudioscribeRequest();
        return TeaModel.build(map, self);
    }

    public PushBlockchainBotIotagentAudioscribeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setTargetPluginId(String targetPluginId) {
        this.targetPluginId = targetPluginId;
        return this;
    }
    public String getTargetPluginId() {
        return this.targetPluginId;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public PushBlockchainBotIotagentAudioscribeRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
