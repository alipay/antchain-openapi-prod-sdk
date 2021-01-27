<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class VerifyPasswordRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'encryptedPassword' => 'encrypted_password',
        'loginName' => 'login_name',
    ];
    public function validate() {
        Model::validateRequired('encryptedPassword', $this->encryptedPassword, true);
        Model::validateRequired('loginName', $this->loginName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->encryptedPassword) {
            $res['encrypted_password'] = $this->encryptedPassword;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VerifyPasswordRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['encrypted_password'])){
            $model->encryptedPassword = $map['encrypted_password'];
        }
        if(isset($map['login_name'])){
            $model->loginName = $map['login_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 加密过的密码值，使用AccessSecret进行3DES加密
    /**
     * @var string
     */
    public $encryptedPassword;

    // 登录名
    /**
     * @var string
     */
    public $loginName;

}
