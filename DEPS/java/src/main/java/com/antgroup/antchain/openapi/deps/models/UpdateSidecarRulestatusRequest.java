// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateSidecarRulestatusRequest extends TeaModel {
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

    // sidecar版本实例id
    @NameInMap("sidecar_version_instance_id")
    public String sidecarVersionInstanceId;

    // 规则状态
    @NameInMap("status")
    public Long status;

    // 发布、下线、废弃原因
    @NameInMap("status_reason")
    public String statusReason;

    public static UpdateSidecarRulestatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecarRulestatusRequest self = new UpdateSidecarRulestatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecarRulestatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecarRulestatusRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSidecarRulestatusRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public UpdateSidecarRulestatusRequest setSidecarVersionInstanceId(String sidecarVersionInstanceId) {
        this.sidecarVersionInstanceId = sidecarVersionInstanceId;
        return this;
    }
    public String getSidecarVersionInstanceId() {
        return this.sidecarVersionInstanceId;
    }

    public UpdateSidecarRulestatusRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public UpdateSidecarRulestatusRequest setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

}
