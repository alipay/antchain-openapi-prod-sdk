// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class ApplyAntchainAtoTradeFinanceprecheckRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度大于6，小于50
    @NameInMap("order_id")
    @Validation(required = true, minLength = 6)
    public String orderId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, minLength = 1)
    public String merchantId;

    // 提交预审的资方的社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, minLength = 1)
    public String fundId;

    // 透传到资方，不做格式限制
    @NameInMap("transparent_info")
    @Validation(maxLength = 1000)
    public String transparentInfo;

    public static ApplyAntchainAtoTradeFinanceprecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntchainAtoTradeFinanceprecheckRequest self = new ApplyAntchainAtoTradeFinanceprecheckRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAntchainAtoTradeFinanceprecheckRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAntchainAtoTradeFinanceprecheckRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAntchainAtoTradeFinanceprecheckRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ApplyAntchainAtoTradeFinanceprecheckRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ApplyAntchainAtoTradeFinanceprecheckRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public ApplyAntchainAtoTradeFinanceprecheckRequest setTransparentInfo(String transparentInfo) {
        this.transparentInfo = transparentInfo;
        return this;
    }
    public String getTransparentInfo() {
        return this.transparentInfo;
    }

}
