<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LeasePromiseInfo extends Model
{
    // 租期index
    /**
     * @example 1
     *
     * @var int
     */
    public $term;

    // 应还款金额
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
    protected $_name = [
        'term'     => 'term',
        'payMoney' => 'pay_money',
        'payDate'  => 'pay_date',
    ];

    public function validate()
    {
        Model::validateRequired('term', $this->term, true);
        Model::validateRequired('payMoney', $this->payMoney, true);
        Model::validateRequired('payDate', $this->payDate, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LeasePromiseInfo
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

        return $model;
    }
}
