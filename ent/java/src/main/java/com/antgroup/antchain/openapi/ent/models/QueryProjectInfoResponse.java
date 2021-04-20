// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class QueryProjectInfoResponse extends TeaModel {
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

    // 总粉丝粒数，单位分个
    @NameInMap("total_token_amount")
    public Long totalTokenAmount;

    // 未发放粉丝粒数，单位分个
    @NameInMap("remaining_token_amount")
    public Long remainingTokenAmount;

    // 已发放粉丝粒数，单位分个
    @NameInMap("released_token_amount")
    public Long releasedTokenAmount;

    // 已提现粉丝粒数，单位分个
    @NameInMap("redeemed_token_amount")
    public Long redeemedTokenAmount;

    // 总资金金额，单位分
    @NameInMap("total_prize_amount")
    public Money totalPrizeAmount;

    // 未消耗资金金额，单位分
    @NameInMap("unused_prize_amount")
    public Money unusedPrizeAmount;

    // 已消耗资金金额，单位分
    @NameInMap("used_prize_amount")
    public Money usedPrizeAmount;

    // 开始发放时间
    @NameInMap("allocation_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String allocationStartTime;

    // 停止发放时间
    @NameInMap("allocation_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String allocationEndTime;

    // 开始兑现时间
    @NameInMap("redeem_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String redeemStartTime;

    // 停止兑现时间
    @NameInMap("redeem_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String redeemEndTime;

    // 发放该项目粉丝粒的订单内票数总和
    @NameInMap("ticket_number")
    public Long ticketNumber;

    // 当前粉丝粒单价，单位分
    @NameInMap("current_token_price")
    public Money currentTokenPrice;

    // 粉丝粒保底价格，单位分
    @NameInMap("min_token_price")
    public Money minTokenPrice;

    // 发放区间信息
    @NameInMap("current_stage")
    public Stage currentStage;

    // 所有发放区间信息
    @NameInMap("all_stages")
    public java.util.List<Stage> allStages;

    // 项目参与用户数
    @NameInMap("project_user_num")
    public Boolean projectUserNum;

    // 项目订单总数
    @NameInMap("project_order_num")
    public Long projectOrderNum;

    // 项目已售商品总数
    @NameInMap("project_item_num")
    public Long projectItemNum;

    public static QueryProjectInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectInfoResponse self = new QueryProjectInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryProjectInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProjectInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProjectInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProjectInfoResponse setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public QueryProjectInfoResponse setTotalTokenAmount(Long totalTokenAmount) {
        this.totalTokenAmount = totalTokenAmount;
        return this;
    }
    public Long getTotalTokenAmount() {
        return this.totalTokenAmount;
    }

    public QueryProjectInfoResponse setRemainingTokenAmount(Long remainingTokenAmount) {
        this.remainingTokenAmount = remainingTokenAmount;
        return this;
    }
    public Long getRemainingTokenAmount() {
        return this.remainingTokenAmount;
    }

    public QueryProjectInfoResponse setReleasedTokenAmount(Long releasedTokenAmount) {
        this.releasedTokenAmount = releasedTokenAmount;
        return this;
    }
    public Long getReleasedTokenAmount() {
        return this.releasedTokenAmount;
    }

    public QueryProjectInfoResponse setRedeemedTokenAmount(Long redeemedTokenAmount) {
        this.redeemedTokenAmount = redeemedTokenAmount;
        return this;
    }
    public Long getRedeemedTokenAmount() {
        return this.redeemedTokenAmount;
    }

    public QueryProjectInfoResponse setTotalPrizeAmount(Money totalPrizeAmount) {
        this.totalPrizeAmount = totalPrizeAmount;
        return this;
    }
    public Money getTotalPrizeAmount() {
        return this.totalPrizeAmount;
    }

    public QueryProjectInfoResponse setUnusedPrizeAmount(Money unusedPrizeAmount) {
        this.unusedPrizeAmount = unusedPrizeAmount;
        return this;
    }
    public Money getUnusedPrizeAmount() {
        return this.unusedPrizeAmount;
    }

    public QueryProjectInfoResponse setUsedPrizeAmount(Money usedPrizeAmount) {
        this.usedPrizeAmount = usedPrizeAmount;
        return this;
    }
    public Money getUsedPrizeAmount() {
        return this.usedPrizeAmount;
    }

    public QueryProjectInfoResponse setAllocationStartTime(String allocationStartTime) {
        this.allocationStartTime = allocationStartTime;
        return this;
    }
    public String getAllocationStartTime() {
        return this.allocationStartTime;
    }

    public QueryProjectInfoResponse setAllocationEndTime(String allocationEndTime) {
        this.allocationEndTime = allocationEndTime;
        return this;
    }
    public String getAllocationEndTime() {
        return this.allocationEndTime;
    }

    public QueryProjectInfoResponse setRedeemStartTime(String redeemStartTime) {
        this.redeemStartTime = redeemStartTime;
        return this;
    }
    public String getRedeemStartTime() {
        return this.redeemStartTime;
    }

    public QueryProjectInfoResponse setRedeemEndTime(String redeemEndTime) {
        this.redeemEndTime = redeemEndTime;
        return this;
    }
    public String getRedeemEndTime() {
        return this.redeemEndTime;
    }

    public QueryProjectInfoResponse setTicketNumber(Long ticketNumber) {
        this.ticketNumber = ticketNumber;
        return this;
    }
    public Long getTicketNumber() {
        return this.ticketNumber;
    }

    public QueryProjectInfoResponse setCurrentTokenPrice(Money currentTokenPrice) {
        this.currentTokenPrice = currentTokenPrice;
        return this;
    }
    public Money getCurrentTokenPrice() {
        return this.currentTokenPrice;
    }

    public QueryProjectInfoResponse setMinTokenPrice(Money minTokenPrice) {
        this.minTokenPrice = minTokenPrice;
        return this;
    }
    public Money getMinTokenPrice() {
        return this.minTokenPrice;
    }

    public QueryProjectInfoResponse setCurrentStage(Stage currentStage) {
        this.currentStage = currentStage;
        return this;
    }
    public Stage getCurrentStage() {
        return this.currentStage;
    }

    public QueryProjectInfoResponse setAllStages(java.util.List<Stage> allStages) {
        this.allStages = allStages;
        return this;
    }
    public java.util.List<Stage> getAllStages() {
        return this.allStages;
    }

    public QueryProjectInfoResponse setProjectUserNum(Boolean projectUserNum) {
        this.projectUserNum = projectUserNum;
        return this;
    }
    public Boolean getProjectUserNum() {
        return this.projectUserNum;
    }

    public QueryProjectInfoResponse setProjectOrderNum(Long projectOrderNum) {
        this.projectOrderNum = projectOrderNum;
        return this;
    }
    public Long getProjectOrderNum() {
        return this.projectOrderNum;
    }

    public QueryProjectInfoResponse setProjectItemNum(Long projectItemNum) {
        this.projectItemNum = projectItemNum;
        return this;
    }
    public Long getProjectItemNum() {
        return this.projectItemNum;
    }

}
