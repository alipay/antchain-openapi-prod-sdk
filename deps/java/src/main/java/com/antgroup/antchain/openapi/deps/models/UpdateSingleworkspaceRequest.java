// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateSingleworkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // workspace 显示名称
    @NameInMap("display_name")
    public String displayName;

    // 可用区id列表
    @NameInMap("zones")
    public java.util.List<String> zones;

    // zone_ids
    @NameInMap("zone_ids")
    public java.util.List<String> zoneIds;

    // labels
    @NameInMap("labels")
    public String labels;

    // workspace_id
    @NameInMap("workspace_id")
    @Validation(required = true)
    public String workspaceId;

    public static UpdateSingleworkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSingleworkspaceRequest self = new UpdateSingleworkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSingleworkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSingleworkspaceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateSingleworkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateSingleworkspaceRequest setZones(java.util.List<String> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<String> getZones() {
        return this.zones;
    }

    public UpdateSingleworkspaceRequest setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public java.util.List<String> getZoneIds() {
        return this.zoneIds;
    }

    public UpdateSingleworkspaceRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdateSingleworkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
