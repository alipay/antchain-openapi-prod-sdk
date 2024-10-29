<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class OrderRepayStrategy extends Model
{
    // 还款期数
    /**
     * @example 1
     *
     * @var int
     */
    public $termIndex;

    // 每期应还租金(分)
    /**
     * @example 10000
     *
     * @var int
     */
    public $rentalMoney;

    // 每期应付时间
    /**
     * @example 2024-10-21
     *
     * @var string
     */
    public $payDay;
    protected $_name = [
        'termIndex'   => 'term_index',
        'rentalMoney' => 'rental_money',
        'payDay'      => 'pay_day',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->termIndex) {
            $res['term_index'] = $this->termIndex;
        }
        if (null !== $this->rentalMoney) {
            $res['rental_money'] = $this->rentalMoney;
        }
        if (null !== $this->payDay) {
            $res['pay_day'] = $this->payDay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderRepayStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['term_index'])) {
            $model->termIndex = $map['term_index'];
        }
        if (isset($map['rental_money'])) {
            $model->rentalMoney = $map['rental_money'];
        }
        if (isset($map['pay_day'])) {
            $model->payDay = $map['pay_day'];
        }

        return $model;
    }
}
