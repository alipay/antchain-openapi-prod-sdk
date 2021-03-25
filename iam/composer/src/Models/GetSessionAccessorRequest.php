<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetSessionAccessorRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 登录态
    /**
     * @var string
     */
    public $authorization;

    // 用户所属租户
    /**
     * @var string
     */
    public $userTenant;
    protected $_name = [
        'authToken'     => 'auth_token',
        'authorization' => 'authorization',
        'userTenant'    => 'user_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('authorization', $this->authorization, true);
        Model::validateRequired('userTenant', $this->userTenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->authorization) {
            $res['authorization'] = $this->authorization;
        }
        if (null !== $this->userTenant) {
            $res['user_tenant'] = $this->userTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetSessionAccessorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['authorization'])) {
            $model->authorization = $map['authorization'];
        }
        if (isset($map['user_tenant'])) {
            $model->userTenant = $map['user_tenant'];
        }

        return $model;
    }
}
