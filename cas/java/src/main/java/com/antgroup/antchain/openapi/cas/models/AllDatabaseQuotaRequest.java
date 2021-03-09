// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseQuotaRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static AllDatabaseQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseQuotaRequest self = new AllDatabaseQuotaRequest();
        return TeaModel.build(map, self);
    }

    public AllDatabaseQuotaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllDatabaseQuotaRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
