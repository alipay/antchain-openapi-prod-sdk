// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryApiDetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // demo
    @NameInMap("target_prod")
    @Validation(required = true)
    public String targetProd;

    // demo
    @NameInMap("target_api")
    @Validation(required = true)
    public String targetApi;

    public static QueryApiDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApiDetailRequest self = new QueryApiDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryApiDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApiDetailRequest setTargetProd(String targetProd) {
        this.targetProd = targetProd;
        return this;
    }
    public String getTargetProd() {
        return this.targetProd;
    }

    public QueryApiDetailRequest setTargetApi(String targetApi) {
        this.targetApi = targetApi;
        return this;
    }
    public String getTargetApi() {
        return this.targetApi;
    }

}
