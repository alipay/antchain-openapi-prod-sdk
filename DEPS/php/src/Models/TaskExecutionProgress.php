<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class TaskExecutionProgress extends Model {
    protected $_name = [
        'name' => 'name',
        'showName' => 'show_name',
        'businessEntityCode' => 'business_entity_code',
        'errorCode' => 'error_code',
        'state' => 'state',
        'executionCount' => 'execution_count',
        'detailMsg' => 'detail_msg',
        'startedTime' => 'started_time',
        'finishedTime' => 'finished_time',
        'standaloneExecutable' => 'standalone_executable',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('showName', $this->showName, true);
        Model::validateRequired('businessEntityCode', $this->businessEntityCode, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('executionCount', $this->executionCount, true);
        Model::validateRequired('detailMsg', $this->detailMsg, true);
        Model::validateRequired('startedTime', $this->startedTime, true);
        Model::validateRequired('finishedTime', $this->finishedTime, true);
        Model::validateRequired('standaloneExecutable', $this->standaloneExecutable, true);
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->showName) {
            $res['show_name'] = $this->showName;
        }
        if (null !== $this->businessEntityCode) {
            $res['business_entity_code'] = $this->businessEntityCode;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->executionCount) {
            $res['execution_count'] = $this->executionCount;
        }
        if (null !== $this->detailMsg) {
            $res['detail_msg'] = $this->detailMsg;
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
     * @return TaskExecutionProgress
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['show_name'])){
            $model->showName = $map['show_name'];
        }
        if(isset($map['business_entity_code'])){
            $model->businessEntityCode = $map['business_entity_code'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['execution_count'])){
            $model->executionCount = $map['execution_count'];
        }
        if(isset($map['detail_msg'])){
            $model->detailMsg = $map['detail_msg'];
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
    // 任务名
    /**
     * @example aa
     * @var string
     */
    public $name;

    // 显示名
    /**
     * @example aa
     * @var string
     */
    public $showName;

    // 业务类型
    /**
     * @example ARRANGEMENT
     * @var string
     */
    public $businessEntityCode;

    // 错误代码
    /**
     * @example 001
     * @var string
     */
    public $errorCode;

    // 状态
    /**
     * @example FAILED
     * @var string
     */
    public $state;

    // 执行次数
    /**
     * @example 1
     * @var string
     */
    public $executionCount;

    // 详细信息
    /**
     * @example error
     * @var string
     */
    public $detailMsg;

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

    // 是否可独立执行
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
