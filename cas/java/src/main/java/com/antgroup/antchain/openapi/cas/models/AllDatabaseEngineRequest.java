// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AllDatabaseEngineRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static AllDatabaseEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        AllDatabaseEngineRequest self = new AllDatabaseEngineRequest();
        return TeaModel.build(map, self);
    }

    public AllDatabaseEngineRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
