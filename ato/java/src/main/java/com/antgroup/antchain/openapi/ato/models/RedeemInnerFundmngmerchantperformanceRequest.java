// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RedeemInnerFundmngmerchantperformanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资方租户id
    @NameInMap("fund_tenant_id")
    @Validation(required = true)
    public String fundTenantId;

    // 商户租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 融资单的资方社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 赎回方式
    // 
    // ONLINE("ONLINE", "线上"),
    // OFFLINE("OFFLINE", "线下"),;
    @NameInMap("redeem_way")
    @Validation(required = true)
    public String redeemWay;

    // 赎回原因
    // ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
    // RENTING_OUT_REDEEM("RENTING_OUT_REDEEM", "退租赎回"),
    // RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
    //                                                                            "租转售赎回");
    @NameInMap("redeem_reason")
    @Validation(required = true)
    public String redeemReason;

    // 赎回金额,单位为分,取消并赎回时必填
    @NameInMap("redeem_amount")
    public Long redeemAmount;

    // 赎回类型，为空默认为 TRANSFER 
    // 转账代偿：TRANSFER 
    // 代扣代偿：WITHHOLD
    @NameInMap("redeem_type")
    public String redeemType;

    // traceid
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    public static RedeemInnerFundmngmerchantperformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RedeemInnerFundmngmerchantperformanceRequest self = new RedeemInnerFundmngmerchantperformanceRequest();
        return TeaModel.build(map, self);
    }

    public RedeemInnerFundmngmerchantperformanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setFundTenantId(String fundTenantId) {
        this.fundTenantId = fundTenantId;
        return this;
    }
    public String getFundTenantId() {
        return this.fundTenantId;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setRedeemWay(String redeemWay) {
        this.redeemWay = redeemWay;
        return this;
    }
    public String getRedeemWay() {
        return this.redeemWay;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setRedeemReason(String redeemReason) {
        this.redeemReason = redeemReason;
        return this;
    }
    public String getRedeemReason() {
        return this.redeemReason;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setRedeemAmount(Long redeemAmount) {
        this.redeemAmount = redeemAmount;
        return this;
    }
    public Long getRedeemAmount() {
        return this.redeemAmount;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setRedeemType(String redeemType) {
        this.redeemType = redeemType;
        return this;
    }
    public String getRedeemType() {
        return this.redeemType;
    }

    public RedeemInnerFundmngmerchantperformanceRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
