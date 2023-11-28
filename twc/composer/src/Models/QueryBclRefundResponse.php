<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryBclRefundResponse extends Model
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

    // 退款id
    /**
     * @var string
     */
    public $refundId;

    // 退款成功的时间, 退款成功返回
    /**
     * @var string
     */
    public $refundTime;

    // 退款金额, 单位分, 退款成功时返回
    /**
     * @var int
     */
    public $refundAmount;

    // ● 退款中，REFUNDING（需要调用查询接口查询结果)；
    // ● 退款成功REFUND_SUCCESS
    // ● 退款失败REFUND_FAIL
    /**
     * @var string
     */
    public $refundStatus;

    // 退款失败原因, 退款失败时返回
    /**
     * @var string
     */
    public $errMsg;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'refundId'     => 'refund_id',
        'refundTime'   => 'refund_time',
        'refundAmount' => 'refund_amount',
        'refundStatus' => 'refund_status',
        'errMsg'       => 'err_msg',
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
        if (null !== $this->refundId) {
            $res['refund_id'] = $this->refundId;
        }
        if (null !== $this->refundTime) {
            $res['refund_time'] = $this->refundTime;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBclRefundResponse
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
        if (isset($map['refund_id'])) {
            $model->refundId = $map['refund_id'];
        }
        if (isset($map['refund_time'])) {
            $model->refundTime = $map['refund_time'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }
        if (isset($map['refund_status'])) {
            $model->refundStatus = $map['refund_status'];
        }
        if (isset($map['err_msg'])) {
            $model->errMsg = $map['err_msg'];
        }

        return $model;
    }
}
