<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class ApiModelVO extends Model
{
    // 绑定的api数量
    /**
     * @example 10
     *
     * @var int
     */
    public $apiCount;

    // 模板id(全局唯一)
    /**
     * @example 8Amfi67dmE9wpY46
     *
     * @var string
     */
    public $apiModelId;

    // 是否可以删除
    /**
     * @example true, false
     *
     * @var bool
     */
    public $canDelete;

    // API模型描述
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

    //
    // 更改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 模型配置
    /**
     * @example model_config
     *
     * @var string
     */
    public $modelConfig;

    // 模型名称
    /**
     * @example model_name
     *
     * @var string
     */
    public $modelName;

    // 数据模型参数
    /**
     * @example model_params
     *
     * @var ApiModelParamVO[]
     */
    public $modelParams;

    // 创建人
    //
    /**
     * @example operator
     *
     * @var string
     */
    public $operator;

    // 租户id
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

    // children
    /**
     * @example children
     *
     * @var string
     */
    public $children;

    // option 表示模型是多参数
    /**
     * @example option
     *
     * @var string
     */
    public $modelType;
    protected $_name = [
        'apiCount'    => 'api_count',
        'apiModelId'  => 'api_model_id',
        'canDelete'   => 'can_delete',
        'description' => 'description',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
        'modelConfig' => 'model_config',
        'modelName'   => 'model_name',
        'modelParams' => 'model_params',
        'operator'    => 'operator',
        'tenantId'    => 'tenant_id',
        'workspaceId' => 'workspace_id',
        'children'    => 'children',
        'modelType'   => 'model_type',
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
        if (null !== $this->apiModelId) {
            $res['api_model_id'] = $this->apiModelId;
        }
        if (null !== $this->canDelete) {
            $res['can_delete'] = $this->canDelete;
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
        if (null !== $this->modelConfig) {
            $res['model_config'] = $this->modelConfig;
        }
        if (null !== $this->modelName) {
            $res['model_name'] = $this->modelName;
        }
        if (null !== $this->modelParams) {
            $res['model_params'] = [];
            if (null !== $this->modelParams && \is_array($this->modelParams)) {
                $n = 0;
                foreach ($this->modelParams as $item) {
                    $res['model_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->children) {
            $res['children'] = $this->children;
        }
        if (null !== $this->modelType) {
            $res['model_type'] = $this->modelType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiModelVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['api_count'])) {
            $model->apiCount = $map['api_count'];
        }
        if (isset($map['api_model_id'])) {
            $model->apiModelId = $map['api_model_id'];
        }
        if (isset($map['can_delete'])) {
            $model->canDelete = $map['can_delete'];
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
        if (isset($map['model_config'])) {
            $model->modelConfig = $map['model_config'];
        }
        if (isset($map['model_name'])) {
            $model->modelName = $map['model_name'];
        }
        if (isset($map['model_params'])) {
            if (!empty($map['model_params'])) {
                $model->modelParams = [];
                $n                  = 0;
                foreach ($map['model_params'] as $item) {
                    $model->modelParams[$n++] = null !== $item ? ApiModelParamVO::fromMap($item) : $item;
                }
            }
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
        if (isset($map['children'])) {
            $model->children = $map['children'];
        }
        if (isset($map['model_type'])) {
            $model->modelType = $map['model_type'];
        }

        return $model;
    }
}
