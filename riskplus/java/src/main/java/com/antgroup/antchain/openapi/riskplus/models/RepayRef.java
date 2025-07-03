// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RepayRef extends TeaModel {
    // 客户编码
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("custom_no")
    @Validation(required = true)
    public String customNo;

    // 当前期数
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("period")
    @Validation(required = true)
    public String period;

    // 应还总额
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("receipt_no")
    @Validation(required = true)
    public String receiptNo;

    // 还款状态1：已还清 2 未还 3 部分还款
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 应还日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("settle_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String settleDate;

    // 还款日期
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("trade_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String tradeDate;

    public static RepayRef build(java.util.Map<String, ?> map) throws Exception {
        RepayRef self = new RepayRef();
        return TeaModel.build(map, self);
    }

    public RepayRef setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public RepayRef setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public RepayRef setNeedAmount(Long needAmount) {
        this.needAmount = needAmount;
        return this;
    }
    public Long getNeedAmount() {
        return this.needAmount;
    }

    public RepayRef setNeedCorpus(Long needCorpus) {
        this.needCorpus = needCorpus;
        return this;
    }
    public Long getNeedCorpus() {
        return this.needCorpus;
    }

    public RepayRef setNeedAccrual(Long needAccrual) {
        this.needAccrual = needAccrual;
        return this;
    }
    public Long getNeedAccrual() {
        return this.needAccrual;
    }

    public RepayRef setNeedFee(Long needFee) {
        this.needFee = needFee;
        return this;
    }
    public Long getNeedFee() {
        return this.needFee;
    }

    public RepayRef setAlreadyAmount(Long alreadyAmount) {
        this.alreadyAmount = alreadyAmount;
        return this;
    }
    public Long getAlreadyAmount() {
        return this.alreadyAmount;
    }

    public RepayRef setAlreadyCorpus(Long alreadyCorpus) {
        this.alreadyCorpus = alreadyCorpus;
        return this;
    }
    public Long getAlreadyCorpus() {
        return this.alreadyCorpus;
    }

    public RepayRef setAlreadyOvercorpus(Long alreadyOvercorpus) {
        this.alreadyOvercorpus = alreadyOvercorpus;
        return this;
    }
    public Long getAlreadyOvercorpus() {
        return this.alreadyOvercorpus;
    }

    public RepayRef setAlreadyAccrual(Long alreadyAccrual) {
        this.alreadyAccrual = alreadyAccrual;
        return this;
    }
    public Long getAlreadyAccrual() {
        return this.alreadyAccrual;
    }

    public RepayRef setAlreadyPunish(Long alreadyPunish) {
        this.alreadyPunish = alreadyPunish;
        return this;
    }
    public Long getAlreadyPunish() {
        return this.alreadyPunish;
    }

    public RepayRef setAlreadyFee(Long alreadyFee) {
        this.alreadyFee = alreadyFee;
        return this;
    }
    public Long getAlreadyFee() {
        return this.alreadyFee;
    }

    public RepayRef setRate(Long rate) {
        this.rate = rate;
        return this;
    }
    public Long getRate() {
        return this.rate;
    }

    public RepayRef setPenaltyValue(Long penaltyValue) {
        this.penaltyValue = penaltyValue;
        return this;
    }
    public Long getPenaltyValue() {
        return this.penaltyValue;
    }

    public RepayRef setRestAmount(Long restAmount) {
        this.restAmount = restAmount;
        return this;
    }
    public Long getRestAmount() {
        return this.restAmount;
    }

    public RepayRef setRestCorpus(Long restCorpus) {
        this.restCorpus = restCorpus;
        return this;
    }
    public Long getRestCorpus() {
        return this.restCorpus;
    }

    public RepayRef setRestAccrual(Long restAccrual) {
        this.restAccrual = restAccrual;
        return this;
    }
    public Long getRestAccrual() {
        return this.restAccrual;
    }

    public RepayRef setRestPunish(Long restPunish) {
        this.restPunish = restPunish;
        return this;
    }
    public Long getRestPunish() {
        return this.restPunish;
    }

    public RepayRef setRemainCorpus(Long remainCorpus) {
        this.remainCorpus = remainCorpus;
        return this;
    }
    public Long getRemainCorpus() {
        return this.remainCorpus;
    }

    public RepayRef setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
        return this;
    }
    public String getReceiptNo() {
        return this.receiptNo;
    }

    public RepayRef setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RepayRef setSettleDate(String settleDate) {
        this.settleDate = settleDate;
        return this;
    }
    public String getSettleDate() {
        return this.settleDate;
    }

    public RepayRef setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
        return this;
    }
    public String getTradeDate() {
        return this.tradeDate;
    }

}
