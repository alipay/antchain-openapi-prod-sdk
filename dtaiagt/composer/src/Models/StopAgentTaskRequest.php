<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class StopAgentTaskRequest extends Model
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

    // 请求内容，内容为 task_event_req 对象的json字符串
    /**
     * @var string
     */
    public $taskEventReq;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'taskEventReq'      => 'task_event_req',
    ];

    public function validate()
    {
        Model::validateRequired('taskEventReq', $this->taskEventReq, true);
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
        if (null !== $this->taskEventReq) {
            $res['task_event_req'] = $this->taskEventReq;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StopAgentTaskRequest
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
        if (isset($map['task_event_req'])) {
            $model->taskEventReq = $map['task_event_req'];
        }

        return $model;
    }
}
