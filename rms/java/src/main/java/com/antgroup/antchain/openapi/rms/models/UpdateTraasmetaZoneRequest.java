// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateTraasmetaZoneRequest extends TeaModel {
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

    // outside_id
    @NameInMap("outside_id")
    public String outsideId;

    // extension
    @NameInMap("extension")
    public String extension;

    // region_uuid
    @NameInMap("region_uuid")
    public String regionUuid;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    public static UpdateTraasmetaZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTraasmetaZoneRequest self = new UpdateTraasmetaZoneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTraasmetaZoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTraasmetaZoneRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UpdateTraasmetaZoneRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTraasmetaZoneRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateTraasmetaZoneRequest setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public UpdateTraasmetaZoneRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public UpdateTraasmetaZoneRequest setRegionUuid(String regionUuid) {
        this.regionUuid = regionUuid;
        return this;
    }
    public String getRegionUuid() {
        return this.regionUuid;
    }

    public UpdateTraasmetaZoneRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public UpdateTraasmetaZoneRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
