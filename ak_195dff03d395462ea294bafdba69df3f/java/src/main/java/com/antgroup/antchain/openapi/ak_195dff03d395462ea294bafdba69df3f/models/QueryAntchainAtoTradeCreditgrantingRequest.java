// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoTradeCreditgrantingRequest extends TeaModel {
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

    public static QueryAntchainAtoTradeCreditgrantingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoTradeCreditgrantingRequest self = new QueryAntchainAtoTradeCreditgrantingRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoTradeCreditgrantingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoTradeCreditgrantingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoTradeCreditgrantingRequest setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public QueryAntchainAtoTradeCreditgrantingRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
