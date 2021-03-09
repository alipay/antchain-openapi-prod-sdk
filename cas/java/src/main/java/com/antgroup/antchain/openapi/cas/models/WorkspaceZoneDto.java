// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceZoneDto extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    // zone_id
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // zone name
    @NameInMap("zone_name")
    public String zoneName;

    public static WorkspaceZoneDto build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceZoneDto self = new WorkspaceZoneDto();
        return TeaModel.build(map, self);
    }

    public WorkspaceZoneDto setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceZoneDto setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public WorkspaceZoneDto setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public WorkspaceZoneDto setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
