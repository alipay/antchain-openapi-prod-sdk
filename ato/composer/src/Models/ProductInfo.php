<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ProductInfo extends Model
{
    // 商家社会统一信用代码
    /**
     * @example 91428406M284UL87G
     *
     * @var string
     */
    public $merchantId;

    // 商品名称
    /**
     * @example 二手苹果14ProMax
     *
     * @var string
     */
    public $productName;

    // 商品id
    /**
     * @example 1725944255332_08831729157506415
     *
     * @var string
     */
    public $productId;

    // 商品规格
    /**
     * @example 到期归还-可随时买断/256G
     *
     * @var string
     */
    public $productModel;

    // 商品版本
    /**
     * @example 1
     *
     * @var string
     */
    public $productVersion;

    // 指导价(单位分)
    /**
     * @example 4000
     *
     * @var int
     */
    public $productPrice;

    // 一级类目
    /**
     * @example 3C
     *
     * @var string
     */
    public $mainClass;

    // 二级类目
    /**
     * @example 3c_mobile
     *
     * @var string
     */
    public $subClass;

    // 品牌
    /**
     * @example 苹果
     *
     * @var string
     */
    public $productBrand;
    protected $_name = [
        'merchantId'     => 'merchant_id',
        'productName'    => 'product_name',
        'productId'      => 'product_id',
        'productModel'   => 'product_model',
        'productVersion' => 'product_version',
        'productPrice'   => 'product_price',
        'mainClass'      => 'main_class',
        'subClass'       => 'sub_class',
        'productBrand'   => 'product_brand',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productModel) {
            $res['product_model'] = $this->productModel;
        }
        if (null !== $this->productVersion) {
            $res['product_version'] = $this->productVersion;
        }
        if (null !== $this->productPrice) {
            $res['product_price'] = $this->productPrice;
        }
        if (null !== $this->mainClass) {
            $res['main_class'] = $this->mainClass;
        }
        if (null !== $this->subClass) {
            $res['sub_class'] = $this->subClass;
        }
        if (null !== $this->productBrand) {
            $res['product_brand'] = $this->productBrand;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ProductInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_model'])) {
            $model->productModel = $map['product_model'];
        }
        if (isset($map['product_version'])) {
            $model->productVersion = $map['product_version'];
        }
        if (isset($map['product_price'])) {
            $model->productPrice = $map['product_price'];
        }
        if (isset($map['main_class'])) {
            $model->mainClass = $map['main_class'];
        }
        if (isset($map['sub_class'])) {
            $model->subClass = $map['sub_class'];
        }
        if (isset($map['product_brand'])) {
            $model->productBrand = $map['product_brand'];
        }

        return $model;
    }
}
