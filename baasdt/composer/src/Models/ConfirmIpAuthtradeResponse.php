<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ConfirmIpAuthtradeResponse extends Model
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

    // 订单ID
    /**
     * @var string
     */
    public $ipOrderId;

    // 保底金支付链接
    /**
     * @var string
     */
    public $payUrl;

    // 保底金账单ID
    /**
     * @var string
     */
    public $ipBillId;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'ipOrderId'  => 'ip_order_id',
        'payUrl'     => 'pay_url',
        'ipBillId'   => 'ip_bill_id',
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
        if (null !== $this->ipOrderId) {
            $res['ip_order_id'] = $this->ipOrderId;
        }
        if (null !== $this->payUrl) {
            $res['pay_url'] = $this->payUrl;
        }
        if (null !== $this->ipBillId) {
            $res['ip_bill_id'] = $this->ipBillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmIpAuthtradeResponse
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
        if (isset($map['ip_order_id'])) {
            $model->ipOrderId = $map['ip_order_id'];
        }
        if (isset($map['pay_url'])) {
            $model->payUrl = $map['pay_url'];
        }
        if (isset($map['ip_bill_id'])) {
            $model->ipBillId = $map['ip_bill_id'];
        }

        return $model;
    }
}
