// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antdigital_demosdk.models;

import com.aliyun.tea.*;

public class QueryCcXxRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // aa
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryCcXxRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCcXxRequest self = new QueryCcXxRequest();
        return TeaModel.build(map, self);
    }

    public QueryCcXxRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCcXxRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCcXxRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
