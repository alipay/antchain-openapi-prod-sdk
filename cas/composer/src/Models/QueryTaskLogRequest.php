<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryTaskLogRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // execution_times
    /**
     * @var int
     */
    public $executionTimes;

    // task_id
    /**
     * @var string
     */
    public $taskId;
    protected $_name = [
        'authToken'      => 'auth_token',
        'executionTimes' => 'execution_times',
        'taskId'         => 'task_id',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->executionTimes) {
            $res['execution_times'] = $this->executionTimes;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTaskLogRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['execution_times'])) {
            $model->executionTimes = $map['execution_times'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }

        return $model;
    }
}
