// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclComplainResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 租赁订单id
    @NameInMap("order_id")
    public String orderId;

    // 投诉订单号
    @NameInMap("complain_event_id")
    public String complainEventId;

    // 投诉单状态
    @NameInMap("status")
    public String status;

    // 支付宝交易号
    @NameInMap("alipay_trade_no")
    public String alipayTradeNo;

    // 投诉单创建时间
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 投诉单修改时间
    @NameInMap("gmt_modified")
    public String gmtModified;

    // 投诉单修改时间
    @NameInMap("gmt_finished")
    public String gmtFinished;

    // 用户投诉诉求
    @NameInMap("leaf_category_name")
    public String leafCategoryName;

    // 用户投诉原因
    @NameInMap("complain_reason")
    public String complainReason;

    // 投诉人电话号码
    @NameInMap("phone_no")
    public String phoneNo;

    // 交易金额，单位元
    @NameInMap("trade_amount")
    public String tradeAmount;

    // 用户与商家之间的协商记录
    @NameInMap("reply_detail_infos")
    public java.util.List<ReplyDetailInfo> replyDetailInfos;

    public static QueryBclComplainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBclComplainResponse self = new QueryBclComplainResponse();
        return TeaModel.build(map, self);
    }

    public QueryBclComplainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBclComplainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBclComplainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBclComplainResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryBclComplainResponse setComplainEventId(String complainEventId) {
        this.complainEventId = complainEventId;
        return this;
    }
    public String getComplainEventId() {
        return this.complainEventId;
    }

    public QueryBclComplainResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryBclComplainResponse setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
        return this;
    }
    public String getAlipayTradeNo() {
        return this.alipayTradeNo;
    }

    public QueryBclComplainResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryBclComplainResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryBclComplainResponse setGmtFinished(String gmtFinished) {
        this.gmtFinished = gmtFinished;
        return this;
    }
    public String getGmtFinished() {
        return this.gmtFinished;
    }

    public QueryBclComplainResponse setLeafCategoryName(String leafCategoryName) {
        this.leafCategoryName = leafCategoryName;
        return this;
    }
    public String getLeafCategoryName() {
        return this.leafCategoryName;
    }

    public QueryBclComplainResponse setComplainReason(String complainReason) {
        this.complainReason = complainReason;
        return this;
    }
    public String getComplainReason() {
        return this.complainReason;
    }

    public QueryBclComplainResponse setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public QueryBclComplainResponse setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public QueryBclComplainResponse setReplyDetailInfos(java.util.List<ReplyDetailInfo> replyDetailInfos) {
        this.replyDetailInfos = replyDetailInfos;
        return this;
    }
    public java.util.List<ReplyDetailInfo> getReplyDetailInfos() {
        return this.replyDetailInfos;
    }

}
