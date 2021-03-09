<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class CheckLoginIdRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 登录id
    /**
     * @var string
     */
    public $loginName;
    protected $_name = [
        'authToken' => 'auth_token',
        'loginName' => 'login_name',
    ];

    public function validate()
    {
        Model::validateRequired('loginName', $this->loginName, true);
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckLoginIdRequest
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

        return $model;
    }
}
