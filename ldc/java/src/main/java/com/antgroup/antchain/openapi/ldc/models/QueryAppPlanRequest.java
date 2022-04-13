// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryAppPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称，精准查询
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 当前页码，从1开始，默认为1
    @NameInMap("current_page")
    public Long currentPage;

    // 排序规则，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    @NameInMap("order")
    public String order;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 状态筛选列表
    @NameInMap("states")
    public java.util.List<String> states;

    // 查询指定发布单 timeseries_id 列表
    @NameInMap("timeseries_ids")
    public java.util.List<String> timeseriesIds;

    // 工作空间组id列表
    @NameInMap("workspace_group_names")
    public java.util.List<String> workspaceGroupNames;

    public static QueryAppPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppPlanRequest self = new QueryAppPlanRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppPlanRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppPlanRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppPlanRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryAppPlanRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppPlanRequest setStates(java.util.List<String> states) {
        this.states = states;
        return this;
    }
    public java.util.List<String> getStates() {
        return this.states;
    }

    public QueryAppPlanRequest setTimeseriesIds(java.util.List<String> timeseriesIds) {
        this.timeseriesIds = timeseriesIds;
        return this;
    }
    public java.util.List<String> getTimeseriesIds() {
        return this.timeseriesIds;
    }

    public QueryAppPlanRequest setWorkspaceGroupNames(java.util.List<String> workspaceGroupNames) {
        this.workspaceGroupNames = workspaceGroupNames;
        return this;
    }
    public java.util.List<String> getWorkspaceGroupNames() {
        return this.workspaceGroupNames;
    }

}
