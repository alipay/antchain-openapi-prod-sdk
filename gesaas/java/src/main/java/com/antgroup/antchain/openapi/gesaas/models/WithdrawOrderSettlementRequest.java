// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class WithdrawOrderSettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退款金额，单位：分
    @NameInMap("refund_amount")
    @Validation(required = true)
    public Long refundAmount;

    // 支付交易号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
    @NameInMap("refund_reason")
    public String refundReason;

    // 【描述】退款请求号。 标识一次退款请求，需要保证在交易号下唯一，如需部分退款，则此参数必传。 注：针对同一次退款请求，如果调用接口失败或异常了，重试时需要保证退款请求号不能变更，防止该笔交易重复退款。会保证同样的退款请求号多次请求只会退一次。
    // 【必选条件】部分退款时必选
    @NameInMap("out_request_no")
    public String outRequestNo;

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

    public WithdrawOrderSettlementRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public WithdrawOrderSettlementRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public WithdrawOrderSettlementRequest setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

}
