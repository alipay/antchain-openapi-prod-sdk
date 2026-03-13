// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RefundRoyaltyResult extends TeaModel {
    // 退分账金额
    /**
     * <strong>example:</strong>
     * <p>12.50</p>
     */
    @NameInMap("refund_amount")
    @Validation(required = true)
    public String refundAmount;

    // 退分账结果码
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("result_code")
    @Validation(required = true)
    public String resultCode;

    public static RefundRoyaltyResult build(java.util.Map<String, ?> map) throws Exception {
        RefundRoyaltyResult self = new RefundRoyaltyResult();
        return TeaModel.build(map, self);
    }

    public RefundRoyaltyResult setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefundRoyaltyResult setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
