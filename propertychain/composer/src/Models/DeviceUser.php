<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DeviceUser extends Model
{
    // 用户id
    /**
     * @example device_user_id
     *
     * @var string
     */
    public $deviceUserId;

    // 用户名称
    /**
     * @example deviceUserName
     *
     * @var string
     */
    public $deviceUserName;

    // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
    /**
     * @example roleType
     *
     * @var string
     */
    public $roleType;

    // 权限(仅有设备所有权和设备使用权两种权限)
    /**
     * @example authority
     *
     * @var string
     */
    public $authority;
    protected $_name = [
        'deviceUserId'   => 'device_user_id',
        'deviceUserName' => 'device_user_name',
        'roleType'       => 'role_type',
        'authority'      => 'authority',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceUserId) {
            $res['device_user_id'] = $this->deviceUserId;
        }
        if (null !== $this->deviceUserName) {
            $res['device_user_name'] = $this->deviceUserName;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }
        if (null !== $this->authority) {
            $res['authority'] = $this->authority;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceUser
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_user_id'])) {
            $model->deviceUserId = $map['device_user_id'];
        }
        if (isset($map['device_user_name'])) {
            $model->deviceUserName = $map['device_user_name'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }
        if (isset($map['authority'])) {
            $model->authority = $map['authority'];
        }

        return $model;
    }
}
