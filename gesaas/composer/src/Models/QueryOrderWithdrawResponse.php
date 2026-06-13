<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryOrderWithdrawResponse extends Model
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

    // 支付交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 退分账明细
    /**
     * @var SettleOrderRoyaltyDetail
     */
    public $refundDetailItemList;

    // 交易退分账总金额，单位：分
    // 明细单金额总和
    /**
     * @var int
     */
    public $tradeRefundAmount;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'tradeNo'              => 'trade_no',
        'refundDetailItemList' => 'refund_detail_item_list',
        'tradeRefundAmount'    => 'trade_refund_amount',
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
        if (null !== $this->refundDetailItemList) {
            $res['refund_detail_item_list'] = null !== $this->refundDetailItemList ? $this->refundDetailItemList->toMap() : null;
        }
        if (null !== $this->tradeRefundAmount) {
            $res['trade_refund_amount'] = $this->tradeRefundAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOrderWithdrawResponse
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
        if (isset($map['refund_detail_item_list'])) {
            $model->refundDetailItemList = SettleOrderRoyaltyDetail::fromMap($map['refund_detail_item_list']);
        }
        if (isset($map['trade_refund_amount'])) {
            $model->tradeRefundAmount = $map['trade_refund_amount'];
        }

        return $model;
    }
}
