// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class QueryInternalFailureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 入参
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static QueryInternalFailureRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInternalFailureRequest self = new QueryInternalFailureRequest();
        return TeaModel.build(map, self);
    }

    public QueryInternalFailureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInternalFailureRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
