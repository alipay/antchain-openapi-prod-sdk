<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryAcctPayResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'orderId' => 'order_id',
        'acctTradeOrderId' => 'acct_trade_order_id',
        'status' => 'status',
        'amount' => 'amount',
        'realPayAmount' => 'real_pay_amount',
        'realReceiptAmount' => 'real_receipt_amount',
        'payFinish' => 'pay_finish',
        'payOrderNo' => 'pay_order_no',
        'payTradeNo' => 'pay_trade_no',
        'cmdTryNum' => 'cmd_try_num',
        'cmdStatus' => 'cmd_status',
        'cmdFailReason' => 'cmd_fail_reason',
        'cmdPayOrderNo' => 'cmd_pay_order_no',
        'cmdPayTradeNo' => 'cmd_pay_trade_no',
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->acctTradeOrderId) {
            $res['acct_trade_order_id'] = $this->acctTradeOrderId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->realPayAmount) {
            $res['real_pay_amount'] = $this->realPayAmount;
        }
        if (null !== $this->realReceiptAmount) {
            $res['real_receipt_amount'] = $this->realReceiptAmount;
        }
        if (null !== $this->payFinish) {
            $res['pay_finish'] = $this->payFinish;
        }
        if (null !== $this->payOrderNo) {
            $res['pay_order_no'] = $this->payOrderNo;
        }
        if (null !== $this->payTradeNo) {
            $res['pay_trade_no'] = $this->payTradeNo;
        }
        if (null !== $this->cmdTryNum) {
            $res['cmd_try_num'] = $this->cmdTryNum;
        }
        if (null !== $this->cmdStatus) {
            $res['cmd_status'] = $this->cmdStatus;
        }
        if (null !== $this->cmdFailReason) {
            $res['cmd_fail_reason'] = $this->cmdFailReason;
        }
        if (null !== $this->cmdPayOrderNo) {
            $res['cmd_pay_order_no'] = $this->cmdPayOrderNo;
        }
        if (null !== $this->cmdPayTradeNo) {
            $res['cmd_pay_trade_no'] = $this->cmdPayTradeNo;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAcctPayResponse
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
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['acct_trade_order_id'])){
            $model->acctTradeOrderId = $map['acct_trade_order_id'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['real_pay_amount'])){
            $model->realPayAmount = $map['real_pay_amount'];
        }
        if(isset($map['real_receipt_amount'])){
            $model->realReceiptAmount = $map['real_receipt_amount'];
        }
        if(isset($map['pay_finish'])){
            $model->payFinish = $map['pay_finish'];
        }
        if(isset($map['pay_order_no'])){
            $model->payOrderNo = $map['pay_order_no'];
        }
        if(isset($map['pay_trade_no'])){
            $model->payTradeNo = $map['pay_trade_no'];
        }
        if(isset($map['cmd_try_num'])){
            $model->cmdTryNum = $map['cmd_try_num'];
        }
        if(isset($map['cmd_status'])){
            $model->cmdStatus = $map['cmd_status'];
        }
        if(isset($map['cmd_fail_reason'])){
            $model->cmdFailReason = $map['cmd_fail_reason'];
        }
        if(isset($map['cmd_pay_order_no'])){
            $model->cmdPayOrderNo = $map['cmd_pay_order_no'];
        }
        if(isset($map['cmd_pay_trade_no'])){
            $model->cmdPayTradeNo = $map['cmd_pay_trade_no'];
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

    // 签约单号
    /**
     * @var string
     */
    public $orderId;

    // 订单id
    /**
     * @var string
     */
    public $acctTradeOrderId;

    // 交易状态
    // ● INIT：待扣款
    // ● TOBE_PAY：扣款中
    // ● SUCCESS：扣款成功【终态】
    /**
     * @var string
     */
    public $status;

    // 扣款金额、单位为分
    /**
     * @var int
     */
    public $amount;

    // 实付金额，单位为分，成功时存在
    /**
     * @var int
     */
    public $realPayAmount;

    // 实收金额，单位为分，成功时存在
    /**
     * @var int
     */
    public $realReceiptAmount;

    // 代扣完成时间，成功时存在
    /**
     * @var string
     */
    public $payFinish;

    // 我方交易流水号，成功时存在
    /**
     * @var int
     */
    public $payOrderNo;

    // 支付宝交易流水号，成功时存在
    /**
     * @var string
     */
    public $payTradeNo;

    // 最新的扣款发起次数
    /**
     * @var int
     */
    public $cmdTryNum;

    // 最新的扣款状态
    /**
     * @var string
     */
    public $cmdStatus;

    // 最新的扣款失败的失败原因
    /**
     * @var string
     */
    public $cmdFailReason;

    // 最新的我方流水号
    /**
     * @var string
     */
    public $cmdPayOrderNo;

    // 最新的支付宝交易流水号
    /**
     * @var string
     */
    public $cmdPayTradeNo;

}
