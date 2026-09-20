<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class NotifyPoiRefundRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'refundNo' => 'refund_no',
        'tradeNo' => 'trade_no',
        'petRefundAmount' => 'pet_refund_amount',
        'mallRefundAmount' => 'mall_refund_amount',
        'refundStatus' => 'refund_status',
        'buyerId' => 'buyer_id',
        'bizOrderNo' => 'biz_order_no',
    ];
    public function validate() {
        Model::validateRequired('refundNo', $this->refundNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('refundStatus', $this->refundStatus, true);
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->petRefundAmount) {
            $res['pet_refund_amount'] = $this->petRefundAmount;
        }
        if (null !== $this->mallRefundAmount) {
            $res['mall_refund_amount'] = $this->mallRefundAmount;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->buyerId) {
            $res['buyer_id'] = $this->buyerId;
        }
        if (null !== $this->bizOrderNo) {
            $res['biz_order_no'] = $this->bizOrderNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotifyPoiRefundRequest
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
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['pet_refund_amount'])){
            $model->petRefundAmount = $map['pet_refund_amount'];
        }
        if(isset($map['mall_refund_amount'])){
            $model->mallRefundAmount = $map['mall_refund_amount'];
        }
        if(isset($map['refund_status'])){
            $model->refundStatus = $map['refund_status'];
        }
        if(isset($map['buyer_id'])){
            $model->buyerId = $map['buyer_id'];
        }
        if(isset($map['biz_order_no'])){
            $model->bizOrderNo = $map['biz_order_no'];
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

    // 退款单号
    /**
     * @var string
     */
    public $refundNo;

    // 关联交易单号（天枢内部）
    /**
     * @var string
     */
    public $tradeNo;

    // 活体部分退款金额（渠道报文）
    /**
     * @var string
     */
    public $petRefundAmount;

    // 商城部分退款金额
    /**
     * @var string
     */
    public $mallRefundAmount;

    // 退款状态：SUCCESS / FAILED（FAILED时金额恢复可用余额）
    /**
     * @var string
     */
    public $refundStatus;

    // 买家用户id（商城报文携带）
    /**
     * @var string
     */
    public $buyerId;

    // 商城订单号（模式4商品订单取消携带）
    /**
     * @var string
     */
    public $bizOrderNo;

}
