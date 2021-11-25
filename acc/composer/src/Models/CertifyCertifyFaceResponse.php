<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CertifyCertifyFaceResponse extends Model
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

    // 跳转url
    /**
     * @var string
     */
    public $redirectUrl;

    // 校验id
    /**
     * @var string
     */
    public $verifyId;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'redirectUrl' => 'redirect_url',
        'verifyId'    => 'verify_id',
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
        if (null !== $this->redirectUrl) {
            $res['redirect_url'] = $this->redirectUrl;
        }
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CertifyCertifyFaceResponse
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
        if (isset($map['redirect_url'])) {
            $model->redirectUrl = $map['redirect_url'];
        }
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }

        return $model;
    }
}
