// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRentalPayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商家扣款请求号(回显)
    @NameInMap("request_no")
    public String requestNo;

    // 交易状态:INIT 待扣款 / SUBMITTED 已提交 / FAILED 扣款失败/ SUCCESS 扣款成功
    @NameInMap("status")
    public String status;

    // 扣款金额(分)
    @NameInMap("amount")
    public Long amount;

    // 实付金额(分),成功时存在
    @NameInMap("real_pay_amount")
    public Long realPayAmount;

    // 实收金额(分),成功时存在
    @NameInMap("real_receipt_amount")
    public Long realReceiptAmount;

    // 代扣完成时间,成功时存在
    @NameInMap("pay_finish")
    public String payFinish;

    // 扣款失败原因(失败时)
    @NameInMap("fail_reason")
    public String failReason;

    // 我方流水号
    @NameInMap("pay_order_no")
    public String payOrderNo;

    // 支付宝交易流水号
    @NameInMap("pay_trade_no")
    public String payTradeNo;

    public static QueryRentalPayResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRentalPayResponse self = new QueryRentalPayResponse();
        return TeaModel.build(map, self);
    }

    public QueryRentalPayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRentalPayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRentalPayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRentalPayResponse setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public QueryRentalPayResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryRentalPayResponse setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public QueryRentalPayResponse setRealPayAmount(Long realPayAmount) {
        this.realPayAmount = realPayAmount;
        return this;
    }
    public Long getRealPayAmount() {
        return this.realPayAmount;
    }

    public QueryRentalPayResponse setRealReceiptAmount(Long realReceiptAmount) {
        this.realReceiptAmount = realReceiptAmount;
        return this;
    }
    public Long getRealReceiptAmount() {
        return this.realReceiptAmount;
    }

    public QueryRentalPayResponse setPayFinish(String payFinish) {
        this.payFinish = payFinish;
        return this;
    }
    public String getPayFinish() {
        return this.payFinish;
    }

    public QueryRentalPayResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QueryRentalPayResponse setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
        return this;
    }
    public String getPayOrderNo() {
        return this.payOrderNo;
    }

    public QueryRentalPayResponse setPayTradeNo(String payTradeNo) {
        this.payTradeNo = payTradeNo;
        return this;
    }
    public String getPayTradeNo() {
        return this.payTradeNo;
    }

}
