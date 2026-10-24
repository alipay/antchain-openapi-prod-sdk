// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryAcctPayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约单号
    @NameInMap("order_id")
    public String orderId;

    // 订单id
    @NameInMap("acct_trade_order_id")
    public String acctTradeOrderId;

    // 交易状态
    // ● INIT：待扣款
    // ● TOBE_PAY：扣款中
    // ● SUCCESS：扣款成功【终态】
    @NameInMap("status")
    public String status;

    // 扣款金额、单位为分
    @NameInMap("amount")
    public Long amount;

    // 实付金额，单位为分，成功时存在
    @NameInMap("real_pay_amount")
    public Long realPayAmount;

    // 实收金额，单位为分，成功时存在
    @NameInMap("real_receipt_amount")
    public Long realReceiptAmount;

    // 代扣完成时间，成功时存在
    @NameInMap("pay_finish")
    public String payFinish;

    // 我方交易流水号，成功时存在
    @NameInMap("pay_order_no")
    public Long payOrderNo;

    // 支付宝交易流水号，成功时存在
    @NameInMap("pay_trade_no")
    public String payTradeNo;

    // 最新的扣款发起次数
    @NameInMap("cmd_try_num")
    public Long cmdTryNum;

    // 最新的扣款状态
    @NameInMap("cmd_status")
    public String cmdStatus;

    // 最新的扣款失败的失败原因
    @NameInMap("cmd_fail_reason")
    public String cmdFailReason;

    // 最新的我方流水号
    @NameInMap("cmd_pay_order_no")
    public String cmdPayOrderNo;

    // 最新的支付宝交易流水号
    @NameInMap("cmd_pay_trade_no")
    public String cmdPayTradeNo;

    public static QueryAcctPayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAcctPayResponse self = new QueryAcctPayResponse();
        return TeaModel.build(map, self);
    }

    public QueryAcctPayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAcctPayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAcctPayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAcctPayResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAcctPayResponse setAcctTradeOrderId(String acctTradeOrderId) {
        this.acctTradeOrderId = acctTradeOrderId;
        return this;
    }
    public String getAcctTradeOrderId() {
        return this.acctTradeOrderId;
    }

    public QueryAcctPayResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAcctPayResponse setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public QueryAcctPayResponse setRealPayAmount(Long realPayAmount) {
        this.realPayAmount = realPayAmount;
        return this;
    }
    public Long getRealPayAmount() {
        return this.realPayAmount;
    }

    public QueryAcctPayResponse setRealReceiptAmount(Long realReceiptAmount) {
        this.realReceiptAmount = realReceiptAmount;
        return this;
    }
    public Long getRealReceiptAmount() {
        return this.realReceiptAmount;
    }

    public QueryAcctPayResponse setPayFinish(String payFinish) {
        this.payFinish = payFinish;
        return this;
    }
    public String getPayFinish() {
        return this.payFinish;
    }

    public QueryAcctPayResponse setPayOrderNo(Long payOrderNo) {
        this.payOrderNo = payOrderNo;
        return this;
    }
    public Long getPayOrderNo() {
        return this.payOrderNo;
    }

    public QueryAcctPayResponse setPayTradeNo(String payTradeNo) {
        this.payTradeNo = payTradeNo;
        return this;
    }
    public String getPayTradeNo() {
        return this.payTradeNo;
    }

    public QueryAcctPayResponse setCmdTryNum(Long cmdTryNum) {
        this.cmdTryNum = cmdTryNum;
        return this;
    }
    public Long getCmdTryNum() {
        return this.cmdTryNum;
    }

    public QueryAcctPayResponse setCmdStatus(String cmdStatus) {
        this.cmdStatus = cmdStatus;
        return this;
    }
    public String getCmdStatus() {
        return this.cmdStatus;
    }

    public QueryAcctPayResponse setCmdFailReason(String cmdFailReason) {
        this.cmdFailReason = cmdFailReason;
        return this;
    }
    public String getCmdFailReason() {
        return this.cmdFailReason;
    }

    public QueryAcctPayResponse setCmdPayOrderNo(String cmdPayOrderNo) {
        this.cmdPayOrderNo = cmdPayOrderNo;
        return this;
    }
    public String getCmdPayOrderNo() {
        return this.cmdPayOrderNo;
    }

    public QueryAcctPayResponse setCmdPayTradeNo(String cmdPayTradeNo) {
        this.cmdPayTradeNo = cmdPayTradeNo;
        return this;
    }
    public String getCmdPayTradeNo() {
        return this.cmdPayTradeNo;
    }

}
