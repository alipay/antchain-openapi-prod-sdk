// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncRentalPayorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 商户社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 平台支付单信息，JSON字符串，RentalPayOrderRequest定义
    @NameInMap("pay_order_info")
    @Validation(required = true)
    public String payOrderInfo;

    public static SyncRentalPayorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncRentalPayorderRequest self = new SyncRentalPayorderRequest();
        return TeaModel.build(map, self);
    }

    public SyncRentalPayorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncRentalPayorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncRentalPayorderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncRentalPayorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncRentalPayorderRequest setPayOrderInfo(String payOrderInfo) {
        this.payOrderInfo = payOrderInfo;
        return this;
    }
    public String getPayOrderInfo() {
        return this.payOrderInfo;
    }

}
