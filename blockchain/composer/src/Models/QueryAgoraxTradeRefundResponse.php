<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAgoraxTradeRefundResponse extends Model
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

    // 支付宝交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 创建交易传入的商户订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 本笔退款对应的退款请求号
    /**
     * @var string
     */
    public $outRequestNo;

    // 该笔退款所对应的交易的订单金额
    /**
     * @var string
     */
    public $totalAmount;

    // 本次退款请求，对应的退款金额
    /**
     * @var string
     */
    public $refundAmount;

    // 退款状态
    /**
     * @var string
     */
    public $refundStatus;

    // 退分账明细信息
    /**
     * @var RefundRoyaltyResult[]
     */
    public $refundRoyaltys;

    // 本次商户实际退回金额
    /**
     * @var string
     */
    public $sendBackFee;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'tradeNo'        => 'trade_no',
        'outTradeNo'     => 'out_trade_no',
        'outRequestNo'   => 'out_request_no',
        'totalAmount'    => 'total_amount',
        'refundAmount'   => 'refund_amount',
        'refundStatus'   => 'refund_status',
        'refundRoyaltys' => 'refund_royaltys',
        'sendBackFee'    => 'send_back_fee',
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
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->refundRoyaltys) {
            $res['refund_royaltys'] = [];
            if (null !== $this->refundRoyaltys && \is_array($this->refundRoyaltys)) {
                $n = 0;
                foreach ($this->refundRoyaltys as $item) {
                    $res['refund_royaltys'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sendBackFee) {
            $res['send_back_fee'] = $this->sendBackFee;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAgoraxTradeRefundResponse
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
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['refund_status'])) {
            $model->refundStatus = $map['refund_status'];
        }
        if (isset($map['refund_royaltys'])) {
            if (!empty($map['refund_royaltys'])) {
                $model->refundRoyaltys = [];
                $n                     = 0;
                foreach ($map['refund_royaltys'] as $item) {
                    $model->refundRoyaltys[$n++] = null !== $item ? RefundRoyaltyResult::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['send_back_fee'])) {
            $model->sendBackFee = $map['send_back_fee'];
        }

        return $model;
    }
}
