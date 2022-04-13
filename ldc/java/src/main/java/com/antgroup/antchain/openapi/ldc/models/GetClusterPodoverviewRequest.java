// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetClusterPodoverviewRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cluster name
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // node name
    @NameInMap("node_name")
    @Validation(required = true)
    public String nodeName;

    // workspace group name
    @NameInMap("workspace_group_name")
    public String workspaceGroupName;

    public static GetClusterPodoverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterPodoverviewRequest self = new GetClusterPodoverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterPodoverviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetClusterPodoverviewRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetClusterPodoverviewRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public GetClusterPodoverviewRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
