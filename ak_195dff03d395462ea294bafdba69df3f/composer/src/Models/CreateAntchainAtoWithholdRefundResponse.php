<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainAtoWithholdRefundResponse extends Model
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

    // 外部系统传入的退款请求号
    /**
     * @var string
     */
    public $refundRequestNo;

    // ACCEPT : 受理成功
    /**
     * @var string
     */
    public $status;

    // 请求支付宝的退款单据号
    /**
     * @var string
     */
    public $refundOrderNo;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
        'refundRequestNo' => 'refund_request_no',
        'status'          => 'status',
        'refundOrderNo'   => 'refund_order_no',
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
        if (null !== $this->refundRequestNo) {
            $res['refund_request_no'] = $this->refundRequestNo;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->refundOrderNo) {
            $res['refund_order_no'] = $this->refundOrderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainAtoWithholdRefundResponse
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
        if (isset($map['refund_request_no'])) {
            $model->refundRequestNo = $map['refund_request_no'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['refund_order_no'])) {
            $model->refundOrderNo = $map['refund_order_no'];
        }

        return $model;
    }
}
