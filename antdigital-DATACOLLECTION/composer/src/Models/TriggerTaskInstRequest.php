<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DATACOLLECTION\Models;

use AlibabaCloud\Tea\Model;

class TriggerTaskInstRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'taskId' => 'task_id',
        'extra' => 'extra',
        'uniqueId' => 'unique_id',
    ];
    public function validate() {
        Model::validateRequired('taskId', $this->taskId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->extra) {
            $res['extra'] = $this->extra;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TriggerTaskInstRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['extra'])){
            $model->extra = $map['extra'];
        }
        if(isset($map['unique_id'])){
            $model->uniqueId = $map['unique_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 任务 id
    /**
     * @var string
     */
    public $taskId;

    // 附加参数
    /**
     * @var string
     */
    public $extra;

    // 幂等 id，若传了，则unique_id=inst_id
    /**
     * @var string
     */
    public $uniqueId;

}
