// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Cell extends TeaModel {
    // 部署区域名称
    @NameInMap("deployment_zone")
    public String deploymentZone;

    // 部署单元描述
    @NameInMap("description")
    public String description;

    // 部署单元名称
    @NameInMap("id")
    public String id;

    // 部署单元所属主可用区ID列表
    @NameInMap("master_zone")
    public String masterZone;

    // 部署单元显示名称
    @NameInMap("name")
    public String name;

    // 部署单元对应的paas id
    @NameInMap("paas_id")
    public String paasId;

    // 部署单元状态
    @NameInMap("status")
    public String status;

    // 租户名称
    @NameInMap("tenant")
    public String tenant;

    // 部署单元类型[单元化模式特有]。
    @NameInMap("type")
    public String type;

    // 工作空间名称
    @NameInMap("workspace")
    public String workspace;

    // 环境名称
    @NameInMap("workspace_group")
    public String workspaceGroup;

    // 部署单元所属可用区ID列表
    @NameInMap("zones")
    public java.util.List<String> zones;

    // displayName
    @NameInMap("display_name")
    public String displayName;

    // appendedZoneIds
    @NameInMap("appended_zone_ids")
    public java.util.List<String> appendedZoneIds;

    public static Cell build(java.util.Map<String, ?> map) throws Exception {
        Cell self = new Cell();
        return TeaModel.build(map, self);
    }

    public Cell setDeploymentZone(String deploymentZone) {
        this.deploymentZone = deploymentZone;
        return this;
    }
    public String getDeploymentZone() {
        return this.deploymentZone;
    }

    public Cell setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Cell setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Cell setMasterZone(String masterZone) {
        this.masterZone = masterZone;
        return this;
    }
    public String getMasterZone() {
        return this.masterZone;
    }

    public Cell setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Cell setPaasId(String paasId) {
        this.paasId = paasId;
        return this;
    }
    public String getPaasId() {
        return this.paasId;
    }

    public Cell setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Cell setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public Cell setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Cell setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public Cell setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public Cell setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

    public Cell setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Cell setAppendedZoneIds(java.util.List<String> appendedZoneIds) {
        this.appendedZoneIds = appendedZoneIds;
        return this;
    }
    public java.util.List<String> getAppendedZoneIds() {
        return this.appendedZoneIds;
    }

}
