<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class ACSUserRole extends Model
{
    // 角色归属产品
    /**
     * @example BAAS
     *
     * @var string
     */
    public $productCode;

    // 角色编码
    /**
     * @example ROLE_ADMIN
     *
     * @var string
     */
    public $productRole;

    // 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
    /**
     * @example SYSTEM
     *
     * @var string
     */
    public $roleType;

    // 角色名称
    /**
     * @example 链管理角色
     *
     * @var string
     */
    public $roleName;

    // 角色描述信息
    /**
     * @example 角色描述
     *
     * @var string
     */
    public $roleDescription;

    // 权限点信息
    /**
     * @example
     *
     * @var AuthAction[]
     */
    public $authActions;

    // 角色code
    /**
     * @example ROLE_ADMIN
     *
     * @var string
     */
    public $roleCode;

    // 登陆用户名
    /**
     * @example 略
     *
     * @var string
     */
    public $userid;
    protected $_name = [
        'productCode'     => 'product_code',
        'productRole'     => 'product_role',
        'roleType'        => 'role_type',
        'roleName'        => 'role_name',
        'roleDescription' => 'role_description',
        'authActions'     => 'auth_actions',
        'roleCode'        => 'role_code',
        'userid'          => 'userid',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productRole', $this->productRole, true);
        Model::validateRequired('roleType', $this->roleType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->productRole) {
            $res['product_role'] = $this->productRole;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }
        if (null !== $this->roleName) {
            $res['role_name'] = $this->roleName;
        }
        if (null !== $this->roleDescription) {
            $res['role_description'] = $this->roleDescription;
        }
        if (null !== $this->authActions) {
            $res['auth_actions'] = [];
            if (null !== $this->authActions && \is_array($this->authActions)) {
                $n = 0;
                foreach ($this->authActions as $item) {
                    $res['auth_actions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->roleCode) {
            $res['role_code'] = $this->roleCode;
        }
        if (null !== $this->userid) {
            $res['userid'] = $this->userid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ACSUserRole
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['product_role'])) {
            $model->productRole = $map['product_role'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }
        if (isset($map['role_name'])) {
            $model->roleName = $map['role_name'];
        }
        if (isset($map['role_description'])) {
            $model->roleDescription = $map['role_description'];
        }
        if (isset($map['auth_actions'])) {
            if (!empty($map['auth_actions'])) {
                $model->authActions = [];
                $n                  = 0;
                foreach ($map['auth_actions'] as $item) {
                    $model->authActions[$n++] = null !== $item ? AuthAction::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['role_code'])) {
            $model->roleCode = $map['role_code'];
        }
        if (isset($map['userid'])) {
            $model->userid = $map['userid'];
        }

        return $model;
    }
}
