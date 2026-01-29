// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryTradeCreditgrantingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // granting_id
    @NameInMap("granting_id")
    @Validation(required = true, maxLength = 49, minLength = 6)
    public String grantingId;

    // merchant_id
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 63, minLength = 1)
    public String merchantId;

    public static QueryTradeCreditgrantingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeCreditgrantingRequest self = new QueryTradeCreditgrantingRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradeCreditgrantingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTradeCreditgrantingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTradeCreditgrantingRequest setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public QueryTradeCreditgrantingRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
