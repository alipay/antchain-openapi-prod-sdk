// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class QueryExternalFailureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 入参
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static QueryExternalFailureRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryExternalFailureRequest self = new QueryExternalFailureRequest();
        return TeaModel.build(map, self);
    }

    public QueryExternalFailureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryExternalFailureRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
