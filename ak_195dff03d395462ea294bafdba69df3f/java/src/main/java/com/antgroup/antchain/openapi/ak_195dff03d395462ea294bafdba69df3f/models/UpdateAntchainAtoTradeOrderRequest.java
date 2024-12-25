// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class UpdateAntchainAtoTradeOrderRequest extends TeaModel {
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

    public static UpdateAntchainAtoTradeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntchainAtoTradeOrderRequest self = new UpdateAntchainAtoTradeOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntchainAtoTradeOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAntchainAtoTradeOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAntchainAtoTradeOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateAntchainAtoTradeOrderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public UpdateAntchainAtoTradeOrderRequest setUpdateOrderInfo(String updateOrderInfo) {
        this.updateOrderInfo = updateOrderInfo;
        return this;
    }
    public String getUpdateOrderInfo() {
        return this.updateOrderInfo;
    }

}
