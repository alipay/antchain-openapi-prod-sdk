// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class DeletePodRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属环境名称。
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 命名空间名称。
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 容器应用服务名称。
    @NameInMap("container_service")
    public String containerService;

    // 集群名称。
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // pod名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static DeletePodRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePodRequest self = new DeletePodRequest();
        return TeaModel.build(map, self);
    }

    public DeletePodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeletePodRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public DeletePodRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeletePodRequest setContainerService(String containerService) {
        this.containerService = containerService;
        return this;
    }
    public String getContainerService() {
        return this.containerService;
    }

    public DeletePodRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public DeletePodRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
