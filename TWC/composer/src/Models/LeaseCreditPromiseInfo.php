<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeaseCreditPromiseInfo extends Model
{
    // 租期index
    /**
     * @example 1
     *
     * @var int
     */
    public $term;

    // 应还金额
    /**
     * @example 123400
     *
     * @var int
     */
    public $payMoney;

    // 应还款时间
    /**
     * @example 2019-07-31 12:00:00
     *
     * @var string
     */
    public $payDate;

    // 垫付日
    /**
     * @example 2019-07-31 12:00:00
     *
     * @var string
     */
    public $payInAdvanceTime;

    // 垫付金额
    /**
     * @example 123400
     *
     * @var int
     */
    public $payInAdvanceMoney;
    protected $_name = [
        'term'              => 'term',
        'payMoney'          => 'pay_money',
        'payDate'           => 'pay_date',
        'payInAdvanceTime'  => 'pay_in_advance_time',
        'payInAdvanceMoney' => 'pay_in_advance_money',
    ];

    public function validate()
    {
        Model::validateRequired('term', $this->term, true);
        Model::validateRequired('payMoney', $this->payMoney, true);
        Model::validateRequired('payDate', $this->payDate, true);
        Model::validateRequired('payInAdvanceTime', $this->payInAdvanceTime, true);
        Model::validateRequired('payInAdvanceMoney', $this->payInAdvanceMoney, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->term) {
            $res['term'] = $this->term;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }
        if (null !== $this->payInAdvanceTime) {
            $res['pay_in_advance_time'] = $this->payInAdvanceTime;
        }
        if (null !== $this->payInAdvanceMoney) {
            $res['pay_in_advance_money'] = $this->payInAdvanceMoney;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeaseCreditPromiseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['term'])) {
            $model->term = $map['term'];
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }
        if (isset($map['pay_in_advance_time'])) {
            $model->payInAdvanceTime = $map['pay_in_advance_time'];
        }
        if (isset($map['pay_in_advance_money'])) {
            $model->payInAdvanceMoney = $map['pay_in_advance_money'];
        }

        return $model;
    }
}
