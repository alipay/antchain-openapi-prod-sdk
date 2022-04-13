// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListMulticlusterEventsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 环境组名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 命名空间
    @NameInMap("namespace")
    public String namespace;

    // 容器服务名称
    @NameInMap("container_service")
    public String containerService;

    public static ListMulticlusterEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMulticlusterEventsRequest self = new ListMulticlusterEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListMulticlusterEventsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListMulticlusterEventsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ListMulticlusterEventsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListMulticlusterEventsRequest setContainerService(String containerService) {
        this.containerService = containerService;
        return this;
    }
    public String getContainerService() {
        return this.containerService;
    }

}
