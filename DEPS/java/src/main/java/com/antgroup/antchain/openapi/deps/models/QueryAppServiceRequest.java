// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 根据应用名称查询，不能为空，不支持一次性查询所有应用
    @NameInMap("app_name")
    public String appName;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    @NameInMap("orders")
    public java.util.List<String> orders;

    // 当前页码，从1开始，默认为1
    @NameInMap("page_num")
    public Long pageNum;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 工作空间列表
    @NameInMap("workspace_ids")
    public java.util.List<String> workspaceIds;

    public static QueryAppServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppServiceRequest self = new QueryAppServiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAppServiceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryAppServiceRequest setOrders(java.util.List<String> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<String> getOrders() {
        return this.orders;
    }

    public QueryAppServiceRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAppServiceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppServiceRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}
