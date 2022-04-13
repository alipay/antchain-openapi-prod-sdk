// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class BatchdeleteFedspannerclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 批量指定fed集群名称
    @NameInMap("cluster_names")
    @Validation(required = true)
    public java.util.List<String> clusterNames;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static BatchdeleteFedspannerclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteFedspannerclusterRequest self = new BatchdeleteFedspannerclusterRequest();
        return TeaModel.build(map, self);
    }

    public BatchdeleteFedspannerclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchdeleteFedspannerclusterRequest setClusterNames(java.util.List<String> clusterNames) {
        this.clusterNames = clusterNames;
        return this;
    }
    public java.util.List<String> getClusterNames() {
        return this.clusterNames;
    }

    public BatchdeleteFedspannerclusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
