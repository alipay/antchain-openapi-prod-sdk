// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade_inner.models;

import com.aliyun.tea.*;

public class InvestmentReportInner extends TeaModel {
    // 预期收益
    // 
    @NameInMap("estimated_annualized")
    @Validation(required = true)
    public Long estimatedAnnualized;

    // 实际收益率（Annual Yield）
    // 
    @NameInMap("actual_annualized_yield")
    @Validation(required = true)
    public Long actualAnnualizedYield;

    // 预期收益率（Expect Yield）
    @NameInMap("estimated_annualized_yield")
    @Validation(required = true)
    public Long estimatedAnnualizedYield;

    // 毛利吻合率（Gross Profit Conformity）
    @NameInMap("match_rate")
    @Validation(required = true)
    public Long matchRate;

    // 投资金额（Investment Allocation）
    @NameInMap("investment_amount")
    @Validation(required = true)
    public Long investmentAmount;

    // 实际收益
    @NameInMap("actual_annualized")
    @Validation(required = true)
    public Long actualAnnualized;

    // 资产抵押率（Collateral Ratio）
    @NameInMap("collateral_rate")
    @Validation(required = true)
    public Long collateralRate;

    // 数据日期
    @NameInMap("dt")
    @Validation(required = true)
    public String dt;

    public static InvestmentReportInner build(java.util.Map<String, ?> map) throws Exception {
        InvestmentReportInner self = new InvestmentReportInner();
        return TeaModel.build(map, self);
    }

    public InvestmentReportInner setEstimatedAnnualized(Long estimatedAnnualized) {
        this.estimatedAnnualized = estimatedAnnualized;
        return this;
    }
    public Long getEstimatedAnnualized() {
        return this.estimatedAnnualized;
    }

    public InvestmentReportInner setActualAnnualizedYield(Long actualAnnualizedYield) {
        this.actualAnnualizedYield = actualAnnualizedYield;
        return this;
    }
    public Long getActualAnnualizedYield() {
        return this.actualAnnualizedYield;
    }

    public InvestmentReportInner setEstimatedAnnualizedYield(Long estimatedAnnualizedYield) {
        this.estimatedAnnualizedYield = estimatedAnnualizedYield;
        return this;
    }
    public Long getEstimatedAnnualizedYield() {
        return this.estimatedAnnualizedYield;
    }

    public InvestmentReportInner setMatchRate(Long matchRate) {
        this.matchRate = matchRate;
        return this;
    }
    public Long getMatchRate() {
        return this.matchRate;
    }

    public InvestmentReportInner setInvestmentAmount(Long investmentAmount) {
        this.investmentAmount = investmentAmount;
        return this;
    }
    public Long getInvestmentAmount() {
        return this.investmentAmount;
    }

    public InvestmentReportInner setActualAnnualized(Long actualAnnualized) {
        this.actualAnnualized = actualAnnualized;
        return this;
    }
    public Long getActualAnnualized() {
        return this.actualAnnualized;
    }

    public InvestmentReportInner setCollateralRate(Long collateralRate) {
        this.collateralRate = collateralRate;
        return this;
    }
    public Long getCollateralRate() {
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
