<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class MultiCurrencyMoney extends Model
{
    // 金额，以分为单位
    /**
     * @example 100
     *
     * @var string
     */
    public $cent;

    // 币种编码
    /**
     * @example HKD
     *
     * @var string
     */
    public $currency;

    // 金额，以元为单位，保留6位小数
    /**
     * @example 1.000000
     *
     * @var string
     */
    public $amount;
    protected $_name = [
        'cent'     => 'cent',
        'currency' => 'currency',
        'amount'   => 'amount',
    ];

    public function validate()
    {
        Model::validateRequired('cent', $this->cent, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('amount', $this->amount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cent) {
            $res['cent'] = $this->cent;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MultiCurrencyMoney
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cent'])) {
            $model->cent = $map['cent'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }

        return $model;
    }
}
