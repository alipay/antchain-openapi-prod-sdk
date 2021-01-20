<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ServiceInfo;
use AntChain\Deps\Models\Pair;
use AntChain\Deps\Models\OpsTargetLegalStates;

class BGReleaseArrangement extends Model {
    protected $_name = [
        'activeUnitId' => 'active_unit_id',
        'deactivatedUnitId' => 'deactivated_unit_id',
        'grayTrafficProcessId' => 'gray_traffic_process_id',
        'rollbackProcessId' => 'rollback_process_id',
        'serviceInfoCollection' => 'service_info_collection',
        'stepType' => 'step_type',
        'unitType' => 'unit_type',
        'name' => 'name',
        'arrangementType' => 'arrangement_type',
        'envConfig' => 'env_config',
        'targetsLegalStates' => 'targets_legal_states',
        'processDefinitionId' => 'process_definition_id',
        'parentId' => 'parent_id',
        'parentEntityType' => 'parent_entity_type',
        'supportedTransitions' => 'supported_transitions',
        'nodeId' => 'node_id',
        'state' => 'state',
        'startedTime' => 'started_time',
        'finishedTime' => 'finished_time',
        'standaloneExecutable' => 'standalone_executable',
        'id' => 'id',
    ];
    public function validate() {
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->activeUnitId) {
            $res['active_unit_id'] = $this->activeUnitId;
        }
        if (null !== $this->deactivatedUnitId) {
            $res['deactivated_unit_id'] = $this->deactivatedUnitId;
        }
        if (null !== $this->grayTrafficProcessId) {
            $res['gray_traffic_process_id'] = $this->grayTrafficProcessId;
        }
        if (null !== $this->rollbackProcessId) {
            $res['rollback_process_id'] = $this->rollbackProcessId;
        }
        if (null !== $this->serviceInfoCollection) {
            $res['service_info_collection'] = [];
            if(null !== $this->serviceInfoCollection && is_array($this->serviceInfoCollection)){
                $n = 0;
                foreach($this->serviceInfoCollection as $item){
                    $res['service_info_collection'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->stepType) {
            $res['step_type'] = $this->stepType;
        }
        if (null !== $this->unitType) {
            $res['unit_type'] = $this->unitType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->arrangementType) {
            $res['arrangement_type'] = $this->arrangementType;
        }
        if (null !== $this->envConfig) {
            $res['env_config'] = [];
            if(null !== $this->envConfig && is_array($this->envConfig)){
                $n = 0;
                foreach($this->envConfig as $item){
                    $res['env_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->targetsLegalStates) {
            $res['targets_legal_states'] = [];
            if(null !== $this->targetsLegalStates && is_array($this->targetsLegalStates)){
                $n = 0;
                foreach($this->targetsLegalStates as $item){
                    $res['targets_legal_states'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->processDefinitionId) {
            $res['process_definition_id'] = $this->processDefinitionId;
        }
        if (null !== $this->parentId) {
            $res['parent_id'] = $this->parentId;
        }
        if (null !== $this->parentEntityType) {
            $res['parent_entity_type'] = $this->parentEntityType;
        }
        if (null !== $this->supportedTransitions) {
            $res['supported_transitions'] = $this->supportedTransitions;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->startedTime) {
            $res['started_time'] = $this->startedTime;
        }
        if (null !== $this->finishedTime) {
            $res['finished_time'] = $this->finishedTime;
        }
        if (null !== $this->standaloneExecutable) {
            $res['standalone_executable'] = $this->standaloneExecutable;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BGReleaseArrangement
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['active_unit_id'])){
            $model->activeUnitId = $map['active_unit_id'];
        }
        if(isset($map['deactivated_unit_id'])){
            $model->deactivatedUnitId = $map['deactivated_unit_id'];
        }
        if(isset($map['gray_traffic_process_id'])){
            $model->grayTrafficProcessId = $map['gray_traffic_process_id'];
        }
        if(isset($map['rollback_process_id'])){
            $model->rollbackProcessId = $map['rollback_process_id'];
        }
        if(isset($map['service_info_collection'])){
            if(!empty($map['service_info_collection'])){
                $model->serviceInfoCollection = [];
                $n = 0;
                foreach($map['service_info_collection'] as $item) {
                    $model->serviceInfoCollection[$n++] = null !== $item ? ServiceInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['step_type'])){
            $model->stepType = $map['step_type'];
        }
        if(isset($map['unit_type'])){
            $model->unitType = $map['unit_type'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['arrangement_type'])){
            $model->arrangementType = $map['arrangement_type'];
        }
        if(isset($map['env_config'])){
            if(!empty($map['env_config'])){
                $model->envConfig = [];
                $n = 0;
                foreach($map['env_config'] as $item) {
                    $model->envConfig[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['targets_legal_states'])){
            if(!empty($map['targets_legal_states'])){
                $model->targetsLegalStates = [];
                $n = 0;
                foreach($map['targets_legal_states'] as $item) {
                    $model->targetsLegalStates[$n++] = null !== $item ? OpsTargetLegalStates::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['process_definition_id'])){
            $model->processDefinitionId = $map['process_definition_id'];
        }
        if(isset($map['parent_id'])){
            $model->parentId = $map['parent_id'];
        }
        if(isset($map['parent_entity_type'])){
            $model->parentEntityType = $map['parent_entity_type'];
        }
        if(isset($map['supported_transitions'])){
            if(!empty($map['supported_transitions'])){
                $model->supportedTransitions = $map['supported_transitions'];
            }
        }
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['started_time'])){
            $model->startedTime = $map['started_time'];
        }
        if(isset($map['finished_time'])){
            $model->finishedTime = $map['finished_time'];
        }
        if(isset($map['standalone_executable'])){
            $model->standaloneExecutable = $map['standalone_executable'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // 活跃单元 ID
    /**
     * @example 123
     * @var string
     */
    public $activeUnitId;

    // 非活跃单元 ID
    /**
     * @example 123
     * @var string
     */
    public $deactivatedUnitId;

    // 灰度进程ID
    /**
     * @example 123
     * @var string
     */
    public $grayTrafficProcessId;

    // 回滚进程ID
    /**
     * @example 123
     * @var string
     */
    public $rollbackProcessId;

    // 发布应用信息集合
    /**
     * @example 
     * @var ServiceInfo[]
     */
    public $serviceInfoCollection;

    // 类型
    /**
     * @example SWITCHOVER_TRAFFIC
     * @var string
     */
    public $stepType;

    // 单元类型
    /**
     * @example ZONE
     * @var string
     */
    public $unitType;

    // 名称
    /**
     * @example aa
     * @var string
     */
    public $name;

    // 类型
    /**
     * @example ONLINE_SERVICE
     * @var string
     */
    public $arrangementType;

    // 环境变量
    /**
     * @example 
     * @var Pair[]
     */
    public $envConfig;

    // 合法状态列表
    /**
     * @example 
     * @var OpsTargetLegalStates[]
     */
    public $targetsLegalStates;

    // 运维进程ID
    /**
     * @example 123
     * @var string
     */
    public $processDefinitionId;

    // 父运维进程ID
    /**
     * @example 123
     * @var string
     */
    public $parentId;

    // 父进程类型
    /**
     * @example aa
     * @var string
     */
    public $parentEntityType;

    // 支持的转换类型
    /**
     * @example SUCCEED_FORWARD
     * @var string[]
     */
    public $supportedTransitions;

    // 流程节点 ID
    /**
     * @example 123
     * @var string
     */
    public $nodeId;

    // 状态
    /**
     * @example FAILED
     * @var string
     */
    public $state;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $startedTime;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $finishedTime;

    // 是否可以独立运行
    /**
     * @example true, false
     * @var bool
     */
    public $standaloneExecutable;

    // ID
    /**
     * @example 123
     * @var string
     */
    public $id;

}
