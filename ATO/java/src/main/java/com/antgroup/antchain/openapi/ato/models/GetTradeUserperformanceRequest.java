// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetTradeUserperformanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 商家公司社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String merchantId;

    public static GetTradeUserperformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTradeUserperformanceRequest self = new GetTradeUserperformanceRequest();
        return TeaModel.build(map, self);
    }

    public GetTradeUserperformanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTradeUserperformanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTradeUserperformanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetTradeUserperformanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
