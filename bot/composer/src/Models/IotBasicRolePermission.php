<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicRolePermission extends Model
{
    // 角色编码
    /**
     * @example 角色编码
     *
     * @var string
     */
    public $roleCode;

    // 角色名称
    /**
     * @example 角色名称
     *
     * @var string
     */
    public $roleName;

    // 权限列表
    /**
     * @example 权限列表
     *
     * @var IotBasicPermissionData[]
     */
    public $permissionList;
    protected $_name = [
        'roleCode'       => 'role_code',
        'roleName'       => 'role_name',
        'permissionList' => 'permission_list',
    ];

    public function validate()
    {
        Model::validateRequired('roleCode', $this->roleCode, true);
        Model::validateRequired('roleName', $this->roleName, true);
        Model::validateRequired('permissionList', $this->permissionList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->roleCode) {
            $res['role_code'] = $this->roleCode;
        }
        if (null !== $this->roleName) {
            $res['role_name'] = $this->roleName;
        }
        if (null !== $this->permissionList) {
            $res['permission_list'] = [];
            if (null !== $this->permissionList && \is_array($this->permissionList)) {
                $n = 0;
                foreach ($this->permissionList as $item) {
                    $res['permission_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicRolePermission
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['role_code'])) {
            $model->roleCode = $map['role_code'];
        }
        if (isset($map['role_name'])) {
            $model->roleName = $map['role_name'];
        }
        if (isset($map['permission_list'])) {
            if (!empty($map['permission_list'])) {
                $model->permissionList = [];
                $n                     = 0;
                foreach ($map['permission_list'] as $item) {
                    $model->permissionList[$n++] = null !== $item ? IotBasicPermissionData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
