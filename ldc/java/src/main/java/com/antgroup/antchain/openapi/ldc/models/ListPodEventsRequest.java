// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListPodEventsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群名称
    @NameInMap("cluster")
    @Validation(required = true)
    public String cluster;

    // Pod名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属命名空间名称
    @NameInMap("namespace")
    @Validation(required = true)
    public String namespace;

    // 所属环境名称
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // pod uid
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    public static ListPodEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPodEventsRequest self = new ListPodEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListPodEventsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListPodEventsRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListPodEventsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPodEventsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListPodEventsRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public ListPodEventsRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
