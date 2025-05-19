// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class QueryModelbackProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品码，数组形式
    @NameInMap("product_codes")
    @Validation(required = true)
    public java.util.List<String> productCodes;

    public static QueryModelbackProductRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModelbackProductRequest self = new QueryModelbackProductRequest();
        return TeaModel.build(map, self);
    }

    public QueryModelbackProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryModelbackProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryModelbackProductRequest setProductCodes(java.util.List<String> productCodes) {
        this.productCodes = productCodes;
        return this;
    }
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

}
