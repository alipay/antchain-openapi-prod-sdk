<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class SupplierProductDetail extends Model {
    protected $_name = [
        'supplierName' => 'supplier_name',
        'supplierProductName' => 'supplier_product_name',
        'dosageUnit' => 'dosage_unit',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }
        if (null !== $this->supplierProductName) {
            $res['supplier_product_name'] = $this->supplierProductName;
        }
        if (null !== $this->dosageUnit) {
            $res['dosage_unit'] = $this->dosageUnit;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SupplierProductDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['supplier_name'])){
            $model->supplierName = $map['supplier_name'];
        }
        if(isset($map['supplier_product_name'])){
            $model->supplierProductName = $map['supplier_product_name'];
        }
        if(isset($map['dosage_unit'])){
            $model->dosageUnit = $map['dosage_unit'];
        }
        return $model;
    }
    // 供应商名称
    /**
     * @example xxxx
     * @var string
     */
    public $supplierName;

    // 供应商产品名称
    /**
     * @example -
     * @var string
     */
    public $supplierProductName;

    // 填报单位
    /**
     * @example xxxx
     * @var string
     */
    public $dosageUnit;

}
