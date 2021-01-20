// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSidecarRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // sidecar生效范围：workspace、workspace_group、region	
    // 
    @NameInMap("scope")
    public String scope;

    // scope对应的唯一标识符
    @NameInMap("scope_identity")
    public String scopeIdentity;

    // sidecar名称
    @NameInMap("sidecar_name")
    public String sidecarName;

    public static GetSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSidecarRequest self = new GetSidecarRequest();
        return TeaModel.build(map, self);
    }

    public GetSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSidecarRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetSidecarRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public GetSidecarRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

}
