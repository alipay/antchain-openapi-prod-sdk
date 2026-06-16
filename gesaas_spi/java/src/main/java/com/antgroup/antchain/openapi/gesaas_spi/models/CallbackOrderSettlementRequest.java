// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class CallbackOrderSettlementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ASYNC_SETTLE_RESULT ：异步分账结果
    @NameInMap("msg_type")
    @Validation(required = true)
    public String msgType;

    // 支付交易号
    @NameInMap("trade_no")
    @Validation(required = true)
    public String tradeNo;

    // 分账金额，单位分
    @NameInMap("split_amount")
    @Validation(required = true)
    public Long splitAmount;

    // 分账受理单号
    @NameInMap("settle_no")
    @Validation(required = true)
    public String settleNo;

    // 分账受理时间
    @NameInMap("split_request_time")
    @Validation(required = true)
    public String splitRequestTime;

    // 分账通知明细
    @NameInMap("split_detail_list")
    @Validation(required = true)
    public java.util.List<SettleOrderRoyaltyDetail> splitDetailList;

    // 扩展参数
    @NameInMap("ext_info")
    public String extInfo;

    // 消息唯一性判断，重试msgId不变
    @NameInMap("msg_id")
    @Validation(required = true)
    public String msgId;

    // 外部订单号(同一个outProductId唯一)
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 分账状态，SUCCESS成功，FAIL失败
    @NameInMap("split_status")
    @Validation(required = true)
    public String splitStatus;

    // 分账失败原因，条件返回：splitStatus=FAIL 返回
    @NameInMap("split_fail_reason")
    public String splitFailReason;

    public static CallbackOrderSettlementRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackOrderSettlementRequest self = new CallbackOrderSettlementRequest();
        return TeaModel.build(map, self);
    }

    public CallbackOrderSettlementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackOrderSettlementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackOrderSettlementRequest setMsgType(String msgType) {
        this.msgType = msgType;
        return this;
    }
    public String getMsgType() {
        return this.msgType;
    }

    public CallbackOrderSettlementRequest setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public CallbackOrderSettlementRequest setSplitAmount(Long splitAmount) {
        this.splitAmount = splitAmount;
        return this;
    }
    public Long getSplitAmount() {
        return this.splitAmount;
    }

    public CallbackOrderSettlementRequest setSettleNo(String settleNo) {
        this.settleNo = settleNo;
        return this;
    }
    public String getSettleNo() {
        return this.settleNo;
    }

    public CallbackOrderSettlementRequest setSplitRequestTime(String splitRequestTime) {
        this.splitRequestTime = splitRequestTime;
        return this;
    }
    public String getSplitRequestTime() {
        return this.splitRequestTime;
    }

    public CallbackOrderSettlementRequest setSplitDetailList(java.util.List<SettleOrderRoyaltyDetail> splitDetailList) {
        this.splitDetailList = splitDetailList;
        return this;
    }
    public java.util.List<SettleOrderRoyaltyDetail> getSplitDetailList() {
        return this.splitDetailList;
    }

    public CallbackOrderSettlementRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CallbackOrderSettlementRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public CallbackOrderSettlementRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public CallbackOrderSettlementRequest setSplitStatus(String splitStatus) {
        this.splitStatus = splitStatus;
        return this;
    }
    public String getSplitStatus() {
        return this.splitStatus;
    }

    public CallbackOrderSettlementRequest setSplitFailReason(String splitFailReason) {
        this.splitFailReason = splitFailReason;
        return this;
    }
    public String getSplitFailReason() {
        return this.splitFailReason;
    }

}
