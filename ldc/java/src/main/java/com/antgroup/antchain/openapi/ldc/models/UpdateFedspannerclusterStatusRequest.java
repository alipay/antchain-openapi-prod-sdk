// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateFedspannerclusterStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // fed spanner cluster 集群名称
    @NameInMap("cluster_name")
    @Validation(required = true)
    public String clusterName;

    // 期望的集群状态
    @NameInMap("cluster_status")
    @Validation(required = true)
    public String clusterStatus;

    public static UpdateFedspannerclusterStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFedspannerclusterStatusRequest self = new UpdateFedspannerclusterStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFedspannerclusterStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFedspannerclusterStatusRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateFedspannerclusterStatusRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateFedspannerclusterStatusRequest setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public String getClusterStatus() {
        return this.clusterStatus;
    }

}
