// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class PoiAccountInfo extends TeaModel {
    // 账户ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("account_id")
    public String accountId;

    // 已消费金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("consume_amount")
    public String consumeAmount;

    // 已还金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("repay_amount")
    public String repayAmount;

    // 解约后剩余应还金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("remaining_amount")
    public String remainingAmount;

    // 可退还用户金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("refund_amount_to_user")
    public String refundAmountToUser;

    // 可退还资方金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("refund_amount_to_investor")
    public String refundAmountToInvestor;

    public static PoiAccountInfo build(java.util.Map<String, ?> map) throws Exception {
        PoiAccountInfo self = new PoiAccountInfo();
        return TeaModel.build(map, self);
    }

    public PoiAccountInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PoiAccountInfo setConsumeAmount(String consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }
    public String getConsumeAmount() {
        return this.consumeAmount;
    }

    public PoiAccountInfo setRepayAmount(String repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public String getRepayAmount() {
        return this.repayAmount;
    }

    public PoiAccountInfo setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
        return this;
    }
    public String getRemainingAmount() {
        return this.remainingAmount;
    }

    public PoiAccountInfo setRefundAmountToUser(String refundAmountToUser) {
        this.refundAmountToUser = refundAmountToUser;
        return this;
    }
    public String getRefundAmountToUser() {
        return this.refundAmountToUser;
    }

    public PoiAccountInfo setRefundAmountToInvestor(String refundAmountToInvestor) {
        this.refundAmountToInvestor = refundAmountToInvestor;
        return this;
    }
    public String getRefundAmountToInvestor() {
        return this.refundAmountToInvestor;
    }

}
