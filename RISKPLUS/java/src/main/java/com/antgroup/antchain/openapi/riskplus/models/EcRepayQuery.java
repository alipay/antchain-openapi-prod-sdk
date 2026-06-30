// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcRepayQuery extends TeaModel {
    // 合同编号
    /**
     * <strong>example:</strong>
     * <p>91234500123400000R</p>
     */
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 借据号
    /**
     * <strong>example:</strong>
     * <p>91234500123400000R</p>
     */
    @NameInMap("loan_no")
    @Validation(required = true)
    public String loanNo;

    // 贷款金额
    /**
     * <strong>example:</strong>
     * <p>25.34</p>
     */
    @NameInMap("loanamt")
    @Validation(required = true)
    public String loanamt;

    // 实时借据状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("loan_status")
    @Validation(required = true)
    public String loanStatus;

    // 总期次
    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("total_num")
    @Validation(required = true)
    public String totalNum;

    // 还款方式
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("repay_type")
    public String repayType;

    // 应还总金额
    /**
     * <strong>example:</strong>
     * <p>25.34</p>
     */
    @NameInMap("repay_amount")
    public String repayAmount;

    // 实还总金额
    /**
     * <strong>example:</strong>
     * <p>2.34</p>
     */
    @NameInMap("actual_sum")
    public String actualSum;

    // 这笔借据所在期次的还款日。格式:yyyy/MM/dd
    /**
     * <strong>example:</strong>
     * <p>2023/05/01</p>
     */
    @NameInMap("duedate")
    public String duedate;

    // 实还日期 格式:yyyy/MM/dd
    /**
     * <strong>example:</strong>
     * <p>2023/05/01</p>
     */
    @NameInMap("actualpay_date")
    public String actualpayDate;

    // 应还本金 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("corpus")
    public String corpus;

    // 实还本金 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("actual_payprincipal_amt")
    public String actualPayprincipalAmt;

    // 应还利息 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("interest")
    public String interest;

    // 实还利息 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("actual_payinterest_amt")
    public String actualPayinterestAmt;

    // 应还罚息 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("pay_principal_penalty_amt")
    public String payPrincipalPenaltyAmt;

    // 实还罚息 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("actual_payprincipal_penalty_amt")
    public String actualPayprincipalPenaltyAmt;

    // 应还复利 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("pay_interest_penalty_amt")
    public String payInterestPenaltyAmt;

    // 实还复利 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("actual_payinterest_penalty_amt")
    public String actualPayinterestPenaltyAmt;

    // 应还贴息利息 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("pay_splitinterest_amt")
    public String paySplitinterestAmt;

    // 实还贴息利息 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("actual_paysplitinterest_amt")
    public String actualPaysplitinterestAmt;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>RMB</p>
     */
    @NameInMap("currency")
    public String currency;

    // 还款期次 这笔还款对应期次。单位:整数
    /**
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("repayment_num")
    public String repaymentNum;

    // 优惠金额 单位:元,格式:数字,小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("reduce_amt")
    public String reduceAmt;

    // 还款类型
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("bill_type")
    public String billType;

    // 流水号
    /**
     * <strong>example:</strong>
     * <p>PANO124414515555</p>
     */
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 还款交易流水号 若为还款，则与还款通知流水保持一致
    /**
     * <strong>example:</strong>
     * <p>PANO124414515555</p>
     */
    @NameInMap("transaction_serialno")
    @Validation(required = true)
    public String transactionSerialno;

    // 是否附言还款
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("remark")
    public String remark;

    public static EcRepayQuery build(java.util.Map<String, ?> map) throws Exception {
        EcRepayQuery self = new EcRepayQuery();
        return TeaModel.build(map, self);
    }

    public EcRepayQuery setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public EcRepayQuery setLoanNo(String loanNo) {
        this.loanNo = loanNo;
        return this;
    }
    public String getLoanNo() {
        return this.loanNo;
    }

    public EcRepayQuery setLoanamt(String loanamt) {
        this.loanamt = loanamt;
        return this;
    }
    public String getLoanamt() {
        return this.loanamt;
    }

    public EcRepayQuery setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
        return this;
    }
    public String getLoanStatus() {
        return this.loanStatus;
    }

    public EcRepayQuery setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public EcRepayQuery setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public EcRepayQuery setRepayAmount(String repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public String getRepayAmount() {
        return this.repayAmount;
    }

    public EcRepayQuery setActualSum(String actualSum) {
        this.actualSum = actualSum;
        return this;
    }
    public String getActualSum() {
        return this.actualSum;
    }

    public EcRepayQuery setDuedate(String duedate) {
        this.duedate = duedate;
        return this;
    }
    public String getDuedate() {
        return this.duedate;
    }

    public EcRepayQuery setActualpayDate(String actualpayDate) {
        this.actualpayDate = actualpayDate;
        return this;
    }
    public String getActualpayDate() {
        return this.actualpayDate;
    }

    public EcRepayQuery setCorpus(String corpus) {
        this.corpus = corpus;
        return this;
    }
    public String getCorpus() {
        return this.corpus;
    }

    public EcRepayQuery setActualPayprincipalAmt(String actualPayprincipalAmt) {
        this.actualPayprincipalAmt = actualPayprincipalAmt;
        return this;
    }
    public String getActualPayprincipalAmt() {
        return this.actualPayprincipalAmt;
    }

    public EcRepayQuery setInterest(String interest) {
        this.interest = interest;
        return this;
    }
    public String getInterest() {
        return this.interest;
    }

    public EcRepayQuery setActualPayinterestAmt(String actualPayinterestAmt) {
        this.actualPayinterestAmt = actualPayinterestAmt;
        return this;
    }
    public String getActualPayinterestAmt() {
        return this.actualPayinterestAmt;
    }

    public EcRepayQuery setPayPrincipalPenaltyAmt(String payPrincipalPenaltyAmt) {
        this.payPrincipalPenaltyAmt = payPrincipalPenaltyAmt;
        return this;
    }
    public String getPayPrincipalPenaltyAmt() {
        return this.payPrincipalPenaltyAmt;
    }

    public EcRepayQuery setActualPayprincipalPenaltyAmt(String actualPayprincipalPenaltyAmt) {
        this.actualPayprincipalPenaltyAmt = actualPayprincipalPenaltyAmt;
        return this;
    }
    public String getActualPayprincipalPenaltyAmt() {
        return this.actualPayprincipalPenaltyAmt;
    }

    public EcRepayQuery setPayInterestPenaltyAmt(String payInterestPenaltyAmt) {
        this.payInterestPenaltyAmt = payInterestPenaltyAmt;
        return this;
    }
    public String getPayInterestPenaltyAmt() {
        return this.payInterestPenaltyAmt;
    }

    public EcRepayQuery setActualPayinterestPenaltyAmt(String actualPayinterestPenaltyAmt) {
        this.actualPayinterestPenaltyAmt = actualPayinterestPenaltyAmt;
        return this;
    }
    public String getActualPayinterestPenaltyAmt() {
        return this.actualPayinterestPenaltyAmt;
    }

    public EcRepayQuery setPaySplitinterestAmt(String paySplitinterestAmt) {
        this.paySplitinterestAmt = paySplitinterestAmt;
        return this;
    }
    public String getPaySplitinterestAmt() {
        return this.paySplitinterestAmt;
    }

    public EcRepayQuery setActualPaysplitinterestAmt(String actualPaysplitinterestAmt) {
        this.actualPaysplitinterestAmt = actualPaysplitinterestAmt;
        return this;
    }
    public String getActualPaysplitinterestAmt() {
        return this.actualPaysplitinterestAmt;
    }

    public EcRepayQuery setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public EcRepayQuery setRepaymentNum(String repaymentNum) {
        this.repaymentNum = repaymentNum;
        return this;
    }
    public String getRepaymentNum() {
        return this.repaymentNum;
    }

    public EcRepayQuery setReduceAmt(String reduceAmt) {
        this.reduceAmt = reduceAmt;
        return this;
    }
    public String getReduceAmt() {
        return this.reduceAmt;
    }

    public EcRepayQuery setBillType(String billType) {
        this.billType = billType;
        return this;
    }
    public String getBillType() {
        return this.billType;
    }

    public EcRepayQuery setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public EcRepayQuery setTransactionSerialno(String transactionSerialno) {
        this.transactionSerialno = transactionSerialno;
        return this;
    }
    public String getTransactionSerialno() {
        return this.transactionSerialno;
    }

    public EcRepayQuery setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
