// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteSidecarInstanceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 版本实例名称	
    // 
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
    // 
    @NameInMap("sidecar_release_version_id")
    public String sidecarReleaseVersionId;

    public static DeleteSidecarInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSidecarInstanceRequest self = new DeleteSidecarInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSidecarInstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteSidecarInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DeleteSidecarInstanceRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DeleteSidecarInstanceRequest setScopeIdentity(String scopeIdentity) {
        this.scopeIdentity = scopeIdentity;
        return this;
    }
    public String getScopeIdentity() {
        return this.scopeIdentity;
    }

    public DeleteSidecarInstanceRequest setSidecarReleaseVersionId(String sidecarReleaseVersionId) {
        this.sidecarReleaseVersionId = sidecarReleaseVersionId;
        return this;
    }
    public String getSidecarReleaseVersionId() {
        return this.sidecarReleaseVersionId;
    }

}
