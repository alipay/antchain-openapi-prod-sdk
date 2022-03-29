// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryAgentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // 每页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // agent部署类型：容器CONTAINER、经典MACHINE
    @NameInMap("deploy_type")
    public String deployType;

    // 模糊搜索关键字
    @NameInMap("keyword")
    public String keyword;

    // app 模糊搜索关键字
    @NameInMap("app_keyword")
    public String appKeyword;

    // 服务 IP 模糊搜索关键字
    @NameInMap("service_ip_keyword")
    public String serviceIpKeyword;

    // 主机 IP 模糊搜索关键字
    @NameInMap("host_ip_keyword")
    public String hostIpKeyword;

    // agent 状态
    @NameInMap("status")
    public Long status;

    public static QueryAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentRequest self = new QueryAgentRequest();
        return TeaModel.build(map, self);
    }

    public QueryAgentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAgentRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public QueryAgentRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAgentRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryAgentRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public QueryAgentRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryAgentRequest setAppKeyword(String appKeyword) {
        this.appKeyword = appKeyword;
        return this;
    }
    public String getAppKeyword() {
        return this.appKeyword;
    }

    public QueryAgentRequest setServiceIpKeyword(String serviceIpKeyword) {
        this.serviceIpKeyword = serviceIpKeyword;
        return this;
    }
    public String getServiceIpKeyword() {
        return this.serviceIpKeyword;
    }

    public QueryAgentRequest setHostIpKeyword(String hostIpKeyword) {
        this.hostIpKeyword = hostIpKeyword;
        return this;
    }
    public String getHostIpKeyword() {
        return this.hostIpKeyword;
    }

    public QueryAgentRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
