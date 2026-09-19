<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgePetrefundRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'channelCode' => 'channel_code',
        'trafficPlatform' => 'traffic_platform',
        'refundNo' => 'refund_no',
        'bizOrderNo' => 'biz_order_no',
        'tradeNo' => 'trade_no',
        'petRefundAmount' => 'pet_refund_amount',
        'mallRefundAmount' => 'mall_refund_amount',
        'refundReason' => 'refund_reason',
    ];
    public function validate() {
        Model::validateRequired('channelCode', $this->channelCode, true);
        Model::validateRequired('refundNo', $this->refundNo, true);
        Model::validateRequired('bizOrderNo', $this->bizOrderNo, true);
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
        if (null !== $this->refundNo) {
            $res['refund_no'] = $this->refundNo;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->petRefundAmount) {
            $res['pet_refund_amount'] = $this->petRefundAmount;
        }
        if (null !== $this->mallRefundAmount) {
            $res['mall_refund_amount'] = $this->mallRefundAmount;
        }
        if (null !== $this->refundReason) {
            $res['refund_reason'] = $this->refundReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ApplyDubbridgePetrefundRequest
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
        if(isset($map['refund_no'])){
            $model->refundNo = $map['refund_no'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['pet_refund_amount'])){
            $model->petRefundAmount = $map['pet_refund_amount'];
        }
        if(isset($map['mall_refund_amount'])){
            $model->mallRefundAmount = $map['mall_refund_amount'];
        }
        if(isset($map['refund_reason'])){
            $model->refundReason = $map['refund_reason'];
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

    // 退款单号，渠道/商城侧唯一
    /**
     * @var string
     */
    public $refundNo;

    // 业务订单号
    /**
     * @var string
     */
    public $bizOrderNo;

    // 关联交易单号
    /**
     * @var string
     */
    public $tradeNo;

    // 活体部分退款金额，单位元，两位小数
    /**
     * @var string
     */
    public $petRefundAmount;

    // 商城部分退款金额，单位元，两位小数
    /**
     * @var string
     */
    public $mallRefundAmount;

    // 退款原因
    /**
     * @var string
     */
    public $refundReason;

}
