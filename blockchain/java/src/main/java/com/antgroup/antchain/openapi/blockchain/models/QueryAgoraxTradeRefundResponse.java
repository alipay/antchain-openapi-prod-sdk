// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAgoraxTradeRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 创建交易传入的商户订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 本笔退款对应的退款请求号
    @NameInMap("out_request_no")
    public String outRequestNo;

    // 该笔退款所对应的交易的订单金额
    @NameInMap("total_amount")
    public String totalAmount;

    // 本次退款请求，对应的退款金额
    @NameInMap("refund_amount")
    public String refundAmount;

    // 退款状态
    @NameInMap("refund_status")
    public String refundStatus;

    // 退分账明细信息
    @NameInMap("refund_royaltys")
    public java.util.List<RefundRoyaltyResult> refundRoyaltys;

    // 本次商户实际退回金额
    @NameInMap("send_back_fee")
    public String sendBackFee;

    public static QueryAgoraxTradeRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgoraxTradeRefundResponse self = new QueryAgoraxTradeRefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgoraxTradeRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAgoraxTradeRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAgoraxTradeRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAgoraxTradeRefundResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryAgoraxTradeRefundResponse setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryAgoraxTradeRefundResponse setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public QueryAgoraxTradeRefundResponse setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public QueryAgoraxTradeRefundResponse setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public QueryAgoraxTradeRefundResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public QueryAgoraxTradeRefundResponse setRefundRoyaltys(java.util.List<RefundRoyaltyResult> refundRoyaltys) {
        this.refundRoyaltys = refundRoyaltys;
        return this;
    }
    public java.util.List<RefundRoyaltyResult> getRefundRoyaltys() {
        return this.refundRoyaltys;
    }

    public QueryAgoraxTradeRefundResponse setSendBackFee(String sendBackFee) {
        this.sendBackFee = sendBackFee;
        return this;
    }
    public String getSendBackFee() {
        return this.sendBackFee;
    }

}
