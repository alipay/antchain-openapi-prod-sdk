// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryWithholdRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 外部系统传入的退款请求号
    @NameInMap("refund_request_no")
    public String refundRequestNo;

    // 请求支付宝的退款单据号
    @NameInMap("refund_order_no")
    public String refundOrderNo;

    // 退款请求状态
    // ● ACCEPT: 受理成功
    // ● PENDING: 需人工介入
    // ● SUCCESS: 成功
    // ● FAILED : 失败
    @NameInMap("status")
    public String status;

    // 退款失败原因
    @NameInMap("refund_error_msg")
    public String refundErrorMsg;

    // 本笔交易总退款金额，单位为分
    // 12300=123元
    @NameInMap("total_refund_amount")
    public Long totalRefundAmount;

    // 本次退款申请的实际退款金额，单位为分
    // 12300=123元
    @NameInMap("send_back_amount")
    public Long sendBackAmount;

    // 实际退款时间,13位时间戳（毫秒）
    @NameInMap("gmt_refund_pay")
    public Long gmtRefundPay;

    public static QueryWithholdRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdRefundResponse self = new QueryWithholdRefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryWithholdRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWithholdRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWithholdRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWithholdRefundResponse setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public QueryWithholdRefundResponse setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
        return this;
    }
    public String getRefundOrderNo() {
        return this.refundOrderNo;
    }

    public QueryWithholdRefundResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryWithholdRefundResponse setRefundErrorMsg(String refundErrorMsg) {
        this.refundErrorMsg = refundErrorMsg;
        return this;
    }
    public String getRefundErrorMsg() {
        return this.refundErrorMsg;
    }

    public QueryWithholdRefundResponse setTotalRefundAmount(Long totalRefundAmount) {
        this.totalRefundAmount = totalRefundAmount;
        return this;
    }
    public Long getTotalRefundAmount() {
        return this.totalRefundAmount;
    }

    public QueryWithholdRefundResponse setSendBackAmount(Long sendBackAmount) {
        this.sendBackAmount = sendBackAmount;
        return this;
    }
    public Long getSendBackAmount() {
        return this.sendBackAmount;
    }

    public QueryWithholdRefundResponse setGmtRefundPay(Long gmtRefundPay) {
        this.gmtRefundPay = gmtRefundPay;
        return this;
    }
    public Long getGmtRefundPay() {
        return this.gmtRefundPay;
    }

}
