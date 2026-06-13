// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryOrderWithdrawResponse extends TeaModel {
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

    // 退分账明细
    @NameInMap("refund_detail_item_list")
    public SettleOrderRoyaltyDetail refundDetailItemList;

    // 交易退分账总金额，单位：分
    // 明细单金额总和
    @NameInMap("trade_refund_amount")
    public Long tradeRefundAmount;

    public static QueryOrderWithdrawResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderWithdrawResponse self = new QueryOrderWithdrawResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderWithdrawResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOrderWithdrawResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOrderWithdrawResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOrderWithdrawResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryOrderWithdrawResponse setRefundDetailItemList(SettleOrderRoyaltyDetail refundDetailItemList) {
        this.refundDetailItemList = refundDetailItemList;
        return this;
    }
    public SettleOrderRoyaltyDetail getRefundDetailItemList() {
        return this.refundDetailItemList;
    }

    public QueryOrderWithdrawResponse setTradeRefundAmount(Long tradeRefundAmount) {
        this.tradeRefundAmount = tradeRefundAmount;
        return this;
    }
    public Long getTradeRefundAmount() {
        return this.tradeRefundAmount;
    }

}
