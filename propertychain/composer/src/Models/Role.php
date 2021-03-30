<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class Role extends Model
{
    // 企业名称
    /**
     * @example firmName
     *
     * @var string
     */
    public $firmName;

    // 蚂蚁金融科技租户ID
    /**
     * @example open_tenant
     *
     * @var string
     */
    public $openTenant;

    // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    /**
     * @example MEMBER
     *
     * @var string
     */
    public $roleType;
    protected $_name = [
        'firmName'   => 'firm_name',
        'openTenant' => 'open_tenant',
        'roleType'   => 'role_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->openTenant) {
            $res['open_tenant'] = $this->openTenant;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Role
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['open_tenant'])) {
            $model->openTenant = $map['open_tenant'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }

        return $model;
    }
}
