<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PayAmount extends Model
{
    // 支付金额（2位小数）
    /**
     * @example 10000.00
     *
     * @var string
     */
    public $amount;

    // 支付方式
    /**
     * @example 银行转账
     *
     * @var string
     */
    public $payType;
    protected $_name = [
        'amount'  => 'amount',
        'payType' => 'pay_type',
    ];

    public function validate()
    {
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('payType', $this->payType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PayAmount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }

        return $model;
    }
}
