// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SidecarScopeDetail extends TeaModel {
    // sidecar生效范围：workspace、workspace_group、region	
    // 
    @NameInMap("scope")
    public String scope;

    // scope对应的唯一id，例如workspace对应workspace id	
    // 
    @NameInMap("scope_identity")
    public String scopeIdentity;

    // scope identity展示名称
    @NameInMap("scope_identity_display_name")
    public String scopeIdentityDisplayName;

    // scope对应的唯一标识符
    @NameInMap("scope_identity_name")
    public String scopeIdentityName;

    public static SidecarScopeDetail build(java.util.Map<String, ?> map) throws Exception {
        SidecarScopeDetail self = new SidecarScopeDetail();
        return TeaModel.build(map, self);
    }

    public SidecarScopeDetail setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public SidecarScopeDetail setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public SidecarScopeDetail setScopeIdentityDisplayName(String scopeIdentityDisplayName) {
        this.scopeIdentityDisplayName = scopeIdentityDisplayName;
        return this;
    }
    public String getScopeIdentityDisplayName() {
        return this.scopeIdentityDisplayName;
    }

    public SidecarScopeDetail setScopeIdentityName(String scopeIdentityName) {
        this.scopeIdentityName = scopeIdentityName;
        return this;
    }
    public String getScopeIdentityName() {
        return this.scopeIdentityName;
    }

}
