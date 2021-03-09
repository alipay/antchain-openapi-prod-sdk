// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Scope extends TeaModel {
    // cell identity
    @NameInMap("cell")
    public String cell;

    // region identity
    @NameInMap("region")
    public String region;

    // tenant name
    @NameInMap("tenant")
    public String tenant;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    // workspace_group
    @NameInMap("workspace_group")
    public String workspaceGroup;

    // zone identity
    @NameInMap("zone")
    public String zone;

    // cluster identity
    @NameInMap("cluster")
    public String cluster;

    public static Scope build(java.util.Map<String, ?> map) throws Exception {
        Scope self = new Scope();
        return TeaModel.build(map, self);
    }

    public Scope setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public Scope setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Scope setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public Scope setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public Scope setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public Scope setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public Scope setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

}
