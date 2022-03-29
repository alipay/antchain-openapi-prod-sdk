// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqTracebymsgkeyRequest extends TeaModel {
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

    //  需查询的消息的 Topic 所对应的实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    //  需查询的消息的 Message Key
    @NameInMap("msg_key")
    @Validation(required = true)
    public String msgKey;

    // 需查询的消息的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QuerySofamqTracebymsgkeyRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqTracebymsgkeyRequest self = new QuerySofamqTracebymsgkeyRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqTracebymsgkeyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqTracebymsgkeyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqTracebymsgkeyRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QuerySofamqTracebymsgkeyRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqTracebymsgkeyRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QuerySofamqTracebymsgkeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqTracebymsgkeyRequest setMsgKey(String msgKey) {
        this.msgKey = msgKey;
        return this;
    }
    public String getMsgKey() {
        return this.msgKey;
    }

    public QuerySofamqTracebymsgkeyRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
