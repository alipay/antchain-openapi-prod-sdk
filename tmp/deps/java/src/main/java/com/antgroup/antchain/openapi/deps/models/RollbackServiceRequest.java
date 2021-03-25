// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // rollback_info
    @NameInMap("rollback_info")
    @Validation(required = true)
    public RollbackInfo rollbackInfo;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static RollbackServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackServiceRequest self = new RollbackServiceRequest();
        return TeaModel.build(map, self);
    }

    public RollbackServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackServiceRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public RollbackServiceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RollbackServiceRequest setRollbackInfo(RollbackInfo rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
        return this;
    }
    public RollbackInfo getRollbackInfo() {
        return this.rollbackInfo;
    }

    public RollbackServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
