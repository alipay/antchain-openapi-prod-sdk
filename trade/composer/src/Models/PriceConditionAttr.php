<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class PriceConditionAttr extends Model
{
    // 属性code
    /**
     * @example 属性code
     *
     * @var string
     */
    public $attrCode;

    // 属性值code
    /**
     * @example 属性值code
     *
     * @var string
     */
    public $attrValueCode;

    // 属性值名称
    /**
     * @example 属性值名称
     *
     * @var string
     */
    public $attrValueName;

    // 运算符，只有在约束条件中会出现
    /**
     * @example 运算符
     *
     * @var string
     */
    public $operator;
    protected $_name = [
        'attrCode'      => 'attr_code',
        'attrValueCode' => 'attr_value_code',
        'attrValueName' => 'attr_value_name',
        'operator'      => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('attrCode', $this->attrCode, true);
        Model::validateRequired('attrValueCode', $this->attrValueCode, true);
        Model::validateRequired('attrValueName', $this->attrValueName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->attrCode) {
            $res['attr_code'] = $this->attrCode;
        }
        if (null !== $this->attrValueCode) {
            $res['attr_value_code'] = $this->attrValueCode;
        }
        if (null !== $this->attrValueName) {
            $res['attr_value_name'] = $this->attrValueName;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PriceConditionAttr
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['attr_code'])) {
            $model->attrCode = $map['attr_code'];
        }
        if (isset($map['attr_value_code'])) {
            $model->attrValueCode = $map['attr_value_code'];
        }
        if (isset($map['attr_value_name'])) {
            $model->attrValueName = $map['attr_value_name'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
