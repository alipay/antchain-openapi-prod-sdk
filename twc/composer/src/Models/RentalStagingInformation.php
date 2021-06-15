<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class RentalStagingInformation extends Model
{
    // 分期期数
    /**
     * @example 10
     *
     * @var int
     */
    public $installmentsNumber;

    // 租金每期应还款时间
    /**
     * @example 2021-05-31
     *
     * @var string
     */
    public $paymentTimeEachCycle;

    // 租金每期应还款额
    /**
     * @example 123.00
     *
     * @var string
     */
    public $paymentEachCycle;
    protected $_name = [
        'installmentsNumber'   => 'installments_number',
        'paymentTimeEachCycle' => 'payment_time_each_cycle',
        'paymentEachCycle'     => 'payment_each_cycle',
    ];

    public function validate()
    {
        Model::validateRequired('installmentsNumber', $this->installmentsNumber, true);
        Model::validateRequired('paymentTimeEachCycle', $this->paymentTimeEachCycle, true);
        Model::validateRequired('paymentEachCycle', $this->paymentEachCycle, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->installmentsNumber) {
            $res['installments_number'] = $this->installmentsNumber;
        }
        if (null !== $this->paymentTimeEachCycle) {
            $res['payment_time_each_cycle'] = $this->paymentTimeEachCycle;
        }
        if (null !== $this->paymentEachCycle) {
            $res['payment_each_cycle'] = $this->paymentEachCycle;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RentalStagingInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['installments_number'])) {
            $model->installmentsNumber = $map['installments_number'];
        }
        if (isset($map['payment_time_each_cycle'])) {
            $model->paymentTimeEachCycle = $map['payment_time_each_cycle'];
        }
        if (isset($map['payment_each_cycle'])) {
            $model->paymentEachCycle = $map['payment_each_cycle'];
        }

        return $model;
    }
}
