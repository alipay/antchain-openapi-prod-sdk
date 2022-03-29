// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateTraasmetaWorkspaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // display_name
    @NameInMap("display_name")
    public String displayName;

    // outside_id
    @NameInMap("outside_id")
    public String outsideId;

    // source_from
    @NameInMap("source_from")
    @Validation(required = true)
    public String sourceFrom;

    // extension
    @NameInMap("extension")
    public String extension;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // workspace_group_uuid
    @NameInMap("workspace_group_uuid")
    public String workspaceGroupUuid;

    // region_uuid
    @NameInMap("region_uuid")
    public String regionUuid;

    // zone_uuid
    @NameInMap("zone_uuid")
    public String zoneUuid;

    public static CreateTraasmetaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTraasmetaWorkspaceRequest self = new CreateTraasmetaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateTraasmetaWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTraasmetaWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTraasmetaWorkspaceRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateTraasmetaWorkspaceRequest setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public CreateTraasmetaWorkspaceRequest setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public CreateTraasmetaWorkspaceRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public CreateTraasmetaWorkspaceRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public CreateTraasmetaWorkspaceRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateTraasmetaWorkspaceRequest setWorkspaceGroupUuid(String workspaceGroupUuid) {
        this.workspaceGroupUuid = workspaceGroupUuid;
        return this;
    }
    public String getWorkspaceGroupUuid() {
        return this.workspaceGroupUuid;
    }

    public CreateTraasmetaWorkspaceRequest setRegionUuid(String regionUuid) {
        this.regionUuid = regionUuid;
        return this;
    }
    public String getRegionUuid() {
        return this.regionUuid;
    }

    public CreateTraasmetaWorkspaceRequest setZoneUuid(String zoneUuid) {
        this.zoneUuid = zoneUuid;
        return this;
    }
    public String getZoneUuid() {
        return this.zoneUuid;
    }

}
