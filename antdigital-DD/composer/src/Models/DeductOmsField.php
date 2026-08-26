<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class DeductOmsField extends Model {
    protected $_name = [
        'productCode' => 'product_code',
        'omsField' => 'oms_field',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->omsField) {
            $res['oms_field'] = $this->omsField;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeductOmsField
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['oms_field'])){
            if(!empty($map['oms_field'])){
                $model->omsField = $map['oms_field'];
            }
        }
        return $model;
    }
    // 抵扣的资源包商品
    /**
     * @example testcode
     * @var string
     */
    public $productCode;

    // 计量项列表
    /**
     * @example 
     * @var string[]
     */
    public $omsField;

}
