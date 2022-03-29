// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DescribeRmsTimeseriesmetricsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // sum或none
    @NameInMap("aggregator")
    @Validation(required = true)
    public String aggregator;

    // 结束毫秒时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // metrics字段名称
    @NameInMap("metrics")
    @Validation(required = true)
    public java.util.List<StringValue> metrics;

    // 开始毫秒时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 扩展字段tags
    @NameInMap("tags")
    public java.util.List<KeyValuePair> tags;

    // metrics类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // workspace_id或workspace_name选填一个
    @NameInMap("workspace_id")
    public Long workspaceId;

    // workspace_id或workspace_name选填一个
    @NameInMap("workspace_name")
    public String workspaceName;

    public static DescribeRmsTimeseriesmetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRmsTimeseriesmetricsRequest self = new DescribeRmsTimeseriesmetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRmsTimeseriesmetricsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DescribeRmsTimeseriesmetricsRequest setAggregator(String aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public String getAggregator() {
        return this.aggregator;
    }

    public DescribeRmsTimeseriesmetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeRmsTimeseriesmetricsRequest setMetrics(java.util.List<StringValue> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<StringValue> getMetrics() {
        return this.metrics;
    }

    public DescribeRmsTimeseriesmetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeRmsTimeseriesmetricsRequest setTags(java.util.List<KeyValuePair> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeyValuePair> getTags() {
        return this.tags;
    }

    public DescribeRmsTimeseriesmetricsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeRmsTimeseriesmetricsRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public DescribeRmsTimeseriesmetricsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
