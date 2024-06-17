// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayResult extends TeaModel {
    // 客户编码
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 当前期数
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 应还总额
    @NameInMap("need_amount")
    @Validation(required = true)
    public Long needAmount;

    // 应还本金
    @NameInMap("need_corpus")
    @Validation(required = true)
    public Long needCorpus;

    // 应还利息
    @NameInMap("need_accrual")
    @Validation(required = true)
    public Long needAccrual;

    // 应还手续费
    @NameInMap("need_fee")
    @Validation(required = true)
    public Long needFee;

    // 已还总额
    @NameInMap("already_amount")
    @Validation(required = true)
    public Long alreadyAmount;

    // 已还本金
    @NameInMap("already_corpus")
    @Validation(required = true)
    public Long alreadyCorpus;

    // 已还逾期本金
    @NameInMap("already_overcorpus")
    @Validation(required = true)
    public Long alreadyOvercorpus;

    // 已还利息
    @NameInMap("already_accrual")
    @Validation(required = true)
    public Long alreadyAccrual;

    // 已还逾期息
    @NameInMap("already_punish")
    @Validation(required = true)
    public Long alreadyPunish;

    // 已还手续费
    @NameInMap("already_fee")
    @Validation(required = true)
    public Long alreadyFee;

    // 利率
    @NameInMap("rate")
    @Validation(required = true)
    public Long rate;

    // 罚息率
    @NameInMap("penalty_value")
    @Validation(required = true)
    public Long penaltyValue;

    // 当期剩余总额
    @NameInMap("rest_amount")
    @Validation(required = true)
    public Long restAmount;

    // 当期剩余本金
    @NameInMap("rest_corpus")
    @Validation(required = true)
    public Long restCorpus;

    // 当期剩余利息
    @NameInMap("rest_accrual")
    @Validation(required = true)
    public Long restAccrual;

    // 当期剩余罚息
    @NameInMap("rest_punish")
    @Validation(required = true)
    public Long restPunish;

    // 期末本金
    @NameInMap("remain_corpus")
    @Validation(required = true)
    public Long remainCorpus;

    // 借据编号
    @NameInMap("receipt_no")
    @Validation(required = true)
    public String receiptNo;

    // 还款状态1：已还清 2 未还 3 部分还款
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 应还日期
    @NameInMap("settle_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String settleDate;

    // 还款日期
    @NameInMap("trade_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tradeDate;

    // 已还担保费
    @NameInMap("already_guarantee_fee")
    @Validation(required = true)
    public Long alreadyGuaranteeFee;

    // 已还违约金
    @NameInMap("already_liquidated_damages")
    @Validation(required = true)
    public Long alreadyLiquidatedDamages;

    // 当期剩余担保费
    @NameInMap("rest_guarantee_fee")
    @Validation(required = true)
    public Long restGuaranteeFee;

    // 当期剩余违约金
    @NameInMap("rest_liquidated_damages")
    @Validation(required = true)
    public Long restLiquidatedDamages;

    // 应还担保费
    @NameInMap("need_guarantee_fee")
    @Validation(required = true)
    public Long needGuaranteeFee;

    // 应还违约金
    @NameInMap("need_liquidated_damages")
    @Validation(required = true)
    public Long needLiquidatedDamages;

    // 逾期天数
    @NameInMap("overdue_days")
    @Validation(required = true)
    public Long overdueDays;

    public static RepayResult build(java.util.Map<String, ?> map) throws Exception {
        RepayResult self = new RepayResult();
        return TeaModel.build(map, self);
    }

    public RepayResult setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public RepayResult setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public RepayResult setNeedAmount(Long needAmount) {
        this.needAmount = needAmount;
        return this;
    }
    public Long getNeedAmount() {
        return this.needAmount;
    }

    public RepayResult setNeedCorpus(Long needCorpus) {
        this.needCorpus = needCorpus;
        return this;
    }
    public Long getNeedCorpus() {
        return this.needCorpus;
    }

    public RepayResult setNeedAccrual(Long needAccrual) {
        this.needAccrual = needAccrual;
        return this;
    }
    public Long getNeedAccrual() {
        return this.needAccrual;
    }

    public RepayResult setNeedFee(Long needFee) {
        this.needFee = needFee;
        return this;
    }
    public Long getNeedFee() {
        return this.needFee;
    }

    public RepayResult setAlreadyAmount(Long alreadyAmount) {
        this.alreadyAmount = alreadyAmount;
        return this;
    }
    public Long getAlreadyAmount() {
        return this.alreadyAmount;
    }

    public RepayResult setAlreadyCorpus(Long alreadyCorpus) {
        this.alreadyCorpus = alreadyCorpus;
        return this;
    }
    public Long getAlreadyCorpus() {
        return this.alreadyCorpus;
    }

    public RepayResult setAlreadyOvercorpus(Long alreadyOvercorpus) {
        this.alreadyOvercorpus = alreadyOvercorpus;
        return this;
    }
    public Long getAlreadyOvercorpus() {
        return this.alreadyOvercorpus;
    }

    public RepayResult setAlreadyAccrual(Long alreadyAccrual) {
        this.alreadyAccrual = alreadyAccrual;
        return this;
    }
    public Long getAlreadyAccrual() {
        return this.alreadyAccrual;
    }

    public RepayResult setAlreadyPunish(Long alreadyPunish) {
        this.alreadyPunish = alreadyPunish;
        return this;
    }
    public Long getAlreadyPunish() {
        return this.alreadyPunish;
    }

    public RepayResult setAlreadyFee(Long alreadyFee) {
        this.alreadyFee = alreadyFee;
        return this;
    }
    public Long getAlreadyFee() {
        return this.alreadyFee;
    }

    public RepayResult setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public RepayResult setPenaltyValue(Long penaltyValue) {
        this.penaltyValue = penaltyValue;
        return this;
    }
    public Long getPenaltyValue() {
        return this.penaltyValue;
    }

    public RepayResult setRestAmount(Long restAmount) {
        this.restAmount = restAmount;
        return this;
    }
    public Long getRestAmount() {
        return this.restAmount;
    }

    public RepayResult setRestCorpus(Long restCorpus) {
        this.restCorpus = restCorpus;
        return this;
    }
    public Long getRestCorpus() {
        return this.restCorpus;
    }

    public RepayResult setRestAccrual(Long restAccrual) {
        this.restAccrual = restAccrual;
        return this;
    }
    public Long getRestAccrual() {
        return this.restAccrual;
    }

    public RepayResult setRestPunish(Long restPunish) {
        this.restPunish = restPunish;
        return this;
    }
    public Long getRestPunish() {
        return this.restPunish;
    }

    public RepayResult setRemainCorpus(Long remainCorpus) {
        this.remainCorpus = remainCorpus;
        return this;
    }
    public Long getRemainCorpus() {
        return this.remainCorpus;
    }

    public RepayResult setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

    public RepayResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RepayResult setSettleDate(String settleDate) {
        this.settleDate = settleDate;
        return this;
    }
    public String getSettleDate() {
        return this.settleDate;
    }

    public RepayResult setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }

    public RepayResult setAlreadyGuaranteeFee(Long alreadyGuaranteeFee) {
        this.alreadyGuaranteeFee = alreadyGuaranteeFee;
        return this;
    }
    public Long getAlreadyGuaranteeFee() {
        return this.alreadyGuaranteeFee;
    }

    public RepayResult setAlreadyLiquidatedDamages(Long alreadyLiquidatedDamages) {
        this.alreadyLiquidatedDamages = alreadyLiquidatedDamages;
        return this;
    }
    public Long getAlreadyLiquidatedDamages() {
        return this.alreadyLiquidatedDamages;
    }

    public RepayResult setRestGuaranteeFee(Long restGuaranteeFee) {
        this.restGuaranteeFee = restGuaranteeFee;
        return this;
    }
    public Long getRestGuaranteeFee() {
        return this.restGuaranteeFee;
    }

    public RepayResult setRestLiquidatedDamages(Long restLiquidatedDamages) {
        this.restLiquidatedDamages = restLiquidatedDamages;
        return this;
    }
    public Long getRestLiquidatedDamages() {
        return this.restLiquidatedDamages;
    }

    public RepayResult setNeedGuaranteeFee(Long needGuaranteeFee) {
        this.needGuaranteeFee = needGuaranteeFee;
        return this;
    }
    public Long getNeedGuaranteeFee() {
        return this.needGuaranteeFee;
    }

    public RepayResult setNeedLiquidatedDamages(Long needLiquidatedDamages) {
        this.needLiquidatedDamages = needLiquidatedDamages;
        return this;
    }
    public Long getNeedLiquidatedDamages() {
        return this.needLiquidatedDamages;
    }

    public RepayResult setOverdueDays(Long overdueDays) {
        this.overdueDays = overdueDays;
        return this;
    }
    public Long getOverdueDays() {
        return this.overdueDays;
    }

}
