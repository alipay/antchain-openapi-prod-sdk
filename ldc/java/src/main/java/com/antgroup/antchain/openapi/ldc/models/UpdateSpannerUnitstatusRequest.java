// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class UpdateSpannerUnitstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 集群id
    @NameInMap("cluster_id")
    @Validation(required = true)
    public String clusterId;

    // 容器id列表
    @NameInMap("container_ids")
    @Validation(required = true)
    public java.util.List<String> containerIds;

    // 集群单元状态： 1-下线状态 2- 上线状态 3-删除状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static UpdateSpannerUnitstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpannerUnitstatusRequest self = new UpdateSpannerUnitstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpannerUnitstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSpannerUnitstatusRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public UpdateSpannerUnitstatusRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateSpannerUnitstatusRequest setContainerIds(java.util.List<String> containerIds) {
        this.containerIds = containerIds;
        return this;
    }
    public java.util.List<String> getContainerIds() {
        return this.containerIds;
    }

    public UpdateSpannerUnitstatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
