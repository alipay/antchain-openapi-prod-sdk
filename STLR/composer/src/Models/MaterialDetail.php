<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

use AntChain\STLR\Models\SupplierProductDetail;

class MaterialDetail extends Model {
    protected $_name = [
        'materialName' => 'material_name',
        'supplierProductList' => 'supplier_product_list',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->materialName) {
            $res['material_name'] = $this->materialName;
        }
        if (null !== $this->supplierProductList) {
            $res['supplier_product_list'] = null !== $this->supplierProductList ? $this->supplierProductList->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return MaterialDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['material_name'])){
            $model->materialName = $map['material_name'];
        }
        if(isset($map['supplier_product_list'])){
            $model->supplierProductList = SupplierProductDetail::fromMap($map['supplier_product_list']);
        }
        return $model;
    }
    // 物料名称
    /**
     * @example xxxx
     * @var string
     */
    public $materialName;

    // 供应商产品详情列表
    /**
     * @example undefined
     * @var SupplierProductDetail
     */
    public $supplierProductList;

}
