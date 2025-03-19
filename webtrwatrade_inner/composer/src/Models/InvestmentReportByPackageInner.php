<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE_INNER\Models;

use AlibabaCloud\Tea\Model;

class InvestmentReportByPackageInner extends Model
{
    // 预期收益
    /**
     * @example 23.45
     *
     * @var MultiCurrencyMoney
     */
    public $estimatedAnnualized;

    // 实际收益率(Annual Yield)
    /**
     * @example 12.34
     *
     * @var string
     */
    public $actualAnnualizedYield;

    // 预期收益率（Expect Yield）
    /**
     * @example 12.34
     *
     * @var string
     */
    public $estimatedAnnualizedYield;

    // 毛利吻合率（Gross Profit Conformity）
    /**
     * @example 12.34
     *
     * @var string
     */
    public $matchRate;

    // 投资金额（Investment Allocation）
    /**
     * @example 12.34
     *
     * @var MultiCurrencyMoney
     */
    public $investmentAmount;

    // 实际收益
    /**
     * @example 12.34
     *
     * @var MultiCurrencyMoney
     */
    public $actualAnnualized;

    // 资产抵押率（Collateral Ratio）
    /**
     * @example 12.34
     *
     * @var string
     */
    public $collateralRate;

    // 数据日期
    /**
     * @example 20250214
     *
     * @var string
     */
    public $dt;

    // 现金流覆盖季度还款金额比例
    /**
     * @example 12.34
     *
     * @var string
     */
    public $cashFlowCoverageQuarterlyRepaymentAmountRatio;

    // 现金流
    /**
     * @example 12.34
     *
     * @var MultiCurrencyMoney
     */
    public $cashFlow;

    // 抵押物总值
    /**
     * @example 12.34
     *
     * @var MultiCurrencyMoney
     */
    public $collateralTotalValue;
    protected $_name = [
        'estimatedAnnualized'                           => 'estimated_annualized',
        'actualAnnualizedYield'                         => 'actual_annualized_yield',
        'estimatedAnnualizedYield'                      => 'estimated_annualized_yield',
        'matchRate'                                     => 'match_rate',
        'investmentAmount'                              => 'investment_amount',
        'actualAnnualized'                              => 'actual_annualized',
        'collateralRate'                                => 'collateral_rate',
        'dt'                                            => 'dt',
        'cashFlowCoverageQuarterlyRepaymentAmountRatio' => 'cash_flow_coverage_quarterly_repayment_amount_ratio',
        'cashFlow'                                      => 'cash_flow',
        'collateralTotalValue'                          => 'collateral_total_value',
    ];

    public function validate()
    {
        Model::validateRequired('estimatedAnnualized', $this->estimatedAnnualized, true);
        Model::validateRequired('actualAnnualizedYield', $this->actualAnnualizedYield, true);
        Model::validateRequired('estimatedAnnualizedYield', $this->estimatedAnnualizedYield, true);
        Model::validateRequired('matchRate', $this->matchRate, true);
        Model::validateRequired('investmentAmount', $this->investmentAmount, true);
        Model::validateRequired('actualAnnualized', $this->actualAnnualized, true);
        Model::validateRequired('collateralRate', $this->collateralRate, true);
        Model::validateRequired('dt', $this->dt, true);
        Model::validateRequired('cashFlowCoverageQuarterlyRepaymentAmountRatio', $this->cashFlowCoverageQuarterlyRepaymentAmountRatio, true);
        Model::validateRequired('cashFlow', $this->cashFlow, true);
        Model::validateRequired('collateralTotalValue', $this->collateralTotalValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->estimatedAnnualized) {
            $res['estimated_annualized'] = null !== $this->estimatedAnnualized ? $this->estimatedAnnualized->toMap() : null;
        }
        if (null !== $this->actualAnnualizedYield) {
            $res['actual_annualized_yield'] = $this->actualAnnualizedYield;
        }
        if (null !== $this->estimatedAnnualizedYield) {
            $res['estimated_annualized_yield'] = $this->estimatedAnnualizedYield;
        }
        if (null !== $this->matchRate) {
            $res['match_rate'] = $this->matchRate;
        }
        if (null !== $this->investmentAmount) {
            $res['investment_amount'] = null !== $this->investmentAmount ? $this->investmentAmount->toMap() : null;
        }
        if (null !== $this->actualAnnualized) {
            $res['actual_annualized'] = null !== $this->actualAnnualized ? $this->actualAnnualized->toMap() : null;
        }
        if (null !== $this->collateralRate) {
            $res['collateral_rate'] = $this->collateralRate;
        }
        if (null !== $this->dt) {
            $res['dt'] = $this->dt;
        }
        if (null !== $this->cashFlowCoverageQuarterlyRepaymentAmountRatio) {
            $res['cash_flow_coverage_quarterly_repayment_amount_ratio'] = $this->cashFlowCoverageQuarterlyRepaymentAmountRatio;
        }
        if (null !== $this->cashFlow) {
            $res['cash_flow'] = null !== $this->cashFlow ? $this->cashFlow->toMap() : null;
        }
        if (null !== $this->collateralTotalValue) {
            $res['collateral_total_value'] = null !== $this->collateralTotalValue ? $this->collateralTotalValue->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InvestmentReportByPackageInner
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['estimated_annualized'])) {
            $model->estimatedAnnualized = MultiCurrencyMoney::fromMap($map['estimated_annualized']);
        }
        if (isset($map['actual_annualized_yield'])) {
            $model->actualAnnualizedYield = $map['actual_annualized_yield'];
        }
        if (isset($map['estimated_annualized_yield'])) {
            $model->estimatedAnnualizedYield = $map['estimated_annualized_yield'];
        }
        if (isset($map['match_rate'])) {
            $model->matchRate = $map['match_rate'];
        }
        if (isset($map['investment_amount'])) {
            $model->investmentAmount = MultiCurrencyMoney::fromMap($map['investment_amount']);
        }
        if (isset($map['actual_annualized'])) {
            $model->actualAnnualized = MultiCurrencyMoney::fromMap($map['actual_annualized']);
        }
        if (isset($map['collateral_rate'])) {
            $model->collateralRate = $map['collateral_rate'];
        }
        if (isset($map['dt'])) {
            $model->dt = $map['dt'];
        }
        if (isset($map['cash_flow_coverage_quarterly_repayment_amount_ratio'])) {
            $model->cashFlowCoverageQuarterlyRepaymentAmountRatio = $map['cash_flow_coverage_quarterly_repayment_amount_ratio'];
        }
        if (isset($map['cash_flow'])) {
            $model->cashFlow = MultiCurrencyMoney::fromMap($map['cash_flow']);
        }
        if (isset($map['collateral_total_value'])) {
            $model->collateralTotalValue = MultiCurrencyMoney::fromMap($map['collateral_total_value']);
        }

        return $model;
    }
}
