<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class AuthAppInfoVO extends Model
{
    // api数
    /**
     * @example
     *
     * @var int
     */
    public $apiCount;

    // 应用类型
    /**
     * @example MPAAS/STANDARD
     *
     * @var string
     */
    public $appType;

    // auth_app_info_id
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $authAppInfoId;

    // authAppType
    /**
     * @example OUTER / INNER
     *
     * @var string
     */
    public $authAppType;

    // 是否可以删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 更改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // operator
    /**
     * @example scott
     *
     * @var string
     */
    public $operator;

    // subAppCompany
    /**
     * @example sub_app_company1
     *
     * @var string
     */
    public $subAppCompany;

    // subAppDesc
    /**
     * @example sub_app_desc1
     *
     * @var string
     */
    public $subAppDesc;

    // 订阅方appid
    /**
     * @example sub_app_id
     *
     * @var string
     */
    public $subAppId;

    // sub_app_info
    /**
     * @example
     *
     * @var AppInfoVO
     */
    public $subAppInfo;

    // subTenantId
    /**
     * @example sub_tenant_id1
     *
     * @var string
     */
    public $subTenantId;

    // subWorkspaceId
    /**
     * @example sub_workspace_id1
     *
     * @var string
     */
    public $subWorkspaceId;

    // api标识
    /**
     * @example api_id
     *
     * @var string
     */
    public $apiId;

    // 应用名称
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'apiCount'       => 'api_count',
        'appType'        => 'app_type',
        'authAppInfoId'  => 'auth_app_info_id',
        'authAppType'    => 'auth_app_type',
        'canDelete'      => 'can_delete',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
        'operator'       => 'operator',
        'subAppCompany'  => 'sub_app_company',
        'subAppDesc'     => 'sub_app_desc',
        'subAppId'       => 'sub_app_id',
        'subAppInfo'     => 'sub_app_info',
        'subTenantId'    => 'sub_tenant_id',
        'subWorkspaceId' => 'sub_workspace_id',
        'apiId'          => 'api_id',
        'appName'        => 'app_name',
        'workspaceId'    => 'workspace_id',
        'tenantId'       => 'tenant_id',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->apiCount) {
            $res['api_count'] = $this->apiCount;
        }
        if (null !== $this->appType) {
            $res['app_type'] = $this->appType;
        }
        if (null !== $this->authAppInfoId) {
            $res['auth_app_info_id'] = $this->authAppInfoId;
        }
        if (null !== $this->authAppType) {
            $res['auth_app_type'] = $this->authAppType;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->subAppCompany) {
            $res['sub_app_company'] = $this->subAppCompany;
        }
        if (null !== $this->subAppDesc) {
            $res['sub_app_desc'] = $this->subAppDesc;
        }
        if (null !== $this->subAppId) {
            $res['sub_app_id'] = $this->subAppId;
        }
        if (null !== $this->subAppInfo) {
            $res['sub_app_info'] = null !== $this->subAppInfo ? $this->subAppInfo->toMap() : null;
        }
        if (null !== $this->subTenantId) {
            $res['sub_tenant_id'] = $this->subTenantId;
        }
        if (null !== $this->subWorkspaceId) {
            $res['sub_workspace_id'] = $this->subWorkspaceId;
        }
        if (null !== $this->apiId) {
            $res['api_id'] = $this->apiId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthAppInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['app_type'])) {
            $model->appType = $map['app_type'];
        }
        if (isset($map['auth_app_info_id'])) {
            $model->authAppInfoId = $map['auth_app_info_id'];
        }
        if (isset($map['auth_app_type'])) {
            $model->authAppType = $map['auth_app_type'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['sub_app_company'])) {
            $model->subAppCompany = $map['sub_app_company'];
        }
        if (isset($map['sub_app_desc'])) {
            $model->subAppDesc = $map['sub_app_desc'];
        }
        if (isset($map['sub_app_id'])) {
            $model->subAppId = $map['sub_app_id'];
        }
        if (isset($map['sub_app_info'])) {
            $model->subAppInfo = AppInfoVO::fromMap($map['sub_app_info']);
        }
        if (isset($map['sub_tenant_id'])) {
            $model->subTenantId = $map['sub_tenant_id'];
        }
        if (isset($map['sub_workspace_id'])) {
            $model->subWorkspaceId = $map['sub_workspace_id'];
        }
        if (isset($map['api_id'])) {
            $model->apiId = $map['api_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
