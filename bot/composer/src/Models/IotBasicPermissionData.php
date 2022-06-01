<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicPermissionData extends Model
{
    // 权限编码
    /**
     * @example ADD_DEVICE
     *
     * @var string
     */
    public $permissionCode;

    // 权限名称
    /**
     * @example 注册设备
     *
     * @var string
     */
    public $permissionName;

    // 权限内容
    /**
     * @example 权限内容
     *
     * @var string
     */
    public $permissionData;

    // 权限类型
    /**
     * @example 权限类型
     *
     * @var string
     */
    public $permissionType;

    // 权限模块
    /**
     * @example 权限模块
     *
     * @var string
     */
    public $module;
    protected $_name = [
        'permissionCode' => 'permission_code',
        'permissionName' => 'permission_name',
        'permissionData' => 'permission_data',
        'permissionType' => 'permission_type',
        'module'         => 'module',
    ];

    public function validate()
    {
        Model::validateRequired('permissionCode', $this->permissionCode, true);
        Model::validateRequired('permissionName', $this->permissionName, true);
        Model::validateRequired('permissionData', $this->permissionData, true);
        Model::validateRequired('permissionType', $this->permissionType, true);
        Model::validateRequired('module', $this->module, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->permissionCode) {
            $res['permission_code'] = $this->permissionCode;
        }
        if (null !== $this->permissionName) {
            $res['permission_name'] = $this->permissionName;
        }
        if (null !== $this->permissionData) {
            $res['permission_data'] = $this->permissionData;
        }
        if (null !== $this->permissionType) {
            $res['permission_type'] = $this->permissionType;
        }
        if (null !== $this->module) {
            $res['module'] = $this->module;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicPermissionData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['permission_code'])) {
            $model->permissionCode = $map['permission_code'];
        }
        if (isset($map['permission_name'])) {
            $model->permissionName = $map['permission_name'];
        }
        if (isset($map['permission_data'])) {
            $model->permissionData = $map['permission_data'];
        }
        if (isset($map['permission_type'])) {
            $model->permissionType = $map['permission_type'];
        }
        if (isset($map['module'])) {
            $model->module = $map['module'];
        }

        return $model;
    }
}
