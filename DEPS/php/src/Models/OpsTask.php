<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Pair;

class OpsTask extends Model {
    protected $_name = [
        'parentGroupId' => 'parent_group_id',
        'serviceId' => 'service_id',
        'arrangementId' => 'arrangement_id',
        'actionHandlerCode' => 'action_handler_code',
        'maxRetryAttempts' => 'max_retry_attempts',
        'context' => 'context',
        'processDefinitionId' => 'process_definition_id',
        'parentId' => 'parent_id',
        'parentEntityType' => 'parent_entity_type',
        'state' => 'state',
        'startedTime' => 'started_time',
        'finishedTime' => 'finished_time',
        'standaloneExecutable' => 'standalone_executable',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('parentGroupId', $this->parentGroupId, true);
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('arrangementId', $this->arrangementId, true);
        Model::validateRequired('actionHandlerCode', $this->actionHandlerCode, true);
        Model::validateRequired('maxRetryAttempts', $this->maxRetryAttempts, true);
        Model::validateRequired('context', $this->context, true);
        Model::validateRequired('processDefinitionId', $this->processDefinitionId, true);
        Model::validateRequired('parentId', $this->parentId, true);
        Model::validateRequired('parentEntityType', $this->parentEntityType, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('startedTime', $this->startedTime, true);
        Model::validateRequired('finishedTime', $this->finishedTime, true);
        Model::validateRequired('standaloneExecutable', $this->standaloneExecutable, true);
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->parentGroupId) {
            $res['parent_group_id'] = $this->parentGroupId;
        }
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->arrangementId) {
            $res['arrangement_id'] = $this->arrangementId;
        }
        if (null !== $this->actionHandlerCode) {
            $res['action_handler_code'] = $this->actionHandlerCode;
        }
        if (null !== $this->maxRetryAttempts) {
            $res['max_retry_attempts'] = $this->maxRetryAttempts;
        }
        if (null !== $this->context) {
            $res['context'] = [];
            if(null !== $this->context && is_array($this->context)){
                $n = 0;
                foreach($this->context as $item){
                    $res['context'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return OpsTask
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['parent_group_id'])){
            $model->parentGroupId = $map['parent_group_id'];
        }
        if(isset($map['service_id'])){
            $model->serviceId = $map['service_id'];
        }
        if(isset($map['arrangement_id'])){
            $model->arrangementId = $map['arrangement_id'];
        }
        if(isset($map['action_handler_code'])){
            $model->actionHandlerCode = $map['action_handler_code'];
        }
        if(isset($map['max_retry_attempts'])){
            $model->maxRetryAttempts = $map['max_retry_attempts'];
        }
        if(isset($map['context'])){
            if(!empty($map['context'])){
                $model->context = [];
                $n = 0;
                foreach($map['context'] as $item) {
                    $model->context[$n++] = null !== $item ? Pair::fromMap($item) : $item;
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
    // parent_group_id
    /**
     * @example parent_group_id
     * @var string
     */
    public $parentGroupId;

    // service_id
    /**
     * @example service_id
     * @var string
     */
    public $serviceId;

    // arrangement_id
    /**
     * @example arrangement_id
     * @var string
     */
    public $arrangementId;

    // action_handler_code
    /**
     * @example action_handler_code
     * @var string
     */
    public $actionHandlerCode;

    // max_retry_attempts
    /**
     * @example 
     * @var int
     */
    public $maxRetryAttempts;

    // context
    /**
     * @example 
     * @var Pair[]
     */
    public $context;

    // process_definition_id
    /**
     * @example process_definition_id
     * @var string
     */
    public $processDefinitionId;

    // parent_id
    /**
     * @example parent_id
     * @var string
     */
    public $parentId;

    // parent_entity_type
    /**
     * @example parent_entity_type
     * @var string
     */
    public $parentEntityType;

    // state
    /**
     * @example state
     * @var string
     */
    public $state;

    // started_time
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $startedTime;

    // finished_time
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $finishedTime;

    // standalone_executable
    /**
     * @example true, false
     * @var bool
     */
    public $standaloneExecutable;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

}
