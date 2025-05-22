// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CancelFundPlanRequest extends TeaModel {
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

    public static CancelFundPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelFundPlanRequest self = new CancelFundPlanRequest();
        return TeaModel.build(map, self);
    }

    public CancelFundPlanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelFundPlanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelFundPlanRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelFundPlanRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CancelFundPlanRequest setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }
    public String getCancelReason() {
        return this.cancelReason;
    }

    public CancelFundPlanRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public CancelFundPlanRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public CancelFundPlanRequest setRedeemAmount(Long redeemAmount) {
        this.redeemAmount = redeemAmount;
        return this;
    }
    public Long getRedeemAmount() {
        return this.redeemAmount;
    }

    public CancelFundPlanRequest setRedeemType(String redeemType) {
        this.redeemType = redeemType;
        return this;
    }
    public String getRedeemType() {
        return this.redeemType;
    }

}
