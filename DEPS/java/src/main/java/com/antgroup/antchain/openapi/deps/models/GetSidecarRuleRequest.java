// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSidecarRuleRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id	
    // 
    @NameInMap("scope_identity")
    public String scopeIdentity;

    // sidecar版本id
    @NameInMap("sidecar_version_instance_id")
    public String sidecarVersionInstanceId;

    public static GetSidecarRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSidecarRuleRequest self = new GetSidecarRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetSidecarRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSidecarRuleRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetSidecarRuleRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public GetSidecarRuleRequest setSidecarVersionInstanceId(String sidecarVersionInstanceId) {
        this.sidecarVersionInstanceId = sidecarVersionInstanceId;
        return this;
    }
    public String getSidecarVersionInstanceId() {
        return this.sidecarVersionInstanceId;
    }

}
