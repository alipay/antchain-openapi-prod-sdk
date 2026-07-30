// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class OverdueInfoResponse extends TeaModel {
    // 逾期标识
    // true：逾期
    // false：未逾期
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("over_due_flag")
    @Validation(required = true)
    public Boolean overDueFlag;

    // 逾期天数
    @NameInMap("over_days")
    @Validation(required = true)
    public Long overDays;

    // 逾期金额在50元以上的客户的逾期天数
    @NameInMap("valuable_over_days")
    @Validation(required = true)
    public Long valuableOverDays;

    // 逾期期数
    @NameInMap("over_period_count")
    @Validation(required = true)
    public Long overPeriodCount;

    // 逾期本金
    @NameInMap("over_principal")
    @Validation(required = true)
    public Long overPrincipal;

    // 逾期利息
    @NameInMap("over_interest")
    @Validation(required = true)
    public Long overInterest;

    // 应还罚息
    @NameInMap("over_punish")
    @Validation(required = true)
    public Long overPunish;

    // 应还逾期总额
    @NameInMap("need_overdue_amount")
    @Validation(required = true)
    public Long needOverdueAmount;

    // 当前应还总额
    @NameInMap("current_need_amount")
    @Validation(required = true)
    public Long currentNeedAmount;

    // 总剩余应还
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 数据日期
    @NameInMap("settle_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String settleDate;

    // 借款唯一编号
    /**
     * <strong>example:</strong>
     * <p>R2022xxxxxx</p>
     */
    @NameInMap("receipt_no")
    @Validation(required = true)
    public String receiptNo;

    // 已还期数
    @NameInMap("already_repay_period_count")
    @Validation(required = true)
    public Long alreadyRepayPeriodCount;

    // 贷款期数
    @NameInMap("loan_period_count")
    @Validation(required = true)
    public Long loanPeriodCount;

    // 未还本金
    @NameInMap("outstanding_principal")
    @Validation(required = true)
    public Long outstandingPrincipal;

    // 放款日期
    @NameInMap("loan_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String loanTime;

    // 结清标志
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("settle_flag")
    @Validation(required = true)
    public Boolean settleFlag;

    // 最近一次还款日期
    @NameInMap("nearest_repay_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String nearestRepayTime;

    public static OverdueInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        OverdueInfoResponse self = new OverdueInfoResponse();
        return TeaModel.build(map, self);
    }

    public OverdueInfoResponse setOverDueFlag(Boolean overDueFlag) {
        this.overDueFlag = overDueFlag;
        return this;
    }
    public Boolean getOverDueFlag() {
        return this.overDueFlag;
    }

    public OverdueInfoResponse setOverDays(Long overDays) {
        this.overDays = overDays;
        return this;
    }
    public Long getOverDays() {
        return this.overDays;
    }

    public OverdueInfoResponse setValuableOverDays(Long valuableOverDays) {
        this.valuableOverDays = valuableOverDays;
        return this;
    }
    public Long getValuableOverDays() {
        return this.valuableOverDays;
    }

    public OverdueInfoResponse setOverPeriodCount(Long overPeriodCount) {
        this.overPeriodCount = overPeriodCount;
        return this;
    }
    public Long getOverPeriodCount() {
        return this.overPeriodCount;
    }

    public OverdueInfoResponse setOverPrincipal(Long overPrincipal) {
        this.overPrincipal = overPrincipal;
        return this;
    }
    public Long getOverPrincipal() {
        return this.overPrincipal;
    }

    public OverdueInfoResponse setOverInterest(Long overInterest) {
        this.overInterest = overInterest;
        return this;
    }
    public Long getOverInterest() {
        return this.overInterest;
    }

    public OverdueInfoResponse setOverPunish(Long overPunish) {
        this.overPunish = overPunish;
        return this;
    }
    public Long getOverPunish() {
        return this.overPunish;
    }

    public OverdueInfoResponse setNeedOverdueAmount(Long needOverdueAmount) {
        this.needOverdueAmount = needOverdueAmount;
        return this;
    }
    public Long getNeedOverdueAmount() {
        return this.needOverdueAmount;
    }

    public OverdueInfoResponse setCurrentNeedAmount(Long currentNeedAmount) {
        this.currentNeedAmount = currentNeedAmount;
        return this;
    }
    public Long getCurrentNeedAmount() {
        return this.currentNeedAmount;
    }

    public OverdueInfoResponse setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public OverdueInfoResponse setSettleDate(String settleDate) {
        this.settleDate = settleDate;
        return this;
    }
    public String getSettleDate() {
        return this.settleDate;
    }

    public OverdueInfoResponse setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

    public OverdueInfoResponse setAlreadyRepayPeriodCount(Long alreadyRepayPeriodCount) {
        this.alreadyRepayPeriodCount = alreadyRepayPeriodCount;
        return this;
    }
    public Long getAlreadyRepayPeriodCount() {
        return this.alreadyRepayPeriodCount;
    }

    public OverdueInfoResponse setLoanPeriodCount(Long loanPeriodCount) {
        this.loanPeriodCount = loanPeriodCount;
        return this;
    }
    public Long getLoanPeriodCount() {
        return this.loanPeriodCount;
    }

    public OverdueInfoResponse setOutstandingPrincipal(Long outstandingPrincipal) {
        this.outstandingPrincipal = outstandingPrincipal;
        return this;
    }
    public Long getOutstandingPrincipal() {
        return this.outstandingPrincipal;
    }

    public OverdueInfoResponse setLoanTime(String loanTime) {
        this.loanTime = loanTime;
        return this;
    }
    public String getLoanTime() {
        return this.loanTime;
    }

    public OverdueInfoResponse setSettleFlag(Boolean settleFlag) {
        this.settleFlag = settleFlag;
        return this;
    }
    public Boolean getSettleFlag() {
        return this.settleFlag;
    }

    public OverdueInfoResponse setNearestRepayTime(String nearestRepayTime) {
        this.nearestRepayTime = nearestRepayTime;
        return this;
    }
    public String getNearestRepayTime() {
        return this.nearestRepayTime;
    }

}
