// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class GetAntchainAtoFundUserperformanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String orderId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    // 订单所属融资公司的社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String fundId;

    public static GetAntchainAtoFundUserperformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainAtoFundUserperformanceRequest self = new GetAntchainAtoFundUserperformanceRequest();
        return TeaModel.build(map, self);
    }

    public GetAntchainAtoFundUserperformanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAntchainAtoFundUserperformanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetAntchainAtoFundUserperformanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetAntchainAtoFundUserperformanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public GetAntchainAtoFundUserperformanceRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

}
