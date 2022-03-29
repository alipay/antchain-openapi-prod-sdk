// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueryMetricsBacklogRequest extends TeaModel {
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
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    public static QueryMetricsBacklogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricsBacklogRequest self = new QueryMetricsBacklogRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricsBacklogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMetricsBacklogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMetricsBacklogRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryMetricsBacklogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMetricsBacklogRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
