// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class InitMulticlusterClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // federation namespace
    @NameInMap("fed_namespace")
    public String fedNamespace;

    // master cluster info 
    @NameInMap("master_cluster_info")
    @Validation(required = true)
    public java.util.List<MasterCluster> masterClusterInfo;

    // workspace group name
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static InitMulticlusterClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        InitMulticlusterClusterRequest self = new InitMulticlusterClusterRequest();
        return TeaModel.build(map, self);
    }

    public InitMulticlusterClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitMulticlusterClusterRequest setFedNamespace(String fedNamespace) {
        this.fedNamespace = fedNamespace;
        return this;
    }
    public String getFedNamespace() {
        return this.fedNamespace;
    }

    public InitMulticlusterClusterRequest setMasterClusterInfo(java.util.List<MasterCluster> masterClusterInfo) {
        this.masterClusterInfo = masterClusterInfo;
        return this;
    }
    public java.util.List<MasterCluster> getMasterClusterInfo() {
        return this.masterClusterInfo;
    }

    public InitMulticlusterClusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
