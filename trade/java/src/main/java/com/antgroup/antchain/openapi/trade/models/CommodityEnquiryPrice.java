// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class CommodityEnquiryPrice extends TeaModel {
    // 商品主数据编码
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 商品名称
    @NameInMap("commodity_name")
    @Validation(required = true)
    public String commodityName;

    // 预付-支付金额
    @NameInMap("pay_amount")
    @Validation(required = true)
    public String payAmount;

    // 预付费-原始金额
    @NameInMap("original_amount")
    @Validation(required = true)
    public String originalAmount;

    // 预付费-折扣金额
    @NameInMap("discount_amount")
    @Validation(required = true)
    public String discountAmount;

    // 命中的活动编码
    @NameInMap("activity_code")
    @Validation(required = true)
    public String activityCode;

    // 命中的活动名称
    @NameInMap("activity_name")
    @Validation(required = true)
    public String activityName;

    // 命中的定价计划ID
    @NameInMap("price_plan_id")
    @Validation(required = true)
    public Long pricePlanId;

    // 命中的定价约束ID
    @NameInMap("price_constraint_id")
    @Validation(required = true)
    public Long priceConstraintId;

    // 币种，元：CNY
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

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

}
