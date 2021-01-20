<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetCmdTaskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'taskId' => 'task_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetCmdTaskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 异步指令执行的任务ID
    /**
     * @var string
     */
    public $taskId;

}
