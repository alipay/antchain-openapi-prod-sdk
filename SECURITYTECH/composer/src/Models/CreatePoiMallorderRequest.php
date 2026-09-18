<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class CreatePoiMallorderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'openId' => 'open_id',
        'merchantId' => 'merchant_id',
        'orderId' => 'order_id',
        'sourceOrderId' => 'source_order_id',
        'productMode' => 'product_mode',
        'goodsName' => 'goods_name',
        'productAmount' => 'product_amount',
        'pointAmount' => 'point_amount',
    ];
    public function validate() {
        Model::validateRequired('openId', $this->openId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('sourceOrderId', $this->sourceOrderId, true);
        Model::validateRequired('productMode', $this->productMode, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('productAmount', $this->productAmount, true);
        Model::validateRequired('pointAmount', $this->pointAmount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->sourceOrderId) {
            $res['source_order_id'] = $this->sourceOrderId;
        }
        if (null !== $this->productMode) {
            $res['product_mode'] = $this->productMode;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->productAmount) {
            $res['product_amount'] = $this->productAmount;
        }
        if (null !== $this->pointAmount) {
            $res['point_amount'] = $this->pointAmount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreatePoiMallorderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['open_id'])){
            $model->openId = $map['open_id'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['source_order_id'])){
            $model->sourceOrderId = $map['source_order_id'];
        }
        if(isset($map['product_mode'])){
            $model->productMode = $map['product_mode'];
        }
        if(isset($map['goods_name'])){
            $model->goodsName = $map['goods_name'];
        }
        if(isset($map['product_amount'])){
            $model->productAmount = $map['product_amount'];
        }
        if(isset($map['point_amount'])){
            $model->pointAmount = $map['point_amount'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 支付宝小程序用户唯一ID
    /**
     * @var string
     */
    public $openId;

    // 商户入驻主体ID（商城主体）
    /**
     * @var string
     */
    public $merchantId;

    // 商城积分消费订单号，由商城生成保证唯一（幂等键）
    /**
     * @var string
     */
    public $orderId;

    // 预充值来源订单号（某笔支付订单的order_id，内部反查trade_no）
    /**
     * @var string
     */
    public $sourceOrderId;

    // 订单类型：PET_PACKAGE/PET/GOODS/MEMBER
    /**
     * @var string
     */
    public $productMode;

    // 商品名称
    /**
     * @var string
     */
    public $goodsName;

    // 结算金额（元，两位小数，≤point_amount）
    /**
     * @var string
     */
    public $productAmount;

    // 冻结金额（元，两位小数，冻结/出账/分账基数）
    /**
     * @var string
     */
    public $pointAmount;

}
