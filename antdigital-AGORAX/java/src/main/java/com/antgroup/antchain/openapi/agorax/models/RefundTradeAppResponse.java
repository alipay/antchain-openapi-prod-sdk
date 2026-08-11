// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class RefundTradeAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 原支付业务订单号
    @NameInMap("out_trade_no")
    public String outTradeNo;

    // 本次退款业务号
    @NameInMap("out_request_no")
    public String outRequestNo;

    // 本次退款金额，单位：元
    @NameInMap("refund_amount")
    public String refundAmount;

    // 当前累计成功退款金额，单位：元
    @NameInMap("total_refund_amount")
    public String totalRefundAmount;

    // 退款状态
    @NameInMap("refund_status")
    public String refundStatus;

    public static RefundTradeAppResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundTradeAppResponse self = new RefundTradeAppResponse();
        return TeaModel.build(map, self);
    }

    public RefundTradeAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RefundTradeAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RefundTradeAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RefundTradeAppResponse setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
        return this;
    }
    public String getOutTradeNo() {
        return this.outTradeNo;
    }

    public RefundTradeAppResponse setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
        return this;
    }
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    public RefundTradeAppResponse setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public RefundTradeAppResponse setTotalRefundAmount(String totalRefundAmount) {
        this.totalRefundAmount = totalRefundAmount;
        return this;
    }
    public String getTotalRefundAmount() {
        return this.totalRefundAmount;
    }

    public RefundTradeAppResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

}
