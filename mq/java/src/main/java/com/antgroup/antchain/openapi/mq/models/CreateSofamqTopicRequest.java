// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqTopicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需创建的 Topic 所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 消息类型。取值说明如下：0：普通消息；1：分区顺序消息；2：全局顺序消息；4：事务消息；5：定时/延时消息。
    @NameInMap("message_type")
    @Validation(required = true)
    public Long messageType;

    // Topic 的备注信息
    @NameInMap("remark")
    public String remark;

    // 需创建的 Topic 的名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    // Topic对应Schema的兼容性策略
    @NameInMap("schema_compatibility")
    public String schemaCompatibility;

    // Topic对应Schema的序列化方式
    @NameInMap("schema_serialization")
    public String schemaSerialization;

    // Topic 所属的应用名称，要求 app name 在 zappinfo 上可查
    @NameInMap("owner")
    public String owner;

    public static CreateSofamqTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqTopicRequest self = new CreateSofamqTopicRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqTopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqTopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSofamqTopicRequest setMessageType(Long messageType) {
        this.messageType = messageType;
        return this;
    }
    public Long getMessageType() {
        return this.messageType;
    }

    public CreateSofamqTopicRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSofamqTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public CreateSofamqTopicRequest setSchemaCompatibility(String schemaCompatibility) {
        this.schemaCompatibility = schemaCompatibility;
        return this;
    }
    public String getSchemaCompatibility() {
        return this.schemaCompatibility;
    }

    public CreateSofamqTopicRequest setSchemaSerialization(String schemaSerialization) {
        this.schemaSerialization = schemaSerialization;
        return this;
    }
    public String getSchemaSerialization() {
        return this.schemaSerialization;
    }

    public CreateSofamqTopicRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
