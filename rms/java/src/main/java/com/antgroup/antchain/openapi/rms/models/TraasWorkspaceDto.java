// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasWorkspaceDto extends TeaModel {
    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // name
    @NameInMap("name")
    @Validation(required = true)
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

    // workspace_group_uuid
    @NameInMap("workspace_group_uuid")
    public String workspaceGroupUuid;

    // region_uuid
    @NameInMap("region_uuid")
    public String regionUuid;

    // zone_uuids
    @NameInMap("zone_uuids")
    public java.util.List<String> zoneUuids;

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

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static TraasWorkspaceDto build(java.util.Map<String, ?> map) throws Exception {
        TraasWorkspaceDto self = new TraasWorkspaceDto();
        return TeaModel.build(map, self);
    }

    public TraasWorkspaceDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TraasWorkspaceDto setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraasWorkspaceDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public TraasWorkspaceDto setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public TraasWorkspaceDto setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public TraasWorkspaceDto setWorkspaceGroupUuid(String workspaceGroupUuid) {
        this.workspaceGroupUuid = workspaceGroupUuid;
        return this;
    }
    public String getWorkspaceGroupUuid() {
        return this.workspaceGroupUuid;
    }

    public TraasWorkspaceDto setRegionUuid(String regionUuid) {
        this.regionUuid = regionUuid;
        return this;
    }
    public String getRegionUuid() {
        return this.regionUuid;
    }

    public TraasWorkspaceDto setZoneUuids(java.util.List<String> zoneUuids) {
        this.zoneUuids = zoneUuids;
        return this;
    }
    public java.util.List<String> getZoneUuids() {
        return this.zoneUuids;
    }

    public TraasWorkspaceDto setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public TraasWorkspaceDto setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public TraasWorkspaceDto setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public TraasWorkspaceDto setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TraasWorkspaceDto setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
