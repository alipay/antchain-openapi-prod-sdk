// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cat.models;

import com.aliyun.tea.*;

public class QueryTestCccRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryTestCccRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestCccRequest self = new QueryTestCccRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestCccRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
