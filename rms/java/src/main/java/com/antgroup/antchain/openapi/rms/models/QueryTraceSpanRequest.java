// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceSpanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 搜索的毫秒开始时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 最大的毫秒开始时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 按traceId搜索时会用到 此时其他条件自动失效
    @NameInMap("trace_id")
    public String traceId;

    // 如果指定了app, 那么是 localServiceName or remoteServiceName 的效果, 任何一个命中了都行
    @NameInMap("app")
    public String app;

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

    // 总页数，小于0或不填代表第一次查询，用来获取总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 总数，小于0或不填代表第一次查询，用来获取总数
    @NameInMap("total_size")
    public Long totalSize;

    // 排序字段
    @NameInMap("sort_by")
    public String sortBy;

    // 排序是否逆序
    @NameInMap("sort_reverse")
    public Boolean sortReverse;

    // 传递需要过滤的字段
    @NameInMap("filter")
    public TraceQuerySummary filter;

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

    public QueryTraceSpanRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
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

    public QueryTraceSpanRequest setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryTraceSpanRequest setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryTraceSpanRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public QueryTraceSpanRequest setSortReverse(Boolean sortReverse) {
        this.sortReverse = sortReverse;
        return this;
    }
    public Boolean getSortReverse() {
        return this.sortReverse;
    }

    public QueryTraceSpanRequest setFilter(TraceQuerySummary filter) {
        this.filter = filter;
        return this;
    }
    public TraceQuerySummary getFilter() {
        return this.filter;
    }

}
