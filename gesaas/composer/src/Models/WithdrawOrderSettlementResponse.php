<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class WithdrawOrderSettlementResponse extends Model
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

    // 商家订单号
    /**
     * @var string
     */
    public $outOrderNo;

    // 退款总金额。单位：分。 指该笔交易累计已经退款成功的金额
    /**
     * @var int
     */
    public $refundFee;

    // 退款使用的资金渠道
    /**
     * @var RefundDetail[]
     */
    public $refundDetailItemList;
    protected $_name = [
        'reqMsgId'             => 'req_msg_id',
        'resultCode'           => 'result_code',
        'resultMsg'            => 'result_msg',
        'tradeNo'              => 'trade_no',
        'outOrderNo'           => 'out_order_no',
        'refundFee'            => 'refund_fee',
        'refundDetailItemList' => 'refund_detail_item_list',
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
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->refundFee) {
            $res['refund_fee'] = $this->refundFee;
        }
        if (null !== $this->refundDetailItemList) {
            $res['refund_detail_item_list'] = [];
            if (null !== $this->refundDetailItemList && \is_array($this->refundDetailItemList)) {
                $n = 0;
                foreach ($this->refundDetailItemList as $item) {
                    $res['refund_detail_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WithdrawOrderSettlementResponse
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
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['refund_fee'])) {
            $model->refundFee = $map['refund_fee'];
        }
        if (isset($map['refund_detail_item_list'])) {
            if (!empty($map['refund_detail_item_list'])) {
                $model->refundDetailItemList = [];
                $n                           = 0;
                foreach ($map['refund_detail_item_list'] as $item) {
                    $model->refundDetailItemList[$n++] = null !== $item ? RefundDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
