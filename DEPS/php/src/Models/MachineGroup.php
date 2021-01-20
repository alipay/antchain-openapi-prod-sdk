<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Machine;

class MachineGroup extends Model {
    protected $_name = [
        'name' => 'name',
        'serviceId' => 'service_id',
        'serviceGroupId' => 'service_group_id',
        'serviceGroupCollectionId' => 'service_group_collection_id',
        'arrangementId' => 'arrangement_id',
        'serviceType' => 'service_type',
        'paasServiceId' => 'paas_service_id',
        'needBeta' => 'need_beta',
        'needConfirm' => 'need_confirm',
        'needReserve' => 'need_reserve',
        'needConfirmTraffic' => 'need_confirm_traffic',
        'machines' => 'machines',
        'processDefinitionId' => 'process_definition_id',
        'parentId' => 'parent_id',
        'parentEntityType' => 'parent_entity_type',
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->serviceGroupId) {
            $res['service_group_id'] = $this->serviceGroupId;
        }
        if (null !== $this->serviceGroupCollectionId) {
            $res['service_group_collection_id'] = $this->serviceGroupCollectionId;
        }
        if (null !== $this->arrangementId) {
            $res['arrangement_id'] = $this->arrangementId;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->paasServiceId) {
            $res['paas_service_id'] = $this->paasServiceId;
        }
        if (null !== $this->needBeta) {
            $res['need_beta'] = $this->needBeta;
        }
        if (null !== $this->needConfirm) {
            $res['need_confirm'] = $this->needConfirm;
        }
        if (null !== $this->needReserve) {
            $res['need_reserve'] = $this->needReserve;
        }
        if (null !== $this->needConfirmTraffic) {
            $res['need_confirm_traffic'] = $this->needConfirmTraffic;
        }
        if (null !== $this->machines) {
            $res['machines'] = [];
            if(null !== $this->machines && is_array($this->machines)){
                $n = 0;
                foreach($this->machines as $item){
                    $res['machines'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return MachineGroup
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['service_group_id'])){
            $model->serviceGroupId = $map['service_group_id'];
        }
        if(isset($map['service_group_collection_id'])){
            $model->serviceGroupCollectionId = $map['service_group_collection_id'];
        }
        if(isset($map['arrangement_id'])){
            $model->arrangementId = $map['arrangement_id'];
        }
        if(isset($map['service_type'])){
            $model->serviceType = $map['service_type'];
        }
        if(isset($map['paas_service_id'])){
            $model->paasServiceId = $map['paas_service_id'];
        }
        if(isset($map['need_beta'])){
            $model->needBeta = $map['need_beta'];
        }
        if(isset($map['need_confirm'])){
            $model->needConfirm = $map['need_confirm'];
        }
        if(isset($map['need_reserve'])){
            $model->needReserve = $map['need_reserve'];
        }
        if(isset($map['need_confirm_traffic'])){
            $model->needConfirmTraffic = $map['need_confirm_traffic'];
        }
        if(isset($map['machines'])){
            if(!empty($map['machines'])){
                $model->machines = [];
                $n = 0;
                foreach($map['machines'] as $item) {
                    $model->machines[$n++] = null !== $item ? Machine::fromMap($item) : $item;
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
    // 机器名
    /**
     * @example test
     * @var string
     */
    public $name;

    // 所属发布服务 ID
    /**
     * @example 123
     * @var string
     */
    public $serviceId;

    // 所属发布服务分组 ID
    /**
     * @example 123
     * @var string
     */
    public $serviceGroupId;

    // 发布服务分组集合 ID
    /**
     * @example 123
     * @var string
     */
    public $serviceGroupCollectionId;

    // 概览 ID
    /**
     * @example 123
     * @var string
     */
    public $arrangementId;

    // 服务类型
    /**
     * @example VM
     * @var string
     */
    public $serviceType;

    // paas 服务 ID
    /**
     * @example 123
     * @var string
     */
    public $paasServiceId;

    // 是否 beta 分组
    /**
     * @example true, false
     * @var bool
     */
    public $needBeta;

    // 是否需要确认
    /**
     * @example true, false
     * @var bool
     */
    public $needConfirm;

    // 是否需要分组预确认
    /**
     * @example true, false
     * @var bool
     */
    public $needReserve;

    // 是否需要引流确认
    /**
     * @example true, false
     * @var bool
     */
    public $needConfirmTraffic;

    // 机器信息组
    /**
     * @example 
     * @var Machine[]
     */
    public $machines;

    // pd id
    /**
     * @example 123
     * @var string
     */
    public $processDefinitionId;

    // 父节点 ID
    /**
     * @example 123
     * @var string
     */
    public $parentId;

    // 父节点类型
    /**
     * @example SERVICE
     * @var string
     */
    public $parentEntityType;

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

    // 是否可以独立执行
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
