// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetSidecarVersionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // sidecar生效范围：workspace、workspace_group、region
    @NameInMap("scope")
    @Validation(required = true)
    public String scope;

    // scope对应的唯一标识，例如workspace对应workspace id
    @NameInMap("scope_identity")
    @Validation(required = true)
    public String scopeIdentity;

    // sidecar版本
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // sidecar版本号
    @NameInMap("sidecar_version")
    @Validation(required = true)
    public String sidecarVersion;

    // sidecar版本类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static GetSidecarVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSidecarVersionRequest self = new GetSidecarVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetSidecarVersionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSidecarVersionRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetSidecarVersionRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetSidecarVersionRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public GetSidecarVersionRequest setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public GetSidecarVersionRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public GetSidecarVersionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
