// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListClusterNodepodRequest extends TeaModel {
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
    @Validation(required = true)
    public String workspaceGroupName;

    public static ListClusterNodepodRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterNodepodRequest self = new ListClusterNodepodRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterNodepodRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListClusterNodepodRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListClusterNodepodRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public ListClusterNodepodRequest setWorkspaceGroupName(String workspaceGroupName) {
        this.workspaceGroupName = workspaceGroupName;
        return this;
    }
    public String getWorkspaceGroupName() {
        return this.workspaceGroupName;
    }

}
