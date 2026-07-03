<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeAlipayTradeResponse extends Model
{
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

    // 订单状态
    // WAIT_BUYER_PAY（等待买家付款）、
    // TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、
    // TRADE_SUCCESS（交易支付成功）、
    // TRADE_FINISHED（交易结束，不可退款）
    /**
     * @var string
     */
    public $tradeStatus;

    // 支付宝交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 买家支付宝账号
    /**
     * @var string
     */
    public $buyerLogonId;

    // 支付金额
    /**
     * @var string
     */
    public $payAmount;

    // 支付时间
    /**
     * @var string
     */
    public $payDate;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'tradeStatus'  => 'trade_status',
        'tradeNo'      => 'trade_no',
        'buyerLogonId' => 'buyer_logon_id',
        'payAmount'    => 'pay_amount',
        'payDate'      => 'pay_date',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
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
        if (null !== $this->tradeStatus) {
            $res['trade_status'] = $this->tradeStatus;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->buyerLogonId) {
            $res['buyer_logon_id'] = $this->buyerLogonId;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->payDate) {
            $res['pay_date'] = $this->payDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeAlipayTradeResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['trade_status'])) {
            $model->tradeStatus = $map['trade_status'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['buyer_logon_id'])) {
            $model->buyerLogonId = $map['buyer_logon_id'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }
        if (isset($map['pay_date'])) {
            $model->payDate = $map['pay_date'];
        }

        return $model;
    }
}
