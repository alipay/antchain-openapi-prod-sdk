<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SupplierProductInfo extends Model {
    protected $_name = [
        'extraInfo' => 'extra_info',
        'productId' => 'product_id',
        'productImeiId' => 'product_imei_id',
        'productName' => 'product_name',
        'productNumber' => 'product_number',
        'productPrice' => 'product_price',
        'supplierVersion' => 'supplier_version',
    ];
    public function validate() {
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productImeiId', $this->productImeiId, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productNumber', $this->productNumber, true);
        Model::validateRequired('productPrice', $this->productPrice, true);
        Model::validateMaxLength('productName', $this->productName, 50);
        Model::validateMinLength('productName', $this->productName, 1);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productImeiId) {
            $res['product_imei_id'] = $this->productImeiId;
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
        if (null !== $this->supplierVersion) {
            $res['supplier_version'] = $this->supplierVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SupplierProductInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['product_id'])){
            $model->productId = $map['product_id'];
        }
        if(isset($map['product_imei_id'])){
            $model->productImeiId = $map['product_imei_id'];
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
        if(isset($map['supplier_version'])){
            $model->supplierVersion = $map['supplier_version'];
        }
        return $model;
    }
    // 产品额外信息
    /**
     * @example {}
     * @var string
     */
    public $extraInfo;

    // 产品id
    /**
     * @example GS2020123
     * @var string
     */
    public $productId;

    // 电子商品唯一标识码
    /**
     * @example 12323,123123,234234
     * @var string
     */
    public $productImeiId;

    // 产品名称
    /**
     * @example IPAD mini 2012
     * @var string
     */
    public $productName;

    // 采购产品的个数
    /**
     * @example 1
     * @var int
     */
    public $productNumber;

    // 采购产品的价格，精确到毫厘，如12.34元表示为123400
    /**
     * @example 10000
     * @var int
     */
    public $productPrice;

    // 产品版本
    /**
     * @example 0
     * @var string
     */
    public $supplierVersion;

}
