// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ConfirmrollbackBgreleaseArrangementRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 概览ID
    @NameInMap("arrangement_id")
    public String arrangementId;

    // 发布单ID
    @NameInMap("plan_id")
    public String planId;

    // retry_rollbacked
    @NameInMap("retry_rollbacked")
    public Boolean retryRollbacked;

    // workspace
    @NameInMap("workspace")
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
