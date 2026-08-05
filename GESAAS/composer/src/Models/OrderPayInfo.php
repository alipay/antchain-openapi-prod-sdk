<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class OrderPayInfo extends Model {
    protected $_name = [
        'orderPayStatus' => 'order_pay_status',
        'orderPayTime' => 'order_pay_time',
        'orderPayFailedReason' => 'order_pay_failed_reason',
        'payAmount' => 'pay_amount',
        'realPayAmount' => 'real_pay_amount',
        'realReceiptAmount' => 'real_receipt_amount',
    ];
    public function validate() {
        Model::validateRequired('orderPayStatus', $this->orderPayStatus, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->orderPayStatus) {
            $res['order_pay_status'] = $this->orderPayStatus;
        }
        if (null !== $this->orderPayTime) {
            $res['order_pay_time'] = $this->orderPayTime;
        }
        if (null !== $this->orderPayFailedReason) {
            $res['order_pay_failed_reason'] = $this->orderPayFailedReason;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->realPayAmount) {
            $res['real_pay_amount'] = $this->realPayAmount;
        }
        if (null !== $this->realReceiptAmount) {
            $res['real_receipt_amount'] = $this->realReceiptAmount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OrderPayInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['order_pay_status'])){
            $model->orderPayStatus = $map['order_pay_status'];
        }
        if(isset($map['order_pay_time'])){
            $model->orderPayTime = $map['order_pay_time'];
        }
        if(isset($map['order_pay_failed_reason'])){
            $model->orderPayFailedReason = $map['order_pay_failed_reason'];
        }
        if(isset($map['pay_amount'])){
            $model->payAmount = $map['pay_amount'];
        }
        if(isset($map['real_pay_amount'])){
            $model->realPayAmount = $map['real_pay_amount'];
        }
        if(isset($map['real_receipt_amount'])){
            $model->realReceiptAmount = $map['real_receipt_amount'];
        }
        return $model;
    }
    // 支付状态：PROCESSING-处理中,SUCCESS-成功,CLOSE-关闭,FAILED-失败
    /**
     * @example SUCCESS
     * @var string
     */
    public $orderPayStatus;

    // 支付时间，条件返回：orderPayStatus=SUCCESS 返回
    /**
     * @example 2021-07-30 12:00:00
     * @var string
     */
    public $orderPayTime;

    // 失败原因，条件返回：orderPayStatus=FAILED 返回
    /**
     * @example 账户余额不足
     * @var string
     */
    public $orderPayFailedReason;

    // 支付金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
    /**
     * @example 990
     * @var int
     */
    public $payAmount;

    // 实际支付金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
    /**
     * @example 990
     * @var int
     */
    public $realPayAmount;

    // 收款金额，单位：分，条件返回：orderPayStatus=SUCCESS 返回
    /**
     * @example 990
     * @var int
     */
    public $realReceiptAmount;

}
