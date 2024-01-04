// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CancelAntchainAtoFundPlanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 取消原因 
    // ACTIVE_REDEEM:自主赎回
    // RENTING_OUT_REDEEM:退租赎回
    // RENTING_AND_RESALE_REDEEM:租转售赎回
    @NameInMap("cancel_reason")
    @Validation(required = true)
    public String cancelReason;

    public static CancelAntchainAtoFundPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAntchainAtoFundPlanRequest self = new CancelAntchainAtoFundPlanRequest();
        return TeaModel.build(map, self);
    }

    public CancelAntchainAtoFundPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelAntchainAtoFundPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelAntchainAtoFundPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelAntchainAtoFundPlanRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CancelAntchainAtoFundPlanRequest setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }
    public String getCancelReason() {
        return this.cancelReason;
    }

}
