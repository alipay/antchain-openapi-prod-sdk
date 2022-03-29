// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateTraasmetaHostmachineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    public static CreateTraasmetaHostmachineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTraasmetaHostmachineRequest self = new CreateTraasmetaHostmachineRequest();
        return TeaModel.build(map, self);
    }

    public CreateTraasmetaHostmachineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTraasmetaHostmachineRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateTraasmetaHostmachineRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateTraasmetaHostmachineRequest setCollectId(String collectId) {
        this.collectId = collectId;
        return this;
    }
    public String getCollectId() {
        return this.collectId;
    }

    public CreateTraasmetaHostmachineRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public CreateTraasmetaHostmachineRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateTraasmetaHostmachineRequest setWorkspaceUuid(String workspaceUuid) {
        this.workspaceUuid = workspaceUuid;
        return this;
    }
    public String getWorkspaceUuid() {
        return this.workspaceUuid;
    }

    public CreateTraasmetaHostmachineRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public CreateTraasmetaHostmachineRequest setZoneUuid(String zoneUuid) {
        this.zoneUuid = zoneUuid;
        return this;
    }
    public String getZoneUuid() {
        return this.zoneUuid;
    }

    public CreateTraasmetaHostmachineRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public CreateTraasmetaHostmachineRequest setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public CreateTraasmetaHostmachineRequest setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public CreateTraasmetaHostmachineRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

}
