<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class AddRoleActionRequest extends Model
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

    // 权限码
    /**
     * @var string[]
     */
    public $actions;
    protected $_name = [
        'authToken' => 'auth_token',
        'roleId'    => 'role_id',
        'actions'   => 'actions',
    ];

    public function validate()
    {
        Model::validateRequired('roleId', $this->roleId, true);
        Model::validateRequired('actions', $this->actions, true);
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
        if (null !== $this->actions) {
            $res['actions'] = $this->actions;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddRoleActionRequest
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
        if (isset($map['actions'])) {
            if (!empty($map['actions'])) {
                $model->actions = $map['actions'];
            }
        }

        return $model;
    }
}
