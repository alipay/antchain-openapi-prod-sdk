<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsTaskExecutionDetail extends Model {
    protected $_name = [
        'taskId' => 'task_id',
        'requestToken' => 'request_token',
        'nodeId' => 'node_id',
        'requestId' => 'request_id',
        'executionCount' => 'execution_count',
        'executionState' => 'execution_state',
        'targetId' => 'target_id',
        'errorCode' => 'error_code',
        'resultMsg' => 'result_msg',
        'startedTime' => 'started_time',
        'finishedTime' => 'finished_time',
        'standaloneExecutable' => 'standalone_executable',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('requestToken', $this->requestToken, true);
        Model::validateRequired('nodeId', $this->nodeId, true);
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('executionCount', $this->executionCount, true);
        Model::validateRequired('executionState', $this->executionState, true);
        Model::validateRequired('targetId', $this->targetId, true);
        Model::validateRequired('errorCode', $this->errorCode, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
        Model::validateRequired('startedTime', $this->startedTime, true);
        Model::validateRequired('finishedTime', $this->finishedTime, true);
        Model::validateRequired('standaloneExecutable', $this->standaloneExecutable, true);
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->requestToken) {
            $res['request_token'] = $this->requestToken;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->executionCount) {
            $res['execution_count'] = $this->executionCount;
        }
        if (null !== $this->executionState) {
            $res['execution_state'] = $this->executionState;
        }
        if (null !== $this->targetId) {
            $res['target_id'] = $this->targetId;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
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
     * @return OpsTaskExecutionDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['request_token'])){
            $model->requestToken = $map['request_token'];
        }
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['execution_count'])){
            $model->executionCount = $map['execution_count'];
        }
        if(isset($map['execution_state'])){
            $model->executionState = $map['execution_state'];
        }
        if(isset($map['target_id'])){
            $model->targetId = $map['target_id'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
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
    // task_id
    /**
     * @example task_id
     * @var string
     */
    public $taskId;

    // request_token
    /**
     * @example request_token
     * @var string
     */
    public $requestToken;

    // node_id
    /**
     * @example node_id
     * @var string
     */
    public $nodeId;

    // request_id
    /**
     * @example request_id
     * @var string
     */
    public $requestId;

    // execution_count
    /**
     * @example 
     * @var int
     */
    public $executionCount;

    // executionState
    /**
     * @example executionState
     * @var string
     */
    public $executionState;

    // target_id
    /**
     * @example target_id
     * @var string
     */
    public $targetId;

    // error_code
    /**
     * @example error_code
     * @var string
     */
    public $errorCode;

    // result_msg
    /**
     * @example result_msg
     * @var string
     */
    public $resultMsg;

    // startedTime
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
