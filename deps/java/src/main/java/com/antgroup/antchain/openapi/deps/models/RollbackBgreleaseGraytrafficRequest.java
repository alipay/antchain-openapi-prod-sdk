// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class RollbackBgreleaseGraytrafficRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 概览ID
    @NameInMap("arrangement_id")
    @Validation(required = true)
    public String arrangementId;

    // 发布单ID
    @NameInMap("plan_id")
    @Validation(required = true)
    public String planId;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static RollbackBgreleaseGraytrafficRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackBgreleaseGraytrafficRequest self = new RollbackBgreleaseGraytrafficRequest();
        return TeaModel.build(map, self);
    }

    public RollbackBgreleaseGraytrafficRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RollbackBgreleaseGraytrafficRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public RollbackBgreleaseGraytrafficRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public RollbackBgreleaseGraytrafficRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public RollbackBgreleaseGraytrafficRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
