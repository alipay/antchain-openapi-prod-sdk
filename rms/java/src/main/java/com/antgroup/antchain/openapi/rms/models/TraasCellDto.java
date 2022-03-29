// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasCellDto extends TeaModel {
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

    // tenant_name
    @NameInMap("tenant_uuid")
    @Validation(required = true)
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    @Validation(required = true)
    public String tenantName;

    // workspace_uuid
    @NameInMap("workspace_uuid")
    @Validation(required = true)
    public String workspaceUuid;

    // workspace_name
    @NameInMap("workspace_name")
    @Validation(required = true)
    public String workspaceName;

    // zone_uuid
    @NameInMap("zone_uuid")
    @Validation(required = true)
    public String zoneUuid;

    // zone_name
    @NameInMap("zone_name")
    @Validation(required = true)
    public String zoneName;

    // outside_id
    @NameInMap("outside_id")
    @Validation(required = true)
    public String outsideId;

    // source_from
    @NameInMap("source_from")
    @Validation(required = true)
    public String sourceFrom;

    // extension
    @NameInMap("extension")
    @Validation(required = true)
    public String extension;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static TraasCellDto build(java.util.Map<String, ?> map) throws Exception {
        TraasCellDto self = new TraasCellDto();
        return TeaModel.build(map, self);
    }

    public TraasCellDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TraasCellDto setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraasCellDto setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public TraasCellDto setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public TraasCellDto setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public TraasCellDto setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

    public TraasCellDto setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public TraasCellDto setZoneUuid(String zoneUuid) {
        this.zoneUuid = zoneUuid;
        return this;
    }
    public String getZoneUuid() {
        return this.zoneUuid;
    }

    public TraasCellDto setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public TraasCellDto setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public TraasCellDto setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public TraasCellDto setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public TraasCellDto setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TraasCellDto setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
