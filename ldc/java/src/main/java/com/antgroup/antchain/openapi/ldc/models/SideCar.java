// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SideCar extends TeaModel {
    // region id
    @NameInMap("region_id")
    public String regionId;

    // sidecar description
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // sidecar_name
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // workspace_group_id
    @NameInMap("workspace_group_id")
    public String workspaceGroupId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static SideCar build(java.util.Map<String, ?> map) throws Exception {
        SideCar self = new SideCar();
        return TeaModel.build(map, self);
    }

    public SideCar setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SideCar setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SideCar setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public SideCar setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public SideCar setWorkspaceGroupId(String workspaceGroupId) {
        this.workspaceGroupId = workspaceGroupId;
        return this;
    }
    public String getWorkspaceGroupId() {
        return this.workspaceGroupId;
    }

    public SideCar setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
