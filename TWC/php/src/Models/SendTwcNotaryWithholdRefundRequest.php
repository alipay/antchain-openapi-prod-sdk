<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SendTwcNotaryWithholdRefundRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'orderId' => 'order_id',
        'outRequestNo' => 'out_request_no',
        'refundAmount' => 'refund_amount',
        'remark' => 'remark',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SendTwcNotaryWithholdRefundRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['out_request_no'])){
            $model->outRequestNo = $map['out_request_no'];
        }
        if(isset($map['refund_amount'])){
            $model->refundAmount = $map['refund_amount'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 支付宝支付单据号
    /**
     * @var string
     */
    public $orderId;

    // 外部订单号,请求方保证唯一性
    /**
     * @var string
     */
    public $outRequestNo;

    // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
    /**
     * @var string
     */
    public $refundAmount;

    // 退款备注
    /**
     * @var string
     */
    public $remark;

}
