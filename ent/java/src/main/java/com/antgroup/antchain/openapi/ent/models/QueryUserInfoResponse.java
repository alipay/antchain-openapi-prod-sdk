// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryUserInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目名称
    @NameInMap("project_name")
    public String projectName;

    // 已获得粉丝粒总数，单位分个
    @NameInMap("gained_token_amount")
    public Long gainedTokenAmount;

    // 当前粉丝粒持有数量，单位分个
    @NameInMap("current_token_amount")
    public Long currentTokenAmount;

    // 已兑现粉丝粒数量，单位分个
    @NameInMap("redeemed_token_amount")
    public Long redeemedTokenAmount;

    // 累计获得奖金
    @NameInMap("accumulative_revenue")
    public Revenue accumulativeRevenue;

    // 当前可兑奖金
    @NameInMap("current_revenue")
    public Revenue currentRevenue;

    // 已兑现奖金
    @NameInMap("redeemed_revenue")
    public Revenue redeemedRevenue;

    // 自购商品数量
    @NameInMap("buy_amount_from_self")
    public Long buyAmountFromSelf;

    // 分享购买商品数量
    @NameInMap("buy_amount_from_share")
    public Long buyAmountFromShare;

    public static QueryUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserInfoResponse self = new QueryUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserInfoResponse setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryUserInfoResponse setGainedTokenAmount(Long gainedTokenAmount) {
        this.gainedTokenAmount = gainedTokenAmount;
        return this;
    }
    public Long getGainedTokenAmount() {
        return this.gainedTokenAmount;
    }

    public QueryUserInfoResponse setCurrentTokenAmount(Long currentTokenAmount) {
        this.currentTokenAmount = currentTokenAmount;
        return this;
    }
    public Long getCurrentTokenAmount() {
        return this.currentTokenAmount;
    }

    public QueryUserInfoResponse setRedeemedTokenAmount(Long redeemedTokenAmount) {
        this.redeemedTokenAmount = redeemedTokenAmount;
        return this;
    }
    public Long getRedeemedTokenAmount() {
        return this.redeemedTokenAmount;
    }

    public QueryUserInfoResponse setAccumulativeRevenue(Revenue accumulativeRevenue) {
        this.accumulativeRevenue = accumulativeRevenue;
        return this;
    }
    public Revenue getAccumulativeRevenue() {
        return this.accumulativeRevenue;
    }

    public QueryUserInfoResponse setCurrentRevenue(Revenue currentRevenue) {
        this.currentRevenue = currentRevenue;
        return this;
    }
    public Revenue getCurrentRevenue() {
        return this.currentRevenue;
    }

    public QueryUserInfoResponse setRedeemedRevenue(Revenue redeemedRevenue) {
        this.redeemedRevenue = redeemedRevenue;
        return this;
    }
    public Revenue getRedeemedRevenue() {
        return this.redeemedRevenue;
    }

    public QueryUserInfoResponse setBuyAmountFromSelf(Long buyAmountFromSelf) {
        this.buyAmountFromSelf = buyAmountFromSelf;
        return this;
    }
    public Long getBuyAmountFromSelf() {
        return this.buyAmountFromSelf;
    }

    public QueryUserInfoResponse setBuyAmountFromShare(Long buyAmountFromShare) {
        this.buyAmountFromShare = buyAmountFromShare;
        return this;
    }
    public Long getBuyAmountFromShare() {
        return this.buyAmountFromShare;
    }

}
