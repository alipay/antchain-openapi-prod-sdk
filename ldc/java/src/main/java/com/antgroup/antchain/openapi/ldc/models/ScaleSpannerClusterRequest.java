// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ScaleSpannerClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 需要扩容的单元数目
    @NameInMap("container_count")
    @Validation(required = true)
    public Long containerCount;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    public static ScaleSpannerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleSpannerClusterRequest self = new ScaleSpannerClusterRequest();
        return TeaModel.build(map, self);
    }

    public ScaleSpannerClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ScaleSpannerClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ScaleSpannerClusterRequest setContainerCount(Long containerCount) {
        this.containerCount = containerCount;
        return this;
    }
    public Long getContainerCount() {
        return this.containerCount;
    }

    public ScaleSpannerClusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
