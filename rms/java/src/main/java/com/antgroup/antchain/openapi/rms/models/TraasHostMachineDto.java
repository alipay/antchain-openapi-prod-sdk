// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasHostMachineDto extends TeaModel {
    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // hostname
    @NameInMap("hostname")
    @Validation(required = true)
    public String hostname;

    // ip
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    // collect_ip
    @NameInMap("collect_ip")
    @Validation(required = true)
    public String collectIp;

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
    public String gmtModified;

    public static TraasHostMachineDto build(java.util.Map<String, ?> map) throws Exception {
        TraasHostMachineDto self = new TraasHostMachineDto();
        return TeaModel.build(map, self);
    }

    public TraasHostMachineDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TraasHostMachineDto setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public TraasHostMachineDto setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public TraasHostMachineDto setCollectIp(String collectIp) {
        this.collectIp = collectIp;
        return this;
    }
    public String getCollectIp() {
        return this.collectIp;
    }

    public TraasHostMachineDto setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public TraasHostMachineDto setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public TraasHostMachineDto setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

    public TraasHostMachineDto setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public TraasHostMachineDto setZoneUuid(String zoneUuid) {
        this.zoneUuid = zoneUuid;
        return this;
    }
    public String getZoneUuid() {
        return this.zoneUuid;
    }

    public TraasHostMachineDto setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public TraasHostMachineDto setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public TraasHostMachineDto setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public TraasHostMachineDto setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public TraasHostMachineDto setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TraasHostMachineDto setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
