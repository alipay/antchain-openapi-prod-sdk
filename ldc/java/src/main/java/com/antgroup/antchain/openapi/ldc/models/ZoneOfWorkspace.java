// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ZoneOfWorkspace extends TeaModel {
    // workspace id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // workspace name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // zone list of workspace
    @NameInMap("zones")
    @Validation(required = true)
    public java.util.List<ZoneInfo> zones;

    // region name
    @NameInMap("region_name")
    @Validation(required = true)
    public String regionName;

    // region id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    public static ZoneOfWorkspace build(java.util.Map<String, ?> map) throws Exception {
        ZoneOfWorkspace self = new ZoneOfWorkspace();
        return TeaModel.build(map, self);
    }

    public ZoneOfWorkspace setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ZoneOfWorkspace setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public ZoneOfWorkspace setZones(java.util.List<ZoneInfo> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ZoneInfo> getZones() {
        return this.zones;
    }

    public ZoneOfWorkspace setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public ZoneOfWorkspace setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
