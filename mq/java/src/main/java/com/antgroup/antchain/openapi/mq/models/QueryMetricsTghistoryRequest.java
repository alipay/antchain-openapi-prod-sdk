// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsTghistoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要查询的单元
    @NameInMap("cell")
    public String cell;

    // 结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 消费组 Group ID
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // Topic 名称
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QueryMetricsTghistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsTghistoryRequest self = new QueryMetricsTghistoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricsTghistoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMetricsTghistoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMetricsTghistoryRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QueryMetricsTghistoryRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricsTghistoryRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public QueryMetricsTghistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMetricsTghistoryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryMetricsTghistoryRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
