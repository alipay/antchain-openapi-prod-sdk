<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class RelUser extends Model
{
    // 工号
    /**
     * @example 000001
     *
     * @var string
     */
    public $empId;

    // 域账号
    /**
     * @example zhangsan.abc
     *
     * @var string
     */
    public $loginName;

    // 花名
    /**
     * @example nick_name
     *
     * @var string
     */
    public $nickName;

    // 角色，PD-产品经理，DEV-研发
    /**
     * @example PD
     *
     * @var string
     */
    public $role;
    protected $_name = [
        'empId'     => 'emp_id',
        'loginName' => 'login_name',
        'nickName'  => 'nick_name',
        'role'      => 'role',
    ];

    public function validate()
    {
        Model::validateRequired('empId', $this->empId, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('nickName', $this->nickName, true);
        Model::validateRequired('role', $this->role, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->empId) {
            $res['emp_id'] = $this->empId;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RelUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['emp_id'])) {
            $model->empId = $map['emp_id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }

        return $model;
    }
}
