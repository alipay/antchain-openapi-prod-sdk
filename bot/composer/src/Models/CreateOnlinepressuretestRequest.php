<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateOnlinepressuretestRequest extends Model
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

    // 产线压测任务对象
    //
    /**
     * @var OnlinePressureTestTask
     */
    public $testTask;

    // 项目ID
    /**
     * @var string
     */
    public $projectId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'testTask'          => 'test_task',
        'projectId'         => 'project_id',
    ];

    public function validate()
    {
        Model::validateRequired('testTask', $this->testTask, true);
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
        if (null !== $this->testTask) {
            $res['test_task'] = null !== $this->testTask ? $this->testTask->toMap() : null;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateOnlinepressuretestRequest
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
        if (isset($map['test_task'])) {
            $model->testTask = OnlinePressureTestTask::fromMap($map['test_task']);
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }

        return $model;
    }
}
