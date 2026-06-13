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

    // 退分账时间，格式为yyyy-MM-dd HH:mm:ss
    /**
     * @var string
     */
    public $refundTime;

    // 分账账单
    /**
     * @var string
     */
    public $settleNo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'tradeNo'    => 'trade_no',
        'outOrderNo' => 'out_order_no',
        'refundTime' => 'refund_time',
        'settleNo'   => 'settle_no',
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
        if (null !== $this->refundTime) {
            $res['refund_time'] = $this->refundTime;
        }
        if (null !== $this->settleNo) {
            $res['settle_no'] = $this->settleNo;
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
        if (isset($map['refund_time'])) {
            $model->refundTime = $map['refund_time'];
        }
        if (isset($map['settle_no'])) {
            $model->settleNo = $map['settle_no'];
        }

        return $model;
    }
}
