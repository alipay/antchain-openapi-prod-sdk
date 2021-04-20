// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class UserRevenueDetail extends TeaModel {
    // 累计收益
    @NameInMap("accumulative_revenue")
    @Validation(required = true)
    public Revenue accumulativeRevenue;

    // 待发放粉丝粒数量，单位分个。
    @NameInMap("pending_token_amount")
    @Validation(required = true)
    public Long pendingTokenAmount;

    // 作品名称
    @NameInMap("project_name")
    @Validation(required = true)
    public String projectName;

    // 可兑现粉丝粒数量，单位分个。
    @NameInMap("redeemable_token_amount")
    @Validation(required = true)
    public Long redeemableTokenAmount;

    // 已兑现粉丝粒数量，单位分个
    @NameInMap("redeemed_token_amount")
    @Validation(required = true)
    public Long redeemedTokenAmount;

    // 已发放粉丝粒数量，单位分个。
    @NameInMap("released_token_amount")
    @Validation(required = true)
    public Long releasedTokenAmount;

    // 粉丝粒单价，单位分
    @NameInMap("token_price")
    @Validation(required = true)
    public Long tokenPrice;

    // 可零收益
    @NameInMap("withdraw_revenue")
    @Validation(required = true)
    public Revenue withdrawRevenue;

    public static UserRevenueDetail build(java.util.Map<String, ?> map) throws Exception {
        UserRevenueDetail self = new UserRevenueDetail();
        return TeaModel.build(map, self);
    }

    public UserRevenueDetail setAccumulativeRevenue(Revenue accumulativeRevenue) {
        this.accumulativeRevenue = accumulativeRevenue;
        return this;
    }
    public Revenue getAccumulativeRevenue() {
        return this.accumulativeRevenue;
    }

    public UserRevenueDetail setPendingTokenAmount(Long pendingTokenAmount) {
        this.pendingTokenAmount = pendingTokenAmount;
        return this;
    }
    public Long getPendingTokenAmount() {
        return this.pendingTokenAmount;
    }

    public UserRevenueDetail setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UserRevenueDetail setRedeemableTokenAmount(Long redeemableTokenAmount) {
        this.redeemableTokenAmount = redeemableTokenAmount;
        return this;
    }
    public Long getRedeemableTokenAmount() {
        return this.redeemableTokenAmount;
    }

    public UserRevenueDetail setRedeemedTokenAmount(Long redeemedTokenAmount) {
        this.redeemedTokenAmount = redeemedTokenAmount;
        return this;
    }
    public Long getRedeemedTokenAmount() {
        return this.redeemedTokenAmount;
    }

    public UserRevenueDetail setReleasedTokenAmount(Long releasedTokenAmount) {
        this.releasedTokenAmount = releasedTokenAmount;
        return this;
    }
    public Long getReleasedTokenAmount() {
        return this.releasedTokenAmount;
    }

    public UserRevenueDetail setTokenPrice(Long tokenPrice) {
        this.tokenPrice = tokenPrice;
        return this;
    }
    public Long getTokenPrice() {
        return this.tokenPrice;
    }

    public UserRevenueDetail setWithdrawRevenue(Revenue withdrawRevenue) {
        this.withdrawRevenue = withdrawRevenue;
        return this;
    }
    public Revenue getWithdrawRevenue() {
        return this.withdrawRevenue;
    }

}
