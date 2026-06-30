// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcLoanDetail extends TeaModel {
    // 借据号
    /**
     * <strong>example:</strong>
     * <p>ACCAL202301120798255316102054428</p>
     */
    @NameInMap("loan_acct_no")
    @Validation(required = true)
    public String loanAcctNo;

    // 贷款金额
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("loan_amt")
    @Validation(required = true)
    public Long loanAmt;

    // 贷款发放日
    /**
     * <strong>example:</strong>
     * <p>2023/05/01</p>
     */
    @NameInMap("loan_start_date")
    @Validation(required = true)
    public String loanStartDate;

    // 贷款到期日
    /**
     * <strong>example:</strong>
     * <p>2023/05/01</p>
     */
    @NameInMap("loan_end_date")
    @Validation(required = true)
    public String loanEndDate;

    // 利率类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rate_type")
    @Validation(required = true)
    public String rateType;

    // 利率单位
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rate_unit")
    @Validation(required = true)
    public String rateUnit;

    // 贷款利率 年化利率(%)
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("loan_int_rate")
    @Validation(required = true)
    public String loanIntRate;

    // 当前剩余本金
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("curr_remain_corpus")
    @Validation(required = true)
    public String currRemainCorpus;

    // 还款方式
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("loan_repay_type")
    @Validation(required = true)
    public String loanRepayType;

    // 最后一次计息日
    /**
     * <strong>example:</strong>
     * <p>2023/05/01</p>
     */
    @NameInMap("last_count_int_date")
    @Validation(required = true)
    public String lastCountIntDate;

    // 当前期数
    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("current_term")
    @Validation(required = true)
    public String currentTerm;

    // 当期应还日期
    /**
     * <strong>example:</strong>
     * <p>2023/05/01</p>
     */
    @NameInMap("cur_repay_day")
    @Validation(required = true)
    public String curRepayDay;

    // 对应期次应还金额
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("cur_remain_amt")
    @Validation(required = true)
    public Long curRemainAmt;

    // 当期已还总额
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("current_paid_amt")
    @Validation(required = true)
    public Long currentPaidAmt;

    // 对应期次应还本金
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("cur_principal_amount")
    @Validation(required = true)
    public Long curPrincipalAmount;

    // 对应期次已还本金
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("act_principal_amount")
    @Validation(required = true)
    public Long actPrincipalAmount;

    // 对应期次应还利息
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("cur_interest_amount")
    @Validation(required = true)
    public Long curInterestAmount;

    // 对应期次已还利息
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("act_interest_amount")
    @Validation(required = true)
    public Long actInterestAmount;

    // 对应期次应还正常利息
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("cur_normal_interest_amt")
    @Validation(required = true)
    public Long curNormalInterestAmt;

    // 对应期次已还正常利息 
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("act_cur_normal_interest_amt")
    @Validation(required = true)
    public Long actCurNormalInterestAmt;

    // 对应期次应还罚息
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("cur_principal_penalty_amt")
    @Validation(required = true)
    public Long curPrincipalPenaltyAmt;

    // 对应期次已还罚息
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("act_cur_principal_penalty_amt")
    @Validation(required = true)
    public Long actCurPrincipalPenaltyAmt;

    // 对应期次应还复利
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("cur_interest_penalty_amt")
    @Validation(required = true)
    public Long curInterestPenaltyAmt;

    // 对应期次已还复利
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("act_cur_interest_penalty_amt")
    @Validation(required = true)
    public Long actCurInterestPenaltyAmt;

    // 总期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total_num")
    @Validation(required = true)
    public String totalNum;

    // 借据状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("loan_status")
    @Validation(required = true)
    public String loanStatus;

    // 总欠款本息
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("total_owe_corpus_interest")
    @Validation(required = true)
    public String totalOweCorpusInterest;

    public static EcLoanDetail build(java.util.Map<String, ?> map) throws Exception {
        EcLoanDetail self = new EcLoanDetail();
        return TeaModel.build(map, self);
    }

    public EcLoanDetail setLoanAcctNo(String loanAcctNo) {
        this.loanAcctNo = loanAcctNo;
        return this;
    }
    public String getLoanAcctNo() {
        return this.loanAcctNo;
    }

    public EcLoanDetail setLoanAmt(Long loanAmt) {
        this.loanAmt = loanAmt;
        return this;
    }
    public Long getLoanAmt() {
        return this.loanAmt;
    }

    public EcLoanDetail setLoanStartDate(String loanStartDate) {
        this.loanStartDate = loanStartDate;
        return this;
    }
    public String getLoanStartDate() {
        return this.loanStartDate;
    }

    public EcLoanDetail setLoanEndDate(String loanEndDate) {
        this.loanEndDate = loanEndDate;
        return this;
    }
    public String getLoanEndDate() {
        return this.loanEndDate;
    }

    public EcLoanDetail setRateType(String rateType) {
        this.rateType = rateType;
        return this;
    }
    public String getRateType() {
        return this.rateType;
    }

    public EcLoanDetail setRateUnit(String rateUnit) {
        this.rateUnit = rateUnit;
        return this;
    }
    public String getRateUnit() {
        return this.rateUnit;
    }

    public EcLoanDetail setLoanIntRate(String loanIntRate) {
        this.loanIntRate = loanIntRate;
        return this;
    }
    public String getLoanIntRate() {
        return this.loanIntRate;
    }

    public EcLoanDetail setCurrRemainCorpus(String currRemainCorpus) {
        this.currRemainCorpus = currRemainCorpus;
        return this;
    }
    public String getCurrRemainCorpus() {
        return this.currRemainCorpus;
    }

    public EcLoanDetail setLoanRepayType(String loanRepayType) {
        this.loanRepayType = loanRepayType;
        return this;
    }
    public String getLoanRepayType() {
        return this.loanRepayType;
    }

    public EcLoanDetail setLastCountIntDate(String lastCountIntDate) {
        this.lastCountIntDate = lastCountIntDate;
        return this;
    }
    public String getLastCountIntDate() {
        return this.lastCountIntDate;
    }

    public EcLoanDetail setCurrentTerm(String currentTerm) {
        this.currentTerm = currentTerm;
        return this;
    }
    public String getCurrentTerm() {
        return this.currentTerm;
    }

    public EcLoanDetail setCurRepayDay(String curRepayDay) {
        this.curRepayDay = curRepayDay;
        return this;
    }
    public String getCurRepayDay() {
        return this.curRepayDay;
    }

    public EcLoanDetail setCurRemainAmt(Long curRemainAmt) {
        this.curRemainAmt = curRemainAmt;
        return this;
    }
    public Long getCurRemainAmt() {
        return this.curRemainAmt;
    }

    public EcLoanDetail setCurrentPaidAmt(Long currentPaidAmt) {
        this.currentPaidAmt = currentPaidAmt;
        return this;
    }
    public Long getCurrentPaidAmt() {
        return this.currentPaidAmt;
    }

    public EcLoanDetail setCurPrincipalAmount(Long curPrincipalAmount) {
        this.curPrincipalAmount = curPrincipalAmount;
        return this;
    }
    public Long getCurPrincipalAmount() {
        return this.curPrincipalAmount;
    }

    public EcLoanDetail setActPrincipalAmount(Long actPrincipalAmount) {
        this.actPrincipalAmount = actPrincipalAmount;
        return this;
    }
    public Long getActPrincipalAmount() {
        return this.actPrincipalAmount;
    }

    public EcLoanDetail setCurInterestAmount(Long curInterestAmount) {
        this.curInterestAmount = curInterestAmount;
        return this;
    }
    public Long getCurInterestAmount() {
        return this.curInterestAmount;
    }

    public EcLoanDetail setActInterestAmount(Long actInterestAmount) {
        this.actInterestAmount = actInterestAmount;
        return this;
    }
    public Long getActInterestAmount() {
        return this.actInterestAmount;
    }

    public EcLoanDetail setCurNormalInterestAmt(Long curNormalInterestAmt) {
        this.curNormalInterestAmt = curNormalInterestAmt;
        return this;
    }
    public Long getCurNormalInterestAmt() {
        return this.curNormalInterestAmt;
    }

    public EcLoanDetail setActCurNormalInterestAmt(Long actCurNormalInterestAmt) {
        this.actCurNormalInterestAmt = actCurNormalInterestAmt;
        return this;
    }
    public Long getActCurNormalInterestAmt() {
        return this.actCurNormalInterestAmt;
    }

    public EcLoanDetail setCurPrincipalPenaltyAmt(Long curPrincipalPenaltyAmt) {
        this.curPrincipalPenaltyAmt = curPrincipalPenaltyAmt;
        return this;
    }
    public Long getCurPrincipalPenaltyAmt() {
        return this.curPrincipalPenaltyAmt;
    }

    public EcLoanDetail setActCurPrincipalPenaltyAmt(Long actCurPrincipalPenaltyAmt) {
        this.actCurPrincipalPenaltyAmt = actCurPrincipalPenaltyAmt;
        return this;
    }
    public Long getActCurPrincipalPenaltyAmt() {
        return this.actCurPrincipalPenaltyAmt;
    }

    public EcLoanDetail setCurInterestPenaltyAmt(Long curInterestPenaltyAmt) {
        this.curInterestPenaltyAmt = curInterestPenaltyAmt;
        return this;
    }
    public Long getCurInterestPenaltyAmt() {
        return this.curInterestPenaltyAmt;
    }

    public EcLoanDetail setActCurInterestPenaltyAmt(Long actCurInterestPenaltyAmt) {
        this.actCurInterestPenaltyAmt = actCurInterestPenaltyAmt;
        return this;
    }
    public Long getActCurInterestPenaltyAmt() {
        return this.actCurInterestPenaltyAmt;
    }

    public EcLoanDetail setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public EcLoanDetail setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
        return this;
    }
    public String getLoanStatus() {
        return this.loanStatus;
    }

    public EcLoanDetail setTotalOweCorpusInterest(String totalOweCorpusInterest) {
        this.totalOweCorpusInterest = totalOweCorpusInterest;
        return this;
    }
    public String getTotalOweCorpusInterest() {
        return this.totalOweCorpusInterest;
    }

}
