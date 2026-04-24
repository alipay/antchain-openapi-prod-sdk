<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AssetPackageCreatePromisePlanParams extends Model
{
    // 账期
    /**
     * @example 1
     *
     * @var int
     */
    public $periodNum;

    // 还款时间yyyy-MM-dd
    /**
     * @example 2026-03-16
     *
     * @var string
     */
    public $payDay;

    // 计划还款总额，单位为分
    /**
     * @example 100
     *
     * @var int
     */
    public $totalAmount;

    // 本金，单位为分
    /**
     * @example 80
     *
     * @var int
     */
    public $principalAmount;

    // 利息，单位为分
    /**
     * @example 20
     *
     * @var int
     */
    public $interestAmount;
    protected $_name = [
        'periodNum'       => 'period_num',
        'payDay'          => 'pay_day',
        'totalAmount'     => 'total_amount',
        'principalAmount' => 'principal_amount',
        'interestAmount'  => 'interest_amount',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->periodNum) {
            $res['period_num'] = $this->periodNum;
        }
        if (null !== $this->payDay) {
            $res['pay_day'] = $this->payDay;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->principalAmount) {
            $res['principal_amount'] = $this->principalAmount;
        }
        if (null !== $this->interestAmount) {
            $res['interest_amount'] = $this->interestAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AssetPackageCreatePromisePlanParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['period_num'])) {
            $model->periodNum = $map['period_num'];
        }
        if (isset($map['pay_day'])) {
            $model->payDay = $map['pay_day'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['principal_amount'])) {
            $model->principalAmount = $map['principal_amount'];
        }
        if (isset($map['interest_amount'])) {
            $model->interestAmount = $map['interest_amount'];
        }

        return $model;
    }
}
