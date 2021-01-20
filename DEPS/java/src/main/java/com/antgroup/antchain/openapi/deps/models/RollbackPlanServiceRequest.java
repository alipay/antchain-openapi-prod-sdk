// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackPlanServiceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 发布单ID
    @NameInMap("plan_id")
    public String planId;

    // rollback_info
    @NameInMap("rollback_info")
    public RollbackInfo rollbackInfo;

    // 发布服务
    @NameInMap("service")
    public String service;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static RollbackPlanServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackPlanServiceRequest self = new RollbackPlanServiceRequest();
        return TeaModel.build(map, self);
    }

    public RollbackPlanServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackPlanServiceRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public RollbackPlanServiceRequest setRollbackInfo(RollbackInfo rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
        return this;
    }
    public RollbackInfo getRollbackInfo() {
        return this.rollbackInfo;
    }

    public RollbackPlanServiceRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public RollbackPlanServiceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
