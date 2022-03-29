// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsTopicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 结束时间
    // 
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 实例 ID
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 需要查询的 Topic 名称。如果 Topic 为 "ALL"，则查询当前租户下所有的 Topic 的数据。
    @NameInMap("topic")
    @Validation(required = true)
    public String topic;

    public static QueryMetricsTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsTopicRequest self = new QueryMetricsTopicRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricsTopicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMetricsTopicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMetricsTopicRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricsTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMetricsTopicRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryMetricsTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
