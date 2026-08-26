<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class RangeValue extends Model {
    protected $_name = [
        'rangeType' => 'range_type',
        'minValue' => 'min_value',
        'maxValue' => 'max_value',
        'step' => 'step',
        'decimalPrecision' => 'decimal_precision',
    ];
    public function validate() {
        Model::validateRequired('rangeType', $this->rangeType, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->rangeType) {
            $res['range_type'] = $this->rangeType;
        }
        if (null !== $this->minValue) {
            $res['min_value'] = $this->minValue;
        }
        if (null !== $this->maxValue) {
            $res['max_value'] = $this->maxValue;
        }
        if (null !== $this->step) {
            $res['step'] = $this->step;
        }
        if (null !== $this->decimalPrecision) {
            $res['decimal_precision'] = $this->decimalPrecision;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RangeValue
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['range_type'])){
            $model->rangeType = $map['range_type'];
        }
        if(isset($map['min_value'])){
            $model->minValue = $map['min_value'];
        }
        if(isset($map['max_value'])){
            $model->maxValue = $map['max_value'];
        }
        if(isset($map['step'])){
            $model->step = $map['step'];
        }
        if(isset($map['decimal_precision'])){
            $model->decimalPrecision = $map['decimal_precision'];
        }
        return $model;
    }
    // 范围类型
    /**
     * @example ()
     * @var string
     */
    public $rangeType;

    // 范围最小值
    /**
     * @example 1
     * @var int
     */
    public $minValue;

    // 范围最大值
    /**
     * @example 10000
     * @var int
     */
    public $maxValue;

    // 范围类型时候步长
    /**
     * @example 1
     * @var int
     */
    public $step;

    // 小数位数
    /**
     * @example 2
     * @var int
     */
    public $decimalPrecision;

}
