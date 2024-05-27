<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class PrepayAmount extends Model
{
    // 指定预付费金额
    /**
     * @example 100.00
     *
     * @var string
     */
    public $amount;

    // 币种单位，CNY\USD等标准币种单位编码
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;
    protected $_name = [
        'amount'   => 'amount',
        'currency' => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('amount', $this->amount, true);
        Model::validateRequired('currency', $this->currency, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PrepayAmount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}
