// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackBgreleaseArrangementRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 概览ID
    @NameInMap("arrangement_id")
    public String arrangementId;

    // 发布单ID
    @NameInMap("plan_id")
    public String planId;

    // rollback_info
    @NameInMap("rollback_info")
    public RollbackInfo rollbackInfo;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static RollbackBgreleaseArrangementRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackBgreleaseArrangementRequest self = new RollbackBgreleaseArrangementRequest();
        return TeaModel.build(map, self);
    }

    public RollbackBgreleaseArrangementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackBgreleaseArrangementRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public RollbackBgreleaseArrangementRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public RollbackBgreleaseArrangementRequest setRollbackInfo(RollbackInfo rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
        return this;
    }
    public RollbackInfo getRollbackInfo() {
        return this.rollbackInfo;
    }

    public RollbackBgreleaseArrangementRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
