<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryQmpOfflinehostplanDecisionresultsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 任务串联任务id
    /**
     * @var string
     */
    public $taskUuid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskUuid'          => 'task_uuid',
    ];

    public function validate()
    {
        Model::validateRequired('taskUuid', $this->taskUuid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->taskUuid) {
            $res['task_uuid'] = $this->taskUuid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQmpOfflinehostplanDecisionresultsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['task_uuid'])) {
            $model->taskUuid = $map['task_uuid'];
        }

        return $model;
    }
}
