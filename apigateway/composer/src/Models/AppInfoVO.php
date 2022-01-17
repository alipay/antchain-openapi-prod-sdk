<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class AppInfoVO extends Model
{
    // api_count
    /**
     * @example
     *
     * @var int
     */
    public $apiCount;

    // app_id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // appSecret
    /**
     * @example app_secret1
     *
     * @var string
     */
    public $appSecret;

    // app类型
    /**
     * @example STANDARD / MPAAS
     *
     * @var string
     */
    public $appType;

    // authenticationConfig
    /**
     * @example
     *
     * @var AuthenticationConfigVO
     */
    public $authenticationConfig;

    // 是否可以删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // description
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // encryptConfig
    /**
     * @example
     *
     * @var EncryptConfigVO
     */
    public $encryptConfig;

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

    // tenant_id
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'apiCount'             => 'api_count',
        'appId'                => 'app_id',
        'appName'              => 'app_name',
        'appSecret'            => 'app_secret',
        'appType'              => 'app_type',
        'authenticationConfig' => 'authentication_config',
        'canDelete'            => 'can_delete',
        'description'          => 'description',
        'encryptConfig'        => 'encrypt_config',
        'gmtCreate'            => 'gmt_create',
        'gmtModified'          => 'gmt_modified',
        'operator'             => 'operator',
        'tenantId'             => 'tenant_id',
        'workspaceId'          => 'workspace_id',
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
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appSecret) {
            $res['app_secret'] = $this->appSecret;
        }
        if (null !== $this->appType) {
            $res['app_type'] = $this->appType;
        }
        if (null !== $this->authenticationConfig) {
            $res['authentication_config'] = null !== $this->authenticationConfig ? $this->authenticationConfig->toMap() : null;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->encryptConfig) {
            $res['encrypt_config'] = null !== $this->encryptConfig ? $this->encryptConfig->toMap() : null;
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_secret'])) {
            $model->appSecret = $map['app_secret'];
        }
        if (isset($map['app_type'])) {
            $model->appType = $map['app_type'];
        }
        if (isset($map['authentication_config'])) {
            $model->authenticationConfig = AuthenticationConfigVO::fromMap($map['authentication_config']);
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['encrypt_config'])) {
            $model->encryptConfig = EncryptConfigVO::fromMap($map['encrypt_config']);
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
