<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyInfo extends Model
{
    // 授信编号
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $applyNo;

    // 资金方编号
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $fundCode;

    // 资金方名称
    /**
     * @example xxxxx
     *
     * @var string
     */
    public $fundName;

    // 贷款利率
    /**
     * @example xxxxx
     *
     * @var int
     */
    public $rateValue;

    // 贷款日利率
    /**
     * @example xxxxx
     *
     * @var int
     */
    public $rateValueDay;

    // 年天数
    /**
     * @example xxxxx
     *
     * @var int
     */
    public $daysNumYear;

    // 总授信额度
    /**
     * @example xxxxx
     *
     * @var int
     */
    public $totalAmount;

    // 可用额度
    /**
     * @example xxxxx
     *
     * @var int
     */
    public $balanceAmount;
    protected $_name = [
        'applyNo'       => 'apply_no',
        'fundCode'      => 'fund_code',
        'fundName'      => 'fund_name',
        'rateValue'     => 'rate_value',
        'rateValueDay'  => 'rate_value_day',
        'daysNumYear'   => 'days_num_year',
        'totalAmount'   => 'total_amount',
        'balanceAmount' => 'balance_amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applyNo) {
            $res['apply_no'] = $this->applyNo;
        }
        if (null !== $this->fundCode) {
            $res['fund_code'] = $this->fundCode;
        }
        if (null !== $this->fundName) {
            $res['fund_name'] = $this->fundName;
        }
        if (null !== $this->rateValue) {
            $res['rate_value'] = $this->rateValue;
        }
        if (null !== $this->rateValueDay) {
            $res['rate_value_day'] = $this->rateValueDay;
        }
        if (null !== $this->daysNumYear) {
            $res['days_num_year'] = $this->daysNumYear;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->balanceAmount) {
            $res['balance_amount'] = $this->balanceAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apply_no'])) {
            $model->applyNo = $map['apply_no'];
        }
        if (isset($map['fund_code'])) {
            $model->fundCode = $map['fund_code'];
        }
        if (isset($map['fund_name'])) {
            $model->fundName = $map['fund_name'];
        }
        if (isset($map['rate_value'])) {
            $model->rateValue = $map['rate_value'];
        }
        if (isset($map['rate_value_day'])) {
            $model->rateValueDay = $map['rate_value_day'];
        }
        if (isset($map['days_num_year'])) {
            $model->daysNumYear = $map['days_num_year'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['balance_amount'])) {
            $model->balanceAmount = $map['balance_amount'];
        }

        return $model;
    }
}
