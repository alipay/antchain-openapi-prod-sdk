// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CommodityEnquiryPrice extends TeaModel {
    // 商品主数据编码
    /**
     * <strong>example:</strong>
     * <p>KXSFFM00264687</p>
     */
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>测试商品</p>
     */
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // 预付-支付金额
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("pay_amount")
    @Validation(required = true)
    public String payAmount;

    // 预付费-原始金额
    /**
     * <strong>example:</strong>
     * <p>200.00</p>
     */
    @NameInMap("original_amount")
    @Validation(required = true)
    public String originalAmount;

    // 预付费-折扣金额
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("discount_amount")
    @Validation(required = true)
    public String discountAmount;

    // 预付费-优惠券抵扣金额
    /**
     * <strong>example:</strong>
     * <p>0.00</p>
     */
    @NameInMap("coupon_amount")
    @Validation(required = true)
    public String couponAmount;

    // 原订购剩余价值，用于变配场景
    /**
     * <strong>example:</strong>
     * <p>50.00</p>
     */
    @NameInMap("subscription_unused_amount")
    @Validation(required = true)
    public String subscriptionUnusedAmount;

    // 命中的活动编码
    /**
     * <strong>example:</strong>
     * <p>a05d8efc-b1c8-42a0-9666-98f419d4e2eb</p>
     */
    @NameInMap("activity_code")
    @Validation(required = true)
    public String activityCode;

    // 命中的活动名称
    /**
     * <strong>example:</strong>
     * <p>测试折扣活动</p>
     */
    @NameInMap("activity_name")
    @Validation(required = true)
    public String activityName;

    // 命中的定价计划ID
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("price_plan_id")
    @Validation(required = true)
    public Long pricePlanId;

    // 命中的定价约束ID
    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("price_constraint_id")
    @Validation(required = true)
    public Long priceConstraintId;

    // 币种，元：CNY
    /**
     * <strong>example:</strong>
     * <p>CNY</p>
     */
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
    @NameInMap("min_duration_of_valid_pay_amount")
    public OrderDuration minDurationOfValidPayAmount;

    // 预付费-折扣率
    /**
     * <strong>example:</strong>
     * <p>0.75</p>
     */
    @NameInMap("discount_rate")
    @Validation(required = true)
    public String discountRate;

    // 原始BD权限价金额，白名单商品会返回此价格
    /**
     * <strong>example:</strong>
     * <p>160.00</p>
     */
    @NameInMap("original_bd_amount")
    public String originalBdAmount;

    // 原始成本价金额，白名单商品会返回此价格
    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("original_cost_amount")
    public String originalCostAmount;

    public static CommodityEnquiryPrice build(java.util.Map<String, ?> map) throws Exception {
        CommodityEnquiryPrice self = new CommodityEnquiryPrice();
        return TeaModel.build(map, self);
    }

    public CommodityEnquiryPrice setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CommodityEnquiryPrice setCommodityName(String commodityName) {
        this.commodityName = commodityName;
        return this;
    }
    public String getCommodityName() {
        return this.commodityName;
    }

    public CommodityEnquiryPrice setPayAmount(String payAmount) {
        this.payAmount = payAmount;
        return this;
    }
    public String getPayAmount() {
        return this.payAmount;
    }

    public CommodityEnquiryPrice setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    public String getOriginalAmount() {
        return this.originalAmount;
    }

    public CommodityEnquiryPrice setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }
    public String getDiscountAmount() {
        return this.discountAmount;
    }

    public CommodityEnquiryPrice setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }
    public String getCouponAmount() {
        return this.couponAmount;
    }

    public CommodityEnquiryPrice setSubscriptionUnusedAmount(String subscriptionUnusedAmount) {
        this.subscriptionUnusedAmount = subscriptionUnusedAmount;
        return this;
    }
    public String getSubscriptionUnusedAmount() {
        return this.subscriptionUnusedAmount;
    }

    public CommodityEnquiryPrice setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public CommodityEnquiryPrice setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public CommodityEnquiryPrice setPricePlanId(Long pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }
    public Long getPricePlanId() {
        return this.pricePlanId;
    }

    public CommodityEnquiryPrice setPriceConstraintId(Long priceConstraintId) {
        this.priceConstraintId = priceConstraintId;
        return this;
    }
    public Long getPriceConstraintId() {
        return this.priceConstraintId;
    }

    public CommodityEnquiryPrice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public CommodityEnquiryPrice setMinDurationOfValidPayAmount(OrderDuration minDurationOfValidPayAmount) {
        this.minDurationOfValidPayAmount = minDurationOfValidPayAmount;
        return this;
    }
    public OrderDuration getMinDurationOfValidPayAmount() {
        return this.minDurationOfValidPayAmount;
    }

    public CommodityEnquiryPrice setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
        return this;
    }
    public String getDiscountRate() {
        return this.discountRate;
    }

    public CommodityEnquiryPrice setOriginalBdAmount(String originalBdAmount) {
        this.originalBdAmount = originalBdAmount;
        return this;
    }
    public String getOriginalBdAmount() {
        return this.originalBdAmount;
    }

    public CommodityEnquiryPrice setOriginalCostAmount(String originalCostAmount) {
        this.originalCostAmount = originalCostAmount;
        return this;
    }
    public String getOriginalCostAmount() {
        return this.originalCostAmount;
    }

}
