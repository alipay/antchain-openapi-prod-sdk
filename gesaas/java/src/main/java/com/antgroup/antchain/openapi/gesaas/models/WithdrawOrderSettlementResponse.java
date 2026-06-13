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

    // 退分账时间，格式为yyyy-MM-dd HH:mm:ss
    @NameInMap("refund_time")
    public String refundTime;

    // 分账账单
    @NameInMap("settle_no")
    public String settleNo;

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

    public WithdrawOrderSettlementResponse setRefundTime(String refundTime) {
        this.refundTime = refundTime;
        return this;
    }
    public String getRefundTime() {
        return this.refundTime;
    }

    public WithdrawOrderSettlementResponse setSettleNo(String settleNo) {
        this.settleNo = settleNo;
        return this;
    }
    public String getSettleNo() {
        return this.settleNo;
    }

}
