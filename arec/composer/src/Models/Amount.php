<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AREC\Models;

use AlibabaCloud\Tea\Model;

class Amount extends Model
{
    // 币种代码，如CNY代表人民币
    /**
     * @example CNY
     *
     * @var string
     */
    public $code;

    // 币种金额，如200.00，人民币以元为单位，保留两位小数
    /**
     * @example 200.00
     *
     * @var string
     */
    public $value;
    protected $_name = [
        'code'  => 'code',
        'value' => 'value',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('value', $this->value, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Amount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['value'])) {
            $model->value = $map['value'];
        }

        return $model;
    }
}
