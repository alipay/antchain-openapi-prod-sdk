// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryAppServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 根据应用名称查询，不能为空，不支持一次性查询所有应用，是精准查询，不支持模糊匹配
    @NameInMap("app_name")
    @Validation(required = true)
    public String appName;

    // 容器服务名
    @NameInMap("container_service_name")
    public String containerServiceName;

    // 当前页码，从1开始，默认为1
    @NameInMap("current_page")
    public Long currentPage;

    // 部署状态
    @NameInMap("deployment_states")
    public java.util.List<String> deploymentStates;

    // 所属命名空间
    @NameInMap("namespace")
    public String namespace;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    @NameInMap("order")
    public String order;

    // 分页大小，默认为10
    @NameInMap("page_size")
    public Long pageSize;

    // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 container_service_name
    @NameInMap("query_type")
    public String queryType;

    // 工作空间组id列表
    @NameInMap("workspace_group_names")
    public java.util.List<String> workspaceGroupNames;

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

    public QueryAppServiceRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public QueryAppServiceRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAppServiceRequest setDeploymentStates(java.util.List<String> deploymentStates) {
        this.deploymentStates = deploymentStates;
        return this;
    }
    public java.util.List<String> getDeploymentStates() {
        return this.deploymentStates;
    }

    public QueryAppServiceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAppServiceRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryAppServiceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAppServiceRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryAppServiceRequest setWorkspaceGroupNames(java.util.List<String> workspaceGroupNames) {
        this.workspaceGroupNames = workspaceGroupNames;
        return this;
    }
    public java.util.List<String> getWorkspaceGroupNames() {
        return this.workspaceGroupNames;
    }

}
