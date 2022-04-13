// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateSpannerClusterstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 设置集群的状态： 1 运行状态  2 维护状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static UpdateSpannerClusterstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpannerClusterstatusRequest self = new UpdateSpannerClusterstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpannerClusterstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSpannerClusterstatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateSpannerClusterstatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateSpannerClusterstatusRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
