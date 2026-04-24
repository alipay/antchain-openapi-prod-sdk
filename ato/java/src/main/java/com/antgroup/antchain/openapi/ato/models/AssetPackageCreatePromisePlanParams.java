// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AssetPackageCreatePromisePlanParams extends TeaModel {
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

    public static AssetPackageCreatePromisePlanParams build(java.util.Map<String, ?> map) throws Exception {
        AssetPackageCreatePromisePlanParams self = new AssetPackageCreatePromisePlanParams();
        return TeaModel.build(map, self);
    }

    public AssetPackageCreatePromisePlanParams setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public AssetPackageCreatePromisePlanParams setPayDay(String payDay) {
        this.payDay = payDay;
        return this;
    }
    public String getPayDay() {
        return this.payDay;
    }

    public AssetPackageCreatePromisePlanParams setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public AssetPackageCreatePromisePlanParams setPrincipalAmount(Long principalAmount) {
        this.principalAmount = principalAmount;
        return this;
    }
    public Long getPrincipalAmount() {
        return this.principalAmount;
    }

    public AssetPackageCreatePromisePlanParams setInterestAmount(Long interestAmount) {
        this.interestAmount = interestAmount;
        return this;
    }
    public Long getInterestAmount() {
        return this.interestAmount;
    }

}
