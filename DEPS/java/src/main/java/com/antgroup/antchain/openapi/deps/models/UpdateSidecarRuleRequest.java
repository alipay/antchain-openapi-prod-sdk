// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateSidecarRuleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 规则描述	
    // 
    @NameInMap("description")
    public String description;

    // 规则优先级
    @NameInMap("level")
    public Long level;

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
    public String status;

    public static UpdateSidecarRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSidecarRuleRequest self = new UpdateSidecarRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSidecarRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSidecarRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSidecarRuleRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public UpdateSidecarRuleRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UpdateSidecarRuleRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public UpdateSidecarRuleRequest setSidecarVersionInstanceId(String sidecarVersionInstanceId) {
        this.sidecarVersionInstanceId = sidecarVersionInstanceId;
        return this;
    }
    public String getSidecarVersionInstanceId() {
        return this.sidecarVersionInstanceId;
    }

    public UpdateSidecarRuleRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
