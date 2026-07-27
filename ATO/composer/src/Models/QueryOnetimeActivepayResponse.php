<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryOnetimeActivepayResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'tradeNo' => 'trade_no',
        'orderStr' => 'order_str',
        'status' => 'status',
        'divideStatus' => 'divide_status',
        'payAmount' => 'pay_amount',
        'realPayAmount' => 'real_pay_amount',
        'realReceiptAmount' => 'real_receipt_amount',
        'payTime' => 'pay_time',
        'payOrderNo' => 'pay_order_no',
        'payTradeNo' => 'pay_trade_no',
    ];
    public function validate() {}
    public function toMap() {
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->orderStr) {
            $res['order_str'] = $this->orderStr;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->divideStatus) {
            $res['divide_status'] = $this->divideStatus;
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
        if (null !== $this->payTime) {
            $res['pay_time'] = $this->payTime;
        }
        if (null !== $this->payOrderNo) {
            $res['pay_order_no'] = $this->payOrderNo;
        }
        if (null !== $this->payTradeNo) {
            $res['pay_trade_no'] = $this->payTradeNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryOnetimeActivepayResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['trade_no'])){
            $model->tradeNo = $map['trade_no'];
        }
        if(isset($map['order_str'])){
            $model->orderStr = $map['order_str'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['divide_status'])){
            $model->divideStatus = $map['divide_status'];
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
        if(isset($map['pay_time'])){
            $model->payTime = $map['pay_time'];
        }
        if(isset($map['pay_order_no'])){
            $model->payOrderNo = $map['pay_order_no'];
        }
        if(isset($map['pay_trade_no'])){
            $model->payTradeNo = $map['pay_trade_no'];
        }
        return $model;
    }
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

    // 支付单号
    /**
     * @var string
     */
    public $tradeNo;

    // 订单串
    /**
     * @var string
     */
    public $orderStr;

    // 状态
    /**
     * @var string
     */
    public $status;

    // 分账状态
    /**
     * @var string
     */
    public $divideStatus;

    // 支付金额
    /**
     * @var int
     */
    public $payAmount;

    // 实际付款金额
    /**
     * @var int
     */
    public $realPayAmount;

    // 实际收款金额
    /**
     * @var int
     */
    public $realReceiptAmount;

    // 支付时间
    /**
     * @var string
     */
    public $payTime;

    // 支付单号
    /**
     * @var string
     */
    public $payOrderNo;

    // 交易单号
    /**
     * @var string
     */
    public $payTradeNo;

}
