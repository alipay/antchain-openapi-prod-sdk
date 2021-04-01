<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateDistributionProductItemRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 分销比例  10 表示 10%
    /**
     * @var string
     */
    public $distributionRate;

    // 上架时间戳
    /**
     * @var string
     */
    public $enableDate;

    // 划线价格
    /**
     * @var string
     */
    public $linePrice;

    // 商品id
    /**
     * @var string
     */
    public $productId;

    // 商品封面图片url
    /**
     * @var string
     */
    public $productImg;

    // 商品信息
    /**
     * @var string
     */
    public $productInfo;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 商品价格
    /**
     * @var string
     */
    public $productPrice;

    // 商品类型
    /**
     * @var string
     */
    public $productType;

    // 商户id
    /**
     * @var string
     */
    public $shopId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'distributionRate'  => 'distribution_rate',
        'enableDate'        => 'enable_date',
        'linePrice'         => 'line_price',
        'productId'         => 'product_id',
        'productImg'        => 'product_img',
        'productInfo'       => 'product_info',
        'productName'       => 'product_name',
        'productPrice'      => 'product_price',
        'productType'       => 'product_type',
        'shopId'            => 'shop_id',
    ];

    public function validate()
    {
        Model::validateRequired('distributionRate', $this->distributionRate, true);
        Model::validateRequired('enableDate', $this->enableDate, true);
        Model::validateRequired('linePrice', $this->linePrice, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productImg', $this->productImg, true);
        Model::validateRequired('productInfo', $this->productInfo, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('productPrice', $this->productPrice, true);
        Model::validateRequired('productType', $this->productType, true);
        Model::validateRequired('shopId', $this->shopId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->distributionRate) {
            $res['distribution_rate'] = $this->distributionRate;
        }
        if (null !== $this->enableDate) {
            $res['enable_date'] = $this->enableDate;
        }
        if (null !== $this->linePrice) {
            $res['line_price'] = $this->linePrice;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productImg) {
            $res['product_img'] = $this->productImg;
        }
        if (null !== $this->productInfo) {
            $res['product_info'] = $this->productInfo;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->productPrice) {
            $res['product_price'] = $this->productPrice;
        }
        if (null !== $this->productType) {
            $res['product_type'] = $this->productType;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDistributionProductItemRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['distribution_rate'])) {
            $model->distributionRate = $map['distribution_rate'];
        }
        if (isset($map['enable_date'])) {
            $model->enableDate = $map['enable_date'];
        }
        if (isset($map['line_price'])) {
            $model->linePrice = $map['line_price'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_img'])) {
            $model->productImg = $map['product_img'];
        }
        if (isset($map['product_info'])) {
            $model->productInfo = $map['product_info'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['product_price'])) {
            $model->productPrice = $map['product_price'];
        }
        if (isset($map['product_type'])) {
            $model->productType = $map['product_type'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }

        return $model;
    }
}
