// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CellView extends TeaModel {
    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // displayName
    @NameInMap("display_name")
    public String displayName;

    // description
    @NameInMap("description")
    public String description;

    // deploymentZoneId
    @NameInMap("deployment_zone_id")
    public String deploymentZoneId;

    // workspaceId
    @NameInMap("workspace_id")
    public String workspaceId;

    // workspaceGroupId
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    // status
    @NameInMap("status")
    public String status;

    // masterZoneId
    @NameInMap("master_zone_id")
    public String masterZoneId;

    // appendedZoneIds
    @NameInMap("appended_zone_ids")
    public java.util.List<String> appendedZoneIds;

    // List<ZoneView> zones
    @NameInMap("zones")
    public java.util.List<ZoneView> zones;

    public static CellView build(java.util.Map<String, ?> map) throws Exception {
        CellView self = new CellView();
        return TeaModel.build(map, self);
    }

    public CellView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CellView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CellView setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CellView setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CellView setDeploymentZoneId(String deploymentZoneId) {
        this.deploymentZoneId = deploymentZoneId;
        return this;
    }
    public String getDeploymentZoneId() {
        return this.deploymentZoneId;
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

    public CellView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CellView setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public CellView setAppendedZoneIds(java.util.List<String> appendedZoneIds) {
        this.appendedZoneIds = appendedZoneIds;
        return this;
    }
    public java.util.List<String> getAppendedZoneIds() {
        return this.appendedZoneIds;
    }

    public CellView setZones(java.util.List<ZoneView> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ZoneView> getZones() {
        return this.zones;
    }

}
