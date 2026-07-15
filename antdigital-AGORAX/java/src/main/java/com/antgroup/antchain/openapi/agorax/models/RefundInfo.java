// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class RefundInfo extends TeaModel {
    // 退款业务号
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("out_request_no")
    @Validation(required = true)
    public String outRequestNo;

    // 本次退款金额
    /**
     * <strong>example:</strong>
     * <p>11.09</p>
     */
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    // 退款状态
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("refund_status")
    @Validation(required = true)
    public String refundStatus;

    public static RefundInfo build(java.util.Map<String, ?> map) throws Exception {
        RefundInfo self = new RefundInfo();
        return TeaModel.build(map, self);
    }

    public RefundInfo setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public RefundInfo setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefundInfo setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

}
