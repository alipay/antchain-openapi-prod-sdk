// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class GetComsumeJdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 项目ID
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 券ID
    @NameInMap("coupon_id")
    @Validation(required = true)
    public String couponId;

    // 券状态
    // UNUSED_=未使用
    // _USED_ 已使用
    // _EXPIRED_ 过期
    @NameInMap("prize_status")
    @Validation(required = true)
    public String prizeStatus;

    // 使用时间
    // 时间格式“yyyy-mm-dd
    // hh:mm:ss”
    @NameInMap("consume_time")
    public String consumeTime;

    // 回传类型
    // _1_-实时 ‘_2_-批量
    @NameInMap("write_off_type")
    @Validation(required = true)
    public Long writeOffType;

    // 银行流水号
    @NameInMap("bank_flow_no")
    public String bankFlowNo;

    // 交易订单号
    @NameInMap("transaction_id")
    public String transactionId;

    // 交易金额(分)
    @NameInMap("trade_amount")
    public Long tradeAmount;

    // 消耗商户号（本期不传）
    @NameInMap("merchant_no")
    public String merchantNo;

    public static GetComsumeJdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetComsumeJdRequest self = new GetComsumeJdRequest();
        return TeaModel.build(map, self);
    }

    public GetComsumeJdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetComsumeJdRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetComsumeJdRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetComsumeJdRequest setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public GetComsumeJdRequest setPrizeStatus(String prizeStatus) {
        this.prizeStatus = prizeStatus;
        return this;
    }
    public String getPrizeStatus() {
        return this.prizeStatus;
    }

    public GetComsumeJdRequest setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }
    public String getConsumeTime() {
        return this.consumeTime;
    }

    public GetComsumeJdRequest setWriteOffType(Long writeOffType) {
        this.writeOffType = writeOffType;
        return this;
    }
    public Long getWriteOffType() {
        return this.writeOffType;
    }

    public GetComsumeJdRequest setBankFlowNo(String bankFlowNo) {
        this.bankFlowNo = bankFlowNo;
        return this;
    }
    public String getBankFlowNo() {
        return this.bankFlowNo;
    }

    public GetComsumeJdRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public GetComsumeJdRequest setTradeAmount(Long tradeAmount) {
        this.tradeAmount = tradeAmount;
        return this;
    }
    public Long getTradeAmount() {
        return this.tradeAmount;
    }

    public GetComsumeJdRequest setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }
    public String getMerchantNo() {
        return this.merchantNo;
    }

}
