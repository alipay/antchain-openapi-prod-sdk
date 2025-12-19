<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class OrgTradeData extends Model
{
    // 平台优惠金额。单位：元。
    /**
     * @example 2000.99
     *
     * @var string
     */
    public $discountAmount;

    // 买家实付金额，单位为元，两位小数。
    /**
     * @example 20000.11
     *
     * @var string
     */
    public $buyerPayAmount;

    // 买家在支付宝的用户id
    /**
     * @example 2088xxx
     *
     * @var string
     */
    public $buyerUserId;

    // 支付宝交易号，交易单主键id
    /**
     * @example 202503060003000000000001
     *
     * @var string
     */
    public $outTradeNo;

    // 支付宝订单号
    /**
     * @example 2025030622001464011433929526
     *
     * @var string
     */
    public $tradeNo;

    // 本次交易打款给卖家的时间
    /**
     * @example 2024-10-31 00:00:00
     *
     * @var string
     */
    public $sendPayDate;

    // 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
    /**
     * @example TRADE_SUCCESS
     *
     * @var string
     */
    public $tradeStatus;

    // 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
    /**
     * @example 20.10
     *
     * @var string
     */
    public $receiptAmount;

    // 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
    /**
     * @example 200.11
     *
     * @var string
     */
    public $totalAmount;
    protected $_name = [
        'discountAmount' => 'discount_amount',
        'buyerPayAmount' => 'buyer_pay_amount',
        'buyerUserId'    => 'buyer_user_id',
        'outTradeNo'     => 'out_trade_no',
        'tradeNo'        => 'trade_no',
        'sendPayDate'    => 'send_pay_date',
        'tradeStatus'    => 'trade_status',
        'receiptAmount'  => 'receipt_amount',
        'totalAmount'    => 'total_amount',
    ];

    public function validate()
    {
        Model::validateRequired('discountAmount', $this->discountAmount, true);
        Model::validateRequired('buyerPayAmount', $this->buyerPayAmount, true);
        Model::validateRequired('buyerUserId', $this->buyerUserId, true);
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('sendPayDate', $this->sendPayDate, true);
        Model::validateRequired('tradeStatus', $this->tradeStatus, true);
        Model::validateRequired('receiptAmount', $this->receiptAmount, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validatePattern('sendPayDate', $this->sendPayDate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->discountAmount) {
            $res['discount_amount'] = $this->discountAmount;
        }
        if (null !== $this->buyerPayAmount) {
            $res['buyer_pay_amount'] = $this->buyerPayAmount;
        }
        if (null !== $this->buyerUserId) {
            $res['buyer_user_id'] = $this->buyerUserId;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->sendPayDate) {
            $res['send_pay_date'] = $this->sendPayDate;
        }
        if (null !== $this->tradeStatus) {
            $res['trade_status'] = $this->tradeStatus;
        }
        if (null !== $this->receiptAmount) {
            $res['receipt_amount'] = $this->receiptAmount;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrgTradeData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['discount_amount'])) {
            $model->discountAmount = $map['discount_amount'];
        }
        if (isset($map['buyer_pay_amount'])) {
            $model->buyerPayAmount = $map['buyer_pay_amount'];
        }
        if (isset($map['buyer_user_id'])) {
            $model->buyerUserId = $map['buyer_user_id'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['send_pay_date'])) {
            $model->sendPayDate = $map['send_pay_date'];
        }
        if (isset($map['trade_status'])) {
            $model->tradeStatus = $map['trade_status'];
        }
        if (isset($map['receipt_amount'])) {
            $model->receiptAmount = $map['receipt_amount'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }

        return $model;
    }
}
