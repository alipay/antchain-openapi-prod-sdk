<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class CreateUserTokenRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 登录账号，邮箱
    /**
     * @var string
     */
    public $loginName;

    // 密码
    /**
     * @var string
     */
    public $password;
    protected $_name = [
        'authToken' => 'auth_token',
        'loginName' => 'login_name',
        'password'  => 'password',
    ];

    public function validate()
    {
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('password', $this->password, true);
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
        if (null !== $this->password) {
            $res['password'] = $this->password;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUserTokenRequest
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
        if (isset($map['password'])) {
            $model->password = $map['password'];
        }

        return $model;
    }
}
