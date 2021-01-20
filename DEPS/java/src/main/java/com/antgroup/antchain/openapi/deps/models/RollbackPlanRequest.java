// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackPlanRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    public String id;

    // rollback_info
    @NameInMap("rollback_info")
    public RollbackInfo rollbackInfo;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static RollbackPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackPlanRequest self = new RollbackPlanRequest();
        return TeaModel.build(map, self);
    }

    public RollbackPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackPlanRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public RollbackPlanRequest setRollbackInfo(RollbackInfo rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
        return this;
    }
    public RollbackInfo getRollbackInfo() {
        return this.rollbackInfo;
    }

    public RollbackPlanRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
