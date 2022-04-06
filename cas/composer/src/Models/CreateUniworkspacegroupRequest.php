<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateUniworkspacegroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组名称
    /**
     * @var string
     */
    public $name;

    // 显示名字，可以中文
    /**
     * @var string
     */
    public $displayName;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // namespace
    /**
     * @var string
     */
    public $namespace;

    // json格式的字符串，工作空间组属性
    /**
     * @var string
     */
    public $properties;

    // release_mode
    /**
     * @var string
     */
    public $releaseMode;

    // 工作空间的名称
    /**
     * @var string[]
     */
    public $workspaces;

    // workspaces_create_param
    /**
     * @var string[]
     */
    public $workspacesCreateParam;

    // cell_group_create_params
    /**
     * @var string[]
     */
    public $cellGroupCreateParams;

    // cell_create_params
    /**
     * @var string[]
     */
    public $cellCreateParams;

    // 域名前缀
    /**
     * @var string
     */
    public $domainSuffix;

    // VPC创建参数
    /**
     * @var string[]
     */
    public $vpcCreateParams;

    // 导入的VPCIDs
    /**
     * @var string[]
     */
    public $importVpcs;
    protected $_name = [
        'authToken'             => 'auth_token',
        'name'                  => 'name',
        'displayName'           => 'display_name',
        'tenantId'              => 'tenant_id',
        'namespace'             => 'namespace',
        'properties'            => 'properties',
        'releaseMode'           => 'release_mode',
        'workspaces'            => 'workspaces',
        'workspacesCreateParam' => 'workspaces_create_param',
        'cellGroupCreateParams' => 'cell_group_create_params',
        'cellCreateParams'      => 'cell_create_params',
        'domainSuffix'          => 'domain_suffix',
        'vpcCreateParams'       => 'vpc_create_params',
        'importVpcs'            => 'import_vpcs',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaces', $this->workspaces, true);
        Model::validateRequired('workspacesCreateParam', $this->workspacesCreateParam, true);
        Model::validateRequired('vpcCreateParams', $this->vpcCreateParams, true);
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
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->releaseMode) {
            $res['release_mode'] = $this->releaseMode;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = $this->workspaces;
        }
        if (null !== $this->workspacesCreateParam) {
            $res['workspaces_create_param'] = $this->workspacesCreateParam;
        }
        if (null !== $this->cellGroupCreateParams) {
            $res['cell_group_create_params'] = $this->cellGroupCreateParams;
        }
        if (null !== $this->cellCreateParams) {
            $res['cell_create_params'] = $this->cellCreateParams;
        }
        if (null !== $this->domainSuffix) {
            $res['domain_suffix'] = $this->domainSuffix;
        }
        if (null !== $this->vpcCreateParams) {
            $res['vpc_create_params'] = $this->vpcCreateParams;
        }
        if (null !== $this->importVpcs) {
            $res['import_vpcs'] = $this->importVpcs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateUniworkspacegroupRequest
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
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['release_mode'])) {
            $model->releaseMode = $map['release_mode'];
        }
        if (isset($map['workspaces'])) {
            if (!empty($map['workspaces'])) {
                $model->workspaces = $map['workspaces'];
            }
        }
        if (isset($map['workspaces_create_param'])) {
            if (!empty($map['workspaces_create_param'])) {
                $model->workspacesCreateParam = $map['workspaces_create_param'];
            }
        }
        if (isset($map['cell_group_create_params'])) {
            if (!empty($map['cell_group_create_params'])) {
                $model->cellGroupCreateParams = $map['cell_group_create_params'];
            }
        }
        if (isset($map['cell_create_params'])) {
            if (!empty($map['cell_create_params'])) {
                $model->cellCreateParams = $map['cell_create_params'];
            }
        }
        if (isset($map['domain_suffix'])) {
            $model->domainSuffix = $map['domain_suffix'];
        }
        if (isset($map['vpc_create_params'])) {
            if (!empty($map['vpc_create_params'])) {
                $model->vpcCreateParams = $map['vpc_create_params'];
            }
        }
        if (isset($map['import_vpcs'])) {
            if (!empty($map['import_vpcs'])) {
                $model->importVpcs = $map['import_vpcs'];
            }
        }

        return $model;
    }
}
