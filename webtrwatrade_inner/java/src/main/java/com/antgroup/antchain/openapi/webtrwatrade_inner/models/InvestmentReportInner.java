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

    // 现金流覆盖季度还款金额比例
    @NameInMap("cash_flow_coverage_quarterly_repayment_amount_ratio")
    @Validation(required = true)
    public String cashFlowCoverageQuarterlyRepaymentAmountRatio;

    // 现金流
    @NameInMap("cash_flow")
    @Validation(required = true)
    public MultiCurrencyMoney cashFlow;

    // 初始资产总值
    @NameInMap("initial_asset_total_value")
    @Validation(required = true)
    public MultiCurrencyMoney initialAssetTotalValue;

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

    public InvestmentReportInner setCashFlowCoverageQuarterlyRepaymentAmountRatio(String cashFlowCoverageQuarterlyRepaymentAmountRatio) {
        this.cashFlowCoverageQuarterlyRepaymentAmountRatio = cashFlowCoverageQuarterlyRepaymentAmountRatio;
        return this;
    }
    public String getCashFlowCoverageQuarterlyRepaymentAmountRatio() {
        return this.cashFlowCoverageQuarterlyRepaymentAmountRatio;
    }

    public InvestmentReportInner setCashFlow(MultiCurrencyMoney cashFlow) {
        this.cashFlow = cashFlow;
        return this;
    }
    public MultiCurrencyMoney getCashFlow() {
        return this.cashFlow;
    }

    public InvestmentReportInner setInitialAssetTotalValue(MultiCurrencyMoney initialAssetTotalValue) {
        this.initialAssetTotalValue = initialAssetTotalValue;
        return this;
    }
    public MultiCurrencyMoney getInitialAssetTotalValue() {
        return this.initialAssetTotalValue;
    }

}
