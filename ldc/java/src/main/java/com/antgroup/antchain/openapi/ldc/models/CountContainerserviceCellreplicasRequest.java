// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CountContainerserviceCellreplicasRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 应用服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // 应用服务的名称空间
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间名称
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static CountContainerserviceCellreplicasRequest build(java.util.Map<String, ?> map) throws Exception {
        CountContainerserviceCellreplicasRequest self = new CountContainerserviceCellreplicasRequest();
        return TeaModel.build(map, self);
    }

    public CountContainerserviceCellreplicasRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountContainerserviceCellreplicasRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public CountContainerserviceCellreplicasRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CountContainerserviceCellreplicasRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
