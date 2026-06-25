// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgePetitemResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 小程序客户号
    @NameInMap("open_id")
    public String openId;

    // 子渠道号(唯一标识)
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 门店ID
    @NameInMap("store_id")
    public String storeId;

    // 分期订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // 活体已打款金额
    @NameInMap("pet_amount")
    public String petAmount;

    // 分期服务费(贴息金额)
    @NameInMap("service_amount")
    public String serviceAmount;

    // 用户已还本金
    @NameInMap("repaid_amount")
    public String repaidAmount;

    // 应还本金
    @NameInMap("due_amount")
    public String dueAmount;

    // 应还罚息
    @NameInMap("due_penalty_amount")
    public String duePenaltyAmount;

    // 可退还资方金额
    @NameInMap("refund_fund_amount")
    public String refundFundAmount;

    // 渠道号
    @NameInMap("channel_code")
    public String channelCode;

    public static QueryDubbridgePetitemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgePetitemResponse self = new QueryDubbridgePetitemResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgePetitemResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgePetitemResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgePetitemResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgePetitemResponse setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryDubbridgePetitemResponse setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public QueryDubbridgePetitemResponse setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public QueryDubbridgePetitemResponse setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public QueryDubbridgePetitemResponse setPetAmount(String petAmount) {
        this.petAmount = petAmount;
        return this;
    }
    public String getPetAmount() {
        return this.petAmount;
    }

    public QueryDubbridgePetitemResponse setServiceAmount(String serviceAmount) {
        this.serviceAmount = serviceAmount;
        return this;
    }
    public String getServiceAmount() {
        return this.serviceAmount;
    }

    public QueryDubbridgePetitemResponse setRepaidAmount(String repaidAmount) {
        this.repaidAmount = repaidAmount;
        return this;
    }
    public String getRepaidAmount() {
        return this.repaidAmount;
    }

    public QueryDubbridgePetitemResponse setDueAmount(String dueAmount) {
        this.dueAmount = dueAmount;
        return this;
    }
    public String getDueAmount() {
        return this.dueAmount;
    }

    public QueryDubbridgePetitemResponse setDuePenaltyAmount(String duePenaltyAmount) {
        this.duePenaltyAmount = duePenaltyAmount;
        return this;
    }
    public String getDuePenaltyAmount() {
        return this.duePenaltyAmount;
    }

    public QueryDubbridgePetitemResponse setRefundFundAmount(String refundFundAmount) {
        this.refundFundAmount = refundFundAmount;
        return this;
    }
    public String getRefundFundAmount() {
        return this.refundFundAmount;
    }

    public QueryDubbridgePetitemResponse setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

}
