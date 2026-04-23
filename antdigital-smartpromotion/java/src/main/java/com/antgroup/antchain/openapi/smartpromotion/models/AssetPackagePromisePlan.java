// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class AssetPackagePromisePlan extends TeaModel {
    // 账期
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("period_num")
    public Long periodNum;

    // 还款时间yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2026-03-16</p>
     */
    @NameInMap("pay_day")
    public String payDay;

    // 计划还款总额，单位为分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total_amount")
    public Long totalAmount;

    // 本金，单位为分
    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("principal_amount")
    public Long principalAmount;

    // 利息，单位为分
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("interest_amount")
    public Long interestAmount;

    // 构成订单数
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("order_count")
    public Long orderCount;

    public static AssetPackagePromisePlan build(java.util.Map<String, ?> map) throws Exception {
        AssetPackagePromisePlan self = new AssetPackagePromisePlan();
        return TeaModel.build(map, self);
    }

    public AssetPackagePromisePlan setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public AssetPackagePromisePlan setPayDay(String payDay) {
        this.payDay = payDay;
        return this;
    }
    public String getPayDay() {
        return this.payDay;
    }

    public AssetPackagePromisePlan setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public AssetPackagePromisePlan setPrincipalAmount(Long principalAmount) {
        this.principalAmount = principalAmount;
        return this;
    }
    public Long getPrincipalAmount() {
        return this.principalAmount;
    }

    public AssetPackagePromisePlan setInterestAmount(Long interestAmount) {
        this.interestAmount = interestAmount;
        return this;
    }
    public Long getInterestAmount() {
        return this.interestAmount;
    }

    public AssetPackagePromisePlan setOrderCount(Long orderCount) {
        this.orderCount = orderCount;
        return this;
    }
    public Long getOrderCount() {
        return this.orderCount;
    }

}
