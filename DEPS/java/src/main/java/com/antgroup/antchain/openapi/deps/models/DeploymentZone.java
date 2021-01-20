// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeploymentZone extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // 名称
    @NameInMap("name")
    public String name;

    // 显示名
    @NameInMap("display_name")
    public String displayName;

    // 描述
    @NameInMap("description")
    public String description;

    // 环境 id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 工作空间组 id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    // 状态
    @NameInMap("status")
    public String status;

    // 主可用区 ID
    @NameInMap("master_zone_id")
    public String masterZoneId;

    // 附属可用区 ID
    @NameInMap("appended_zone_ids")
    public java.util.List<String> appendedZoneIds;

    // 包含部署单元
    @NameInMap("cells")
    public java.util.List<Cell> cells;

    public static DeploymentZone build(java.util.Map<String, ?> map) throws Exception {
        DeploymentZone self = new DeploymentZone();
        return TeaModel.build(map, self);
    }

    public DeploymentZone setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeploymentZone setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeploymentZone setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DeploymentZone setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeploymentZone setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DeploymentZone setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public DeploymentZone setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DeploymentZone setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public DeploymentZone setAppendedZoneIds(java.util.List<String> appendedZoneIds) {
        this.appendedZoneIds = appendedZoneIds;
        return this;
    }
    public java.util.List<String> getAppendedZoneIds() {
        return this.appendedZoneIds;
    }

    public DeploymentZone setCells(java.util.List<Cell> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<Cell> getCells() {
        return this.cells;
    }

}
