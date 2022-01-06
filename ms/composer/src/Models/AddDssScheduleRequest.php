<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddDssScheduleRequest extends Model
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

    /**
     * @var string
     */
    public $appName;

    /**
     * @var string
     */
    public $cronexp;

    /**
     * @var int
     */
    public $divideCount;

    /**
     * @var string
     */
    public $instanceId;

    /**
     * @var int
     */
    public $maxLoad;

    /**
     * @var string
     */
    public $name;

    /**
     * @var string
     */
    public $priority;

    /**
     * @var string
     */
    public $strategyName;

    /**
     * @var string
     */
    public $taskIdcs;

    /**
     * @var string
     */
    public $taskState;

    /**
     * @var string
     */
    public $taskType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'appName'           => 'app_name',
        'cronexp'           => 'cronexp',
        'divideCount'       => 'divide_count',
        'instanceId'        => 'instance_id',
        'maxLoad'           => 'max_load',
        'name'              => 'name',
        'priority'          => 'priority',
        'strategyName'      => 'strategy_name',
        'taskIdcs'          => 'task_idcs',
        'taskState'         => 'task_state',
        'taskType'          => 'task_type',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('cronexp', $this->cronexp, true);
        Model::validateRequired('divideCount', $this->divideCount, true);
        Model::validateRequired('maxLoad', $this->maxLoad, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('priority', $this->priority, true);
        Model::validateRequired('strategyName', $this->strategyName, true);
        Model::validateRequired('taskIdcs', $this->taskIdcs, true);
        Model::validateRequired('taskState', $this->taskState, true);
        Model::validateRequired('taskType', $this->taskType, true);
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->cronexp) {
            $res['cronexp'] = $this->cronexp;
        }
        if (null !== $this->divideCount) {
            $res['divide_count'] = $this->divideCount;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->maxLoad) {
            $res['max_load'] = $this->maxLoad;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->strategyName) {
            $res['strategy_name'] = $this->strategyName;
        }
        if (null !== $this->taskIdcs) {
            $res['task_idcs'] = $this->taskIdcs;
        }
        if (null !== $this->taskState) {
            $res['task_state'] = $this->taskState;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDssScheduleRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['cronexp'])) {
            $model->cronexp = $map['cronexp'];
        }
        if (isset($map['divide_count'])) {
            $model->divideCount = $map['divide_count'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['max_load'])) {
            $model->maxLoad = $map['max_load'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['strategy_name'])) {
            $model->strategyName = $map['strategy_name'];
        }
        if (isset($map['task_idcs'])) {
            $model->taskIdcs = $map['task_idcs'];
        }
        if (isset($map['task_state'])) {
            $model->taskState = $map['task_state'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }

        return $model;
    }
}
