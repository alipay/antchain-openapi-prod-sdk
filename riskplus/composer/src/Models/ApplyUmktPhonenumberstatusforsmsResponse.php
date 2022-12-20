<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyUmktPhonenumberstatusforsmsResponse extends Model
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

    // 12345
    /**
     * @var string
     */
    public $customerKey;

    // 用户凭证状态
    /**
     * @var string
     */
    public $status;

    // 号码当前归属的基础运营商
    /**
     * @var string
     */
    public $carrier;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'customerKey' => 'customer_key',
        'status'      => 'status',
        'carrier'     => 'carrier',
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
        if (null !== $this->customerKey) {
            $res['customer_key'] = $this->customerKey;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->carrier) {
            $res['carrier'] = $this->carrier;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyUmktPhonenumberstatusforsmsResponse
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
        if (isset($map['customer_key'])) {
            $model->customerKey = $map['customer_key'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['carrier'])) {
            $model->carrier = $map['carrier'];
        }

        return $model;
    }
}
