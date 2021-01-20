<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\RetryInfo;

class RetryMachinetaskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'machineId' => 'machine_id',
        'retryInfo' => 'retry_info',
        'taskId' => 'task_id',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->machineId) {
            $res['machine_id'] = $this->machineId;
        }
        if (null !== $this->retryInfo) {
            $res['retry_info'] = null !== $this->retryInfo ? $this->retryInfo->toMap() : null;
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
     * @return RetryMachinetaskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['machine_id'])){
            $model->machineId = $map['machine_id'];
        }
        if(isset($map['retry_info'])){
            $model->retryInfo = RetryInfo::fromMap($map['retry_info']);
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

    // 机器 ID
    /**
     * @var string
     */
    public $machineId;

    // retry_info
    /**
     * @var RetryInfo
     */
    public $retryInfo;

    // 任务 ID
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
