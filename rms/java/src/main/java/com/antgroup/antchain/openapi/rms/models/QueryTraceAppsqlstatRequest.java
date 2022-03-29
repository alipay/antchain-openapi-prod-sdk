// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceAppsqlstatRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 应用名
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 开始毫秒时间戳
    @NameInMap("start_time")
    @Validation(required = true)
    public Long startTime;

    // 结束毫秒时间戳
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 排序字段
    @NameInMap("sort_by")
    public String sortBy;

    // 排序是否逆序
    @NameInMap("sort_reverse")
    public Boolean sortReverse;

    // 分页页数
    @NameInMap("page_number")
    public Long pageNumber;

    // 每页记录条数
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryTraceAppsqlstatRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAppsqlstatRequest self = new QueryTraceAppsqlstatRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceAppsqlstatRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraceAppsqlstatRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryTraceAppsqlstatRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryTraceAppsqlstatRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryTraceAppsqlstatRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTraceAppsqlstatRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public QueryTraceAppsqlstatRequest setSortReverse(Boolean sortReverse) {
        this.sortReverse = sortReverse;
        return this;
    }
    public Boolean getSortReverse() {
        return this.sortReverse;
    }

    public QueryTraceAppsqlstatRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryTraceAppsqlstatRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
