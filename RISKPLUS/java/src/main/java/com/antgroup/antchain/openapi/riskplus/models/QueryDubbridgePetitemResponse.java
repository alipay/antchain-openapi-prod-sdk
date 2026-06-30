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

    // 渠道code
    @NameInMap("channel_code")
    public String channelCode;

    // 用户已支出金额
    @NameInMap("consumed_amount")
    public String consumedAmount;

    // 商城消费结算金额
    @NameInMap("mall_consume_settle_amount")
    public String mallConsumeSettleAmount;

    // 商城消费在途未结算金额
    @NameInMap("mall_consume_unsettle_amount")
    public String mallConsumeUnsettleAmount;

    // 已还金额
    @NameInMap("repaid_amount")
    public String repaidAmount;

    // 解约后剩余应还金额
    @NameInMap("remaining_amount")
    public String remainingAmount;

    // 解约后退还给用户的金额
    @NameInMap("refund_user_amount")
    public String refundUserAmount;

    // 是否逾期(默认false)
    @NameInMap("overdue")
    public Boolean overdue;

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

    public QueryDubbridgePetitemResponse setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public QueryDubbridgePetitemResponse setConsumedAmount(String consumedAmount) {
        this.consumedAmount = consumedAmount;
        return this;
    }
    public String getConsumedAmount() {
        return this.consumedAmount;
    }

    public QueryDubbridgePetitemResponse setMallConsumeSettleAmount(String mallConsumeSettleAmount) {
        this.mallConsumeSettleAmount = mallConsumeSettleAmount;
        return this;
    }
    public String getMallConsumeSettleAmount() {
        return this.mallConsumeSettleAmount;
    }

    public QueryDubbridgePetitemResponse setMallConsumeUnsettleAmount(String mallConsumeUnsettleAmount) {
        this.mallConsumeUnsettleAmount = mallConsumeUnsettleAmount;
        return this;
    }
    public String getMallConsumeUnsettleAmount() {
        return this.mallConsumeUnsettleAmount;
    }

    public QueryDubbridgePetitemResponse setRepaidAmount(String repaidAmount) {
        this.repaidAmount = repaidAmount;
        return this;
    }
    public String getRepaidAmount() {
        return this.repaidAmount;
    }

    public QueryDubbridgePetitemResponse setRemainingAmount(String remainingAmount) {
        this.remainingAmount = remainingAmount;
        return this;
    }
    public String getRemainingAmount() {
        return this.remainingAmount;
    }

    public QueryDubbridgePetitemResponse setRefundUserAmount(String refundUserAmount) {
        this.refundUserAmount = refundUserAmount;
        return this;
    }
    public String getRefundUserAmount() {
        return this.refundUserAmount;
    }

    public QueryDubbridgePetitemResponse setOverdue(Boolean overdue) {
        this.overdue = overdue;
        return this;
    }
    public Boolean getOverdue() {
        return this.overdue;
    }

}
