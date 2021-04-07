<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ExecRequestTaskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // rmc_request_id，注意区分OPENAPI自身的request_id
    /**
     * @var string
     */
    public $rmcRequestId;

    // task_ids
    /**
     * @var string[]
     */
    public $taskIds;
    protected $_name = [
        'authToken'    => 'auth_token',
        'rmcRequestId' => 'rmc_request_id',
        'taskIds'      => 'task_ids',
    ];

    public function validate()
    {
        Model::validateRequired('rmcRequestId', $this->rmcRequestId, true);
        Model::validateRequired('taskIds', $this->taskIds, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->rmcRequestId) {
            $res['rmc_request_id'] = $this->rmcRequestId;
        }
        if (null !== $this->taskIds) {
            $res['task_ids'] = $this->taskIds;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecRequestTaskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['rmc_request_id'])) {
            $model->rmcRequestId = $map['rmc_request_id'];
        }
        if (isset($map['task_ids'])) {
            if (!empty($map['task_ids'])) {
                $model->taskIds = $map['task_ids'];
            }
        }

        return $model;
    }
}
