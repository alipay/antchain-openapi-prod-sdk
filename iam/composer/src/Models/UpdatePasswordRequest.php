<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class UpdatePasswordRequest extends Model
{
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
    //
    /**
     * @var string
     */
    public $newEncryptedPassword;

    // 加密过的旧密码值，使用AccessSecret进行DES加密
    //
    /**
     * @var string
     */
    public $oldEncryptedPassword;
    protected $_name = [
        'authToken'            => 'auth_token',
        'loginName'            => 'login_name',
        'newEncryptedPassword' => 'new_encrypted_password',
        'oldEncryptedPassword' => 'old_encrypted_password',
    ];

    public function validate()
    {
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('newEncryptedPassword', $this->newEncryptedPassword, true);
        Model::validateRequired('oldEncryptedPassword', $this->oldEncryptedPassword, true);
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
        if (null !== $this->oldEncryptedPassword) {
            $res['old_encrypted_password'] = $this->oldEncryptedPassword;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdatePasswordRequest
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
        if (isset($map['old_encrypted_password'])) {
            $model->oldEncryptedPassword = $map['old_encrypted_password'];
        }

        return $model;
    }
}
