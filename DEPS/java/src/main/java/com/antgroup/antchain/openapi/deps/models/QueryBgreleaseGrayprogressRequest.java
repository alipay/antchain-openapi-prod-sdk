// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBgreleaseGrayprogressRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 概览ID
    @NameInMap("arrangement_id")
    public String arrangementId;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static QueryBgreleaseGrayprogressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBgreleaseGrayprogressRequest self = new QueryBgreleaseGrayprogressRequest();
        return TeaModel.build(map, self);
    }

    public QueryBgreleaseGrayprogressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBgreleaseGrayprogressRequest setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public QueryBgreleaseGrayprogressRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
