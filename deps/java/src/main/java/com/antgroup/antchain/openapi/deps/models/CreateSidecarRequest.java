// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateSidecarRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // sidecar描述
    @NameInMap("description")
    public String description;

    // sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    public static CreateSidecarRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSidecarRequest self = new CreateSidecarRequest();
        return TeaModel.build(map, self);
    }

    public CreateSidecarRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSidecarRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateSidecarRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSidecarRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public CreateSidecarRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateSidecarRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

}
