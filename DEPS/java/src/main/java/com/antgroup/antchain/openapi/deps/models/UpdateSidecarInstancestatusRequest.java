// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateSidecarInstancestatusRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 版本实例名称
    @NameInMap("instance_name")
    public String instanceName;

    // sidecar生效范围：workspace、workspace_group、region	
    // 
    @NameInMap("scope")
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id	
    // 
    @NameInMap("scope_identity")
    public String scopeIdentity;

    // sidecar版本id
    @NameInMap("sidecar_release_version_id")
    public String sidecarReleaseVersionId;

    // 版本实例状态
    @NameInMap("status")
    public Long status;

    // 发布、下线、废弃原因
    @NameInMap("status_reason")
    public String statusReason;

    public static UpdateSidecarInstancestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecarInstancestatusRequest self = new UpdateSidecarInstancestatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecarInstancestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecarInstancestatusRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateSidecarInstancestatusRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSidecarInstancestatusRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public UpdateSidecarInstancestatusRequest setSidecarReleaseVersionId(String sidecarReleaseVersionId) {
        this.sidecarReleaseVersionId = sidecarReleaseVersionId;
        return this;
    }
    public String getSidecarReleaseVersionId() {
        return this.sidecarReleaseVersionId;
    }

    public UpdateSidecarInstancestatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateSidecarInstancestatusRequest setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

}
