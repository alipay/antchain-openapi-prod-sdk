// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsPathRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // requests
    @NameInMap("requests")
    public java.util.List<FolderRequestCmd> requests;

    public static QueryRmsPathRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsPathRequest self = new QueryRmsPathRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsPathRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRmsPathRequest setRequests(java.util.List<FolderRequestCmd> requests) {
        this.requests = requests;
        return this;
    }
    public java.util.List<FolderRequestCmd> getRequests() {
        return this.requests;
    }

}
