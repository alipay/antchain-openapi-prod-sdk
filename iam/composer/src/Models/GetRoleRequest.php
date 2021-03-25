<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class GetRoleRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 角色ID
    /**
     * @var string
     */
    public $roleId;
    protected $_name = [
        'authToken' => 'auth_token',
        'roleId'    => 'role_id',
    ];

    public function validate()
    {
        Model::validateRequired('roleId', $this->roleId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->roleId) {
            $res['role_id'] = $this->roleId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetRoleRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['role_id'])) {
            $model->roleId = $map['role_id'];
        }

        return $model;
    }
}
