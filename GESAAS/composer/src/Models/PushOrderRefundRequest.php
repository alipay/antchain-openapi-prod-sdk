<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class PushOrderRefundRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outOrderNo' => 'out_order_no',
        'refundRequestNo' => 'refund_request_no',
        'refundAmount' => 'refund_amount',
        'refundReason' => 'refund_reason',
    ];
    public function validate() {
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('refundRequestNo', $this->refundRequestNo, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->refundRequestNo) {
            $res['refund_request_no'] = $this->refundRequestNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundReason) {
            $res['refund_reason'] = $this->refundReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PushOrderRefundRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['out_order_no'])){
            $model->outOrderNo = $map['out_order_no'];
        }
        if(isset($map['refund_request_no'])){
            $model->refundRequestNo = $map['refund_request_no'];
        }
        if(isset($map['refund_amount'])){
            $model->refundAmount = $map['refund_amount'];
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

    // 外部订单号
    /**
     * @var string
     */
    public $outOrderNo;

    // 外部系统传入的退款请求号
    /**
     * @var string
     */
    public $refundRequestNo;

    // 退款退分账金额，单位：分
    // 限制条件：大于0，小于等于订单金额
    /**
     * @var int
     */
    public $refundAmount;

    // 退款退分账原因
    /**
     * @var string
     */
    public $refundReason;

}
