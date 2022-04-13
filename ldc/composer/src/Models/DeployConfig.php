<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DeployConfig extends Model
{
    // 节点亲和性配置
    /**
     * @example
     *
     * @var AffinityEntity
     */
    public $affinity;

    // annotations
    /**
     * @example mosn.sidecar.k8s.alipay.com/inject:enabled
     *
     * @var string
     */
    public $annotations;

    // 用户自定义标签，将会在pod上生效
    /**
     * @example a=b,c=d
     *
     * @var string
     */
    public $customLabels;

    // 最小分组数
    /**
     * @example 10
     *
     * @var int
     */
    public $groupCount;

    // 容器服务部署分组策略。
    /**
     * @example Quick
     *
     * @var string
     */
    public $groupStrategy;

    // labels
    /**
     * @example "techStack=SOFA,techStackVersion=v1"
     *
     * @var string
     */
    public $labels;

    // 单个分组最大Pod数量。
    /**
     * @example 10
     *
     * @var int
     */
    public $maxGroupCapacity;

    // 是否需要beta confirm。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needBeta;

    // 是否需要分组确认。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needConfirm;

    // 已废弃
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enableSofaMesh;

    // 只支持InPlace
    /**
     * @example InPlace
     *
     * @var string
     */
    public $upgradeStrategy;

    // 分组确认策略，FIRST：第一个分组需要确认，EACH：每个分组都需要确认（默认）
    /**
     * @example FIRST
     *
     * @var string
     */
    public $confirmStrategy;

    // pod name 命名规则，lks 1.23.0 开始支持。Default/PersistentSequence
    /**
     * @example Default
     *
     * @var string
     */
    public $podNamingPolicy;

    // [已废除] 是否开启强制步长控制。对于ALL_ONE, ALL_ONE_CELL_BETA等分组模式，group_count与max_group_capacity字段将生效，提供精细化分组，以满足用户的pod发布并发控制需求
    /**
     * @example true, false
     *
     * @var bool
     */
    public $forceStrideControl;

    // 每个部署单元单批次最大变更pod比例，仅当group_strategy为ALL_CELL_PERCENTAGE时生效
    /**
     * @example 25, 50
     *
     * @var int
     */
    public $maxCellPodPercentage;
    protected $_name = [
        'affinity'             => 'affinity',
        'annotations'          => 'annotations',
        'customLabels'         => 'custom_labels',
        'groupCount'           => 'group_count',
        'groupStrategy'        => 'group_strategy',
        'labels'               => 'labels',
        'maxGroupCapacity'     => 'max_group_capacity',
        'needBeta'             => 'need_beta',
        'needConfirm'          => 'need_confirm',
        'enableSofaMesh'       => 'enable_sofa_mesh',
        'upgradeStrategy'      => 'upgrade_strategy',
        'confirmStrategy'      => 'confirm_strategy',
        'podNamingPolicy'      => 'pod_naming_policy',
        'forceStrideControl'   => 'force_stride_control',
        'maxCellPodPercentage' => 'max_cell_pod_percentage',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->affinity) {
            $res['affinity'] = null !== $this->affinity ? $this->affinity->toMap() : null;
        }
        if (null !== $this->annotations) {
            $res['annotations'] = $this->annotations;
        }
        if (null !== $this->customLabels) {
            $res['custom_labels'] = $this->customLabels;
        }
        if (null !== $this->groupCount) {
            $res['group_count'] = $this->groupCount;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->labels) {
            $res['labels'] = $this->labels;
        }
        if (null !== $this->maxGroupCapacity) {
            $res['max_group_capacity'] = $this->maxGroupCapacity;
        }
        if (null !== $this->needBeta) {
            $res['need_beta'] = $this->needBeta;
        }
        if (null !== $this->needConfirm) {
            $res['need_confirm'] = $this->needConfirm;
        }
        if (null !== $this->enableSofaMesh) {
            $res['enable_sofa_mesh'] = $this->enableSofaMesh;
        }
        if (null !== $this->upgradeStrategy) {
            $res['upgrade_strategy'] = $this->upgradeStrategy;
        }
        if (null !== $this->confirmStrategy) {
            $res['confirm_strategy'] = $this->confirmStrategy;
        }
        if (null !== $this->podNamingPolicy) {
            $res['pod_naming_policy'] = $this->podNamingPolicy;
        }
        if (null !== $this->forceStrideControl) {
            $res['force_stride_control'] = $this->forceStrideControl;
        }
        if (null !== $this->maxCellPodPercentage) {
            $res['max_cell_pod_percentage'] = $this->maxCellPodPercentage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeployConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['affinity'])) {
            $model->affinity = AffinityEntity::fromMap($map['affinity']);
        }
        if (isset($map['annotations'])) {
            $model->annotations = $map['annotations'];
        }
        if (isset($map['custom_labels'])) {
            $model->customLabels = $map['custom_labels'];
        }
        if (isset($map['group_count'])) {
            $model->groupCount = $map['group_count'];
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['labels'])) {
            $model->labels = $map['labels'];
        }
        if (isset($map['max_group_capacity'])) {
            $model->maxGroupCapacity = $map['max_group_capacity'];
        }
        if (isset($map['need_beta'])) {
            $model->needBeta = $map['need_beta'];
        }
        if (isset($map['need_confirm'])) {
            $model->needConfirm = $map['need_confirm'];
        }
        if (isset($map['enable_sofa_mesh'])) {
            $model->enableSofaMesh = $map['enable_sofa_mesh'];
        }
        if (isset($map['upgrade_strategy'])) {
            $model->upgradeStrategy = $map['upgrade_strategy'];
        }
        if (isset($map['confirm_strategy'])) {
            $model->confirmStrategy = $map['confirm_strategy'];
        }
        if (isset($map['pod_naming_policy'])) {
            $model->podNamingPolicy = $map['pod_naming_policy'];
        }
        if (isset($map['force_stride_control'])) {
            $model->forceStrideControl = $map['force_stride_control'];
        }
        if (isset($map['max_cell_pod_percentage'])) {
            $model->maxCellPodPercentage = $map['max_cell_pod_percentage'];
        }

        return $model;
    }
}
