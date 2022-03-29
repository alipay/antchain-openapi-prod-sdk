// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetSofamqTracebymsgidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  查询的时间范围的起始时间点
    @NameInMap("begin_time")
    @Validation(required = true)
    public Long beginTime;

    // 需要查询的单元
    @NameInMap("cell")
    public String cell;

    // 查询的时间范围的结束时间点
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 需查询的消息的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 需查询的消息的 ID，即 Message ID
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 需查询的消息的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static GetSofamqTracebymsgidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSofamqTracebymsgidRequest self = new GetSofamqTracebymsgidRequest();
        return TeaModel.build(map, self);
    }

    public GetSofamqTracebymsgidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSofamqTracebymsgidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetSofamqTracebymsgidRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetSofamqTracebymsgidRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public GetSofamqTracebymsgidRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetSofamqTracebymsgidRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSofamqTracebymsgidRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public GetSofamqTracebymsgidRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
