<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class ResetOperatorPasswordRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 登录名
    /**
     * @var string
     */
    public $loginName;

    // 加密过的新密码值，使用AccessSecret进行3DES加密
    /**
     * @var string
     */
    public $newEncryptedPassword;

    // 登录凭证状态，取值范围：NORMAL, EXPIRED
    //
    // 默认为 NORMAL，设为 EXPIRED 用户登录时会要求重置密码
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'            => 'auth_token',
        'loginName'            => 'login_name',
        'newEncryptedPassword' => 'new_encrypted_password',
        'status'               => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('newEncryptedPassword', $this->newEncryptedPassword, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->newEncryptedPassword) {
            $res['new_encrypted_password'] = $this->newEncryptedPassword;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResetOperatorPasswordRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['new_encrypted_password'])) {
            $model->newEncryptedPassword = $map['new_encrypted_password'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
