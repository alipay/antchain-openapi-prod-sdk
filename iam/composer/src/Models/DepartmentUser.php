<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class DepartmentUser extends Model
{
    // 部门唯一码
    /**
     * @example D0001
     *
     * @var string
     */
    public $departmentCode;

    // 用户 id
    /**
     * @example
     *
     * @var string
     */
    public $userId;

    // 部门成员类型，
    /**
     * @example NORMAL | MANAGER
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'departmentCode' => 'department_code',
        'userId'         => 'user_id',
        'type'           => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->departmentCode) {
            $res['department_code'] = $this->departmentCode;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DepartmentUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['department_code'])) {
            $model->departmentCode = $map['department_code'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
