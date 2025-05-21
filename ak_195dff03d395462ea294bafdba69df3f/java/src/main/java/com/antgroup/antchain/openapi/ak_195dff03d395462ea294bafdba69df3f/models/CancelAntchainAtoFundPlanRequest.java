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

    // 融资单的资方社会信用代码
    @NameInMap("fund_id")
    @Validation(maxLength = 64)
    public String fundId;

    // 操作
    @NameInMap("operation")
    @Validation(maxLength = 64)
    public String operation;

    // 赎回金额,单位为分,取消并赎回时必填
    @NameInMap("redeem_amount")
    public Long redeemAmount;

    // 赎回类型，为空默认为 TRANSFER 
    // 转账代偿：TRANSFER
    // 代扣代偿：WITHHOLD
    @NameInMap("redeem_type")
    @Validation(maxLength = 64)
    public String redeemType;

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

    public CancelAntchainAtoFundPlanRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public CancelAntchainAtoFundPlanRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public CancelAntchainAtoFundPlanRequest setRedeemAmount(Long redeemAmount) {
        this.redeemAmount = redeemAmount;
        return this;
    }
    public Long getRedeemAmount() {
        return this.redeemAmount;
    }

    public CancelAntchainAtoFundPlanRequest setRedeemType(String redeemType) {
        this.redeemType = redeemType;
        return this;
    }
    public String getRedeemType() {
        return this.redeemType;
    }

}
