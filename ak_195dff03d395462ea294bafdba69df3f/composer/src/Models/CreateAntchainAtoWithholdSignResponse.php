<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainAtoWithholdSignResponse extends Model
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

    // 签约字符串
    /**
     * @var string
     */
    public $signStr;

    // 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约
    /**
     * @var string
     */
    public $signStrType;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'signStr'     => 'sign_str',
        'signStrType' => 'sign_str_type',
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
        if (null !== $this->signStr) {
            $res['sign_str'] = $this->signStr;
        }
        if (null !== $this->signStrType) {
            $res['sign_str_type'] = $this->signStrType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainAtoWithholdSignResponse
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
        if (isset($map['sign_str'])) {
            $model->signStr = $map['sign_str'];
        }
        if (isset($map['sign_str_type'])) {
            $model->signStrType = $map['sign_str_type'];
        }

        return $model;
    }
}
