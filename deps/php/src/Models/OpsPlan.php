<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Pair;
use AntChain\Deps\Models\OpsProcessDefinition;

class OpsPlan extends Model {
    protected $_name = [
        'autoExecution' => 'auto_execution',
        'context' => 'context',
        'description' => 'description',
        'enableNotification' => 'enable_notification',
        'executorId' => 'executor_id',
        'executorName' => 'executor_name',
        'finishedTime' => 'finished_time',
        'id' => 'id',
        'lastOperator' => 'last_operator',
        'messageDetail' => 'message_detail',
        'messageParams' => 'message_params',
        'name' => 'name',
        'opsType' => 'ops_type',
        'processDefinitions' => 'process_definitions',
        'releaseMode' => 'release_mode',
        'rollbackPlanId' => 'rollback_plan_id',
        'standaloneExecutable' => 'standalone_executable',
        'startedTime' => 'started_time',
        'state' => 'state',
        'timeSeriesId' => 'time_series_id',
    ];
    public function validate() {
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->autoExecution) {
            $res['auto_execution'] = $this->autoExecution;
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
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->enableNotification) {
            $res['enable_notification'] = $this->enableNotification;
        }
        if (null !== $this->executorId) {
            $res['executor_id'] = $this->executorId;
        }
        if (null !== $this->executorName) {
            $res['executor_name'] = $this->executorName;
        }
        if (null !== $this->finishedTime) {
            $res['finished_time'] = $this->finishedTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->lastOperator) {
            $res['last_operator'] = $this->lastOperator;
        }
        if (null !== $this->messageDetail) {
            $res['message_detail'] = [];
            if(null !== $this->messageDetail && is_array($this->messageDetail)){
                $n = 0;
                foreach($this->messageDetail as $item){
                    $res['message_detail'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->messageParams) {
            $res['message_params'] = $this->messageParams;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->opsType) {
            $res['ops_type'] = $this->opsType;
        }
        if (null !== $this->processDefinitions) {
            $res['process_definitions'] = [];
            if(null !== $this->processDefinitions && is_array($this->processDefinitions)){
                $n = 0;
                foreach($this->processDefinitions as $item){
                    $res['process_definitions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->releaseMode) {
            $res['release_mode'] = $this->releaseMode;
        }
        if (null !== $this->rollbackPlanId) {
            $res['rollback_plan_id'] = $this->rollbackPlanId;
        }
        if (null !== $this->standaloneExecutable) {
            $res['standalone_executable'] = $this->standaloneExecutable;
        }
        if (null !== $this->startedTime) {
            $res['started_time'] = $this->startedTime;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsPlan
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auto_execution'])){
            $model->autoExecution = $map['auto_execution'];
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
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['enable_notification'])){
            $model->enableNotification = $map['enable_notification'];
        }
        if(isset($map['executor_id'])){
            $model->executorId = $map['executor_id'];
        }
        if(isset($map['executor_name'])){
            $model->executorName = $map['executor_name'];
        }
        if(isset($map['finished_time'])){
            $model->finishedTime = $map['finished_time'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['last_operator'])){
            $model->lastOperator = $map['last_operator'];
        }
        if(isset($map['message_detail'])){
            if(!empty($map['message_detail'])){
                $model->messageDetail = [];
                $n = 0;
                foreach($map['message_detail'] as $item) {
                    $model->messageDetail[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['message_params'])){
            $model->messageParams = $map['message_params'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['ops_type'])){
            $model->opsType = $map['ops_type'];
        }
        if(isset($map['process_definitions'])){
            if(!empty($map['process_definitions'])){
                $model->processDefinitions = [];
                $n = 0;
                foreach($map['process_definitions'] as $item) {
                    $model->processDefinitions[$n++] = null !== $item ? OpsProcessDefinition::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['release_mode'])){
            $model->releaseMode = $map['release_mode'];
        }
        if(isset($map['rollback_plan_id'])){
            $model->rollbackPlanId = $map['rollback_plan_id'];
        }
        if(isset($map['standalone_executable'])){
            $model->standaloneExecutable = $map['standalone_executable'];
        }
        if(isset($map['started_time'])){
            $model->startedTime = $map['started_time'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['time_series_id'])){
            $model->timeSeriesId = $map['time_series_id'];
        }
        return $model;
    }
    // 是否自动执行
    /**
     * @example true, false
     * @var bool
     */
    public $autoExecution;

    // 上下文
    /**
     * @example 
     * @var Pair[]
     */
    public $context;

    // 描述
    /**
     * @example test
     * @var string
     */
    public $description;

    // 是否开启通知
    /**
     * @example true, false
     * @var bool
     */
    public $enableNotification;

    // 执行人 ID
    /**
     * @example 123
     * @var string
     */
    public $executorId;

    // 执行人
    /**
     * @example test
     * @var string
     */
    public $executorName;

    // 完成时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $finishedTime;

    // ID
    /**
     * @example 123
     * @var string
     */
    public $id;

    // last operator
    /**
     * @example aa
     * @var string
     */
    public $lastOperator;

    // 详情
    /**
     * @example 
     * @var Pair[]
     */
    public $messageDetail;

    // 信息
    /**
     * @example test
     * @var string
     */
    public $messageParams;

    // 名称
    /**
     * @example test
     * @var string
     */
    public $name;

    // 类型
    /**
     * @example DEPLOY
     * @var string
     */
    public $opsType;

    // 发布进程
    /**
     * @example 
     * @var OpsProcessDefinition[]
     */
    public $processDefinitions;

    // release_mode
    /**
     * @example 发布模式
     * @var string
     */
    public $releaseMode;

    // 回滚单ID
    /**
     * @example 123
     * @var string
     */
    public $rollbackPlanId;

    // 是否可独立执行
    /**
     * @example true, false
     * @var bool
     */
    public $standaloneExecutable;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $startedTime;

    // 状态
    /**
     * @example FAILED
     * @var string
     */
    public $state;

    // 发布单 ID
    /**
     * @example 123
     * @var string
     */
    public $timeSeriesId;

}
