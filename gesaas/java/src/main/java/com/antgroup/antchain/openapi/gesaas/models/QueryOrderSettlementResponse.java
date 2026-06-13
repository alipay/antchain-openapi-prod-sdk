// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryOrderSettlementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分账受理时间，格式为yyyy-MM-dd HH:mm:ss
    @NameInMap("split_request_time")
    public String splitRequestTime;

    // 分账明细
    @NameInMap("split_detail_list")
    public java.util.List<SettleOrderRoyaltyDetail> splitDetailList;

    // 支付宝 平台订单号
    @NameInMap("trade_no")
    public String tradeNo;

    // 外部订单号(商家)
    @NameInMap("out_order_no")
    public String outOrderNo;

    // 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
    @NameInMap("split_status")
    public String splitStatus;

    // 分账失败原因
    @NameInMap("split_fail_reason")
    public String splitFailReason;

    // 分账单号
    @NameInMap("settle_no")
    public String settleNo;

    public static QueryOrderSettlementResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderSettlementResponse self = new QueryOrderSettlementResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderSettlementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOrderSettlementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOrderSettlementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOrderSettlementResponse setSplitRequestTime(String splitRequestTime) {
        this.splitRequestTime = splitRequestTime;
        return this;
    }
    public String getSplitRequestTime() {
        return this.splitRequestTime;
    }

    public QueryOrderSettlementResponse setSplitDetailList(java.util.List<SettleOrderRoyaltyDetail> splitDetailList) {
        this.splitDetailList = splitDetailList;
        return this;
    }
    public java.util.List<SettleOrderRoyaltyDetail> getSplitDetailList() {
        return this.splitDetailList;
    }

    public QueryOrderSettlementResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryOrderSettlementResponse setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public QueryOrderSettlementResponse setSplitStatus(String splitStatus) {
        this.splitStatus = splitStatus;
        return this;
    }
    public String getSplitStatus() {
        return this.splitStatus;
    }

    public QueryOrderSettlementResponse setSplitFailReason(String splitFailReason) {
        this.splitFailReason = splitFailReason;
        return this;
    }
    public String getSplitFailReason() {
        return this.splitFailReason;
    }

    public QueryOrderSettlementResponse setSettleNo(String settleNo) {
        this.settleNo = settleNo;
        return this;
    }
    public String getSettleNo() {
        return this.settleNo;
    }

}
