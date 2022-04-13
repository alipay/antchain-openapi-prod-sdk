// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class MasterClusterInfoForWorkspaces extends TeaModel {
    // master cluster info
    @NameInMap("master_cluster_info")
    @Validation(required = true)
    public MasterCluster masterClusterInfo;

    // workspace ids
    @NameInMap("workspace_ids")
    @Validation(required = true)
    public java.util.List<String> workspaceIds;

    public static MasterClusterInfoForWorkspaces build(java.util.Map<String, ?> map) throws Exception {
        MasterClusterInfoForWorkspaces self = new MasterClusterInfoForWorkspaces();
        return TeaModel.build(map, self);
    }

    public MasterClusterInfoForWorkspaces setMasterClusterInfo(MasterCluster masterClusterInfo) {
        this.masterClusterInfo = masterClusterInfo;
        return this;
    }
    public MasterCluster getMasterClusterInfo() {
        return this.masterClusterInfo;
    }

    public MasterClusterInfoForWorkspaces setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}
