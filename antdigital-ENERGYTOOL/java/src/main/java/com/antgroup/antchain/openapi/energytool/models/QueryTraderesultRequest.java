// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryTraderesultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryTraderesultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraderesultRequest self = new QueryTraderesultRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraderesultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
