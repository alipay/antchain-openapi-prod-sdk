<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE_INNER\Models;

use AlibabaCloud\Tea\Model;

class InvestmentReportInner extends Model
{
    // 预期收益
    //
    /**
     * @example 23.45
     *
     * @var int
     */
    public $estimatedAnnualized;

    // 实际收益率（Annual Yield）
    //
    /**
     * @example 12.34
     *
     * @var int
     */
    public $actualAnnualizedYield;

    // 预期收益率（Expect Yield）
    /**
     * @example 12.34
     *
     * @var int
     */
    public $estimatedAnnualizedYield;

    // 毛利吻合率（Gross Profit Conformity）
    /**
     * @example 12.34
     *
     * @var int
     */
    public $matchRate;

    // 投资金额（Investment Allocation）
    /**
     * @example 12.34
     *
     * @var int
     */
    public $investmentAmount;

    // 实际收益
    /**
     * @example 12.34
     *
     * @var int
     */
    public $actualAnnualized;

    // 资产抵押率（Collateral Ratio）
    /**
     * @example 12.34
     *
     * @var int
     */
    public $collateralRate;

    // 数据日期
    /**
     * @example 20250214
     *
     * @var string
     */
    public $dt;
    protected $_name = [
        'estimatedAnnualized'      => 'estimated_annualized',
        'actualAnnualizedYield'    => 'actual_annualized_yield',
        'estimatedAnnualizedYield' => 'estimated_annualized_yield',
        'matchRate'                => 'match_rate',
        'investmentAmount'         => 'investment_amount',
        'actualAnnualized'         => 'actual_annualized',
        'collateralRate'           => 'collateral_rate',
        'dt'                       => 'dt',
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
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->estimatedAnnualized) {
            $res['estimated_annualized'] = $this->estimatedAnnualized;
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
            $res['investment_amount'] = $this->investmentAmount;
        }
        if (null !== $this->actualAnnualized) {
            $res['actual_annualized'] = $this->actualAnnualized;
        }
        if (null !== $this->collateralRate) {
            $res['collateral_rate'] = $this->collateralRate;
        }
        if (null !== $this->dt) {
            $res['dt'] = $this->dt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InvestmentReportInner
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['estimated_annualized'])) {
            $model->estimatedAnnualized = $map['estimated_annualized'];
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
            $model->investmentAmount = $map['investment_amount'];
        }
        if (isset($map['actual_annualized'])) {
            $model->actualAnnualized = $map['actual_annualized'];
        }
        if (isset($map['collateral_rate'])) {
            $model->collateralRate = $map['collateral_rate'];
        }
        if (isset($map['dt'])) {
            $model->dt = $map['dt'];
        }

        return $model;
    }
}
