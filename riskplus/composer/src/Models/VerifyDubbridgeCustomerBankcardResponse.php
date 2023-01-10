<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class VerifyDubbridgeCustomerBankcardResponse extends Model
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

    // 绑卡流水
    /**
     * @var string
     */
    public $bindSerialNo;

    // 签约结果
    /**
     * @var string
     */
    public $signResult;

    // 客户号
    /**
     * @var string
     */
    public $customerNo;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'bindSerialNo' => 'bind_serial_no',
        'signResult'   => 'sign_result',
        'customerNo'   => 'customer_no',
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
        if (null !== $this->bindSerialNo) {
            $res['bind_serial_no'] = $this->bindSerialNo;
        }
        if (null !== $this->signResult) {
            $res['sign_result'] = $this->signResult;
        }
        if (null !== $this->customerNo) {
            $res['customer_no'] = $this->customerNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyDubbridgeCustomerBankcardResponse
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
        if (isset($map['bind_serial_no'])) {
            $model->bindSerialNo = $map['bind_serial_no'];
        }
        if (isset($map['sign_result'])) {
            $model->signResult = $map['sign_result'];
        }
        if (isset($map['customer_no'])) {
            $model->customerNo = $map['customer_no'];
        }

        return $model;
    }
}
