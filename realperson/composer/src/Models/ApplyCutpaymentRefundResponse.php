<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\REALPERSON\Models;

use AlibabaCloud\Tea\Model;

class ApplyCutpaymentRefundResponse extends Model
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

    // 退款商户订单号
    /**
     * @var string
     */
    public $refundTransId;

    // 退款商户流水号
    /**
     * @var string
     */
    public $refundSerialNo;

    // 退款金额，单位：分 整数
    /**
     * @var string
     */
    public $refundAmt;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'refundTransId'  => 'refund_trans_id',
        'refundSerialNo' => 'refund_serial_no',
        'refundAmt'      => 'refund_amt',
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
        if (null !== $this->refundTransId) {
            $res['refund_trans_id'] = $this->refundTransId;
        }
        if (null !== $this->refundSerialNo) {
            $res['refund_serial_no'] = $this->refundSerialNo;
        }
        if (null !== $this->refundAmt) {
            $res['refund_amt'] = $this->refundAmt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyCutpaymentRefundResponse
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
        if (isset($map['refund_trans_id'])) {
            $model->refundTransId = $map['refund_trans_id'];
        }
        if (isset($map['refund_serial_no'])) {
            $model->refundSerialNo = $map['refund_serial_no'];
        }
        if (isset($map['refund_amt'])) {
            $model->refundAmt = $map['refund_amt'];
        }

        return $model;
    }
}
