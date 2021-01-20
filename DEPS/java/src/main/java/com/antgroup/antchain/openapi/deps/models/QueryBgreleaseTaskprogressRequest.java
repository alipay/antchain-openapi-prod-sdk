// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBgreleaseTaskprogressRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 概览ID
    @NameInMap("arrangement_id")
    public String arrangementId;

    // 发布单ID
    @NameInMap("plan_id")
    public String planId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryBgreleaseTaskprogressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBgreleaseTaskprogressRequest self = new QueryBgreleaseTaskprogressRequest();
        return TeaModel.build(map, self);
    }

    public QueryBgreleaseTaskprogressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBgreleaseTaskprogressRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public QueryBgreleaseTaskprogressRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public QueryBgreleaseTaskprogressRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
