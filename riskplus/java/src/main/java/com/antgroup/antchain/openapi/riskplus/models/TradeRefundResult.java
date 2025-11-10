// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class TradeRefundResult extends TeaModel {
    // 退款请求编号
    /**
     * <strong>example:</strong>
     * <p>20880002000001</p>
     */
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 退款金额
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("refund_amount")
    @Validation(required = true)
    public Long refundAmount;

    // 退款原因
    /**
     * <strong>example:</strong>
     * <p>不想要了</p>
     */
    @NameInMap("refund_reason")
    @Validation(required = true)
    public String refundReason;

    // 退款状态
    /**
     * <strong>example:</strong>
     * <p>REFUND_SUCCESS</p>
     */
    @NameInMap("refund_status")
    @Validation(required = true)
    public String refundStatus;

    // 退款失败原因
    /**
     * <strong>example:</strong>
     * <p>参数异常</p>
     */
    @NameInMap("refund_fail_reason")
    @Validation(required = true)
    public String refundFailReason;

    public static TradeRefundResult build(java.util.Map<String, ?> map) throws Exception {
        TradeRefundResult self = new TradeRefundResult();
        return TeaModel.build(map, self);
    }

    public TradeRefundResult setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public TradeRefundResult setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public TradeRefundResult setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public TradeRefundResult setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public TradeRefundResult setRefundFailReason(String refundFailReason) {
        this.refundFailReason = refundFailReason;
        return this;
    }
    public String getRefundFailReason() {
        return this.refundFailReason;
    }

}
