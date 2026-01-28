// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class ApplyAntchainAtoTradeCreditgrantingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授信id
    @NameInMap("granting_id")
    @Validation(required = true, maxLength = 49, minLength = 6)
    public String grantingId;

    // merchant_id
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 63, minLength = 1)
    public String merchantId;

    // merchant_name
    @NameInMap("merchant_name")
    @Validation(required = true, maxLength = 199, minLength = 1)
    public String merchantName;

    // fund_id
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 63, minLength = 1)
    public String fundId;

    // auth_id
    @NameInMap("auth_id")
    @Validation(required = true, maxLength = 63, minLength = 1)
    public String authId;

    // 授信附加信息
    @NameInMap("credit_extra_data")
    public String creditExtraData;

    public static ApplyAntchainAtoTradeCreditgrantingRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntchainAtoTradeCreditgrantingRequest self = new ApplyAntchainAtoTradeCreditgrantingRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntchainAtoTradeCreditgrantingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAntchainAtoTradeCreditgrantingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAntchainAtoTradeCreditgrantingRequest setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public ApplyAntchainAtoTradeCreditgrantingRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ApplyAntchainAtoTradeCreditgrantingRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public ApplyAntchainAtoTradeCreditgrantingRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public ApplyAntchainAtoTradeCreditgrantingRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public ApplyAntchainAtoTradeCreditgrantingRequest setCreditExtraData(String creditExtraData) {
        this.creditExtraData = creditExtraData;
        return this;
    }
    public String getCreditExtraData() {
        return this.creditExtraData;
    }

}
