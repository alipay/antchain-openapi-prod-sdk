// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBgreleaseArrangementprogressRequest extends TeaModel {
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

    public static QueryBgreleaseArrangementprogressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBgreleaseArrangementprogressRequest self = new QueryBgreleaseArrangementprogressRequest();
        return TeaModel.build(map, self);
    }

    public QueryBgreleaseArrangementprogressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBgreleaseArrangementprogressRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public QueryBgreleaseArrangementprogressRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public QueryBgreleaseArrangementprogressRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public QueryBgreleaseArrangementprogressRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
