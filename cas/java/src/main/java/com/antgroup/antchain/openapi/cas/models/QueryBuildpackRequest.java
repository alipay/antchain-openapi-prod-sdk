// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryBuildpackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 技术栈版本
    @NameInMap("bp_version")
    public String bpVersion;

    // 是否分页，默认为true
    @NameInMap("by_page")
    public Boolean byPage;

    // 组件ID
    @NameInMap("component_id")
    public String componentId;

    // 配置ID
    @NameInMap("config_id")
    public String configId;

    // 页码：默认值为1，表示第一页
    @NameInMap("current_page")
    public Long currentPage;

    // 部署脚本id
    @NameInMap("deploy_script_id")
    public String deployScriptId;

    // 技术栈ID标识
    @NameInMap("id")
    public String id;

    // 是否包含模板
    @NameInMap("include_template")
    public Boolean includeTemplate;

    // 技术栈名称
    @NameInMap("name")
    public String name;

    // 每页返回个数
    @NameInMap("page_size")
    public Long pageSize;

    // 查询名称过滤方式
    // 模糊查询 FUZZY
    // 精准匹配 ACCURATE
    // 前缀查询 START_WITH
    @NameInMap("query_type")
    public String queryType;

    // 所属技术栈类别ID
    @NameInMap("stack_id")
    public String stackId;

    // 技术栈状态
    @NameInMap("status")
    public String status;

    // 技术栈定义类型
    // 系统模板 TEMPLATE,
    // 用户自定义 CUSTOM,
    // 后台服务 BACKGROUND_SERVICE
    @NameInMap("types")
    public java.util.List<String> types;

    // 工作空间
    @NameInMap("workspace")
    public String workspace;

    public static QueryBuildpackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackRequest self = new QueryBuildpackRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBuildpackRequest setBpVersion(String bpVersion) {
        this.bpVersion = bpVersion;
        return this;
    }
    public String getBpVersion() {
        return this.bpVersion;
    }

    public QueryBuildpackRequest setByPage(Boolean byPage) {
        this.byPage = byPage;
        return this;
    }
    public Boolean getByPage() {
        return this.byPage;
    }

    public QueryBuildpackRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public QueryBuildpackRequest setConfigId(String configId) {
        this.configId = configId;
        return this;
    }
    public String getConfigId() {
        return this.configId;
    }

    public QueryBuildpackRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryBuildpackRequest setDeployScriptId(String deployScriptId) {
        this.deployScriptId = deployScriptId;
        return this;
    }
    public String getDeployScriptId() {
        return this.deployScriptId;
    }

    public QueryBuildpackRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryBuildpackRequest setIncludeTemplate(Boolean includeTemplate) {
        this.includeTemplate = includeTemplate;
        return this;
    }
    public Boolean getIncludeTemplate() {
        return this.includeTemplate;
    }

    public QueryBuildpackRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryBuildpackRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryBuildpackRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryBuildpackRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public QueryBuildpackRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryBuildpackRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public QueryBuildpackRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
