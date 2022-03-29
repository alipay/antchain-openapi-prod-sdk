// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class UpdateTraasmetaAppserverRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuid
    @NameInMap("uuid")
    @Validation(required = true)
    public String uuid;

    // hostname
    @NameInMap("hostname")
    public String hostname;

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

    // ip
    @NameInMap("ip")
    public String ip;

    // host_ip
    @NameInMap("host_ip")
    public String hostIp;

    // collect_id
    @NameInMap("collect_id")
    public String collectId;

    // status
    @NameInMap("status")
    public Boolean status;

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

    public static UpdateTraasmetaAppserverRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTraasmetaAppserverRequest self = new UpdateTraasmetaAppserverRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTraasmetaAppserverRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTraasmetaAppserverRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UpdateTraasmetaAppserverRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public UpdateTraasmetaAppserverRequest setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public UpdateTraasmetaAppserverRequest setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public UpdateTraasmetaAppserverRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public UpdateTraasmetaAppserverRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public UpdateTraasmetaAppserverRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public UpdateTraasmetaAppserverRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public UpdateTraasmetaAppserverRequest setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public UpdateTraasmetaAppserverRequest setCollectId(String collectId) {
        this.collectId = collectId;
        return this;
    }
    public String getCollectId() {
        return this.collectId;
    }

    public UpdateTraasmetaAppserverRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public UpdateTraasmetaAppserverRequest setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

    public UpdateTraasmetaAppserverRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateTraasmetaAppserverRequest setCellUuid(String cellUuid) {
        this.cellUuid = cellUuid;
        return this;
    }
    public String getCellUuid() {
        return this.cellUuid;
    }

    public UpdateTraasmetaAppserverRequest setZoneUuid(String zoneUuid) {
        this.zoneUuid = zoneUuid;
        return this;
    }
    public String getZoneUuid() {
        return this.zoneUuid;
    }

    public UpdateTraasmetaAppserverRequest setAppUuid(String appUuid) {
        this.appUuid = appUuid;
        return this;
    }
    public String getAppUuid() {
        return this.appUuid;
    }

    public UpdateTraasmetaAppserverRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateTraasmetaAppserverRequest setAppServiceUuid(String appServiceUuid) {
        this.appServiceUuid = appServiceUuid;
        return this;
    }
    public String getAppServiceUuid() {
        return this.appServiceUuid;
    }

    public UpdateTraasmetaAppserverRequest setVmUuid(String vmUuid) {
        this.vmUuid = vmUuid;
        return this;
    }
    public String getVmUuid() {
        return this.vmUuid;
    }

    public UpdateTraasmetaAppserverRequest setPodUuid(String podUuid) {
        this.podUuid = podUuid;
        return this;
    }
    public String getPodUuid() {
        return this.podUuid;
    }

}
