// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class AssetPackageFinancePlan extends TeaModel {
    // 版本号，从1开始
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("version")
    public Long version;

    // 状态，ENABLE：启用，不启用时默认null
    /**
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("status")
    public String status;

    // 放款比例
    // 0~100，保留小数2位
    /**
     * <strong>example:</strong>
     * <p>75</p>
     */
    @NameInMap("loan_rate")
    public String loanRate;

    // 放款金额，单位分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("loan_money")
    public Long loanMoney;

    // 放款金额，单位元
    /**
     * <strong>example:</strong>
     * <p>1.00</p>
     */
    @NameInMap("loan_money_yuan")
    public String loanMoneyYuan;

    // 计息方式，枚举：
    // ● 年化利率：APR
    // ● 固定金额：FIXED_AMOUNT
    // ● 固定比例：FIXED_RATE
    /**
     * <strong>example:</strong>
     * <p>APR</p>
     */
    @NameInMap("interest_accrual_method")
    public String interestAccrualMethod;

    // 年计息天数
    /**
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("day_count_convention")
    public Long dayCountConvention;

    // 息费率
    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("allin_financing_cost_rate")
    public String allinFinancingCostRate;

    // 还款方式，枚举：
    // ● 等额本息：EQUAL_INSTALLMENT_METHOD
    /**
     * <strong>example:</strong>
     * <p>EQUAL_INSTALLMENT_METHOD</p>
     */
    @NameInMap("repayment_method")
    public String repaymentMethod;

    // 还款频率，枚举：
    // ● 按月：MONTH
    /**
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("repayment_frequency")
    public String repaymentFrequency;

    // 融资期数，范围0~36
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("finance_num")
    public Long financeNum;

    // 计划还款日期，范围1～28
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pay_day")
    public Long payDay;

    // 触发商家代偿时间，单位天
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("merchant_compensation_day")
    public Long merchantCompensationDay;

    // 订单未还款总金额，单位分
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("unreleased_amount")
    public Long unreleasedAmount;

    public static AssetPackageFinancePlan build(java.util.Map<String, ?> map) throws Exception {
        AssetPackageFinancePlan self = new AssetPackageFinancePlan();
        return TeaModel.build(map, self);
    }

    public AssetPackageFinancePlan setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public AssetPackageFinancePlan setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AssetPackageFinancePlan setLoanRate(String loanRate) {
        this.loanRate = loanRate;
        return this;
    }
    public String getLoanRate() {
        return this.loanRate;
    }

    public AssetPackageFinancePlan setLoanMoney(Long loanMoney) {
        this.loanMoney = loanMoney;
        return this;
    }
    public Long getLoanMoney() {
        return this.loanMoney;
    }

    public AssetPackageFinancePlan setLoanMoneyYuan(String loanMoneyYuan) {
        this.loanMoneyYuan = loanMoneyYuan;
        return this;
    }
    public String getLoanMoneyYuan() {
        return this.loanMoneyYuan;
    }

    public AssetPackageFinancePlan setInterestAccrualMethod(String interestAccrualMethod) {
        this.interestAccrualMethod = interestAccrualMethod;
        return this;
    }
    public String getInterestAccrualMethod() {
        return this.interestAccrualMethod;
    }

    public AssetPackageFinancePlan setDayCountConvention(Long dayCountConvention) {
        this.dayCountConvention = dayCountConvention;
        return this;
    }
    public Long getDayCountConvention() {
        return this.dayCountConvention;
    }

    public AssetPackageFinancePlan setAllinFinancingCostRate(String allinFinancingCostRate) {
        this.allinFinancingCostRate = allinFinancingCostRate;
        return this;
    }
    public String getAllinFinancingCostRate() {
        return this.allinFinancingCostRate;
    }

    public AssetPackageFinancePlan setRepaymentMethod(String repaymentMethod) {
        this.repaymentMethod = repaymentMethod;
        return this;
    }
    public String getRepaymentMethod() {
        return this.repaymentMethod;
    }

    public AssetPackageFinancePlan setRepaymentFrequency(String repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
        return this;
    }
    public String getRepaymentFrequency() {
        return this.repaymentFrequency;
    }

    public AssetPackageFinancePlan setFinanceNum(Long financeNum) {
        this.financeNum = financeNum;
        return this;
    }
    public Long getFinanceNum() {
        return this.financeNum;
    }

    public AssetPackageFinancePlan setPayDay(Long payDay) {
        this.payDay = payDay;
        return this;
    }
    public Long getPayDay() {
        return this.payDay;
    }

    public AssetPackageFinancePlan setMerchantCompensationDay(Long merchantCompensationDay) {
        this.merchantCompensationDay = merchantCompensationDay;
        return this;
    }
    public Long getMerchantCompensationDay() {
        return this.merchantCompensationDay;
    }

    public AssetPackageFinancePlan setUnreleasedAmount(Long unreleasedAmount) {
        this.unreleasedAmount = unreleasedAmount;
        return this;
    }
    public Long getUnreleasedAmount() {
        return this.unreleasedAmount;
    }

}
