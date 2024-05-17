<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class VerifyAuthTokenValidityResponse extends Model
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

    // 验证结果（ture表示通过，false表示不通过）
    /**
     * @var bool
     */
    public $verifyResult;

    // 错误信息
    /**
     * @var string
     */
    public $errMsg;
    protected $_name = [
        'reqMsgId'     => 'req_msg_id',
        'resultCode'   => 'result_code',
        'resultMsg'    => 'result_msg',
        'verifyResult' => 'verify_result',
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
        if (null !== $this->verifyResult) {
            $res['verify_result'] = $this->verifyResult;
        }
        if (null !== $this->errMsg) {
            $res['err_msg'] = $this->errMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyAuthTokenValidityResponse
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
        if (isset($map['verify_result'])) {
            $model->verifyResult = $map['verify_result'];
        }
        if (isset($map['err_msg'])) {
            $model->errMsg = $map['err_msg'];
        }

        return $model;
    }
}
