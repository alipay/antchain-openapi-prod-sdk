// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class MasterClusterForWorkspaces extends TeaModel {
    // workspace id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public java.util.List<String> workspaceId;

    // master cluster info to init minion cluster
    @NameInMap("master_cluster_info")
    @Validation(required = true)
    public MasterCluster masterClusterInfo;

    public static MasterClusterForWorkspaces build(java.util.Map<String, ?> map) throws Exception {
        MasterClusterForWorkspaces self = new MasterClusterForWorkspaces();
        return TeaModel.build(map, self);
    }

    public MasterClusterForWorkspaces setWorkspaceId(java.util.List<String> workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public java.util.List<String> getWorkspaceId() {
        return this.workspaceId;
    }

    public MasterClusterForWorkspaces setMasterClusterInfo(MasterCluster masterClusterInfo) {
        this.masterClusterInfo = masterClusterInfo;
        return this;
    }
    public MasterCluster getMasterClusterInfo() {
        return this.masterClusterInfo;
    }

}
