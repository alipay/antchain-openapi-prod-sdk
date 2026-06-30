// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UserAggregationInfo extends TeaModel {
    // 状态
    // 0: 未授信
    // 1: 授信中
    // 2: 已授信未支用
    // 3: 支用中
    // 4: 已支用
    // 5: 借据逾期
    // 6: 授信过期
    // 7: 授信冻结
    // 8: 可重新授信
    // 9: 授信拒绝
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 总额度
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("credit_amount")
    public Long creditAmount;

    // 可用额度
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("available_amount")
    public Long availableAmount;

    // 待还总金额
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("should_pay_amount")
    public Long shouldPayAmount;

    // 逾期总金额
    @NameInMap("overdue_amount")
    public Long overdueAmount;

    // 下一期应还金额
    @NameInMap("next_period_amount")
    public Long nextPeriodAmount;

    // 下一期还款时间yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("next_period_repay_time")
    public String nextPeriodRepayTime;

    // 下次可授信时间yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("next_apply_time")
    public String nextApplyTime;

    // 优惠券列表
    @NameInMap("coupon_list")
    public java.util.List<CouponInfo> couponList;

    public static UserAggregationInfo build(java.util.Map<String, ?> map) throws Exception {
        UserAggregationInfo self = new UserAggregationInfo();
        return TeaModel.build(map, self);
    }

    public UserAggregationInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UserAggregationInfo setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public Long getCreditAmount() {
        return this.creditAmount;
    }

    public UserAggregationInfo setAvailableAmount(Long availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public Long getAvailableAmount() {
        return this.availableAmount;
    }

    public UserAggregationInfo setShouldPayAmount(Long shouldPayAmount) {
        this.shouldPayAmount = shouldPayAmount;
        return this;
    }
    public Long getShouldPayAmount() {
        return this.shouldPayAmount;
    }

    public UserAggregationInfo setOverdueAmount(Long overdueAmount) {
        this.overdueAmount = overdueAmount;
        return this;
    }
    public Long getOverdueAmount() {
        return this.overdueAmount;
    }

    public UserAggregationInfo setNextPeriodAmount(Long nextPeriodAmount) {
        this.nextPeriodAmount = nextPeriodAmount;
        return this;
    }
    public Long getNextPeriodAmount() {
        return this.nextPeriodAmount;
    }

    public UserAggregationInfo setNextPeriodRepayTime(String nextPeriodRepayTime) {
        this.nextPeriodRepayTime = nextPeriodRepayTime;
        return this;
    }
    public String getNextPeriodRepayTime() {
        return this.nextPeriodRepayTime;
    }

    public UserAggregationInfo setNextApplyTime(String nextApplyTime) {
        this.nextApplyTime = nextApplyTime;
        return this;
    }
    public String getNextApplyTime() {
        return this.nextApplyTime;
    }

    public UserAggregationInfo setCouponList(java.util.List<CouponInfo> couponList) {
        this.couponList = couponList;
        return this;
    }
    public java.util.List<CouponInfo> getCouponList() {
        return this.couponList;
    }

}
