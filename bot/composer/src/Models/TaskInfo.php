<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TaskInfo extends Model
{
    // 升级计划Id
    /**
     * @example 234
     *
     * @var int
     */
    public $planId;

    // 刷库计划步骤id
    /**
     * @example 234
     *
     * @var int
     */
    public $planStepId;

    // 任务id
    /**
     * @example 234
     *
     * @var int
     */
    public $taskId;

    // action_id
    /**
     * @example 234
     *
     * @var int
     */
    public $actionId;

    // 任务类型
    /**
     * @example 升级，溯源
     *
     * @var string
     */
    public $taskType;
    protected $_name = [
        'planId'     => 'plan_id',
        'planStepId' => 'plan_step_id',
        'taskId'     => 'task_id',
        'actionId'   => 'action_id',
        'taskType'   => 'task_type',
    ];

    public function validate()
    {
        Model::validateMinimum('planId', $this->planId, 0);
        Model::validateMinimum('planStepId', $this->planStepId, 0);
        Model::validateMinimum('taskId', $this->taskId, 0);
        Model::validateMinimum('actionId', $this->actionId, 0);
        Model::validateRequired('taskType', $this->taskType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->planStepId) {
            $res['plan_step_id'] = $this->planStepId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->actionId) {
            $res['action_id'] = $this->actionId;
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['plan_id'])) {
            $model->planId = $map['plan_id'];
        }
        if (isset($map['plan_step_id'])) {
            $model->planStepId = $map['plan_step_id'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['action_id'])) {
            $model->actionId = $map['action_id'];
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }

        return $model;
    }
}
