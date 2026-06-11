// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class WithdrawOrderSettlementResponse extends TeaModel {
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

    // 商家订单号
    @NameInMap("out_order_no")
    public String outOrderNo;

    // 退款总金额。单位：分。 指该笔交易累计已经退款成功的金额
    @NameInMap("refund_fee")
    public Long refundFee;

    // 退款使用的资金渠道
    @NameInMap("refund_detail_item_list")
    public java.util.List<RefundDetail> refundDetailItemList;

    public static WithdrawOrderSettlementResponse build(java.util.Map<String, ?> map) throws Exception {
        WithdrawOrderSettlementResponse self = new WithdrawOrderSettlementResponse();
        return TeaModel.build(map, self);
    }

    public WithdrawOrderSettlementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public WithdrawOrderSettlementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public WithdrawOrderSettlementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public WithdrawOrderSettlementResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public WithdrawOrderSettlementResponse setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public WithdrawOrderSettlementResponse setRefundFee(Long refundFee) {
        this.refundFee = refundFee;
        return this;
    }
    public Long getRefundFee() {
        return this.refundFee;
    }

    public WithdrawOrderSettlementResponse setRefundDetailItemList(java.util.List<RefundDetail> refundDetailItemList) {
        this.refundDetailItemList = refundDetailItemList;
        return this;
    }
    public java.util.List<RefundDetail> getRefundDetailItemList() {
        return this.refundDetailItemList;
    }

}
