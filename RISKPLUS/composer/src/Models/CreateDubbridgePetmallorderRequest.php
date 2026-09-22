<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CreateDubbridgePetmallorderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelCode' => 'channel_code',
        'trafficPlatform' => 'traffic_platform',
        'buyerId' => 'buyer_id',
        'merchantId' => 'merchant_id',
        'bizOrderNo' => 'biz_order_no',
        'tradeNo' => 'trade_no',
        'goodsName' => 'goods_name',
        'productAmount' => 'product_amount',
        'pointAmount' => 'point_amount',
    ];
    public function validate() {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('trafficPlatform', $this->trafficPlatform, true);
        Model::validateRequired('buyerId', $this->buyerId, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
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
        if (null !== $this->channelCode) {
            $res['channel_code'] = $this->channelCode;
        }
        if (null !== $this->trafficPlatform) {
            $res['traffic_platform'] = $this->trafficPlatform;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
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
     * @return CreateDubbridgePetmallorderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['channel_code'])){
            $model->channelCode = $map['channel_code'];
        }
        if(isset($map['traffic_platform'])){
            $model->trafficPlatform = $map['traffic_platform'];
        }
        if(isset($map['buyer_id'])){
            $model->buyerId = $map['buyer_id'];
        }
        if(isset($map['merchant_id'])){
            $model->merchantId = $map['merchant_id'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
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

    // 渠道编码
    /**
     * @var string
     */
    public $channelCode;

    // 流量平台
    /**
     * @var string
     */
    public $trafficPlatform;

    // 买家用户id
    /**
     * @var string
     */
    public $buyerId;

    // 商户入驻id
    /**
     * @var string
     */
    public $merchantId;

    // 商城订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 关联交易单号，储值卡来源 trade_no，储值卡金额只能消耗该 trade_no 下的余额
    /**
     * @var string
     */
    public $tradeNo;

    // 商品名称
    /**
     * @var string
     */
    public $goodsName;

    // 商品标价，单位：元
    /**
     * @var string
     */
    public $productAmount;

    // 储值卡支付结算金额，用于冻结/出账/分账的基数，单位元，两位小数
    /**
     * @var string
     */
    public $pointAmount;

}
