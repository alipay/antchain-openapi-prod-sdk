<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class LoginAccountTypeBO extends Model
{
    // 登录类型：EMAIL-邮箱
    /**
     * @example EMAIL
     *
     * @var string
     */
    public $userLoginType;

    // 登录名称
    /**
     * @example 123@qq.com
     *
     * @var string
     */
    public $loginName;
    protected $_name = [
        'userLoginType' => 'user_login_type',
        'loginName'     => 'login_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userLoginType) {
            $res['user_login_type'] = $this->userLoginType;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LoginAccountTypeBO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_login_type'])) {
            $model->userLoginType = $map['user_login_type'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }

        return $model;
    }
}
