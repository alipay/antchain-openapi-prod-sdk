<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class RollbackContainerserviceDeploymentRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属工作空间组名称
    /**
     * @var string
     */
    public $workspaceGroup;

    // 容器服务名字
    /**
     * @var string
     */
    public $containerServiceName;

    // 所属命名空间名称
    /**
     * @var string
     */
    public $namespace;

    // 回滚的版本
    /**
     * @var string
     */
    public $revision;

    // 部署单ID
    /**
     * @var string
     */
    public $operationId;

    // 操作人账号
    /**
     * @var string
     */
    public $operator;

    // 分组数，默认为3
    /**
     * @var int
     */
    public $groupCount;

    // 回滚时的分组策略，取值为： QUICK：快速分组； EACH_ONE：每台一组； UNIT：按逻辑单元分组； CELL：按部署单元分组； 默认为CELL
    /**
     * @var string
     */
    public $groupStrategy;

    // 回滚原因
    /**
     * @var string
     */
    public $reason;
    protected $_name = [
        'authToken'            => 'auth_token',
        'workspaceGroup'       => 'workspace_group',
        'containerServiceName' => 'container_service_name',
        'namespace'            => 'namespace',
        'revision'             => 'revision',
        'operationId'          => 'operation_id',
        'operator'             => 'operator',
        'groupCount'           => 'group_count',
        'groupStrategy'        => 'group_strategy',
        'reason'               => 'reason',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('revision', $this->revision, true);
        Model::validateRequired('operationId', $this->operationId, true);
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('reason', $this->reason, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->revision) {
            $res['revision'] = $this->revision;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->groupCount) {
            $res['group_count'] = $this->groupCount;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RollbackContainerserviceDeploymentRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['revision'])) {
            $model->revision = $map['revision'];
        }
        if (isset($map['operation_id'])) {
            $model->operationId = $map['operation_id'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['group_count'])) {
            $model->groupCount = $map['group_count'];
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }

        return $model;
    }
}
