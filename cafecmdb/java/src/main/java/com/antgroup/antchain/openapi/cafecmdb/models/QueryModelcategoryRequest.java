// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class QueryModelcategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryModelcategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelcategoryRequest self = new QueryModelcategoryRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelcategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
