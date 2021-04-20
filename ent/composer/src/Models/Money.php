<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ENT\Models;

use AlibabaCloud\Tea\Model;

class Money extends Model
{
    // 金额，单位分
    /**
     * @example 100
     *
     * @var int
     */
    public $value;

    // 币种，暂只支持人民币CNY
    /**
     * @example CNY
     *
     * @var string
     */
    public $currency;
    protected $_name = [
        'value'    => 'value',
        'currency' => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('currency', $this->currency, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Money
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}
