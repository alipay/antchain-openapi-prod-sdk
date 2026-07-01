<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseFinancecertifyResponse extends Model
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

    // 本次认证是否通过
    /**
     * @var string
     */
    public $certifyResult;

    // 通过的人脸认证id
    /**
     * @var string
     */
    public $leaseCertifyId;

    // 本次调用核验结果码
    /**
     * @var string
     */
    public $code;

    // 错误信息描述
    /**
     * @var string
     */
    public $message;
    protected $_name = [
        'reqMsgId'       => 'req_msg_id',
        'resultCode'     => 'result_code',
        'resultMsg'      => 'result_msg',
        'certifyResult'  => 'certify_result',
        'leaseCertifyId' => 'lease_certify_id',
        'code'           => 'code',
        'message'        => 'message',
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
        if (null !== $this->certifyResult) {
            $res['certify_result'] = $this->certifyResult;
        }
        if (null !== $this->leaseCertifyId) {
            $res['lease_certify_id'] = $this->leaseCertifyId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseFinancecertifyResponse
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
        if (isset($map['certify_result'])) {
            $model->certifyResult = $map['certify_result'];
        }
        if (isset($map['lease_certify_id'])) {
            $model->leaseCertifyId = $map['lease_certify_id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
