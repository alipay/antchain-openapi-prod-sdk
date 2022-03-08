<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiModelParamVO extends Model
{
    // 默认值
    /**
     * @example default_value
     *
     * @var string
     */
    public $defaultValue;

    // 描述
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 模型id
    /**
     * @example model_id
     *
     * @var string
     */
    public $modelId;

    // 模型提交 操作
    /**
     * @example delete，update，add
     *
     * @var string
     */
    public $operation;

    // 模型参数id（唯一标识）
    /**
     * @example param_id
     *
     * @var string
     */
    public $paramId;

    // 参数名
    /**
     * @example param_name
     *
     * @var string
     */
    public $paramName;

    // 参数类型
    /**
     * @example String，Int，Long，Float，Double，Boolean，Object，List，Map
     *
     * @var string
     */
    public $paramType;

    // 引用模型id
    /**
     * @example ref_param_id
     *
     * @var string
     */
    public $refModelId;

    // 工作空间标识
    /**
     * @example tenant_id
     *
     * @var string
     */
    public $tenantId;

    // workspace_id
    /**
     * @example workspace id
     *
     * @var string
     */
    public $workspaceId;

    // model_description
    /**
     * @example model_description
     *
     * @var string
     */
    public $modelDescription;
    protected $_name = [
        'defaultValue'     => 'default_value',
        'description'      => 'description',
        'gmtCreate'        => 'gmt_create',
        'gmtModified'      => 'gmt_modified',
        'modelId'          => 'model_id',
        'operation'        => 'operation',
        'paramId'          => 'param_id',
        'paramName'        => 'param_name',
        'paramType'        => 'param_type',
        'refModelId'       => 'ref_model_id',
        'tenantId'         => 'tenant_id',
        'workspaceId'      => 'workspace_id',
        'modelDescription' => 'model_description',
    ];

    public function validate()
    {
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->defaultValue) {
            $res['default_value'] = $this->defaultValue;
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
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->paramId) {
            $res['param_id'] = $this->paramId;
        }
        if (null !== $this->paramName) {
            $res['param_name'] = $this->paramName;
        }
        if (null !== $this->paramType) {
            $res['param_type'] = $this->paramType;
        }
        if (null !== $this->refModelId) {
            $res['ref_model_id'] = $this->refModelId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->modelDescription) {
            $res['model_description'] = $this->modelDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiModelParamVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['default_value'])) {
            $model->defaultValue = $map['default_value'];
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
        if (isset($map['model_id'])) {
            $model->modelId = $map['model_id'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['param_id'])) {
            $model->paramId = $map['param_id'];
        }
        if (isset($map['param_name'])) {
            $model->paramName = $map['param_name'];
        }
        if (isset($map['param_type'])) {
            $model->paramType = $map['param_type'];
        }
        if (isset($map['ref_model_id'])) {
            $model->refModelId = $map['ref_model_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['model_description'])) {
            $model->modelDescription = $map['model_description'];
        }

        return $model;
    }
}
