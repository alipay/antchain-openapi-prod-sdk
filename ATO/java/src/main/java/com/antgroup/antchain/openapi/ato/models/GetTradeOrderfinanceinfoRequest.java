// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class GetTradeOrderfinanceinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单Id
    @NameInMap("order_id")
    @Validation(required = true, minLength = 1)
    public String orderId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, minLength = 1)
    public String merchantId;

    public static GetTradeOrderfinanceinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTradeOrderfinanceinfoRequest self = new GetTradeOrderfinanceinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTradeOrderfinanceinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTradeOrderfinanceinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTradeOrderfinanceinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetTradeOrderfinanceinfoRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
