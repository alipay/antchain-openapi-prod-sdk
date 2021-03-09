// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseMasterzoneRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryDatabaseMasterzoneRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseMasterzoneRequest self = new QueryDatabaseMasterzoneRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseMasterzoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatabaseMasterzoneRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
