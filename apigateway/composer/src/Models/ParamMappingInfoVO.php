<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ParamMappingInfoVO extends Model
{
    // api_count
    /**
     * @example
     *
     * @var int
     */
    public $apiCount;

    // can_delete
    /**
     * @example true/false
     *
     * @var bool
     */
    public $canDelete;

    // 配置模板
    /**
     * @example config_template
     *
     * @var string
     */
    public $configTemplate;

    // 描述
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // gmt_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 映射类型
    /**
     * @example request
     * esponse
     * @var string
     */
    public $mappingType;

    // 创建人
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // param_mapping_id
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $paramMappingId;

    // 参数映射名称
    /**
     * @example param_mapping_name
     *
     * @var string
     */
    public $paramMappingName;

    // 脚本配置
    /**
     * @example script_config
     *
     * @var string
     */
    public $scriptConfig;

    // tenant_id
    /**
     * @example TSCPDICNT
     *
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @example default
     *
     * @var string
     */
    public $workspaceId;

    // 配置模板名称
    /**
     * @example config_template_name
     *
     * @var string
     */
    public $configTemplateName;
    protected $_name = [
        'apiCount'           => 'api_count',
        'canDelete'          => 'can_delete',
        'configTemplate'     => 'config_template',
        'description'        => 'description',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'mappingType'        => 'mapping_type',
        'operator'           => 'operator',
        'paramMappingId'     => 'param_mapping_id',
        'paramMappingName'   => 'param_mapping_name',
        'scriptConfig'       => 'script_config',
        'tenantId'           => 'tenant_id',
        'workspaceId'        => 'workspace_id',
        'configTemplateName' => 'config_template_name',
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
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
        }
        if (null !== $this->configTemplate) {
            $res['config_template'] = $this->configTemplate;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->mappingType) {
            $res['mapping_type'] = $this->mappingType;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->paramMappingId) {
            $res['param_mapping_id'] = $this->paramMappingId;
        }
        if (null !== $this->paramMappingName) {
            $res['param_mapping_name'] = $this->paramMappingName;
        }
        if (null !== $this->scriptConfig) {
            $res['script_config'] = $this->scriptConfig;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->configTemplateName) {
            $res['config_template_name'] = $this->configTemplateName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParamMappingInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
        }
        if (isset($map['config_template'])) {
            $model->configTemplate = $map['config_template'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['mapping_type'])) {
            $model->mappingType = $map['mapping_type'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['param_mapping_id'])) {
            $model->paramMappingId = $map['param_mapping_id'];
        }
        if (isset($map['param_mapping_name'])) {
            $model->paramMappingName = $map['param_mapping_name'];
        }
        if (isset($map['script_config'])) {
            $model->scriptConfig = $map['script_config'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['config_template_name'])) {
            $model->configTemplateName = $map['config_template_name'];
        }

        return $model;
    }
}
