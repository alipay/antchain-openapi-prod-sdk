// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetFedspannerclusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // fed集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true, maxLength = 256)
    public String workspaceGroup;

    public static GetFedspannerclusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFedspannerclusterRequest self = new GetFedspannerclusterRequest();
        return TeaModel.build(map, self);
    }

    public GetFedspannerclusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetFedspannerclusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetFedspannerclusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
