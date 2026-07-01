<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SupplierProductItem extends Model
{
    // 供应商名称
    /**
     * @example 戴尔
     *
     * @var string
     */
    public $supplierName;

    // 商品型号
    /**
     * @example 商品型号
     *
     * @var string
     */
    public $productModel;

    // 供应商id
    /**
     * @example 供应商id
     *
     * @var string
     */
    public $supplierId;

    // 商品唯一id
    /**
     * @example 2023423424
     *
     * @var string
     */
    public $productId;

    // 3C
    /**
     * @example 一级类目
     *
     * @var string
     */
    public $mainClass;

    // 预计发货量
    /**
     * @example 100
     *
     * @var int
     */
    public $estimatedShipment;

    // 二级类目
    /**
     * @example 3C_pc
     *
     * @var string
     */
    public $subClass;

    // 商品详情
    /**
     * @example 商品详情
     *
     * @var string
     */
    public $productDetailInfo;

    // 商品品牌
    /**
     * @example 商品品牌
     *
     * @var string
     */
    public $productBrand;

    // 商品来源
    /**
     * @example 1
     *
     * @var int
     */
    public $productOrigin;

    // 商品名称
    /**
     * @example 商品名称
     *
     * @var string
     */
    public $productName;

    // 商品版本
    /**
     * @example 0
     *
     * @var int
     */
    public $productVersion;

    // 商品安装费用
    /**
     * @example 100
     *
     * @var int
     */
    public $installPrice;

    // 实际库存
    /**
     * @example 0
     *
     * @var int
     */
    public $realStock;

    // 保证金
    /**
     * @example 0
     *
     * @var int
     */
    public $depositPrice;

    // 商品url
    /**
     * @example http://www.product.url
     *
     * @var string
     */
    public $productUrl;

    // 官网价
    /**
     * @example 1000
     *
     * @var int
     */
    public $productPrice;

    // 商品预留字段
    /**
     * @example {}
     *
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'supplierName'      => 'supplier_name',
        'productModel'      => 'product_model',
        'supplierId'        => 'supplier_id',
        'productId'         => 'product_id',
        'mainClass'         => 'main_class',
        'estimatedShipment' => 'estimated_shipment',
        'subClass'          => 'sub_class',
        'productDetailInfo' => 'product_detail_info',
        'productBrand'      => 'product_brand',
        'productOrigin'     => 'product_origin',
        'productName'       => 'product_name',
        'productVersion'    => 'product_version',
        'installPrice'      => 'install_price',
        'realStock'         => 'real_stock',
        'depositPrice'      => 'deposit_price',
        'productUrl'        => 'product_url',
        'productPrice'      => 'product_price',
        'extraInfo'         => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('productModel', $this->productModel, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('mainClass', $this->mainClass, true);
        Model::validateRequired('subClass', $this->subClass, true);
        Model::validateRequired('productDetailInfo', $this->productDetailInfo, true);
        Model::validateRequired('productBrand', $this->productBrand, true);
        Model::validateRequired('productOrigin', $this->productOrigin, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productVersion', $this->productVersion, true);
        Model::validateRequired('productPrice', $this->productPrice, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->supplierName) {
            $res['supplier_name'] = $this->supplierName;
        }
        if (null !== $this->productModel) {
            $res['product_model'] = $this->productModel;
        }
        if (null !== $this->supplierId) {
            $res['supplier_id'] = $this->supplierId;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->mainClass) {
            $res['main_class'] = $this->mainClass;
        }
        if (null !== $this->estimatedShipment) {
            $res['estimated_shipment'] = $this->estimatedShipment;
        }
        if (null !== $this->subClass) {
            $res['sub_class'] = $this->subClass;
        }
        if (null !== $this->productDetailInfo) {
            $res['product_detail_info'] = $this->productDetailInfo;
        }
        if (null !== $this->productBrand) {
            $res['product_brand'] = $this->productBrand;
        }
        if (null !== $this->productOrigin) {
            $res['product_origin'] = $this->productOrigin;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productVersion) {
            $res['product_version'] = $this->productVersion;
        }
        if (null !== $this->installPrice) {
            $res['install_price'] = $this->installPrice;
        }
        if (null !== $this->realStock) {
            $res['real_stock'] = $this->realStock;
        }
        if (null !== $this->depositPrice) {
            $res['deposit_price'] = $this->depositPrice;
        }
        if (null !== $this->productUrl) {
            $res['product_url'] = $this->productUrl;
        }
        if (null !== $this->productPrice) {
            $res['product_price'] = $this->productPrice;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SupplierProductItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['supplier_name'])) {
            $model->supplierName = $map['supplier_name'];
        }
        if (isset($map['product_model'])) {
            $model->productModel = $map['product_model'];
        }
        if (isset($map['supplier_id'])) {
            $model->supplierId = $map['supplier_id'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['main_class'])) {
            $model->mainClass = $map['main_class'];
        }
        if (isset($map['estimated_shipment'])) {
            $model->estimatedShipment = $map['estimated_shipment'];
        }
        if (isset($map['sub_class'])) {
            $model->subClass = $map['sub_class'];
        }
        if (isset($map['product_detail_info'])) {
            $model->productDetailInfo = $map['product_detail_info'];
        }
        if (isset($map['product_brand'])) {
            $model->productBrand = $map['product_brand'];
        }
        if (isset($map['product_origin'])) {
            $model->productOrigin = $map['product_origin'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_version'])) {
            $model->productVersion = $map['product_version'];
        }
        if (isset($map['install_price'])) {
            $model->installPrice = $map['install_price'];
        }
        if (isset($map['real_stock'])) {
            $model->realStock = $map['real_stock'];
        }
        if (isset($map['deposit_price'])) {
            $model->depositPrice = $map['deposit_price'];
        }
        if (isset($map['product_url'])) {
            $model->productUrl = $map['product_url'];
        }
        if (isset($map['product_price'])) {
            $model->productPrice = $map['product_price'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
