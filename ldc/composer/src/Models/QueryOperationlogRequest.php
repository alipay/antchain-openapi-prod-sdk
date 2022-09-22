<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryOperationlogRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 页码。起始值：1。默认值：1。
    /**
     * @var int
     */
    public $pageNo;

    // 分页查询时设置的每页行数。最大值：100，默认值：10。
    /**
     * @var int
     */
    public $pageSize;

    // 实体类型。LDC_PLAN/LDC_SERVICE/POD_CONTAINER
    /**
     * @var string
     */
    public $entityType;

    // 目标id。发布单plan_id或者lks_service_id。
    /**
     * @var string
     */
    public $targetId;

    // 当前工作空间组名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // 集群id，entity_type==POD_CONTAINER 时有用
    /**
     * @var string
     */
    public $clusterId;

    // pod名称，entity_type==POD_CONTAINER 时有用
    /**
     * @var string
     */
    public $podName;

    // 命名空间，entity_type==POD_CONTAINER 时必传
    /**
     * @var string
     */
    public $namespace;
    protected $_name = [
        'authToken'      => 'auth_token',
        'pageNo'         => 'page_no',
        'pageSize'       => 'page_size',
        'entityType'     => 'entity_type',
        'targetId'       => 'target_id',
        'workspaceGroup' => 'workspace_group',
        'clusterId'      => 'cluster_id',
        'podName'        => 'pod_name',
        'namespace'      => 'namespace',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->pageNo) {
            $res['page_no'] = $this->pageNo;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }
        if (null !== $this->targetId) {
            $res['target_id'] = $this->targetId;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->clusterId) {
            $res['cluster_id'] = $this->clusterId;
        }
        if (null !== $this->podName) {
            $res['pod_name'] = $this->podName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOperationlogRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['page_no'])) {
            $model->pageNo = $map['page_no'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['entity_type'])) {
            $model->entityType = $map['entity_type'];
        }
        if (isset($map['target_id'])) {
            $model->targetId = $map['target_id'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['cluster_id'])) {
            $model->clusterId = $map['cluster_id'];
        }
        if (isset($map['pod_name'])) {
            $model->podName = $map['pod_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }

        return $model;
    }
}
