<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateContainerserviceOperationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 容器服务列表。
    /**
     * @var ContainerServiceOperationList
     */
    public $containerServices;

    // 分组策略：ALL_ONE、EACH_ONE、CELL，默认EACH_ONE
    /**
     * @var string
     */
    public $groupStrategy;

    // 是否自动执行，默认false
    /**
     * @var bool
     */
    public $isAutoExecute;

    // 是否需要beta卡点，默认 true
    /**
     * @var bool
     */
    public $isNeedBeta;

    // 所属命名空间
    /**
     * @var string
     */
    public $namespace;

    // 运维类型：重启等
    /**
     * @var string
     */
    public $opsMode;

    // 默认值：CLOUD_NATIVE_OPERATION
    /**
     * @var string
     */
    public $opsType;

    // 运维单名称
    /**
     * @var string
     */
    public $title;

    // 所属工作空间组名称。
    /**
     * @var string
     */
    public $workspaceGroup;

    // 在具体分组策略下，每个执行单元（部署单元，机房等）内部的分组个数。
    /**
     * @var int
     */
    public $groupAmount;

    // 审批人账号id，暂时不支持
    /**
     * @var string[]
     */
    public $assigneeIds;

    // 操作人账号，lks1.23.0才支持
    /**
     * @var string
     */
    public $operator;

    // [huanyu场景使用]huanyu变更单id
    /**
     * @var string
     */
    public $huanyuExecNo;

    // 每个批次最大涉及变更的pod个数
    /**
     * @var int
     */
    public $maxGroupCapacity;

    // 每个部署单元单批次变更pod数量百分比，仅当group_strategey为ALL_CELL_PERCENTAGE时生效
    /**
     * @var int
     */
    public $maxCellPodPercentage;
    protected $_name = [
        'authToken'            => 'auth_token',
        'containerServices'    => 'container_services',
        'groupStrategy'        => 'group_strategy',
        'isAutoExecute'        => 'is_auto_execute',
        'isNeedBeta'           => 'is_need_beta',
        'namespace'            => 'namespace',
        'opsMode'              => 'ops_mode',
        'opsType'              => 'ops_type',
        'title'                => 'title',
        'workspaceGroup'       => 'workspace_group',
        'groupAmount'          => 'group_amount',
        'assigneeIds'          => 'assignee_ids',
        'operator'             => 'operator',
        'huanyuExecNo'         => 'huanyu_exec_no',
        'maxGroupCapacity'     => 'max_group_capacity',
        'maxCellPodPercentage' => 'max_cell_pod_percentage',
    ];

    public function validate()
    {
        Model::validateRequired('containerServices', $this->containerServices, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('opsMode', $this->opsMode, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->containerServices) {
            $res['container_services'] = null !== $this->containerServices ? $this->containerServices->toMap() : null;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->isAutoExecute) {
            $res['is_auto_execute'] = $this->isAutoExecute;
        }
        if (null !== $this->isNeedBeta) {
            $res['is_need_beta'] = $this->isNeedBeta;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->opsMode) {
            $res['ops_mode'] = $this->opsMode;
        }
        if (null !== $this->opsType) {
            $res['ops_type'] = $this->opsType;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->groupAmount) {
            $res['group_amount'] = $this->groupAmount;
        }
        if (null !== $this->assigneeIds) {
            $res['assignee_ids'] = $this->assigneeIds;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->huanyuExecNo) {
            $res['huanyu_exec_no'] = $this->huanyuExecNo;
        }
        if (null !== $this->maxGroupCapacity) {
            $res['max_group_capacity'] = $this->maxGroupCapacity;
        }
        if (null !== $this->maxCellPodPercentage) {
            $res['max_cell_pod_percentage'] = $this->maxCellPodPercentage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContainerserviceOperationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['container_services'])) {
            $model->containerServices = ContainerServiceOperationList::fromMap($map['container_services']);
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['is_auto_execute'])) {
            $model->isAutoExecute = $map['is_auto_execute'];
        }
        if (isset($map['is_need_beta'])) {
            $model->isNeedBeta = $map['is_need_beta'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['ops_mode'])) {
            $model->opsMode = $map['ops_mode'];
        }
        if (isset($map['ops_type'])) {
            $model->opsType = $map['ops_type'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['group_amount'])) {
            $model->groupAmount = $map['group_amount'];
        }
        if (isset($map['assignee_ids'])) {
            if (!empty($map['assignee_ids'])) {
                $model->assigneeIds = $map['assignee_ids'];
            }
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['huanyu_exec_no'])) {
            $model->huanyuExecNo = $map['huanyu_exec_no'];
        }
        if (isset($map['max_group_capacity'])) {
            $model->maxGroupCapacity = $map['max_group_capacity'];
        }
        if (isset($map['max_cell_pod_percentage'])) {
            $model->maxCellPodPercentage = $map['max_cell_pod_percentage'];
        }

        return $model;
    }
}
