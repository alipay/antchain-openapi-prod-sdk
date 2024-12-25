// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateTradeOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // order_id
    @NameInMap("order_id")
    @Validation(required = true, minLength = 1)
    public String orderId;

    // merchant_id
    @NameInMap("merchant_id")
    @Validation(required = true, minLength = 1)
    public String merchantId;

    // json字符串
    @NameInMap("update_order_info")
    @Validation(required = true, minLength = 1)
    public String updateOrderInfo;

    public static UpdateTradeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTradeOrderRequest self = new UpdateTradeOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTradeOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateTradeOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateTradeOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateTradeOrderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdateTradeOrderRequest setUpdateOrderInfo(String updateOrderInfo) {
        this.updateOrderInfo = updateOrderInfo;
        return this;
    }
    public String getUpdateOrderInfo() {
        return this.updateOrderInfo;
    }

}
