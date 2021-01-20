// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppPlanRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 应用名称
    @NameInMap("app_name")
    public String appName;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 发布单 order_id
    @NameInMap("order_id")
    public String orderId;

    // 当前页码，从1开始，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 状态筛选列表
    @NameInMap("state_list")
    public java.util.List<String> stateList;

    // 工作空间名称
    @NameInMap("workspace")
    public String workspace;

    // 工作空间 id 列表
    @NameInMap("workspace_ids")
    public java.util.List<String> workspaceIds;

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

    public QueryAppPlanRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public QueryAppPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAppPlanRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAppPlanRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppPlanRequest setStateList(java.util.List<String> stateList) {
        this.stateList = stateList;
        return this;
    }
    public java.util.List<String> getStateList() {
        return this.stateList;
    }

    public QueryAppPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryAppPlanRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}
