// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateTraasmetaAppgroupRequest extends TeaModel {
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

    // source_from
    @NameInMap("source_from")
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

    // parent_uuid
    @NameInMap("parent_uuid")
    public String parentUuid;

    // layer
    @NameInMap("layer")
    public Long layer;

    // outside_parent_id
    @NameInMap("outside_parent_id")
    public String outsideParentId;

    public static UpdateTraasmetaAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTraasmetaAppgroupRequest self = new UpdateTraasmetaAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTraasmetaAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTraasmetaAppgroupRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UpdateTraasmetaAppgroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTraasmetaAppgroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateTraasmetaAppgroupRequest setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public UpdateTraasmetaAppgroupRequest setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public UpdateTraasmetaAppgroupRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public UpdateTraasmetaAppgroupRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public UpdateTraasmetaAppgroupRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public UpdateTraasmetaAppgroupRequest setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
        return this;
    }
    public String getParentUuid() {
        return this.parentUuid;
    }

    public UpdateTraasmetaAppgroupRequest setLayer(Long layer) {
        this.layer = layer;
        return this;
    }
    public Long getLayer() {
        return this.layer;
    }

    public UpdateTraasmetaAppgroupRequest setOutsideParentId(String outsideParentId) {
        this.outsideParentId = outsideParentId;
        return this;
    }
    public String getOutsideParentId() {
        return this.outsideParentId;
    }

}
