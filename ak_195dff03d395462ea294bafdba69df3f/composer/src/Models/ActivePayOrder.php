<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class ActivePayOrder extends Model
{
    // 支付宝支付订单号，用于拉起主动支付页面
    /**
     * @example f28038577d664015bfc1034c4a125121
     *
     * @var string
     */
    public $tradeNo;

    // 状态
    // INIT：交易创建
    // FAILED：付款失败
    // SUCCESS：付款成功
    /**
     * @example INIT
     *
     * @var string
     */
    public $tradeStatus;

    // 状态原因码
    /**
     * @example TIMEOUT
     *
     * @var string
     */
    public $statusReasonCode;

    // 超时关闭
    /**
     * @example 状态原因描述
     *
     * @var string
     */
    public $statusReasonMsg;

    // 本次交易支付的订单金额，单位为分
    // 付款成功或付款成功之后的状态必填
    /**
     * @example 100
     *
     * @var int
     */
    public $totalAmount;

    // 用户在交易中支付的金额，单位为分
    // 付款成功的状态必填
    /**
     * @example 100
     *
     * @var int
     */
    public $paidAmount;

    // 商家在交易中实际收到的款项，单位为分
    // 付款成功的状态必填
    /**
     * @example 100
     *
     * @var int
     */
    public $receiptAmount;

    // 交易支付时间
    // 付款成功的状态必填
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtPay;
    protected $_name = [
        'tradeNo'          => 'trade_no',
        'tradeStatus'      => 'trade_status',
        'statusReasonCode' => 'status_reason_code',
        'statusReasonMsg'  => 'status_reason_msg',
        'totalAmount'      => 'total_amount',
        'paidAmount'       => 'paid_amount',
        'receiptAmount'    => 'receipt_amount',
        'gmtPay'           => 'gmt_pay',
    ];

    public function validate()
    {
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('tradeStatus', $this->tradeStatus, true);
        Model::validateMaxLength('tradeNo', $this->tradeNo, 64);
        Model::validateMaxLength('tradeStatus', $this->tradeStatus, 64);
        Model::validateMinLength('tradeNo', $this->tradeNo, 1);
        Model::validateMinLength('tradeStatus', $this->tradeStatus, 1);
        Model::validateMinLength('statusReasonCode', $this->statusReasonCode, 1);
        Model::validateMinLength('statusReasonMsg', $this->statusReasonMsg, 1);
        Model::validateMinimum('totalAmount', $this->totalAmount, 1);
        Model::validateMinimum('paidAmount', $this->paidAmount, 1);
        Model::validateMinimum('receiptAmount', $this->receiptAmount, 1);
        Model::validatePattern('gmtPay', $this->gmtPay, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->tradeStatus) {
            $res['trade_status'] = $this->tradeStatus;
        }
        if (null !== $this->statusReasonCode) {
            $res['status_reason_code'] = $this->statusReasonCode;
        }
        if (null !== $this->statusReasonMsg) {
            $res['status_reason_msg'] = $this->statusReasonMsg;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->paidAmount) {
            $res['paid_amount'] = $this->paidAmount;
        }
        if (null !== $this->receiptAmount) {
            $res['receipt_amount'] = $this->receiptAmount;
        }
        if (null !== $this->gmtPay) {
            $res['gmt_pay'] = $this->gmtPay;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ActivePayOrder
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['trade_status'])) {
            $model->tradeStatus = $map['trade_status'];
        }
        if (isset($map['status_reason_code'])) {
            $model->statusReasonCode = $map['status_reason_code'];
        }
        if (isset($map['status_reason_msg'])) {
            $model->statusReasonMsg = $map['status_reason_msg'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['paid_amount'])) {
            $model->paidAmount = $map['paid_amount'];
        }
        if (isset($map['receipt_amount'])) {
            $model->receiptAmount = $map['receipt_amount'];
        }
        if (isset($map['gmt_pay'])) {
            $model->gmtPay = $map['gmt_pay'];
        }

        return $model;
    }
}
