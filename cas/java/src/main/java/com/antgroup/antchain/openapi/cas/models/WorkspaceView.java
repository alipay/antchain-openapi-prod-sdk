// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class WorkspaceView extends TeaModel {
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

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // region
    @NameInMap("region")
    @Validation(required = true)
    public RegionView region;

    // zones
    @NameInMap("zones")
    @Validation(required = true)
    public java.util.List<WorkspaceZoneView> zones;

    public static WorkspaceView build(java.util.Map<String, ?> map) throws Exception {
        WorkspaceView self = new WorkspaceView();
        return TeaModel.build(map, self);
    }

    public WorkspaceView setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public WorkspaceView setIdentity(String identity) {
        this.identity = identity;
        return this;
    }
    public String getIdentity() {
        return this.identity;
    }

    public WorkspaceView setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WorkspaceView setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public WorkspaceView setRegion(RegionView region) {
        this.region = region;
        return this;
    }
    public RegionView getRegion() {
        return this.region;
    }

    public WorkspaceView setZones(java.util.List<WorkspaceZoneView> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<WorkspaceZoneView> getZones() {
        return this.zones;
    }

}
