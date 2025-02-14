<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE_INNER\Models;

use AlibabaCloud\Tea\Model;

class QueryPlatformInvestmentreportResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 预期收益
    /**
     * @var int
     */
    public $estimatedAnnualized;

    // 实际收益率（Annual Yield）
    /**
     * @var int
     */
    public $actualAnnualizedYield;

    // 预期收益率（Expect Yield）
    /**
     * @var int
     */
    public $estimatedAnnualizedYield;

    // 毛利吻合率（Gross Profit Conformity）
    /**
     * @var int
     */
    public $matchRate;

    // 投资金额（Investment Allocation）
    /**
     * @var int
     */
    public $investmentAmount;

    // 实际收益
    /**
     * @var int
     */
    public $actualAnnualized;

    // 资产抵押率（Collateral Ratio）
    /**
     * @var int
     */
    public $collateralRate;

    // 数据日期
    /**
     * @var string
     */
    public $dt;
    protected $_name = [
        'reqMsgId'                 => 'req_msg_id',
        'resultCode'               => 'result_code',
        'resultMsg'                => 'result_msg',
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
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
     * @return QueryPlatformInvestmentreportResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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
