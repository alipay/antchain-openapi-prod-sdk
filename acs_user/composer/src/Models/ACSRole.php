<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACS_USER\Models;

use AlibabaCloud\Tea\Model;

class ACSRole extends Model
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

    // 角色编码
    /**
     * @example ROLE_ADMIN
     *
     * @var string
     */
    public $roleCode;

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

    // 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
    /**
     * @example SYSTEM
     *
     * @var string
     */
    public $roleType;
    protected $_name = [
        'productCode'     => 'product_code',
        'productRole'     => 'product_role',
        'roleCode'        => 'role_code',
        'roleName'        => 'role_name',
        'roleDescription' => 'role_description',
        'roleType'        => 'role_type',
    ];

    public function validate()
    {
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('productRole', $this->productRole, true);
        Model::validateRequired('roleCode', $this->roleCode, true);
        Model::validateRequired('roleName', $this->roleName, true);
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
        if (null !== $this->roleCode) {
            $res['role_code'] = $this->roleCode;
        }
        if (null !== $this->roleName) {
            $res['role_name'] = $this->roleName;
        }
        if (null !== $this->roleDescription) {
            $res['role_description'] = $this->roleDescription;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ACSRole
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
        if (isset($map['role_code'])) {
            $model->roleCode = $map['role_code'];
        }
        if (isset($map['role_name'])) {
            $model->roleName = $map['role_name'];
        }
        if (isset($map['role_description'])) {
            $model->roleDescription = $map['role_description'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }

        return $model;
    }
}
