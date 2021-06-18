// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryPfIouResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行年利率
    @NameInMap("annual_interest_rate")
    public String annualInterestRate;

    // 借据Id
    @NameInMap("credit_id")
    public String creditId;

    // 借据到期日
    @NameInMap("interest_bearing_end")
    public String interestBearingEnd;

    // 借据起息日
    @NameInMap("interest_bearing_start")
    public String interestBearingStart;

    // 应还本金，即放款金额
    @NameInMap("issued_amount")
    public String issuedAmount;

    // 还款银行名称
    @NameInMap("repay_bank_name")
    public String repayBankName;

    // 还款账号名称
    @NameInMap("repay_acct_name")
    public String repayAcctName;

    // 还款账号
    @NameInMap("repay_account")
    public String repayAccount;

    // 实际已还本金
    @NameInMap("repay_amt")
    public String repayAmt;

    // 实际已还利息
    @NameInMap("repay_interest")
    public String repayInterest;

    // 实际已还总额
    @NameInMap("repay_total_amt")
    public String repayTotalAmt;

    // 借据状态
    @NameInMap("credit_status")
    public String creditStatus;

    // 是否逾期,0是,1否
    @NameInMap("is_overdue")
    public String isOverdue;

    // 项目id
    @NameInMap("project_id")
    public String projectId;

    // 支用id
    @NameInMap("financing_id")
    public String financingId;

    // 融资主体DID
    @NameInMap("financing_subject_did")
    public String financingSubjectDid;

    public static QueryPfIouResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPfIouResponse self = new QueryPfIouResponse();
        return TeaModel.build(map, self);
    }

    public QueryPfIouResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPfIouResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPfIouResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPfIouResponse setAnnualInterestRate(String annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        return this;
    }
    public String getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public QueryPfIouResponse setCreditId(String creditId) {
        this.creditId = creditId;
        return this;
    }
    public String getCreditId() {
        return this.creditId;
    }

    public QueryPfIouResponse setInterestBearingEnd(String interestBearingEnd) {
        this.interestBearingEnd = interestBearingEnd;
        return this;
    }
    public String getInterestBearingEnd() {
        return this.interestBearingEnd;
    }

    public QueryPfIouResponse setInterestBearingStart(String interestBearingStart) {
        this.interestBearingStart = interestBearingStart;
        return this;
    }
    public String getInterestBearingStart() {
        return this.interestBearingStart;
    }

    public QueryPfIouResponse setIssuedAmount(String issuedAmount) {
        this.issuedAmount = issuedAmount;
        return this;
    }
    public String getIssuedAmount() {
        return this.issuedAmount;
    }

    public QueryPfIouResponse setRepayBankName(String repayBankName) {
        this.repayBankName = repayBankName;
        return this;
    }
    public String getRepayBankName() {
        return this.repayBankName;
    }

    public QueryPfIouResponse setRepayAcctName(String repayAcctName) {
        this.repayAcctName = repayAcctName;
        return this;
    }
    public String getRepayAcctName() {
        return this.repayAcctName;
    }

    public QueryPfIouResponse setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
        return this;
    }
    public String getRepayAccount() {
        return this.repayAccount;
    }

    public QueryPfIouResponse setRepayAmt(String repayAmt) {
        this.repayAmt = repayAmt;
        return this;
    }
    public String getRepayAmt() {
        return this.repayAmt;
    }

    public QueryPfIouResponse setRepayInterest(String repayInterest) {
        this.repayInterest = repayInterest;
        return this;
    }
    public String getRepayInterest() {
        return this.repayInterest;
    }

    public QueryPfIouResponse setRepayTotalAmt(String repayTotalAmt) {
        this.repayTotalAmt = repayTotalAmt;
        return this;
    }
    public String getRepayTotalAmt() {
        return this.repayTotalAmt;
    }

    public QueryPfIouResponse setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public QueryPfIouResponse setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
        return this;
    }
    public String getIsOverdue() {
        return this.isOverdue;
    }

    public QueryPfIouResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryPfIouResponse setFinancingId(String financingId) {
        this.financingId = financingId;
        return this;
    }
    public String getFinancingId() {
        return this.financingId;
    }

    public QueryPfIouResponse setFinancingSubjectDid(String financingSubjectDid) {
        this.financingSubjectDid = financingSubjectDid;
        return this;
    }
    public String getFinancingSubjectDid() {
        return this.financingSubjectDid;
    }

}
