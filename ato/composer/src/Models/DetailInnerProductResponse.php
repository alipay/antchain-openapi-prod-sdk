<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerProductResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 商家社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商品名称
    /**
     * @var string
     */
    public $productName;

    // 商品id
    /**
     * @var string
     */
    public $productId;

    // 商品规格
    /**
     * @var string
     */
    public $productModel;

    // 商品版本
    /**
     * @var string
     */
    public $productVersion;

    // 指导价
    /**
     * @var string
     */
    public $productPrice;

    // 一级类目
    /**
     * @var string
     */
    public $mainClass;

    // 二级类目
    /**
     * @var string
     */
    public $subClass;

    // 品牌
    /**
     * @var string
     */
    public $productBrand;

    // 商品链接
    /**
     * @var string
     */
    public $productUrl;

    // 商品详情
    /**
     * @var string
     */
    public $productDetailInfo;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'merchantId'        => 'merchant_id',
        'productName'       => 'product_name',
        'productId'         => 'product_id',
        'productModel'      => 'product_model',
        'productVersion'    => 'product_version',
        'productPrice'      => 'product_price',
        'mainClass'         => 'main_class',
        'subClass'          => 'sub_class',
        'productBrand'      => 'product_brand',
        'productUrl'        => 'product_url',
        'productDetailInfo' => 'product_detail_info',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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
        if (null !== $this->productUrl) {
            $res['product_url'] = $this->productUrl;
        }
        if (null !== $this->productDetailInfo) {
            $res['product_detail_info'] = $this->productDetailInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerProductResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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
        if (isset($map['product_url'])) {
            $model->productUrl = $map['product_url'];
        }
        if (isset($map['product_detail_info'])) {
            $model->productDetailInfo = $map['product_detail_info'];
        }

        return $model;
    }
}
