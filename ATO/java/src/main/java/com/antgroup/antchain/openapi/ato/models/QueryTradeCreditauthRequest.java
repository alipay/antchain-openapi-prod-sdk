// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryTradeCreditauthRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // merchant_id
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    // auth_id
    @NameInMap("auth_id")
    @Validation(required = true, maxLength = 32, minLength = 1)
    public String authId;

    public static QueryTradeCreditauthRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeCreditauthRequest self = new QueryTradeCreditauthRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeCreditauthRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTradeCreditauthRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTradeCreditauthRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QueryTradeCreditauthRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

}
