<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicUserInfo extends Model
{
    // 租户ID
    /**
     * @example DWWS2D
     *
     * @var string
     */
    public $tenant;

    // 金融云用户Id
    //
    /**
     * @example 12321321
     *
     * @var string
     */
    public $cloudUserId;

    // 金融云平台的登录名
    //
    /**
     * @example xxx@alitest.com
     *
     * @var string
     */
    public $loginName;

    // 权限集合
    /**
     * @example
     *
     * @var IotBasicRolePermission[]
     */
    public $permissionList;
    protected $_name = [
        'tenant'         => 'tenant',
        'cloudUserId'    => 'cloud_user_id',
        'loginName'      => 'login_name',
        'permissionList' => 'permission_list',
    ];

    public function validate()
    {
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('cloudUserId', $this->cloudUserId, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('permissionList', $this->permissionList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->cloudUserId) {
            $res['cloud_user_id'] = $this->cloudUserId;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
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
     * @return IotBasicUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['cloud_user_id'])) {
            $model->cloudUserId = $map['cloud_user_id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['permission_list'])) {
            if (!empty($map['permission_list'])) {
                $model->permissionList = [];
                $n                     = 0;
                foreach ($map['permission_list'] as $item) {
                    $model->permissionList[$n++] = null !== $item ? IotBasicRolePermission::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
