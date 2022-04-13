<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryContainerserviceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属应用名称
    /**
     * @var string
     */
    public $appName;

    // 容器服务部署状态。取值可以由多个部署状态组成一个JSON数组，不同状态之间用绊脚逗号(,)隔开，取值范围：
    // . WAITING_FOR_DEPLOY: 待发布
    // . INITIALIZING: 初始化中
    // . INITIALIZED: 初始化完成
    // . INITIALIZE_FAILED: 初始化失败
    // . CONFIRM_WAITING: 待确认
    // . CONFIRMED: 已确认
    // . EXECUTING: 发布中
    // . PAUSED: 暂停
    // . CANCELING: 取消中
    // . CANCELED: 已取消
    // . ROLLBACKING: 回滚中
    // . ROLLBACK_PAUSED: 回滚暂停
    // . ROLLBACKED: 已回滚
    // . SUCCEEDED: 发布完成
    // . FAILED: 发布失败
    // . DELETING: 删除中
    // . DELETE_FAILED: 删除失败
    /**
     * @var string[]
     */
    public $deploymentStatus;

    // 容器服务元数据状态。取值可以由多个元数据状态组成一个JSON数组，不同状态之间用半角逗号（,）隔开。状态取值范围：
    // . DRAFTED: 草稿
    // . CREATING: 创建中
    // . CREATED: 已创建
    // . UPDATING: 更新中
    // . UPDATED: 已更新
    // . DELETING: 删除中
    // . DELETED: 已删除
    // . DEPLOYED: 已发布
    // . CREATE_FAILED: 创建失败
    // . UPDATE_FAILED: 更新失败
    // . DELETE_FAILED: 删除失败
    /**
     * @var string[]
     */
    public $metadataStatus;

    // 容器应用服务名称，支持使用通配符*进行模糊搜索。
    /**
     * @var string
     */
    public $name;

    // 当前命名空间名称。
    /**
     * @var string
     */
    public $namespace;

    // 实例状态列表的页码。起始值：1。默认值：1 。
    /**
     * @var int
     */
    public $pageNumber;

    // 分页查询时设置的每页行数。最大值：100。默认值：10。
    /**
     * @var int
     */
    public $pageSize;

    // 当前工作空间组名称。
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'        => 'auth_token',
        'appName'          => 'app_name',
        'deploymentStatus' => 'deployment_status',
        'metadataStatus'   => 'metadata_status',
        'name'             => 'name',
        'namespace'        => 'namespace',
        'pageNumber'       => 'page_number',
        'pageSize'         => 'page_size',
        'workspaceGroup'   => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
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
        if (null !== $this->deploymentStatus) {
            $res['deployment_status'] = $this->deploymentStatus;
        }
        if (null !== $this->metadataStatus) {
            $res['metadata_status'] = $this->metadataStatus;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContainerserviceRequest
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
        if (isset($map['deployment_status'])) {
            if (!empty($map['deployment_status'])) {
                $model->deploymentStatus = $map['deployment_status'];
            }
        }
        if (isset($map['metadata_status'])) {
            if (!empty($map['metadata_status'])) {
                $model->metadataStatus = $map['metadata_status'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
