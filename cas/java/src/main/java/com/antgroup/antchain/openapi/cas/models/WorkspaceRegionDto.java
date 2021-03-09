// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceRegionDto extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // networkType
    @NameInMap("network_type")
    public String networkType;

    // region id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // regionName
    @NameInMap("region_name")
    public String regionName;

    // 安全域id
    @NameInMap("secured_zone_id")
    public String securedZoneId;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // workspaceLogicRegionStatus
    @NameInMap("workspace_logic_region_status")
    public String workspaceLogicRegionStatus;

    // workspaceLogicRegionType
    @NameInMap("workspace_logic_region_type")
    public String workspaceLogicRegionType;

    // workspaceZoneDtos
    @NameInMap("workspace_zone_dtos")
    public java.util.List<WorkspaceZoneDto> workspaceZoneDtos;

    public static WorkspaceRegionDto build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceRegionDto self = new WorkspaceRegionDto();
        return TeaModel.build(map, self);
    }

    public WorkspaceRegionDto setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceRegionDto setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public WorkspaceRegionDto setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WorkspaceRegionDto setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public WorkspaceRegionDto setSecuredZoneId(String securedZoneId) {
        this.securedZoneId = securedZoneId;
        return this;
    }
    public String getSecuredZoneId() {
        return this.securedZoneId;
    }

    public WorkspaceRegionDto setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public WorkspaceRegionDto setWorkspaceLogicRegionStatus(String workspaceLogicRegionStatus) {
        this.workspaceLogicRegionStatus = workspaceLogicRegionStatus;
        return this;
    }
    public String getWorkspaceLogicRegionStatus() {
        return this.workspaceLogicRegionStatus;
    }

    public WorkspaceRegionDto setWorkspaceLogicRegionType(String workspaceLogicRegionType) {
        this.workspaceLogicRegionType = workspaceLogicRegionType;
        return this;
    }
    public String getWorkspaceLogicRegionType() {
        return this.workspaceLogicRegionType;
    }

    public WorkspaceRegionDto setWorkspaceZoneDtos(java.util.List<WorkspaceZoneDto> workspaceZoneDtos) {
        this.workspaceZoneDtos = workspaceZoneDtos;
        return this;
    }
    public java.util.List<WorkspaceZoneDto> getWorkspaceZoneDtos() {
        return this.workspaceZoneDtos;
    }

}
