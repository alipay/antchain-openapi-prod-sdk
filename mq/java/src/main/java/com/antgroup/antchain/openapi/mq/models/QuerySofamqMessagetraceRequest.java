// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqMessagetraceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需要查询的Cell名
    @NameInMap("cell")
    public String cell;

    // 需查询的消息所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 需查询消息轨迹的消息 ID，即 Message ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 消息的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QuerySofamqMessagetraceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqMessagetraceRequest self = new QuerySofamqMessagetraceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqMessagetraceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqMessagetraceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqMessagetraceRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqMessagetraceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqMessagetraceRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public QuerySofamqMessagetraceRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
