<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SkipGrayTaskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'processId' => 'process_id',
        'taskId' => 'task_id',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SkipGrayTaskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['process_id'])){
            $model->processId = $map['process_id'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 进程 ID
    /**
     * @var string
     */
    public $processId;

    // 任务ID
    /**
     * @var string
     */
    public $taskId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
