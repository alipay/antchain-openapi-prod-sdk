<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ProductInfo extends Model {
    protected $_name = [
        'extraInfo' => 'extra_info',
        'needDid' => 'need_did',
        'productBrand' => 'product_brand',
        'productId' => 'product_id',
        'productImeiId' => 'product_imei_id',
        'productModel' => 'product_model',
        'productName' => 'product_name',
        'productNumber' => 'product_number',
        'productPrice' => 'product_price',
        'supplierId' => 'supplier_id',
        'supplierVersion' => 'supplier_version',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->needDid) {
            $res['need_did'] = $this->needDid;
        }
        if (null !== $this->productBrand) {
            $res['product_brand'] = $this->productBrand;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productImeiId) {
            $res['product_imei_id'] = $this->productImeiId;
        }
        if (null !== $this->productModel) {
            $res['product_model'] = $this->productModel;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productNumber) {
            $res['product_number'] = $this->productNumber;
        }
        if (null !== $this->productPrice) {
            $res['product_price'] = $this->productPrice;
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->supplierVersion) {
            $res['supplier_version'] = $this->supplierVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ProductInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['need_did'])){
            $model->needDid = $map['need_did'];
        }
        if(isset($map['product_brand'])){
            $model->productBrand = $map['product_brand'];
        }
        if(isset($map['product_id'])){
            $model->productId = $map['product_id'];
        }
        if(isset($map['product_imei_id'])){
            $model->productImeiId = $map['product_imei_id'];
        }
        if(isset($map['product_model'])){
            $model->productModel = $map['product_model'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['product_number'])){
            $model->productNumber = $map['product_number'];
        }
        if(isset($map['product_price'])){
            $model->productPrice = $map['product_price'];
        }
        if(isset($map['supplier_id'])){
            $model->supplierId = $map['supplier_id'];
        }
        if(isset($map['supplier_version'])){
            $model->supplierVersion = $map['supplier_version'];
        }
        return $model;
    }
    // 额外字段
    /**
     * @example {}
     * @var string
     */
    public $extraInfo;

    // 是否需要创建did
    /**
     * @example true, false
     * @var bool
     */
    public $needDid;

    // 产品品牌，长度不超过50
    /**
     * @example 大金
     * @var string
     */
    public $productBrand;

    // 产品Id，长度不超过50
    /**
     * @example productId
     * @var string
     */
    public $productId;

    // 唯一标识码，imeiID，长度不超过50
    /**
     * @example sn_number
     * @var string
     */
    public $productImeiId;

    // 产品规格型号，长度不超过255
    /**
     * @example LP3001
     * @var string
     */
    public $productModel;

    // 产品名称，长度不超过50
    /**
     * @example 大金空调
     * @var string
     */
    public $productName;

    // 产品数量
    /**
     * @example 10
     * @var int
     */
    public $productNumber;

    // 产品采购含税价 精确到毫厘，即123400表示12.34元
    /**
     * @example 123400
     * @var int
     */
    public $productPrice;

    // 供应商id
    /**
     * @example supplierId
     * @var string
     */
    public $supplierId;

    // 供应商对应的产品版本，每个版本可以对应一个价格
    /**
     * @example 001
     * @var string
     */
    public $supplierVersion;

}
