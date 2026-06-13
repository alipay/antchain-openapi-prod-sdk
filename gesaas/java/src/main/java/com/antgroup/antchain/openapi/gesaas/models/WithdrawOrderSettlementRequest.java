// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class WithdrawOrderSettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退分账金额，单位：分
    @NameInMap("refund_amount")
    @Validation(required = true)
    public Long refundAmount;

    // 分账单号
    @NameInMap("settle_no")
    @Validation(required = true)
    public String settleNo;

    // 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
    @NameInMap("refund_reason")
    public String refundReason;

    public static WithdrawOrderSettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawOrderSettlementRequest self = new WithdrawOrderSettlementRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawOrderSettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public WithdrawOrderSettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public WithdrawOrderSettlementRequest setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public WithdrawOrderSettlementRequest setSettleNo(String settleNo) {
        this.settleNo = settleNo;
        return this;
    }
    public String getSettleNo() {
        return this.settleNo;
    }

    public WithdrawOrderSettlementRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

}
