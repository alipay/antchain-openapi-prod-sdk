// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBgreleaseArrangementRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 发布单ID
    @NameInMap("plan_id")
    public String planId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryBgreleaseArrangementRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBgreleaseArrangementRequest self = new QueryBgreleaseArrangementRequest();
        return TeaModel.build(map, self);
    }

    public QueryBgreleaseArrangementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBgreleaseArrangementRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public QueryBgreleaseArrangementRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
