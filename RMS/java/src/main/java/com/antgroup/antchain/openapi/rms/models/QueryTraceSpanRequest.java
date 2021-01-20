// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceSpanRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 按traceId搜索时会用到 此时其他条件自动失效
    @NameInMap("trace_id")
    public String traceId;

    // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
    @NameInMap("app")
    public String app;

    // 搜索的毫秒开始时间戳
    @NameInMap("start_time")
    public Long startTime;

    // 最大的毫秒开始时间戳
    @NameInMap("end_time")
    public Long endTime;

    // 最小毫秒耗时
    @NameInMap("min_duration")
    public Long minDuration;

    // 最大毫秒耗时
    @NameInMap("max_duration")
    public Long maxDuration;

    // 分页号
    @NameInMap("current_page")
    public Long currentPage;

    // 每页记录条数
    @NameInMap("page_size")
    public Long pageSize;

    // 用来动态传递一些tags或条件匹配, 有一些key是保留的, 服务端会进行特殊解释, 其他的则会认为是要对tags做精确匹配.
    @NameInMap("tags")
    public java.util.List<KeySet> tags;

    // 工作空间
    @NameInMap("workspace_name")
    public String workspaceName;

    public static QueryTraceSpanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceSpanRequest self = new QueryTraceSpanRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceSpanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceSpanRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryTraceSpanRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public QueryTraceSpanRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryTraceSpanRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTraceSpanRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public QueryTraceSpanRequest setMaxDuration(Long maxDuration) {
        this.maxDuration = maxDuration;
        return this;
    }
    public Long getMaxDuration() {
        return this.maxDuration;
    }

    public QueryTraceSpanRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTraceSpanRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTraceSpanRequest setTags(java.util.List<KeySet> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<KeySet> getTags() {
        return this.tags;
    }

    public QueryTraceSpanRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
