<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListAppportraitAppRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 应用名称
    /**
     * @var string
     */
    public $name;

    // 应用分组名称
    /**
     * @var string
     */
    public $appGroupName;

    // 应用负责人
    /**
     * @var string
     */
    public $ownerDisplayName;

    // 技术栈名称
    /**
     * @var string
     */
    public $buildpackName;

    // 技术栈版本
    /**
     * @var string
     */
    public $buildpackVersion;

    // TenantId
    /**
     * @var string
     */
    public $tenantId;

    // TenantName
    /**
     * @var string
     */
    public $tenantName;
    protected $_name = [
        'authToken'        => 'auth_token',
        'name'             => 'name',
        'appGroupName'     => 'app_group_name',
        'ownerDisplayName' => 'owner_display_name',
        'buildpackName'    => 'buildpack_name',
        'buildpackVersion' => 'buildpack_version',
        'tenantId'         => 'tenant_id',
        'tenantName'       => 'tenant_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->appGroupName) {
            $res['app_group_name'] = $this->appGroupName;
        }
        if (null !== $this->ownerDisplayName) {
            $res['owner_display_name'] = $this->ownerDisplayName;
        }
        if (null !== $this->buildpackName) {
            $res['buildpack_name'] = $this->buildpackName;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAppportraitAppRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['app_group_name'])) {
            $model->appGroupName = $map['app_group_name'];
        }
        if (isset($map['owner_display_name'])) {
            $model->ownerDisplayName = $map['owner_display_name'];
        }
        if (isset($map['buildpack_name'])) {
            $model->buildpackName = $map['buildpack_name'];
        }
        if (isset($map['buildpack_version'])) {
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }

        return $model;
    }
}
