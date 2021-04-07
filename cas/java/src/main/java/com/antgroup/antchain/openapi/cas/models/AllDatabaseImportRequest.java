// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseImportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static AllDatabaseImportRequest build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseImportRequest self = new AllDatabaseImportRequest();
        return TeaModel.build(map, self);
    }

    public AllDatabaseImportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllDatabaseImportRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
