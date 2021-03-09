// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseSecurityipRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 数据库id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static AllDatabaseSecurityipRequest build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseSecurityipRequest self = new AllDatabaseSecurityipRequest();
        return TeaModel.build(map, self);
    }

    public AllDatabaseSecurityipRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllDatabaseSecurityipRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AllDatabaseSecurityipRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
