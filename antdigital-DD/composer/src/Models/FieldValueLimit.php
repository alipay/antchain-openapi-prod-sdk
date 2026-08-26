<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\StringMap;
use AntChain\DD\Models\RangeValue;

class FieldValueLimit extends Model {
    protected $_name = [
        'valueList' => 'value_list',
        'rangeValue' => 'range_value',
        'valueDataType' => 'value_data_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->valueList) {
            $res['value_list'] = [];
            if(null !== $this->valueList && is_array($this->valueList)){
                $n = 0;
                foreach($this->valueList as $item){
                    $res['value_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->rangeValue) {
            $res['range_value'] = null !== $this->rangeValue ? $this->rangeValue->toMap() : null;
        }
        if (null !== $this->valueDataType) {
            $res['value_data_type'] = $this->valueDataType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FieldValueLimit
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['value_list'])){
            if(!empty($map['value_list'])){
                $model->valueList = [];
                $n = 0;
                foreach($map['value_list'] as $item) {
                    $model->valueList[$n++] = null !== $item ? StringMap::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['range_value'])){
            $model->rangeValue = RangeValue::fromMap($map['range_value']);
        }
        if(isset($map['value_data_type'])){
            $model->valueDataType = $map['value_data_type'];
        }
        return $model;
    }
    // 枚举值，计量项为配置项的时候使用
    /**
     * @example code,中文名
     * @var StringMap[]
     */
    public $valueList;

    // 范围value
    /**
     * @example 
     * @var RangeValue
     */
    public $rangeValue;

    // 范围类型
    /**
     * @example num
     * @var string
     */
    public $valueDataType;

}
