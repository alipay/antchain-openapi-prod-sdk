<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ApplyPoiRefundRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'refundNo' => 'refund_no',
        'orderId' => 'order_id',
        'petRefundAmount' => 'pet_refund_amount',
        'mallRefundAmount' => 'mall_refund_amount',
        'refundReason' => 'refund_reason',
    ];
    public function validate() {
        Model::validateRequired('refundNo', $this->refundNo, true);
        Model::validateRequired('orderId', $this->orderId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->refundNo) {
            $res['refund_no'] = $this->refundNo;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
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
     * @return ApplyPoiRefundRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['refund_no'])){
            $model->refundNo = $map['refund_no'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
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

    // 退款单号，由发起方生成保证唯一（幂等键）
    /**
     * @var string
     */
    public $refundNo;

    // 被退款的支付订单号（内部反查trade_no）
    /**
     * @var string
     */
    public $orderId;

    // 活体部分退款金额（元，两位小数）；与mall_refund_amount至少一项必填且>0
    /**
     * @var string
     */
    public $petRefundAmount;

    // 商城部分退款金额（元，两位小数），即退回的预充值余额
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
