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

    // 发放金额
    @NameInMap("issued_amount")
    public String issuedAmount;

    // 贷款性质 0-正常 1-展期 2-一类逾期 3-二类逾期 4-呆滞 5-呆帐
    @NameInMap("loan_nature")
    public String loanNature;

    // 贷款状态 销户=结清 0-正常 1-销户 5-已发放未复核入账
    @NameInMap("loan_status")
    public String loanStatus;

    // 下次结息日期
    @NameInMap("next_parsing_date")
    public String nextParsingDate;

    // 逾期计息方式 0-逾期利率 1-逾期罚息比例 2-协议违约利率
    @NameInMap("odi_cal_type")
    public String odiCalType;

    // 逾期罚息浮动比率
    @NameInMap("opi_floating_ratio")
    public String opiFloatingRatio;

    // 贷款入账账号
    @NameInMap("pay_account")
    public String payAccount;

    // 本金余额
    @NameInMap("principal_balance")
    public String principalBalance;

    // 还款账号
    @NameInMap("repay_account")
    public String repayAccount;

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

    public QueryPfIouResponse setLoanNature(String loanNature) {
        this.loanNature = loanNature;
        return this;
    }
    public String getLoanNature() {
        return this.loanNature;
    }

    public QueryPfIouResponse setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
        return this;
    }
    public String getLoanStatus() {
        return this.loanStatus;
    }

    public QueryPfIouResponse setNextParsingDate(String nextParsingDate) {
        this.nextParsingDate = nextParsingDate;
        return this;
    }
    public String getNextParsingDate() {
        return this.nextParsingDate;
    }

    public QueryPfIouResponse setOdiCalType(String odiCalType) {
        this.odiCalType = odiCalType;
        return this;
    }
    public String getOdiCalType() {
        return this.odiCalType;
    }

    public QueryPfIouResponse setOpiFloatingRatio(String opiFloatingRatio) {
        this.opiFloatingRatio = opiFloatingRatio;
        return this;
    }
    public String getOpiFloatingRatio() {
        return this.opiFloatingRatio;
    }

    public QueryPfIouResponse setPayAccount(String payAccount) {
        this.payAccount = payAccount;
        return this;
    }
    public String getPayAccount() {
        return this.payAccount;
    }

    public QueryPfIouResponse setPrincipalBalance(String principalBalance) {
        this.principalBalance = principalBalance;
        return this;
    }
    public String getPrincipalBalance() {
        return this.principalBalance;
    }

    public QueryPfIouResponse setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
        return this;
    }
    public String getRepayAccount() {
        return this.repayAccount;
    }

}
