<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class EnableMfaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 用户 id
    /**
     * @var string
     */
    public $userId;

    // 验证码
    /**
     * @var int
     */
    public $verificationCode;
    protected $_name = [
        'authToken'        => 'auth_token',
        'userId'           => 'user_id',
        'verificationCode' => 'verification_code',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('verificationCode', $this->verificationCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->verificationCode) {
            $res['verification_code'] = $this->verificationCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnableMfaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['verification_code'])) {
            $model->verificationCode = $map['verification_code'];
        }

        return $model;
    }
}
