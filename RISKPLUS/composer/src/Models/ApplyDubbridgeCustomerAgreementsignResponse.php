<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ApplyDubbridgeCustomerAgreementsignResponse extends Model
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

    // sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
    /**
     * @var string
     */
    public $sdkParams;

    // 客户编号
    /**
     * @var string
     */
    public $customNo;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'sdkParams'  => 'sdk_params',
        'customNo'   => 'custom_no',
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
        if (null !== $this->sdkParams) {
            $res['sdk_params'] = $this->sdkParams;
        }
        if (null !== $this->customNo) {
            $res['custom_no'] = $this->customNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyDubbridgeCustomerAgreementsignResponse
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
        if (isset($map['sdk_params'])) {
            $model->sdkParams = $map['sdk_params'];
        }
        if (isset($map['custom_no'])) {
            $model->customNo = $map['custom_no'];
        }

        return $model;
    }
}
