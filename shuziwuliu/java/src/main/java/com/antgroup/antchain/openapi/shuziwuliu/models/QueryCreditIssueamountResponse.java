// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssueamountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 剩余金额
    @NameInMap("balance_amt")
    public String balanceAmt;

    // 已清分金额
    @NameInMap("cash_amt")
    public String cashAmt;

    // 欠的滞纳金金额
    @NameInMap("debt_int_amt")
    public String debtIntAmt;

    // 欠款本金金额
    @NameInMap("debt_prin_amt")
    public String debtPrinAmt;

    // 该凭证下的总欠款金额
    @NameInMap("debt_total_amt")
    public String debtTotalAmt;

    // 信用凭证到期时间
    @NameInMap("expire_date")
    public String expireDate;

    // 冻结的金额
    @NameInMap("freeze_amt")
    public String freezeAmt;

    // 信用凭证id
    @NameInMap("issue_id")
    public String issueId;

    // 累计已还滞纳金金额
    @NameInMap("paid_int_amt")
    public String paidIntAmt;

    // 凭证总金额
    @NameInMap("ticket_amt")
    public String ticketAmt;

    public static QueryCreditIssueamountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssueamountResponse self = new QueryCreditIssueamountResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssueamountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditIssueamountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditIssueamountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditIssueamountResponse setBalanceAmt(String balanceAmt) {
        this.balanceAmt = balanceAmt;
        return this;
    }
    public String getBalanceAmt() {
        return this.balanceAmt;
    }

    public QueryCreditIssueamountResponse setCashAmt(String cashAmt) {
        this.cashAmt = cashAmt;
        return this;
    }
    public String getCashAmt() {
        return this.cashAmt;
    }

    public QueryCreditIssueamountResponse setDebtIntAmt(String debtIntAmt) {
        this.debtIntAmt = debtIntAmt;
        return this;
    }
    public String getDebtIntAmt() {
        return this.debtIntAmt;
    }

    public QueryCreditIssueamountResponse setDebtPrinAmt(String debtPrinAmt) {
        this.debtPrinAmt = debtPrinAmt;
        return this;
    }
    public String getDebtPrinAmt() {
        return this.debtPrinAmt;
    }

    public QueryCreditIssueamountResponse setDebtTotalAmt(String debtTotalAmt) {
        this.debtTotalAmt = debtTotalAmt;
        return this;
    }
    public String getDebtTotalAmt() {
        return this.debtTotalAmt;
    }

    public QueryCreditIssueamountResponse setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public QueryCreditIssueamountResponse setFreezeAmt(String freezeAmt) {
        this.freezeAmt = freezeAmt;
        return this;
    }
    public String getFreezeAmt() {
        return this.freezeAmt;
    }

    public QueryCreditIssueamountResponse setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public QueryCreditIssueamountResponse setPaidIntAmt(String paidIntAmt) {
        this.paidIntAmt = paidIntAmt;
        return this;
    }
    public String getPaidIntAmt() {
        return this.paidIntAmt;
    }

    public QueryCreditIssueamountResponse setTicketAmt(String ticketAmt) {
        this.ticketAmt = ticketAmt;
        return this;
    }
    public String getTicketAmt() {
        return this.ticketAmt;
    }

}
