// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeLoanstatusLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 放款结果，
    // 0:放款成功
    // 1:放款失败
    // 2.查无此单(重新发起支用申请接口,需要保证支用申请接口幂等)
    // 99:处理中
    @NameInMap("loan_result")
    public Long loanResult;

    // 描述信息
    @NameInMap("msg")
    public String msg;

    // 成功必填，资方返回的阶梯结算利率，供生成对资还款计划时使用
    @NameInMap("settle_rate")
    public Long settleRate;

    // 成功必填，YYYY-MM-DD HH:MM:SS
    @NameInMap("payment_time")
    public String paymentTime;

    // 放款成功金额，成功必填，单位:元
    @NameInMap("loan_amt")
    public Long loanAmt;

    // 放款流水号，成功必填
    @NameInMap("capital_loan_no")
    public String capitalLoanNo;

    // 收款人银行卡卡号，放款成功提供实际的放款目标账户
    @NameInMap("debit_account_no")
    public String debitAccountNo;

    public static QueryDubbridgeLoanstatusLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeLoanstatusLxResponse self = new QueryDubbridgeLoanstatusLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeLoanstatusLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeLoanstatusLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeLoanstatusLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeLoanstatusLxResponse setLoanResult(Long loanResult) {
        this.loanResult = loanResult;
        return this;
    }
    public Long getLoanResult() {
        return this.loanResult;
    }

    public QueryDubbridgeLoanstatusLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeLoanstatusLxResponse setSettleRate(Long settleRate) {
        this.settleRate = settleRate;
        return this;
    }
    public Long getSettleRate() {
        return this.settleRate;
    }

    public QueryDubbridgeLoanstatusLxResponse setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
        return this;
    }
    public String getPaymentTime() {
        return this.paymentTime;
    }

    public QueryDubbridgeLoanstatusLxResponse setLoanAmt(Long loanAmt) {
        this.loanAmt = loanAmt;
        return this;
    }
    public Long getLoanAmt() {
        return this.loanAmt;
    }

    public QueryDubbridgeLoanstatusLxResponse setCapitalLoanNo(String capitalLoanNo) {
        this.capitalLoanNo = capitalLoanNo;
        return this;
    }
    public String getCapitalLoanNo() {
        return this.capitalLoanNo;
    }

    public QueryDubbridgeLoanstatusLxResponse setDebitAccountNo(String debitAccountNo) {
        this.debitAccountNo = debitAccountNo;
        return this;
    }
    public String getDebitAccountNo() {
        return this.debitAccountNo;
    }

}
