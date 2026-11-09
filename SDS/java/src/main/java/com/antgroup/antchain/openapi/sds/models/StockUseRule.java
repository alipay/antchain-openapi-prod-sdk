// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sds.models;

import com.aliyun.tea.*;

public class StockUseRule extends TeaModel {
    // 【发放总上限】 最大发券数
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("max_coupons")
    @Validation(required = true)
    public Long maxCoupons;

    // 【总预算】 总消耗金额，单位：分。
    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("max_amount")
    @Validation(required = true)
    public Long maxAmount;

    // 【单天发放上限金额】 单天最高消耗金额，单位：分。
    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("max_amount_by_day")
    @Validation(required = true)
    public Long maxAmountByDay;

    // 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
    /**
     * <strong>example:</strong>
     * <p>{           &quot;coupon_amount&quot; : 100,           &quot;transaction_minimum&quot; : 100         }</p>
     */
    @NameInMap("fixed_normal_coupon")
    @Validation(required = true)
    public FixedNormalCoupon fixedNormalCoupon;

    // 【单个用户可领个数】 单个用户可领个数
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("max_coupons_per_user")
    @Validation(required = true)
    public Long maxCouponsPerUser;

    // 【券或消费金类型】 券或消费金类型
    // 枚举值：
    // NORMAL：满减券
    // CUT_TO：减至券
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("coupon_type")
    public String couponType;

    // 【订单优惠标记】 订单优惠标记 (该字段暂未开放返回)
    // 特殊规则：单个优惠标记的字符长度为【1，128】,条目个数限制为【1，50】。
    /**
     * <strong>example:</strong>
     * <p>[           &quot;123456&quot;         ]</p>
     */
    @NameInMap("goods_tag")
    public java.util.List<String> goodsTag;

    // 【指定支付模式】默认不限制(该字段暂未开放返回)，枚举值：
    // 可选取值
    // MICROAPP:  小程序支付
    // APPPAY:  APP支付
    // PPAY:  免密支付
    // CARD:  刷卡支付
    // FACE:  人脸支付
    // OTHER:  其他支付，公众号、扫码等
    /**
     * <strong>example:</strong>
     * <p>[           &quot;MICROAPP&quot;         ]</p>
     */
    @NameInMap("trade_type")
    public java.util.List<String> tradeType;

    // 【是否可叠加其他优惠】 枚举值：
    // true：是
    // false：否
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("combine_use")
    public Boolean combineUse;

    // 【固定折扣特定信息】
    /**
     * <strong>example:</strong>
     * <p>{           &quot;discount_amount_max&quot; : 100,           &quot;discount_percent&quot; : 88,      &quot;transaction_minimum&quot; : 100         }</p>
     */
    @NameInMap("fixed_discount_coupon")
    public FixedDiscountCoupon fixedDiscountCoupon;

    public static StockUseRule build(java.util.Map<String, ?> map) throws Exception {
        StockUseRule self = new StockUseRule();
        return TeaModel.build(map, self);
    }

    public StockUseRule setMaxCoupons(Long maxCoupons) {
        this.maxCoupons = maxCoupons;
        return this;
    }
    public Long getMaxCoupons() {
        return this.maxCoupons;
    }

    public StockUseRule setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }
    public Long getMaxAmount() {
        return this.maxAmount;
    }

    public StockUseRule setMaxAmountByDay(Long maxAmountByDay) {
        this.maxAmountByDay = maxAmountByDay;
        return this;
    }
    public Long getMaxAmountByDay() {
        return this.maxAmountByDay;
    }

    public StockUseRule setFixedNormalCoupon(FixedNormalCoupon fixedNormalCoupon) {
        this.fixedNormalCoupon = fixedNormalCoupon;
        return this;
    }
    public FixedNormalCoupon getFixedNormalCoupon() {
        return this.fixedNormalCoupon;
    }

    public StockUseRule setMaxCouponsPerUser(Long maxCouponsPerUser) {
        this.maxCouponsPerUser = maxCouponsPerUser;
        return this;
    }
    public Long getMaxCouponsPerUser() {
        return this.maxCouponsPerUser;
    }

    public StockUseRule setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public StockUseRule setGoodsTag(java.util.List<String> goodsTag) {
        this.goodsTag = goodsTag;
        return this;
    }
    public java.util.List<String> getGoodsTag() {
        return this.goodsTag;
    }

    public StockUseRule setTradeType(java.util.List<String> tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public java.util.List<String> getTradeType() {
        return this.tradeType;
    }

    public StockUseRule setCombineUse(Boolean combineUse) {
        this.combineUse = combineUse;
        return this;
    }
    public Boolean getCombineUse() {
        return this.combineUse;
    }

    public StockUseRule setFixedDiscountCoupon(FixedDiscountCoupon fixedDiscountCoupon) {
        this.fixedDiscountCoupon = fixedDiscountCoupon;
        return this;
    }
    public FixedDiscountCoupon getFixedDiscountCoupon() {
        return this.fixedDiscountCoupon;
    }

}
