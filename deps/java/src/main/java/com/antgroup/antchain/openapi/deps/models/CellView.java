// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CellView extends TeaModel {
    // 扩展部署机房id
    @NameInMap("deployment_zone_id")
    public String deploymentZoneId;

    // 部署单元描述
    @NameInMap("description")
    public String description;

    // 显示名称
    @NameInMap("display_name")
    public String displayName;

    // table id
    @NameInMap("id")
    public String id;

    // 标识
    @NameInMap("identity")
    public String identity;

    // master zone id
    @NameInMap("master_zone_id")
    public String masterZoneId;

    // 部署单元状态
    @NameInMap("status")
    public String status;

    // 工作空间 id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 工作空间组 id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    public static CellView build(java.util.Map<String, ?> map) throws Exception {
        CellView self = new CellView();
        return TeaModel.build(map, self);
    }

    public CellView setDeploymentZoneId(String deploymentZoneId) {
        this.deploymentZoneId = deploymentZoneId;
        return this;
    }
    public String getDeploymentZoneId() {
        return this.deploymentZoneId;
    }

    public CellView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CellView setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CellView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CellView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public CellView setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public CellView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CellView setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CellView setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

}
