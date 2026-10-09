// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class ExecBlockchainBotIotagentPluginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // dt-plugin
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // audio_scribe
    @NameInMap("target_plugin_id")
    @Validation(required = true)
    public String targetPluginId;

    @NameInMap("message_type")
    @Validation(required = true)
    public String messageType;

    // 业务数据，JSON格式
    @NameInMap("payload")
    @Validation(required = true)
    public String payload;

    // Unix Epoch 毫秒
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    public static ExecBlockchainBotIotagentPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainBotIotagentPluginRequest self = new ExecBlockchainBotIotagentPluginRequest();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainBotIotagentPluginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecBlockchainBotIotagentPluginRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecBlockchainBotIotagentPluginRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ExecBlockchainBotIotagentPluginRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ExecBlockchainBotIotagentPluginRequest setTargetPluginId(String targetPluginId) {
        this.targetPluginId = targetPluginId;
        return this;
    }
    public String getTargetPluginId() {
        return this.targetPluginId;
    }

    public ExecBlockchainBotIotagentPluginRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public ExecBlockchainBotIotagentPluginRequest setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    public String getPayload() {
        return this.payload;
    }

    public ExecBlockchainBotIotagentPluginRequest setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
