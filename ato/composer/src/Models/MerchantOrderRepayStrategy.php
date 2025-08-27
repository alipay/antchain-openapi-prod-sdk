<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class MerchantOrderRepayStrategy extends Model
{
    // 分账期数(关联商户履约)
    /**
     * @example 1
     *
     * @var int
     */
    public $termIndex;

    // 还款期数(关联用户还款承诺)
    /**
     * @example 1
     *
     * @var int
     */
    public $leaseTermIndex;

    // 分账金额
    /**
     * @example 1000
     *
     * @var int
     */
    public $payMoney;

    // 转代偿时间，yyyy-MM-dd
    /**
     * @example 2018-01-01
     *
     * @var string
     */
    public $toCompensateDate;
    protected $_name = [
        'termIndex'        => 'term_index',
        'leaseTermIndex'   => 'lease_term_index',
        'payMoney'         => 'pay_money',
        'toCompensateDate' => 'to_compensate_date',
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
        if (null !== $this->leaseTermIndex) {
            $res['lease_term_index'] = $this->leaseTermIndex;
        }
        if (null !== $this->payMoney) {
            $res['pay_money'] = $this->payMoney;
        }
        if (null !== $this->toCompensateDate) {
            $res['to_compensate_date'] = $this->toCompensateDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantOrderRepayStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['term_index'])) {
            $model->termIndex = $map['term_index'];
        }
        if (isset($map['lease_term_index'])) {
            $model->leaseTermIndex = $map['lease_term_index'];
        }
        if (isset($map['pay_money'])) {
            $model->payMoney = $map['pay_money'];
        }
        if (isset($map['to_compensate_date'])) {
            $model->toCompensateDate = $map['to_compensate_date'];
        }

        return $model;
    }
}
