<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RefundDubbridgeAlipayTradeResponse extends Model
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
    // REFUNDING（交易退款中）、
    // REFUND_SUCCESS（交易退款成功）、
    // REFUND_FAIL（交易退款失败）
    /**
     * @var string
     */
    public $refundStatus;

    // 退款失败原因
    /**
     * @var string
     */
    public $refundFailReason;

    // 退款时间
    /**
     * @var string
     */
    public $refundDate;
    protected $_name = [
        'reqMsgId'         => 'req_msg_id',
        'resultCode'       => 'result_code',
        'resultMsg'        => 'result_msg',
        'refundStatus'     => 'refund_status',
        'refundFailReason' => 'refund_fail_reason',
        'refundDate'       => 'refund_date',
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
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->refundFailReason) {
            $res['refund_fail_reason'] = $this->refundFailReason;
        }
        if (null !== $this->refundDate) {
            $res['refund_date'] = $this->refundDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefundDubbridgeAlipayTradeResponse
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
        if (isset($map['refund_status'])) {
            $model->refundStatus = $map['refund_status'];
        }
        if (isset($map['refund_fail_reason'])) {
            $model->refundFailReason = $map['refund_fail_reason'];
        }
        if (isset($map['refund_date'])) {
            $model->refundDate = $map['refund_date'];
        }

        return $model;
    }
}
