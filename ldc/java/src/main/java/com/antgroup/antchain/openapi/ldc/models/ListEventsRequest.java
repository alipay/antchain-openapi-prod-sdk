// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListEventsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群名
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // 容器名称
    @NameInMap("container_name")
    public String containerName;

    // pod名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // namespace
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    //  pod uid
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    // wsg
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static ListEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventsRequest self = new ListEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListEventsRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListEventsRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public ListEventsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEventsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListEventsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public ListEventsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
