// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseMasterzoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static AllDatabaseMasterzoneRequest build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseMasterzoneRequest self = new AllDatabaseMasterzoneRequest();
        return TeaModel.build(map, self);
    }

    public AllDatabaseMasterzoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllDatabaseMasterzoneRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
