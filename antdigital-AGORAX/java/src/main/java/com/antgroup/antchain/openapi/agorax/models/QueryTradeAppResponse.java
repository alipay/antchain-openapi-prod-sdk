// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryTradeAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接入方外部业务订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 支付状态
    @NameInMap("trade_status")
    public String tradeStatus;

    // 订单金额，单位：元
    @NameInMap("total_amount")
    public String totalAmount;

    // 实付金额，单位：元
    @NameInMap("receipt_amount")
    public String receiptAmount;

    // 退款记录
    @NameInMap("refund_list")
    public RefundList refundList;

    // 累计退款金额
    @NameInMap("total_refund_amount")
    public String totalRefundAmount;

    public static QueryTradeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeAppResponse self = new QueryTradeAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryTradeAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTradeAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTradeAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTradeAppResponse setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public QueryTradeAppResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryTradeAppResponse setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
        return this;
    }
    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public QueryTradeAppResponse setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public QueryTradeAppResponse setReceiptAmount(String receiptAmount) {
        this.receiptAmount = receiptAmount;
        return this;
    }
    public String getReceiptAmount() {
        return this.receiptAmount;
    }

    public QueryTradeAppResponse setRefundList(RefundList refundList) {
        this.refundList = refundList;
        return this;
    }
    public RefundList getRefundList() {
        return this.refundList;
    }

    public QueryTradeAppResponse setTotalRefundAmount(String totalRefundAmount) {
        this.totalRefundAmount = totalRefundAmount;
        return this;
    }
    public String getTotalRefundAmount() {
        return this.totalRefundAmount;
    }

}
