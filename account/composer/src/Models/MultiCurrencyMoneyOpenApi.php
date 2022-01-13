<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACCOUNT\Models;

use AlibabaCloud\Tea\Model;

class MultiCurrencyMoneyOpenApi extends Model
{
    // 最小币种单位
    /**
     * @example 123
     *
     * @var string
     */
    public $cent;

    // 币种
    /**
     * @example 156
     *
     * @var string
     */
    public $currencyValue;
    protected $_name = [
        'cent'          => 'cent',
        'currencyValue' => 'currency_value',
    ];

    public function validate()
    {
        Model::validateRequired('cent', $this->cent, true);
        Model::validateRequired('currencyValue', $this->currencyValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cent) {
            $res['cent'] = $this->cent;
        }
        if (null !== $this->currencyValue) {
            $res['currency_value'] = $this->currencyValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MultiCurrencyMoneyOpenApi
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cent'])) {
            $model->cent = $map['cent'];
        }
        if (isset($map['currency_value'])) {
            $model->currencyValue = $map['currency_value'];
        }

        return $model;
    }
}
