<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class CommodityAttribute extends Model
{
    // 属性编码
    /**
     * @example CAPACITY
     *
     * @var string
     */
    public $code;

    // 属性名
    /**
     * @example 资源包容量
     *
     * @var string
     */
    public $name;

    // 默认值
    /**
     * @example 100
     *
     * @var string
     */
    public $defaultValue;

    // 属性值类型，离散值：DISCRETE，数值：NUMBER
    /**
     * @example DISCRETE
     *
     * @var string
     */
    public $valueType;

    // 当是离散值类型时，为多个离散值逗号分隔
    // 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
    /**
     * @example 100,200
     *
     * @var string
     */
    public $valueRange;

    // 展示类型
    /**
     * @example RadioGroup
     *
     * @var string
     */
    public $displayType;

    // 提示文案
    /**
     * @example 这是一个属性
     *
     * @var string
     */
    public $tips;

    // 单位
    /**
     * @example 次、分钟
     *
     * @var string
     */
    public $unit;
    protected $_name = [
        'code'         => 'code',
        'name'         => 'name',
        'defaultValue' => 'default_value',
        'valueType'    => 'value_type',
        'valueRange'   => 'value_range',
        'displayType'  => 'display_type',
        'tips'         => 'tips',
        'unit'         => 'unit',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('defaultValue', $this->defaultValue, true);
        Model::validateRequired('valueType', $this->valueType, true);
        Model::validateRequired('valueRange', $this->valueRange, true);
        Model::validateRequired('displayType', $this->displayType, true);
        Model::validateRequired('tips', $this->tips, true);
        Model::validateRequired('unit', $this->unit, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
        }
        if (null !== $this->valueType) {
            $res['value_type'] = $this->valueType;
        }
        if (null !== $this->valueRange) {
            $res['value_range'] = $this->valueRange;
        }
        if (null !== $this->displayType) {
            $res['display_type'] = $this->displayType;
        }
        if (null !== $this->tips) {
            $res['tips'] = $this->tips;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommodityAttribute
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['default_value'])) {
            $model->defaultValue = $map['default_value'];
        }
        if (isset($map['value_type'])) {
            $model->valueType = $map['value_type'];
        }
        if (isset($map['value_range'])) {
            $model->valueRange = $map['value_range'];
        }
        if (isset($map['display_type'])) {
            $model->displayType = $map['display_type'];
        }
        if (isset($map['tips'])) {
            $model->tips = $map['tips'];
        }
        if (isset($map['unit'])) {
            $model->unit = $map['unit'];
        }

        return $model;
    }
}
