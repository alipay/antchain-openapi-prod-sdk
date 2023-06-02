<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class SaveDepartmentUserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 待添加或更新的部门成员关系列表
    /**
     * @var DepartmentUser[]
     */
    public $departmentUsers;
    protected $_name = [
        'authToken'       => 'auth_token',
        'departmentUsers' => 'department_users',
    ];

    public function validate()
    {
        Model::validateRequired('departmentUsers', $this->departmentUsers, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->departmentUsers) {
            $res['department_users'] = [];
            if (null !== $this->departmentUsers && \is_array($this->departmentUsers)) {
                $n = 0;
                foreach ($this->departmentUsers as $item) {
                    $res['department_users'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveDepartmentUserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['department_users'])) {
            if (!empty($map['department_users'])) {
                $model->departmentUsers = [];
                $n                      = 0;
                foreach ($map['department_users'] as $item) {
                    $model->departmentUsers[$n++] = null !== $item ? DepartmentUser::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
