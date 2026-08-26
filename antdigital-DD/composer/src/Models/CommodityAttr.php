<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class CommodityAttr extends Model {
    protected $_name = [
        'code' => 'code',
        'value' => 'value',
        'unit' => 'unit',
    ];
    public function validate() {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('value', $this->value, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->value) {
            $res['value'] = $this->value;
        }
        if (null !== $this->unit) {
            $res['unit'] = $this->unit;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CommodityAttr
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['value'])){
            $model->value = $map['value'];
        }
        if(isset($map['unit'])){
            $model->unit = $map['unit'];
        }
        return $model;
    }
    // 规格属性编码
    /**
     * @example version
     * @var string
     */
    public $code;

    // 规格属性值
    /**
     * @example mytc_mini
     * @var string
     */
    public $value;

    // 规格属性单位
    /**
     * @example 个
     * @var string
     */
    public $unit;

}
