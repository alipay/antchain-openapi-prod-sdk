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

    // 用户已支出金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("expense_amount")
    public String expenseAmount;

    // 商城已消费金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("consume_amount")
    public String consumeAmount;

    // 商城已冻结金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("frozen_amount")
    public String frozenAmount;

    // 是否逾期
    /**
     * <strong>example:</strong>
     * <p>TRUE</p>
     */
    @NameInMap("overdue")
    public String overdue;

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

    // 解约后退还用户金额
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("refund_amount_to_user")
    public String refundAmountToUser;

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

    public PoiAccountInfo setExpenseAmount(String expenseAmount) {
        this.expenseAmount = expenseAmount;
        return this;
    }
    public String getExpenseAmount() {
        return this.expenseAmount;
    }

    public PoiAccountInfo setConsumeAmount(String consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }
    public String getConsumeAmount() {
        return this.consumeAmount;
    }

    public PoiAccountInfo setFrozenAmount(String frozenAmount) {
        this.frozenAmount = frozenAmount;
        return this;
    }
    public String getFrozenAmount() {
        return this.frozenAmount;
    }

    public PoiAccountInfo setOverdue(String overdue) {
        this.overdue = overdue;
        return this;
    }
    public String getOverdue() {
        return this.overdue;
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

}
