// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class AccountInfo extends TeaModel {
    // STRING	账户ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("account_id")
    @Validation(required = true)
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

    public static AccountInfo build(java.util.Map<String, ?> map) throws Exception {
        AccountInfo self = new AccountInfo();
        return TeaModel.build(map, self);
    }

    public AccountInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public AccountInfo setConsumeAmount(String consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }
    public String getConsumeAmount() {
        return this.consumeAmount;
    }

    public AccountInfo setRepayAmount(String repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public String getRepayAmount() {
        return this.repayAmount;
    }

    public AccountInfo setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
        return this;
    }
    public String getRemainingAmount() {
        return this.remainingAmount;
    }

    public AccountInfo setRefundAmountToUser(String refundAmountToUser) {
        this.refundAmountToUser = refundAmountToUser;
        return this;
    }
    public String getRefundAmountToUser() {
        return this.refundAmountToUser;
    }

    public AccountInfo setRefundAmountToInvestor(String refundAmountToInvestor) {
        this.refundAmountToInvestor = refundAmountToInvestor;
        return this;
    }
    public String getRefundAmountToInvestor() {
        return this.refundAmountToInvestor;
    }

}
