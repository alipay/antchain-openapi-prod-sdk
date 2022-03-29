// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraasAppServerDto extends TeaModel {
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

    // collect_id
    @NameInMap("collect_id")
    @Validation(required = true)
    public String collectId;

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

    // cell_uuid
    @NameInMap("cell_uuid")
    public String cellUuid;

    // zone_uuid
    @NameInMap("zone_uuid")
    public String zoneUuid;

    // app_uuid
    @NameInMap("app_uuid")
    public String appUuid;

    // app_name
    @NameInMap("app_name")
    public String appName;

    // app_service_uuid
    @NameInMap("app_service_uuid")
    public String appServiceUuid;

    // vm_uuid
    @NameInMap("vm_uuid")
    public String vmUuid;

    // pod_uuid
    @NameInMap("pod_uuid")
    public String podUuid;

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

    // status
    @NameInMap("status")
    @Validation(required = true)
    public Boolean status;

    // host_ip
    @NameInMap("host_ip")
    @Validation(required = true)
    public String hostIp;

    // gmt_create
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // gmt_modified
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static TraasAppServerDto build(java.util.Map<String, ?> map) throws Exception {
        TraasAppServerDto self = new TraasAppServerDto();
        return TeaModel.build(map, self);
    }

    public TraasAppServerDto setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public TraasAppServerDto setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public TraasAppServerDto setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public TraasAppServerDto setCollectId(String collectId) {
        this.collectId = collectId;
        return this;
    }
    public String getCollectId() {
        return this.collectId;
    }

    public TraasAppServerDto setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public TraasAppServerDto setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public TraasAppServerDto setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

    public TraasAppServerDto setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public TraasAppServerDto setCellUuid(String cellUuid) {
        this.cellUuid = cellUuid;
        return this;
    }
    public String getCellUuid() {
        return this.cellUuid;
    }

    public TraasAppServerDto setZoneUuid(String zoneUuid) {
        this.zoneUuid = zoneUuid;
        return this;
    }
    public String getZoneUuid() {
        return this.zoneUuid;
    }

    public TraasAppServerDto setAppUuid(String appUuid) {
        this.appUuid = appUuid;
        return this;
    }
    public String getAppUuid() {
        return this.appUuid;
    }

    public TraasAppServerDto setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TraasAppServerDto setAppServiceUuid(String appServiceUuid) {
        this.appServiceUuid = appServiceUuid;
        return this;
    }
    public String getAppServiceUuid() {
        return this.appServiceUuid;
    }

    public TraasAppServerDto setVmUuid(String vmUuid) {
        this.vmUuid = vmUuid;
        return this;
    }
    public String getVmUuid() {
        return this.vmUuid;
    }

    public TraasAppServerDto setPodUuid(String podUuid) {
        this.podUuid = podUuid;
        return this;
    }
    public String getPodUuid() {
        return this.podUuid;
    }

    public TraasAppServerDto setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public TraasAppServerDto setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public TraasAppServerDto setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public TraasAppServerDto setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public TraasAppServerDto setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public TraasAppServerDto setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TraasAppServerDto setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
