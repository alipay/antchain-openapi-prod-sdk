// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class QueryTestCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryTestCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestCreateRequest self = new QueryTestCreateRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
