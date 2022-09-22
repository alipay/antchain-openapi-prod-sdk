// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListFederationServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    // 命名空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 应用服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    public static ListFederationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFederationServiceRequest self = new ListFederationServiceRequest();
        return TeaModel.build(map, self);
    }

    public ListFederationServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListFederationServiceRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

    public ListFederationServiceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListFederationServiceRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

}
