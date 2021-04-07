<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryBuildpackRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 技术栈版本
    /**
     * @var string
     */
    public $bpVersion;

    // 是否分页，默认为true
    /**
     * @var bool
     */
    public $byPage;

    // 组件ID
    /**
     * @var string
     */
    public $componentId;

    // 配置ID
    /**
     * @var string
     */
    public $configId;

    // 页码：默认值为1，表示第一页
    /**
     * @var int
     */
    public $currentPage;

    // 部署脚本id
    /**
     * @var string
     */
    public $deployScriptId;

    // 技术栈ID标识
    /**
     * @var string
     */
    public $id;

    // 是否包含模板
    /**
     * @var bool
     */
    public $includeTemplate;

    // 技术栈名称
    /**
     * @var string
     */
    public $name;

    // 每页返回个数
    /**
     * @var int
     */
    public $pageSize;

    // 查询名称过滤方式
    // 模糊查询 FUZZY
    // 精准匹配 ACCURATE
    // 前缀查询 START_WITH
    /**
     * @var string
     */
    public $queryType;

    // 所属技术栈类别ID
    /**
     * @var string
     */
    public $stackId;

    // 技术栈状态
    /**
     * @var string
     */
    public $status;

    // 技术栈定义类型
    // 系统模板 TEMPLATE,
    // 用户自定义 CUSTOM,
    // 后台服务 BACKGROUND_SERVICE
    /**
     * @var string[]
     */
    public $types;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'       => 'auth_token',
        'bpVersion'       => 'bp_version',
        'byPage'          => 'by_page',
        'componentId'     => 'component_id',
        'configId'        => 'config_id',
        'currentPage'     => 'current_page',
        'deployScriptId'  => 'deploy_script_id',
        'id'              => 'id',
        'includeTemplate' => 'include_template',
        'name'            => 'name',
        'pageSize'        => 'page_size',
        'queryType'       => 'query_type',
        'stackId'         => 'stack_id',
        'status'          => 'status',
        'types'           => 'types',
        'workspace'       => 'workspace',
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
        if (null !== $this->bpVersion) {
            $res['bp_version'] = $this->bpVersion;
        }
        if (null !== $this->byPage) {
            $res['by_page'] = $this->byPage;
        }
        if (null !== $this->componentId) {
            $res['component_id'] = $this->componentId;
        }
        if (null !== $this->configId) {
            $res['config_id'] = $this->configId;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->deployScriptId) {
            $res['deploy_script_id'] = $this->deployScriptId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->includeTemplate) {
            $res['include_template'] = $this->includeTemplate;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->stackId) {
            $res['stack_id'] = $this->stackId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBuildpackRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['bp_version'])) {
            $model->bpVersion = $map['bp_version'];
        }
        if (isset($map['by_page'])) {
            $model->byPage = $map['by_page'];
        }
        if (isset($map['component_id'])) {
            $model->componentId = $map['component_id'];
        }
        if (isset($map['config_id'])) {
            $model->configId = $map['config_id'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['deploy_script_id'])) {
            $model->deployScriptId = $map['deploy_script_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['include_template'])) {
            $model->includeTemplate = $map['include_template'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['stack_id'])) {
            $model->stackId = $map['stack_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
