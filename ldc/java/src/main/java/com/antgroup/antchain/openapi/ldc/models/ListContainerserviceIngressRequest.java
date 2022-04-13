// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListContainerserviceIngressRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 容器服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 命名空间名称
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static ListContainerserviceIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContainerserviceIngressRequest self = new ListContainerserviceIngressRequest();
        return TeaModel.build(map, self);
    }

    public ListContainerserviceIngressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListContainerserviceIngressRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ListContainerserviceIngressRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListContainerserviceIngressRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
