// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class PushSofamqMessageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 单元名称
    @NameInMap("cell")
    public String cell;

    // 需要接收消息的 Client ID
    @NameInMap("client_id")
    @Validation(required = true)
    public String clientId;

    // 需要 push 的消费组 Group ID
    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 需要 push 的消息 Message ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 需要发送的 Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static PushSofamqMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        PushSofamqMessageRequest self = new PushSofamqMessageRequest();
        return TeaModel.build(map, self);
    }

    public PushSofamqMessageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushSofamqMessageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushSofamqMessageRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public PushSofamqMessageRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public PushSofamqMessageRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public PushSofamqMessageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public PushSofamqMessageRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public PushSofamqMessageRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
