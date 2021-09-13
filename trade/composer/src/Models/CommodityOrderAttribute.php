<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CommodityOrderAttribute extends Model
{
    // 属性编码
    /**
     * @example SYS_USAGE_AMOUNT
     *
     * @var string
     */
    public $code;

    // 属性值
    /**
     * @example abc
     *
     * @var string
     */
    public $value;

    // 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
    /**
     * @example MB
     *
     * @var string
     */
    public $valueUnit;
    protected $_name = [
        'code'      => 'code',
        'value'     => 'value',
        'valueUnit' => 'value_unit',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('value', $this->value, true);
        Model::validateRequired('valueUnit', $this->valueUnit, true);
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
        if (null !== $this->valueUnit) {
            $res['value_unit'] = $this->valueUnit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommodityOrderAttribute
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
        if (isset($map['value_unit'])) {
            $model->valueUnit = $map['value_unit'];
        }

        return $model;
    }
}
