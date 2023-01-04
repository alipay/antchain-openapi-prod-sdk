// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractComplainResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 投诉单号
    @NameInMap("complain_event_id")
    public String complainEventId;

    // 投诉单状态
    // 商家处理中：MERCHANT_PROCESSING
    // 商家已反馈：MERCHANT_FEEDBACKED
    // 投诉已完结：FINISHED
    // 投诉已撤销：CANCELLED
    // 平台处理中：PLATFORM_PROCESSING
    // 平台处理完结：PLATFORM_FINISH
    // 系统关闭：CLOSED
    @NameInMap("status")
    public String status;

    // 支付宝交易号
    @NameInMap("trade_no")
    public String tradeNo;

    // 商家订单号
    @NameInMap("merchant_order_no")
    public String merchantOrderNo;

    // 投诉单创建时间
    @NameInMap("gmt_create")
    public String gmtCreate;

    // 投诉单修改时间
    @NameInMap("gmt_modified")
    public String gmtModified;

    // 投诉单完结时间
    @NameInMap("gmt_finished")
    public String gmtFinished;

    // 用户投诉诉求
    @NameInMap("leaf_category_name")
    public String leafCategoryName;

    // 用户投诉原因
    @NameInMap("complain_reason")
    public String complainReason;

    // 用户投诉内容
    @NameInMap("content")
    public String content;

    // 投诉图片
    @NameInMap("images")
    public java.util.List<String> images;

    // 投诉人电话号码
    @NameInMap("phone_no")
    public String phoneNo;

    // 交易金额，单位元
    @NameInMap("trade_amount")
    public String tradeAmount;

    // 用户与商家之间的协商记录
    @NameInMap("reply_detail_infos")
    public java.util.List<ReplayDetailInfo> replyDetailInfos;

    public static QueryContractComplainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractComplainResponse self = new QueryContractComplainResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractComplainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractComplainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractComplainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractComplainResponse setComplainEventId(String complainEventId) {
        this.complainEventId = complainEventId;
        return this;
    }
    public String getComplainEventId() {
        return this.complainEventId;
    }

    public QueryContractComplainResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryContractComplainResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

    public QueryContractComplainResponse setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
        return this;
    }
    public String getMerchantOrderNo() {
        return this.merchantOrderNo;
    }

    public QueryContractComplainResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryContractComplainResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public QueryContractComplainResponse setGmtFinished(String gmtFinished) {
        this.gmtFinished = gmtFinished;
        return this;
    }
    public String getGmtFinished() {
        return this.gmtFinished;
    }

    public QueryContractComplainResponse setLeafCategoryName(String leafCategoryName) {
        this.leafCategoryName = leafCategoryName;
        return this;
    }
    public String getLeafCategoryName() {
        return this.leafCategoryName;
    }

    public QueryContractComplainResponse setComplainReason(String complainReason) {
        this.complainReason = complainReason;
        return this;
    }
    public String getComplainReason() {
        return this.complainReason;
    }

    public QueryContractComplainResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryContractComplainResponse setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public QueryContractComplainResponse setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public QueryContractComplainResponse setTradeAmount(String tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public QueryContractComplainResponse setReplyDetailInfos(java.util.List<ReplayDetailInfo> replyDetailInfos) {
        this.replyDetailInfos = replyDetailInfos;
        return this;
    }
    public java.util.List<ReplayDetailInfo> getReplyDetailInfos() {
        return this.replyDetailInfos;
    }

}
