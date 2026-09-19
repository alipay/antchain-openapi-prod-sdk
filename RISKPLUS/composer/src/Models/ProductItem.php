<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ProductItem extends Model {
    protected $_name = [
        'productType' => 'product_type',
        'productName' => 'product_name',
        'productAmount' => 'product_amount',
        'merchantId' => 'merchant_id',
    ];
    public function validate() {
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productAmount', $this->productAmount, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productAmount) {
            $res['product_amount'] = $this->productAmount;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ProductItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['product_type'])){
            $model->productType = $map['product_type'];
        }
        if(isset($map['product_name'])){
            $model->productName = $map['product_name'];
        }
        if(isset($map['product_amount'])){
            $model->productAmount = $map['product_amount'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        return $model;
    }
    // 订单商品类型，PET-活体、GOODS-商品、POINT_PACKAGE-积分包（积分商品订单专用，区分普通实物商品）、MEMBER-会员订阅
    /**
     * @example PET
     * @var string
     */
    public $productType;

    // 商品名称
    /**
     * @example xxx
     * @var string
     */
    public $productName;

    // 商品金额，单位元，两位小数
    /**
     * @example 99.22
     * @var string
     */
    public $productAmount;

    // 该行商品收款主体
    /**
     * @example xxx
     * @var string
     */
    public $merchantId;

}
