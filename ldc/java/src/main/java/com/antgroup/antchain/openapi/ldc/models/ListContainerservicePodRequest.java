// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListContainerservicePodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 容器服务名称
    @NameInMap("container_service_name")
    @Validation(required = true)
    public String containerServiceName;

    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 工作空间组名称。
    @NameInMap("workspace_group_name")
    @Validation(required = true)
    public String workspaceGroupName;

    public static ListContainerservicePodRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContainerservicePodRequest self = new ListContainerservicePodRequest();
        return TeaModel.build(map, self);
    }

    public ListContainerservicePodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListContainerservicePodRequest setContainerServiceName(String containerServiceName) {
        this.containerServiceName = containerServiceName;
        return this;
    }
    public String getContainerServiceName() {
        return this.containerServiceName;
    }

    public ListContainerservicePodRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListContainerservicePodRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
