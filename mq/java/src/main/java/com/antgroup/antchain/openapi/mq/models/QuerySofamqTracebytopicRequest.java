// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySofamqTracebytopicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询的时间范围的起始时间点
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

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 需查询的消息的 Topic
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QuerySofamqTracebytopicRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySofamqTracebytopicRequest self = new QuerySofamqTracebytopicRequest();
        return TeaModel.build(map, self);
    }

    public QuerySofamqTracebytopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySofamqTracebytopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySofamqTracebytopicRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QuerySofamqTracebytopicRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QuerySofamqTracebytopicRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QuerySofamqTracebytopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySofamqTracebytopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
