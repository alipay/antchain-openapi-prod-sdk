<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class SendWithholdRefundResponse extends Model
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

    // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
    /**
     * @var string
     */
    public $refundAmount;

    // 退款成功的日期
    /**
     * @var string
     */
    public $refundDate;

    // 退款的支付宝系统内部单据id
    /**
     * @var string
     */
    public $refundOrderId;

    // FINISHED,退款成功的状态值
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'reqMsgId'      => 'req_msg_id',
        'resultCode'    => 'result_code',
        'resultMsg'     => 'result_msg',
        'refundAmount'  => 'refund_amount',
        'refundDate'    => 'refund_date',
        'refundOrderId' => 'refund_order_id',
        'status'        => 'status',
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
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundDate) {
            $res['refund_date'] = $this->refundDate;
        }
        if (null !== $this->refundOrderId) {
            $res['refund_order_id'] = $this->refundOrderId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SendWithholdRefundResponse
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
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['refund_date'])) {
            $model->refundDate = $map['refund_date'];
        }
        if (isset($map['refund_order_id'])) {
            $model->refundOrderId = $map['refund_order_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
