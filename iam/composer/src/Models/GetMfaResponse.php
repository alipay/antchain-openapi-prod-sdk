<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetMfaResponse extends Model
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

    // 用户 id
    /**
     * @var string
     */
    public $userId;

    // MFA状态, 取值范围：ENABLED, DISABLED
    /**
     * @var string
     */
    public $status;

    // 密钥
    /**
     * @var string
     */
    public $secretKey;

    // 最后一次密钥生成时间
    /**
     * @var string
     */
    public $lastGeneratedTime;

    // (校验失败时)重试校验的次数
    /**
     * @var int
     */
    public $verifyAttempts;

    // 第一次校验失败时间
    /**
     * @var string
     */
    public $firstFailureTime;
    protected $_name = [
        'reqMsgId'          => 'req_msg_id',
        'resultCode'        => 'result_code',
        'resultMsg'         => 'result_msg',
        'userId'            => 'user_id',
        'status'            => 'status',
        'secretKey'         => 'secret_key',
        'lastGeneratedTime' => 'last_generated_time',
        'verifyAttempts'    => 'verify_attempts',
        'firstFailureTime'  => 'first_failure_time',
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->secretKey) {
            $res['secret_key'] = $this->secretKey;
        }
        if (null !== $this->lastGeneratedTime) {
            $res['last_generated_time'] = $this->lastGeneratedTime;
        }
        if (null !== $this->verifyAttempts) {
            $res['verify_attempts'] = $this->verifyAttempts;
        }
        if (null !== $this->firstFailureTime) {
            $res['first_failure_time'] = $this->firstFailureTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMfaResponse
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['secret_key'])) {
            $model->secretKey = $map['secret_key'];
        }
        if (isset($map['last_generated_time'])) {
            $model->lastGeneratedTime = $map['last_generated_time'];
        }
        if (isset($map['verify_attempts'])) {
            $model->verifyAttempts = $map['verify_attempts'];
        }
        if (isset($map['first_failure_time'])) {
            $model->firstFailureTime = $map['first_failure_time'];
        }

        return $model;
    }
}
