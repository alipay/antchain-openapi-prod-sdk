// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class SendSofamqMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 目标单元
    @NameInMap("cell")
    public String cell;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 消息的 Message Key
    @NameInMap("key")
    public String key;

    //  消息内容
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    // 消息 Tag
    @NameInMap("tag")
    public String tag;

    // 需要发送的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // 使用的Schema的版本号
    @NameInMap("schema_version")
    public Long schemaVersion;

    // 消息属性 key-value
    @NameInMap("properties")
    public String properties;

    public static SendSofamqMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSofamqMessageRequest self = new SendSofamqMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendSofamqMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendSofamqMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendSofamqMessageRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public SendSofamqMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendSofamqMessageRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public SendSofamqMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendSofamqMessageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendSofamqMessageRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public SendSofamqMessageRequest setSchemaVersion(Long schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public Long getSchemaVersion() {
        return this.schemaVersion;
    }

    public SendSofamqMessageRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
