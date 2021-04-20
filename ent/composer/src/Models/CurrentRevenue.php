<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class CurrentRevenue extends Model
{
    // 币种，当前仅支持CNY
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;

    // 金额，单位为分
    /**
     * @example
     *
     * @var int
     */
    public $value;
    protected $_name = [
        'currency' => 'currency',
        'value'    => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CurrentRevenue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
