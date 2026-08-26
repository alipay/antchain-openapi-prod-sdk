<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class ChargeItemVO extends Model {
    protected $_name = [
        'name' => 'name',
        'code' => 'code',
        'value' => 'value',
        'unit' => 'unit',
        'type' => 'type',
        'displayName' => 'display_name',
        'displayUnit' => 'display_unit',
        'displayValue' => 'display_value',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->displayUnit) {
            $res['display_unit'] = $this->displayUnit;
        }
        if (null !== $this->displayValue) {
            $res['display_value'] = $this->displayValue;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChargeItemVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['display_unit'])){
            $model->displayUnit = $map['display_unit'];
        }
        if(isset($map['display_value'])){
            $model->displayValue = $map['display_value'];
        }
        return $model;
    }
    // 收费项对应的枚举编码@ProductConstraintEnum
    /**
     * @example a
     * @var string
     */
    public $name;

    // 收费项对应的云产品条件code@ProductConstraintEnum
    /**
     * @example a
     * @var string
     */
    public $code;

    // 使用量
    /**
     * @example 1
     * @var string
     */
    public $value;

    // 度量单位
    /**
     * @example m
     * @var string
     */
    public $unit;

    // 计费项类型
    /**
     * @example type
     * @var string
     */
    public $type;

    // 计费项名称-前端显示
    /**
     * @example display_name
     * @var string
     */
    public $displayName;

    // 计费项单位-前端显示
    /**
     * @example displayUnit
     * @var string
     */
    public $displayUnit;

    // 计费项值-前端显示
    /**
     * @example display_value
     * @var string
     */
    public $displayValue;

}
