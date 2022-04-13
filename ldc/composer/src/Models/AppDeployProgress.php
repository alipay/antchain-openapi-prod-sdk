<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppDeployProgress extends Model
{
    // 应用发布所需要组件列表
    /**
     * @example
     *
     * @var string[]
     */
    public $componentList;

    // 应用发布分组列表
    /**
     * @example
     *
     * @var AppDeployGroup[]
     */
    public $executeGroups;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $finishTime;

    // service id
    /**
     * @example 0000000103873151
     *
     * @var string
     */
    public $id;

    // 当前应用是否是一个回滚的应用
    /**
     * @example true,false
     *
     * @var bool
     */
    public $isRollBack;

    // 发布进度pod状态统计数据
    /**
     * @example
     *
     * @var AppDeployPodStateSummary
     */
    public $podStateSummary;

    // 后置任务列表
    /**
     * @example
     *
     * @var AppDeployTask[]
     */
    public $postTasks;

    // 前置任务列表
    /**
     * @example
     *
     * @var AppDeployTask[]
     */
    public $preTasks;

    // 当前服务关联的一个回滚服务的id，如果该值不为空则表示当前服务被回滚过
    /**
     * @example 0000000103873152
     *
     * @var string
     */
    public $rollBackServiceId;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 当前发布状态
    /**
     * @example INITIALIZED, EXECUTING,CONFIRM_WAITING, SUCCEEDED, FAILED
     *
     * @var string
     */
    public $state;

    // 容器服务命名空间
    /**
     * @example dev
     *
     * @var string
     */
    public $namespace;

    // 错误信息
    /**
     * @example ok
     *
     * @var string
     */
    public $message;

    // task id
    /**
     * @example 0000000001218013
     *
     * @var string
     */
    public $taskId;

    // 操作code
    /**
     * @example POD_GROUP_RELEASE
     *
     * @var string
     */
    public $actionCode;
    protected $_name = [
        'componentList'     => 'component_list',
        'executeGroups'     => 'execute_groups',
        'finishTime'        => 'finish_time',
        'id'                => 'id',
        'isRollBack'        => 'is_roll_back',
        'podStateSummary'   => 'pod_state_summary',
        'postTasks'         => 'post_tasks',
        'preTasks'          => 'pre_tasks',
        'rollBackServiceId' => 'roll_back_service_id',
        'startTime'         => 'start_time',
        'state'             => 'state',
        'namespace'         => 'namespace',
        'message'           => 'message',
        'taskId'            => 'task_id',
        'actionCode'        => 'action_code',
    ];

    public function validate()
    {
        Model::validateRequired('componentList', $this->componentList, true);
        Model::validateRequired('executeGroups', $this->executeGroups, true);
        Model::validateRequired('finishTime', $this->finishTime, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('isRollBack', $this->isRollBack, true);
        Model::validateRequired('podStateSummary', $this->podStateSummary, true);
        Model::validateRequired('postTasks', $this->postTasks, true);
        Model::validateRequired('preTasks', $this->preTasks, true);
        Model::validateRequired('startTime', $this->startTime, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validatePattern('finishTime', $this->finishTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->componentList) {
            $res['component_list'] = $this->componentList;
        }
        if (null !== $this->executeGroups) {
            $res['execute_groups'] = [];
            if (null !== $this->executeGroups && \is_array($this->executeGroups)) {
                $n = 0;
                foreach ($this->executeGroups as $item) {
                    $res['execute_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->finishTime) {
            $res['finish_time'] = $this->finishTime;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isRollBack) {
            $res['is_roll_back'] = $this->isRollBack;
        }
        if (null !== $this->podStateSummary) {
            $res['pod_state_summary'] = null !== $this->podStateSummary ? $this->podStateSummary->toMap() : null;
        }
        if (null !== $this->postTasks) {
            $res['post_tasks'] = [];
            if (null !== $this->postTasks && \is_array($this->postTasks)) {
                $n = 0;
                foreach ($this->postTasks as $item) {
                    $res['post_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->preTasks) {
            $res['pre_tasks'] = [];
            if (null !== $this->preTasks && \is_array($this->preTasks)) {
                $n = 0;
                foreach ($this->preTasks as $item) {
                    $res['pre_tasks'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->rollBackServiceId) {
            $res['roll_back_service_id'] = $this->rollBackServiceId;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDeployProgress
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['component_list'])) {
            if (!empty($map['component_list'])) {
                $model->componentList = $map['component_list'];
            }
        }
        if (isset($map['execute_groups'])) {
            if (!empty($map['execute_groups'])) {
                $model->executeGroups = [];
                $n                    = 0;
                foreach ($map['execute_groups'] as $item) {
                    $model->executeGroups[$n++] = null !== $item ? AppDeployGroup::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['finish_time'])) {
            $model->finishTime = $map['finish_time'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['is_roll_back'])) {
            $model->isRollBack = $map['is_roll_back'];
        }
        if (isset($map['pod_state_summary'])) {
            $model->podStateSummary = AppDeployPodStateSummary::fromMap($map['pod_state_summary']);
        }
        if (isset($map['post_tasks'])) {
            if (!empty($map['post_tasks'])) {
                $model->postTasks = [];
                $n                = 0;
                foreach ($map['post_tasks'] as $item) {
                    $model->postTasks[$n++] = null !== $item ? AppDeployTask::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['pre_tasks'])) {
            if (!empty($map['pre_tasks'])) {
                $model->preTasks = [];
                $n               = 0;
                foreach ($map['pre_tasks'] as $item) {
                    $model->preTasks[$n++] = null !== $item ? AppDeployTask::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['roll_back_service_id'])) {
            $model->rollBackServiceId = $map['roll_back_service_id'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }

        return $model;
    }
}
