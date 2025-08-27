<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class PaymentItem extends Model
{
    // 付款金额，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $amount;

    // 付款项目类型
    /**
     * @example SCREEN_DAMAGE_INSURANCE
     *
     * @var string
     */
    public $paymentType;
    protected $_name = [
        'amount'      => 'amount',
        'paymentType' => 'payment_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->paymentType) {
            $res['payment_type'] = $this->paymentType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PaymentItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['payment_type'])) {
            $model->paymentType = $map['payment_type'];
        }

        return $model;
    }
}
