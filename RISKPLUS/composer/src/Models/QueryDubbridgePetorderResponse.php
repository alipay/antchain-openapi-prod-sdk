<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgePetorderResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'tradeNoInner' => 'trade_no_inner',
        'outTradeNo' => 'out_trade_no',
        'status' => 'status',
        'amount' => 'amount',
        'buyerUserId' => 'buyer_user_id',
        'sendPayDate' => 'send_pay_date',
        'receiptAmount' => 'receipt_amount',
        'paymentChannelCode' => 'payment_channel_code',
        'payInstitutionCode' => 'pay_institution_code',
        'installNum' => 'install_num',
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
        if (null !== $this->tradeNoInner) {
            $res['trade_no_inner'] = $this->tradeNoInner;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->buyerUserId) {
            $res['buyer_user_id'] = $this->buyerUserId;
        }
        if (null !== $this->sendPayDate) {
            $res['send_pay_date'] = $this->sendPayDate;
        }
        if (null !== $this->receiptAmount) {
            $res['receipt_amount'] = $this->receiptAmount;
        }
        if (null !== $this->paymentChannelCode) {
            $res['payment_channel_code'] = $this->paymentChannelCode;
        }
        if (null !== $this->payInstitutionCode) {
            $res['pay_institution_code'] = $this->payInstitutionCode;
        }
        if (null !== $this->installNum) {
            $res['install_num'] = $this->installNum;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryDubbridgePetorderResponse
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
        if(isset($map['trade_no_inner'])){
            $model->tradeNoInner = $map['trade_no_inner'];
        }
        if(isset($map['out_trade_no'])){
            $model->outTradeNo = $map['out_trade_no'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['amount'])){
            $model->amount = $map['amount'];
        }
        if(isset($map['buyer_user_id'])){
            $model->buyerUserId = $map['buyer_user_id'];
        }
        if(isset($map['send_pay_date'])){
            $model->sendPayDate = $map['send_pay_date'];
        }
        if(isset($map['receipt_amount'])){
            $model->receiptAmount = $map['receipt_amount'];
        }
        if(isset($map['payment_channel_code'])){
            $model->paymentChannelCode = $map['payment_channel_code'];
        }
        if(isset($map['pay_institution_code'])){
            $model->payInstitutionCode = $map['pay_institution_code'];
        }
        if(isset($map['install_num'])){
            $model->installNum = $map['install_num'];
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

    // 内部交易单号	String
    /**
     * @var string
     */
    public $tradeNoInner;

    // 支付宝订单号	String
    /**
     * @var string
     */
    public $outTradeNo;

    // 交易状态
    /**
     * @var string
     */
    public $status;

    // 交易的订单金额	String
    /**
     * @var string
     */
    public $amount;

    // 买家在支付宝的用户id
    /**
     * @var string
     */
    public $buyerUserId;

    // 本次交易打款给卖家的时间
    /**
     * @var string
     */
    public $sendPayDate;

    // 实收金额
    /**
     * @var string
     */
    public $receiptAmount;

    // 支付渠道编码
    /**
     * @var string
     */
    public $paymentChannelCode;

    // 支付机构编码	String
    /**
     * @var string
     */
    public $payInstitutionCode;

    // 分期期数
    /**
     * @var string
     */
    public $installNum;

}
