// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tritestdemo.models;

import com.aliyun.tea.*;

public class QueryTrApiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 入参
    @NameInMap("param")
    @Validation(required = true)
    public String param;

    public static QueryTrApiRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrApiRequest self = new QueryTrApiRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrApiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTrApiRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
