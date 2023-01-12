// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ConfirmrollbackBgreleaseArrangementRequest extends TeaModel {
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

    // retry_rollbacked
    @NameInMap("retry_rollbacked")
    @Validation(required = true)
    public Boolean retryRollbacked;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static ConfirmrollbackBgreleaseArrangementRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmrollbackBgreleaseArrangementRequest self = new ConfirmrollbackBgreleaseArrangementRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmrollbackBgreleaseArrangementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmrollbackBgreleaseArrangementRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ConfirmrollbackBgreleaseArrangementRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public ConfirmrollbackBgreleaseArrangementRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ConfirmrollbackBgreleaseArrangementRequest setRetryRollbacked(Boolean retryRollbacked) {
        this.retryRollbacked = retryRollbacked;
        return this;
    }
    public Boolean getRetryRollbacked() {
        return this.retryRollbacked;
    }

    public ConfirmrollbackBgreleaseArrangementRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
