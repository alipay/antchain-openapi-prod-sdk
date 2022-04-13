<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryAppServiceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 根据应用名称查询，不能为空，不支持一次性查询所有应用，是精准查询，不支持模糊匹配
    /**
     * @var string
     */
    public $appName;

    // 容器服务名
    /**
     * @var string
     */
    public $containerServiceName;

    // 当前页码，从1开始，默认为1
    /**
     * @var int
     */
    public $currentPage;

    // 部署状态
    /**
     * @var string[]
     */
    public $deploymentStates;

    // 所属命名空间
    /**
     * @var string
     */
    public $namespace;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    /**
     * @var string
     */
    public $order;

    // 分页大小，默认为10
    /**
     * @var int
     */
    public $pageSize;

    // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 container_service_name
    /**
     * @var string
     */
    public $queryType;

    // 工作空间组id列表
    /**
     * @var string[]
     */
    public $workspaceGroupNames;
    protected $_name = [
        'authToken'            => 'auth_token',
        'appName'              => 'app_name',
        'containerServiceName' => 'container_service_name',
        'currentPage'          => 'current_page',
        'deploymentStates'     => 'deployment_states',
        'namespace'            => 'namespace',
        'order'                => 'order',
        'pageSize'             => 'page_size',
        'queryType'            => 'query_type',
        'workspaceGroupNames'  => 'workspace_group_names',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->deploymentStates) {
            $res['deployment_states'] = $this->deploymentStates;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->order) {
            $res['order'] = $this->order;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->workspaceGroupNames) {
            $res['workspace_group_names'] = $this->workspaceGroupNames;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppServiceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['deployment_states'])) {
            if (!empty($map['deployment_states'])) {
                $model->deploymentStates = $map['deployment_states'];
            }
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['order'])) {
            $model->order = $map['order'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['workspace_group_names'])) {
            if (!empty($map['workspace_group_names'])) {
                $model->workspaceGroupNames = $map['workspace_group_names'];
            }
        }

        return $model;
    }
}
