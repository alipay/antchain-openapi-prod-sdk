// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceWithGroupView extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // identity
    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // networkType
    @NameInMap("network_type")
    @Validation(required = true)
    public String networkType;

    // region
    @NameInMap("region")
    @Validation(required = true)
    public RegionView region;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // tenantId
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // zones
    @NameInMap("zones")
    @Validation(required = true)
    public java.util.List<WorkspaceZoneView> zones;

    // workspaceGroup
    @NameInMap("workspace_group")
    @Validation(required = true)
    public WorkspaceGroupView workspaceGroup;

    public static WorkspaceWithGroupView build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceWithGroupView self = new WorkspaceWithGroupView();
        return TeaModel.build(map, self);
    }

    public WorkspaceWithGroupView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceWithGroupView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public WorkspaceWithGroupView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceWithGroupView setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public WorkspaceWithGroupView setRegion(RegionView region) {
        this.region = region;
        return this;
    }
    public RegionView getRegion() {
        return this.region;
    }

    public WorkspaceWithGroupView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WorkspaceWithGroupView setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public WorkspaceWithGroupView setZones(java.util.List<WorkspaceZoneView> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<WorkspaceZoneView> getZones() {
        return this.zones;
    }

    public WorkspaceWithGroupView setWorkspaceGroup(WorkspaceGroupView workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public WorkspaceGroupView getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
