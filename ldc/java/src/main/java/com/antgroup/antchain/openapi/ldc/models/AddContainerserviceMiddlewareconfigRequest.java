// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class AddContainerserviceMiddlewareconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 应用服务名
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 应用服务版本
    @NameInMap("container_service_revision")
    @Validation(required = true)
    public String containerServiceRevision;

    // 操作人账号
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 中间件配置
    @NameInMap("middleware_configs")
    @Validation(required = true)
    public java.util.List<String> middlewareConfigs;

    public static AddContainerserviceMiddlewareconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddContainerserviceMiddlewareconfigRequest self = new AddContainerserviceMiddlewareconfigRequest();
        return TeaModel.build(map, self);
    }

    public AddContainerserviceMiddlewareconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddContainerserviceMiddlewareconfigRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AddContainerserviceMiddlewareconfigRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public AddContainerserviceMiddlewareconfigRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public AddContainerserviceMiddlewareconfigRequest setContainerServiceRevision(String containerServiceRevision) {
        this.containerServiceRevision = containerServiceRevision;
        return this;
    }
    public String getContainerServiceRevision() {
        return this.containerServiceRevision;
    }

    public AddContainerserviceMiddlewareconfigRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public AddContainerserviceMiddlewareconfigRequest setMiddlewareConfigs(java.util.List<String> middlewareConfigs) {
        this.middlewareConfigs = middlewareConfigs;
        return this;
    }
    public java.util.List<String> getMiddlewareConfigs() {
        return this.middlewareConfigs;
    }

}
