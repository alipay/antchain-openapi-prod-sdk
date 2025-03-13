// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class InvestmentReportInner extends TeaModel {
    // 预期收益
    // 
    @NameInMap("estimated_annualized")
    @Validation(required = true)
    public MultiCurrencyMoney estimatedAnnualized;

    // 实际收益率（Annual Yield）
    // 
    @NameInMap("actual_annualized_yield")
    @Validation(required = true)
    public String actualAnnualizedYield;

    // 预期收益率（Expect Yield）
    @NameInMap("estimated_annualized_yield")
    @Validation(required = true)
    public String estimatedAnnualizedYield;

    // 毛利吻合率（Gross Profit Conformity）
    @NameInMap("match_rate")
    @Validation(required = true)
    public String matchRate;

    // 投资金额（Investment Allocation）
    @NameInMap("investment_amount")
    @Validation(required = true)
    public MultiCurrencyMoney investmentAmount;

    // 实际收益
    @NameInMap("actual_annualized")
    @Validation(required = true)
    public MultiCurrencyMoney actualAnnualized;

    // 资产抵押率（Collateral Ratio）
    @NameInMap("collateral_rate")
    @Validation(required = true)
    public String collateralRate;

    // 数据日期
    @NameInMap("dt")
    @Validation(required = true)
    public String dt;

    public static InvestmentReportInner build(java.util.Map<String, ?> map) throws Exception {
        InvestmentReportInner self = new InvestmentReportInner();
        return TeaModel.build(map, self);
    }

    public InvestmentReportInner setEstimatedAnnualized(MultiCurrencyMoney estimatedAnnualized) {
        this.estimatedAnnualized = estimatedAnnualized;
        return this;
    }
    public MultiCurrencyMoney getEstimatedAnnualized() {
        return this.estimatedAnnualized;
    }

    public InvestmentReportInner setActualAnnualizedYield(String actualAnnualizedYield) {
        this.actualAnnualizedYield = actualAnnualizedYield;
        return this;
    }
    public String getActualAnnualizedYield() {
        return this.actualAnnualizedYield;
    }

    public InvestmentReportInner setEstimatedAnnualizedYield(String estimatedAnnualizedYield) {
        this.estimatedAnnualizedYield = estimatedAnnualizedYield;
        return this;
    }
    public String getEstimatedAnnualizedYield() {
        return this.estimatedAnnualizedYield;
    }

    public InvestmentReportInner setMatchRate(String matchRate) {
        this.matchRate = matchRate;
        return this;
    }
    public String getMatchRate() {
        return this.matchRate;
    }

    public InvestmentReportInner setInvestmentAmount(MultiCurrencyMoney investmentAmount) {
        this.investmentAmount = investmentAmount;
        return this;
    }
    public MultiCurrencyMoney getInvestmentAmount() {
        return this.investmentAmount;
    }

    public InvestmentReportInner setActualAnnualized(MultiCurrencyMoney actualAnnualized) {
        this.actualAnnualized = actualAnnualized;
        return this;
    }
    public MultiCurrencyMoney getActualAnnualized() {
        return this.actualAnnualized;
    }

    public InvestmentReportInner setCollateralRate(String collateralRate) {
        this.collateralRate = collateralRate;
        return this;
    }
    public String getCollateralRate() {
        return this.collateralRate;
    }

    public InvestmentReportInner setDt(String dt) {
        this.dt = dt;
        return this;
    }
    public String getDt() {
        return this.dt;
    }

}
