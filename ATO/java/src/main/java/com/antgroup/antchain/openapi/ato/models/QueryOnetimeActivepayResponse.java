// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryOnetimeActivepayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付单号
    @NameInMap("trade_no")
    public String tradeNo;

    // 订单串
    @NameInMap("order_str")
    public String orderStr;

    // 状态
    @NameInMap("status")
    public String status;

    // 分账状态
    @NameInMap("divide_status")
    public String divideStatus;

    // 支付金额
    @NameInMap("pay_amount")
    public Long payAmount;

    // 实际付款金额
    @NameInMap("real_pay_amount")
    public Long realPayAmount;

    // 实际收款金额
    @NameInMap("real_receipt_amount")
    public Long realReceiptAmount;

    // 支付时间
    @NameInMap("pay_time")
    public String payTime;

    // 支付单号
    @NameInMap("pay_order_no")
    public String payOrderNo;

    // 交易单号
    @NameInMap("pay_trade_no")
    public String payTradeNo;

    public static QueryOnetimeActivepayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOnetimeActivepayResponse self = new QueryOnetimeActivepayResponse();
        return TeaModel.build(map, self);
    }

    public QueryOnetimeActivepayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOnetimeActivepayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOnetimeActivepayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOnetimeActivepayResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryOnetimeActivepayResponse setOrderStr(String orderStr) {
        this.orderStr = orderStr;
        return this;
    }
    public String getOrderStr() {
        return this.orderStr;
    }

    public QueryOnetimeActivepayResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryOnetimeActivepayResponse setDivideStatus(String divideStatus) {
        this.divideStatus = divideStatus;
        return this;
    }
    public String getDivideStatus() {
        return this.divideStatus;
    }

    public QueryOnetimeActivepayResponse setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public Long getPayAmount() {
        return this.payAmount;
    }

    public QueryOnetimeActivepayResponse setRealPayAmount(Long realPayAmount) {
        this.realPayAmount = realPayAmount;
        return this;
    }
    public Long getRealPayAmount() {
        return this.realPayAmount;
    }

    public QueryOnetimeActivepayResponse setRealReceiptAmount(Long realReceiptAmount) {
        this.realReceiptAmount = realReceiptAmount;
        return this;
    }
    public Long getRealReceiptAmount() {
        return this.realReceiptAmount;
    }

    public QueryOnetimeActivepayResponse setPayTime(String payTime) {
        this.payTime = payTime;
        return this;
    }
    public String getPayTime() {
        return this.payTime;
    }

    public QueryOnetimeActivepayResponse setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
        return this;
    }
    public String getPayOrderNo() {
        return this.payOrderNo;
    }

    public QueryOnetimeActivepayResponse setPayTradeNo(String payTradeNo) {
        this.payTradeNo = payTradeNo;
        return this;
    }
    public String getPayTradeNo() {
        return this.payTradeNo;
    }

}
