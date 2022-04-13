<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ExportOpsplanStagesRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 容器服务列表
    /**
     * @var ContainerServiceOperation
     */
    public $containerService;

    // Pod分组策略。
    /**
     * @var string
     */
    public $groupStrategy;

    // 工作空间组名称
    /**
     * @var string
     */
    public $workspaceGroupName;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 目前支持：REBOOT | REPLACE | DEPLOY | SCALEINOUT，其余默认DEPLOY
    /**
     * @var string
     */
    public $operation;

    // 最小分组数
    /**
     * @var int
     */
    public $groupAmount;

    // 每个分组的最大涉及变更pod个数
    /**
     * @var int
     */
    public $maxGroupCapacity;

    // 是否开启beta分组，目前仅在扩缩容场景下使用，默认false
    /**
     * @var bool
     */
    public $needBeta;
    protected $_name = [
        'authToken'          => 'auth_token',
        'containerService'   => 'container_service',
        'groupStrategy'      => 'group_strategy',
        'workspaceGroupName' => 'workspace_group_name',
        'namespace'          => 'namespace',
        'operation'          => 'operation',
        'groupAmount'        => 'group_amount',
        'maxGroupCapacity'   => 'max_group_capacity',
        'needBeta'           => 'need_beta',
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
        if (null !== $this->containerService) {
            $res['container_service'] = null !== $this->containerService ? $this->containerService->toMap() : null;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->workspaceGroupName) {
            $res['workspace_group_name'] = $this->workspaceGroupName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }
        if (null !== $this->groupAmount) {
            $res['group_amount'] = $this->groupAmount;
        }
        if (null !== $this->maxGroupCapacity) {
            $res['max_group_capacity'] = $this->maxGroupCapacity;
        }
        if (null !== $this->needBeta) {
            $res['need_beta'] = $this->needBeta;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportOpsplanStagesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['container_service'])) {
            $model->containerService = ContainerServiceOperation::fromMap($map['container_service']);
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['workspace_group_name'])) {
            $model->workspaceGroupName = $map['workspace_group_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }
        if (isset($map['group_amount'])) {
            $model->groupAmount = $map['group_amount'];
        }
        if (isset($map['max_group_capacity'])) {
            $model->maxGroupCapacity = $map['max_group_capacity'];
        }
        if (isset($map['need_beta'])) {
            $model->needBeta = $map['need_beta'];
        }

        return $model;
    }
}
