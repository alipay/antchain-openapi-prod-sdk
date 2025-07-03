// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class ResetProductRedisRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 要刷新的产品码类型
    @NameInMap("products")
    @Validation(required = true)
    public java.util.List<String> products;

    public static ResetProductRedisRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetProductRedisRequest self = new ResetProductRedisRequest();
        return TeaModel.build(map, self);
    }

    public ResetProductRedisRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetProductRedisRequest setProducts(java.util.List<String> products) {
        this.products = products;
        return this;
    }
    public java.util.List<String> getProducts() {
        return this.products;
    }

}
