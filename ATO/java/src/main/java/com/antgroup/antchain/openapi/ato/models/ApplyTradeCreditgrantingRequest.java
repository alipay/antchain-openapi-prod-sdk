// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ApplyTradeCreditgrantingRequest extends TeaModel {
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

    public static ApplyTradeCreditgrantingRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTradeCreditgrantingRequest self = new ApplyTradeCreditgrantingRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTradeCreditgrantingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyTradeCreditgrantingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyTradeCreditgrantingRequest setGrantingId(String grantingId) {
        this.grantingId = grantingId;
        return this;
    }
    public String getGrantingId() {
        return this.grantingId;
    }

    public ApplyTradeCreditgrantingRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ApplyTradeCreditgrantingRequest setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public ApplyTradeCreditgrantingRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public ApplyTradeCreditgrantingRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public ApplyTradeCreditgrantingRequest setCreditExtraData(String creditExtraData) {
        this.creditExtraData = creditExtraData;
        return this;
    }
    public String getCreditExtraData() {
        return this.creditExtraData;
    }

}
