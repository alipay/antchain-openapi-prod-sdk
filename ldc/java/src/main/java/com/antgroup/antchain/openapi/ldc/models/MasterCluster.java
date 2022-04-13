// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class MasterCluster extends TeaModel {
    // master cluster name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // workspace id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // workspace name
    @NameInMap("workspace_name")
    public String workspaceName;

    // region id
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // region name
    @NameInMap("region_name")
    public String regionName;

    // zone id
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // zone name
    @NameInMap("zone_name")
    public String zoneName;

    public static MasterCluster build(java.util.Map<String, ?> map) throws Exception {
        MasterCluster self = new MasterCluster();
        return TeaModel.build(map, self);
    }

    public MasterCluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MasterCluster setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public MasterCluster setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public MasterCluster setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MasterCluster setRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }
    public String getRegionName() {
        return this.regionName;
    }

    public MasterCluster setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public MasterCluster setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
