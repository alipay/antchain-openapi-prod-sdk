// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceMetricsRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // sum或none
    @NameInMap("aggregator")
    public String aggregator;

    // 结束毫秒时间戳
    @NameInMap("end_time")
    public Long endTime;

    // 开始毫秒时间戳
    @NameInMap("start_time")
    public Long startTime;

    // metrics字段名称
    @NameInMap("metrics")
    public java.util.List<String> metrics;

    // 扩展字段tags
    @NameInMap("tags")
    public java.util.List<KeyValuePair> tags;

    // metrics类型
    @NameInMap("type")
    public String type;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    public static QueryTraceMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceMetricsRequest self = new QueryTraceMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceMetricsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceMetricsRequest setAggregator(String aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public String getAggregator() {
        return this.aggregator;
    }

    public QueryTraceMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTraceMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryTraceMetricsRequest setMetrics(java.util.List<String> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<String> getMetrics() {
        return this.metrics;
    }

    public QueryTraceMetricsRequest setTags(java.util.List<KeyValuePair> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeyValuePair> getTags() {
        return this.tags;
    }

    public QueryTraceMetricsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryTraceMetricsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
