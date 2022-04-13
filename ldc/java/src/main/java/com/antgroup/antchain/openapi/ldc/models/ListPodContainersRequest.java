// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListPodContainersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 所属环境名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 所属集群名称
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 所属工作空间名称
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // Pod名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static ListPodContainersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPodContainersRequest self = new ListPodContainersRequest();
        return TeaModel.build(map, self);
    }

    public ListPodContainersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListPodContainersRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ListPodContainersRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListPodContainersRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListPodContainersRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
