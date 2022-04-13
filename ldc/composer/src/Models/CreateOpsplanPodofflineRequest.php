<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateOpsplanPodofflineRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 是否自动执行
    /**
     * @var bool
     */
    public $autoExecute;

    // 运维单扩展信息，jsonStr格式
    /**
     * @var string
     */
    public $context;

    // 容器服务间依赖顺序。 e.g 先发 A，B， 再发C， D {"groups": [{container_services: [{"name": A}, {"name": B}]}, {"container_services": [{"name": C}, {"name": D}]}]}
    /**
     * @var OpsContainerServiceChain
     */
    public $dependency;

    // 在具体分组策略下，每个执行单元（部署单元，机房等）内部的分组个数。
    /**
     * @var int
     */
    public $groupAmount;

    // 用户可自定义分组发布的顺序，结合具体的分组策略并通过指定具体分组维度对应的名称生效。 e.g, 当分组策略为机房时，可以指定先发机房A，再发机房B ["A", "B"]
    /**
     * @var string[]
     */
    public $groupOrders;

    // 分组策略（维度）：
    // - 按部署单元（CELL），按部署单元依次缩容；
    // - 按机房（ZONE），按机房依次缩容；
    // - 按逻辑单元（UNIT），按逻辑单元缩容；
    // - 共分一组（ALL），所有容器一起缩容，仍遵循分组个数控制；
    /**
     * @var string
     */
    public $groupStrategy;

    // 命名空间
    /**
     * @var string
     */
    public $namespace;

    // 是否需要beta卡点
    /**
     * @var bool
     */
    public $needBeta;

    // 限定操作的部署单元
    /**
     * @var string[]
     */
    public $restrictedCells;

    // 限定操作的机房
    /**
     * @var string[]
     */
    public $restrictedZones;

    // 选定的容器服务列表
    /**
     * @var OpsContainerServiceGroup
     */
    public $selectedContainerServices;

    // 缩容指定pod的标题
    /**
     * @var string
     */
    public $title;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'autoExecute'               => 'auto_execute',
        'context'                   => 'context',
        'dependency'                => 'dependency',
        'groupAmount'               => 'group_amount',
        'groupOrders'               => 'group_orders',
        'groupStrategy'             => 'group_strategy',
        'namespace'                 => 'namespace',
        'needBeta'                  => 'need_beta',
        'restrictedCells'           => 'restricted_cells',
        'restrictedZones'           => 'restricted_zones',
        'selectedContainerServices' => 'selected_container_services',
        'title'                     => 'title',
        'workspaceGroup'            => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('groupAmount', $this->groupAmount, true);
        Model::validateRequired('groupStrategy', $this->groupStrategy, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('needBeta', $this->needBeta, true);
        Model::validateRequired('selectedContainerServices', $this->selectedContainerServices, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->autoExecute) {
            $res['auto_execute'] = $this->autoExecute;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->dependency) {
            $res['dependency'] = null !== $this->dependency ? $this->dependency->toMap() : null;
        }
        if (null !== $this->groupAmount) {
            $res['group_amount'] = $this->groupAmount;
        }
        if (null !== $this->groupOrders) {
            $res['group_orders'] = $this->groupOrders;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->needBeta) {
            $res['need_beta'] = $this->needBeta;
        }
        if (null !== $this->restrictedCells) {
            $res['restricted_cells'] = $this->restrictedCells;
        }
        if (null !== $this->restrictedZones) {
            $res['restricted_zones'] = $this->restrictedZones;
        }
        if (null !== $this->selectedContainerServices) {
            $res['selected_container_services'] = null !== $this->selectedContainerServices ? $this->selectedContainerServices->toMap() : null;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOpsplanPodofflineRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['auto_execute'])) {
            $model->autoExecute = $map['auto_execute'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['dependency'])) {
            $model->dependency = OpsContainerServiceChain::fromMap($map['dependency']);
        }
        if (isset($map['group_amount'])) {
            $model->groupAmount = $map['group_amount'];
        }
        if (isset($map['group_orders'])) {
            if (!empty($map['group_orders'])) {
                $model->groupOrders = $map['group_orders'];
            }
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['need_beta'])) {
            $model->needBeta = $map['need_beta'];
        }
        if (isset($map['restricted_cells'])) {
            if (!empty($map['restricted_cells'])) {
                $model->restrictedCells = $map['restricted_cells'];
            }
        }
        if (isset($map['restricted_zones'])) {
            if (!empty($map['restricted_zones'])) {
                $model->restrictedZones = $map['restricted_zones'];
            }
        }
        if (isset($map['selected_container_services'])) {
            $model->selectedContainerServices = OpsContainerServiceGroup::fromMap($map['selected_container_services']);
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
