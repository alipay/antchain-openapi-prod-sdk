// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CouponInfo extends TeaModel {
    // 优惠券Id
    @NameInMap("coupon_id")
    @Validation(required = true)
    public String couponId;

    // 优惠券名称
    @NameInMap("coupon_name")
    @Validation(required = true)
    public String couponName;

    // 优惠券状态
    // unUsed-未使用
    // Used-已使用
    // Expired-过期
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 使用场景
    // 01-提款使用
    // 02-还款使用
    @NameInMap("use_condition")
    @Validation(required = true)
    public String useCondition;

    // 优惠码
    @NameInMap("coupon_code")
    public String couponCode;

    // 优惠券类型
    // 01-金额优惠
    // 02-天数优惠
    // 03-折扣优惠
    // 04-期数优惠
    // 05-固定利率
    @NameInMap("coupon_type")
    public String couponType;

    // 优惠券面额
    // coupon_type=01 时为优惠金额
    // coupon_type=02 时为减免天数
    // coupon_type=03 时为折扣值（如6 折）
    // coupon_type=04 时为减免期数
    // coupon_type=05 时为折扣值（如 8.88 为利率8.88%）
    @NameInMap("coupon_value")
    public String couponValue;

    // 当 coupon_type=01 时，才会有优惠金额
    @NameInMap("coupon_amount")
    public String couponAmount;

    // 过期时间yyyy-MM-dd HH:mm:ss
    @NameInMap("expired_time")
    public String expiredTime;

    // 生效时间yyyy-MM-dd HH:mm:ss
    @NameInMap("effective_time")
    public String effectiveTime;

    // 使用规则
    @NameInMap("use_detail")
    public String useDetail;

    // 贷款最低金额
    @NameInMap("min_amount")
    public String minAmount;

    // 贷款最高金额
    @NameInMap("max_amount")
    public String maxAmount;

    // 最低贷款期数
    @NameInMap("min_period")
    public String minPeriod;

    // 最高贷款期数
    @NameInMap("max_period")
    public String maxPeriod;

    // 贷款最低期限天数
    @NameInMap("min_day")
    public String minDay;

    // 还款方式
    // 1-等额本息
    // 2-等额本金
    // 3-等本等费
    // 4-按期付息到期还本
    // 5-到期一次性还本付息
    // 6-等本等费-总费率
    // 7-等额本息(长期)
    @NameInMap("repayment_method")
    public String repaymentMethod;

    // 是否有贷款期数要求
    // 0：否
    // 1：是
    @NameInMap("is_period_limit")
    public String isPeriodLimit;

    // 贷款期限要求还款条件
    // 01：可提前还款
    // 02：不可提前还款
    // isPeriodLimit=1 && repayCondition=01 代表：有可提前还款锁期
    // isPeriodLimit=1 && repayCondition=02 代表：有不可提前还款锁期
    @NameInMap("repay_condition")
    public String repayCondition;

    // 还款场景
    // 01-到期还款
    // 02-即期还款
    @NameInMap("repay_ways")
    public String repayWays;

    // 优惠模板Id
    @NameInMap("coupon_model_no")
    public String couponModelNo;

    // 至到期:X年X月X日
    // 0：不是至到期券 
    // 1：是至到期券
    @NameInMap("to_maturity")
    public String toMaturity;

    public static CouponInfo build(java.util.Map<String, ?> map) throws Exception {
        CouponInfo self = new CouponInfo();
        return TeaModel.build(map, self);
    }

    public CouponInfo setCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }
    public String getCouponId() {
        return this.couponId;
    }

    public CouponInfo setCouponName(String couponName) {
        this.couponName = couponName;
        return this;
    }
    public String getCouponName() {
        return this.couponName;
    }

    public CouponInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CouponInfo setUseCondition(String useCondition) {
        this.useCondition = useCondition;
        return this;
    }
    public String getUseCondition() {
        return this.useCondition;
    }

    public CouponInfo setCouponCode(String couponCode) {
        this.couponCode = couponCode;
        return this;
    }
    public String getCouponCode() {
        return this.couponCode;
    }

    public CouponInfo setCouponType(String couponType) {
        this.couponType = couponType;
        return this;
    }
    public String getCouponType() {
        return this.couponType;
    }

    public CouponInfo setCouponValue(String couponValue) {
        this.couponValue = couponValue;
        return this;
    }
    public String getCouponValue() {
        return this.couponValue;
    }

    public CouponInfo setCouponAmount(String couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }
    public String getCouponAmount() {
        return this.couponAmount;
    }

    public CouponInfo setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public CouponInfo setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public CouponInfo setUseDetail(String useDetail) {
        this.useDetail = useDetail;
        return this;
    }
    public String getUseDetail() {
        return this.useDetail;
    }

    public CouponInfo setMinAmount(String minAmount) {
        this.minAmount = minAmount;
        return this;
    }
    public String getMinAmount() {
        return this.minAmount;
    }

    public CouponInfo setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }
    public String getMaxAmount() {
        return this.maxAmount;
    }

    public CouponInfo setMinPeriod(String minPeriod) {
        this.minPeriod = minPeriod;
        return this;
    }
    public String getMinPeriod() {
        return this.minPeriod;
    }

    public CouponInfo setMaxPeriod(String maxPeriod) {
        this.maxPeriod = maxPeriod;
        return this;
    }
    public String getMaxPeriod() {
        return this.maxPeriod;
    }

    public CouponInfo setMinDay(String minDay) {
        this.minDay = minDay;
        return this;
    }
    public String getMinDay() {
        return this.minDay;
    }

    public CouponInfo setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod;
        return this;
    }
    public String getRepaymentMethod() {
        return this.repaymentMethod;
    }

    public CouponInfo setIsPeriodLimit(String isPeriodLimit) {
        this.isPeriodLimit = isPeriodLimit;
        return this;
    }
    public String getIsPeriodLimit() {
        return this.isPeriodLimit;
    }

    public CouponInfo setRepayCondition(String repayCondition) {
        this.repayCondition = repayCondition;
        return this;
    }
    public String getRepayCondition() {
        return this.repayCondition;
    }

    public CouponInfo setRepayWays(String repayWays) {
        this.repayWays = repayWays;
        return this;
    }
    public String getRepayWays() {
        return this.repayWays;
    }

    public CouponInfo setCouponModelNo(String couponModelNo) {
        this.couponModelNo = couponModelNo;
        return this;
    }
    public String getCouponModelNo() {
        return this.couponModelNo;
    }

    public CouponInfo setToMaturity(String toMaturity) {
        this.toMaturity = toMaturity;
        return this;
    }
    public String getToMaturity() {
        return this.toMaturity;
    }

}
