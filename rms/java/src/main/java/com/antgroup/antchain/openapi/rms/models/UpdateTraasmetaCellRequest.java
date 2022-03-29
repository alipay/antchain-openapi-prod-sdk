// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateTraasmetaCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // name
    @NameInMap("name")
    public String name;

    // display_name
    @NameInMap("display_name")
    public String displayName;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // workspace_uuid
    @NameInMap("workspace_uuid")
    public String workspaceUuid;

    // workspace_name
    @NameInMap("workspace_name")
    public String workspaceName;

    // zone_uuid
    @NameInMap("zone_uuid")
    public String zoneUuid;

    // zone_name
    @NameInMap("zone_name")
    public String zoneName;

    // outside_id
    @NameInMap("outside_id")
    public String outsideId;

    // source_from
    @NameInMap("source_from")
    public String sourceFrom;

    // extension
    @NameInMap("extension")
    public String extension;

    public static UpdateTraasmetaCellRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTraasmetaCellRequest self = new UpdateTraasmetaCellRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTraasmetaCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTraasmetaCellRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UpdateTraasmetaCellRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTraasmetaCellRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateTraasmetaCellRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public UpdateTraasmetaCellRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public UpdateTraasmetaCellRequest setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

    public UpdateTraasmetaCellRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateTraasmetaCellRequest setZoneUuid(String zoneUuid) {
        this.zoneUuid = zoneUuid;
        return this;
    }
    public String getZoneUuid() {
        return this.zoneUuid;
    }

    public UpdateTraasmetaCellRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public UpdateTraasmetaCellRequest setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public UpdateTraasmetaCellRequest setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public UpdateTraasmetaCellRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
