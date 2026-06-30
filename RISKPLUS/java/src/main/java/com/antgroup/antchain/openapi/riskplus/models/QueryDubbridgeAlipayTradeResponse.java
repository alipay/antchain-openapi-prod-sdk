// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAlipayTradeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单状态
    // WAIT_BUYER_PAY（等待买家付款）、
    // TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、
    // TRADE_SUCCESS（交易支付成功）、
    // TRADE_FINISHED（交易结束，不可退款）
    @NameInMap("trade_status")
    public String tradeStatus;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 买家支付宝账号
    @NameInMap("buyer_logon_id")
    public String buyerLogonId;

    // 支付金额
    @NameInMap("pay_amount")
    public String payAmount;

    // 支付时间
    @NameInMap("pay_date")
    public String payDate;

    public static QueryDubbridgeAlipayTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAlipayTradeResponse self = new QueryDubbridgeAlipayTradeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAlipayTradeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeAlipayTradeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeAlipayTradeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeAlipayTradeResponse setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public QueryDubbridgeAlipayTradeResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryDubbridgeAlipayTradeResponse setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId;
        return this;
    }
    public String getBuyerLogonId() {
        return this.buyerLogonId;
    }

    public QueryDubbridgeAlipayTradeResponse setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public QueryDubbridgeAlipayTradeResponse setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getPayDate() {
        return this.payDate;
    }

}
