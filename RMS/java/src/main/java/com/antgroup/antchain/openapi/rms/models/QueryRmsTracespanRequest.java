// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsTracespanRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
    @NameInMap("app")
    public String app;

    // 最大的毫秒开始时间戳
    @NameInMap("end_time")
    public Long endTime;

    // 万能扩展字段
    @NameInMap("extensions")
    public java.util.List<KeySet> extensions;

    // 最大毫秒耗时
    @NameInMap("max_duration")
    public Long maxDuration;

    // 最小毫秒耗时
    @NameInMap("min_duration")
    public Long minDuration;

    // 分页号
    @NameInMap("page_number")
    public Long pageNumber;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 搜索的毫秒开始时间戳
    @NameInMap("start_time")
    public Long startTime;

    // 结果码
    @NameInMap("status")
    public String status;

    // 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
    @NameInMap("tags")
    public java.util.List<KeySet> tags;

    // 按traceId搜索时会用到 此时其他条件自动失效
    @NameInMap("trace_id")
    public String traceId;

    // workspace_id
    @NameInMap("workspace_id")
    public Long workspaceId;

    public static QueryRmsTracespanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsTracespanRequest self = new QueryRmsTracespanRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsTracespanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsTracespanRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueryRmsTracespanRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryRmsTracespanRequest setExtensions(java.util.List<KeySet> extensions) {
        this.extensions = extensions;
        return this;
    }
    public java.util.List<KeySet> getExtensions() {
        return this.extensions;
    }

    public QueryRmsTracespanRequest setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public Long getMaxDuration() {
        return this.maxDuration;
    }

    public QueryRmsTracespanRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public QueryRmsTracespanRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryRmsTracespanRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRmsTracespanRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryRmsTracespanRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryRmsTracespanRequest setTags(java.util.List<KeySet> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeySet> getTags() {
        return this.tags;
    }

    public QueryRmsTracespanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryRmsTracespanRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
