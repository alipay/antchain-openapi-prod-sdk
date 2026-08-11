<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class RefundTradeAppRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outTradeNo' => 'out_trade_no',
        'outRequestNo' => 'out_request_no',
        'refundAmount' => 'refund_amount',
        'refundReason' => 'refund_reason',
        'registeredMobile' => 'registered_mobile',
    ];
    public function validate() {
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('refundReason', $this->refundReason, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundReason) {
            $res['refund_reason'] = $this->refundReason;
        }
        if (null !== $this->registeredMobile) {
            $res['registered_mobile'] = $this->registeredMobile;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RefundTradeAppRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['out_trade_no'])){
            $model->outTradeNo = $map['out_trade_no'];
        }
        if(isset($map['out_request_no'])){
            $model->outRequestNo = $map['out_request_no'];
        }
        if(isset($map['refund_amount'])){
            $model->refundAmount = $map['refund_amount'];
        }
        if(isset($map['refund_reason'])){
            $model->refundReason = $map['refund_reason'];
        }
        if(isset($map['registered_mobile'])){
            $model->registeredMobile = $map['registered_mobile'];
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

    // 原支付业务订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 退款业务号，当前调用方内唯一，作为退款幂等键
    /**
     * @var string
     */
    public $outRequestNo;

    // 本次退款金额，单位：元，大于 0，最多两位小数
    /**
     * @var string
     */
    public $refundAmount;

    // 退款原因
    /**
     * @var string
     */
    public $refundReason;

    // 订单创建时登记的中国大陆 11 位手机号
    /**
     * @var string
     */
    public $registeredMobile;

}
