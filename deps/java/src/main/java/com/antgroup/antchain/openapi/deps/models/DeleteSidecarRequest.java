// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteSidecarRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar生效范围：workspace、workspace_group、region	
    // 
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id	
    // 
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    public static DeleteSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSidecarRequest self = new DeleteSidecarRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSidecarRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public DeleteSidecarRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public DeleteSidecarRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DeleteSidecarRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

}
