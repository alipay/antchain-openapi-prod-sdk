<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class MfaConfig extends Model
{
    // 用户id
    /**
     * @example
     *
     * @var string
     */
    public $userId;

    // MFA状态, 取值范围：ENABLED, DISABLED
    /**
     * @example ENABLED
     *
     * @var string
     */
    public $status;

    // MFA类型，取值范围：SELF(自有MFA), SYMANTEC(赛门铁克MFA)
    /**
     * @example SELF
     *
     * @var string
     */
    public $type;

    // 密钥
    /**
     * @example
     *
     * @var string
     */
    public $secretKey;

    // 最后一次密钥生成时间
    /**
     * @example
     *
     * @var string
     */
    public $lastGeneratedTime;

    // (校验失败时)重试校验的次数, 0 代表不限次数
    /**
     * @example
     *
     * @var int
     */
    public $verifyAttempts;

    // 第一次校验失败时间, ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $firstFailureTime;
    protected $_name = [
        'userId'            => 'user_id',
        'status'            => 'status',
        'type'              => 'type',
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
     * @return MfaConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
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
