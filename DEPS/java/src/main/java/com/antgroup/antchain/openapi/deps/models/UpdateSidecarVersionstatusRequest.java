// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateSidecarVersionstatusRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // sidecar生效范围：workspace、workspace_group、region	
    // 
    @NameInMap("scope")
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id	
    // 
    @NameInMap("scope_identity")
    public String scopeIdentity;

    // sidecar名称
    @NameInMap("sidecar_name")
    public String sidecarName;

    // sidecar版本号
    @NameInMap("sidecar_version")
    public String sidecarVersion;

    // 版本状态
    @NameInMap("status")
    public Long status;

    // 发布、下线、废弃原因
    @NameInMap("status_reason")
    public String statusReason;

    // sidecar版本类型
    @NameInMap("type")
    public String type;

    public static UpdateSidecarVersionstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecarVersionstatusRequest self = new UpdateSidecarVersionstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecarVersionstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecarVersionstatusRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSidecarVersionstatusRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public UpdateSidecarVersionstatusRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public UpdateSidecarVersionstatusRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public UpdateSidecarVersionstatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateSidecarVersionstatusRequest setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public UpdateSidecarVersionstatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
