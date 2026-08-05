// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryOrderRefundResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 支付交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 外部系统传入的退款请求流水号
    @NameInMap("refund_request_no")
    public String refundRequestNo;

    // 退款请求状态
    // ● ACCEPT: 受理成功
    // ● PENDING: 需人工介入
    // ● SUCCESS: 成功
    // ● FAILED : 失败
    @NameInMap("refund_status")
    public String refundStatus;

    // 退款退分账申请金额
    @NameInMap("refund_amount")
    public Long refundAmount;

    // 退款退分账失败原因，条件返回：refundStatus=FAILED 返回
    @NameInMap("refund_failed_reason")
    public String refundFailedReason;

    // 退款退分账时间，格式为yyyy-MM-dd HH:mm:ss 
    // 条件返回：refundStatus=SUCCESS 返回
    @NameInMap("refund_time")
    public String refundTime;

    // 条件返回：refundStatus=SUCCESS 返回
    // 退分账明细
    @NameInMap("refund_detail_item_list")
    public java.util.List<RefundDetailItemList> refundDetailItemList;

    public static QueryOrderRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderRefundResponse self = new QueryOrderRefundResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderRefundResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOrderRefundResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOrderRefundResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOrderRefundResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryOrderRefundResponse setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public QueryOrderRefundResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public QueryOrderRefundResponse setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public Long getRefundAmount() {
        return this.refundAmount;
    }

    public QueryOrderRefundResponse setRefundFailedReason(String refundFailedReason) {
        this.refundFailedReason = refundFailedReason;
        return this;
    }
    public String getRefundFailedReason() {
        return this.refundFailedReason;
    }

    public QueryOrderRefundResponse setRefundTime(String refundTime) {
        this.refundTime = refundTime;
        return this;
    }
    public String getRefundTime() {
        return this.refundTime;
    }

    public QueryOrderRefundResponse setRefundDetailItemList(java.util.List<RefundDetailItemList> refundDetailItemList) {
        this.refundDetailItemList = refundDetailItemList;
        return this;
    }
    public java.util.List<RefundDetailItemList> getRefundDetailItemList() {
        return this.refundDetailItemList;
    }

}
