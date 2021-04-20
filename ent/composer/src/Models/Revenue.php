<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class Revenue extends Model
{
    // 收益币种，目前仅支持CNY
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;

    // 收益金额，单位为分
    /**
     * @example 100
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
     * @return Revenue
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
