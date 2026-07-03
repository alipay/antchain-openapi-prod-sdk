<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class TradeRefundResult extends Model
{
    // 退款请求编号
    /**
     * @example 20880002000001
     *
     * @var string
     */
    public $requestNo;

    // 退款金额
    /**
     * @example 30
     *
     * @var int
     */
    public $refundAmount;

    // 退款原因
    /**
     * @example 不想要了
     *
     * @var string
     */
    public $refundReason;

    // 退款状态
    /**
     * @example REFUND_SUCCESS
     *
     * @var string
     */
    public $refundStatus;

    // 退款失败原因
    /**
     * @example 参数异常
     *
     * @var string
     */
    public $refundFailReason;
    protected $_name = [
        'requestNo'        => 'request_no',
        'refundAmount'     => 'refund_amount',
        'refundReason'     => 'refund_reason',
        'refundStatus'     => 'refund_status',
        'refundFailReason' => 'refund_fail_reason',
    ];

    public function validate()
    {
        Model::validateRequired('requestNo', $this->requestNo, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
        Model::validateRequired('refundReason', $this->refundReason, true);
        Model::validateRequired('refundStatus', $this->refundStatus, true);
        Model::validateRequired('refundFailReason', $this->refundFailReason, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->requestNo) {
            $res['request_no'] = $this->requestNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundReason) {
            $res['refund_reason'] = $this->refundReason;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->refundFailReason) {
            $res['refund_fail_reason'] = $this->refundFailReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TradeRefundResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['request_no'])) {
            $model->requestNo = $map['request_no'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['refund_reason'])) {
            $model->refundReason = $map['refund_reason'];
        }
        if (isset($map['refund_status'])) {
            $model->refundStatus = $map['refund_status'];
        }
        if (isset($map['refund_fail_reason'])) {
            $model->refundFailReason = $map['refund_fail_reason'];
        }

        return $model;
    }
}
