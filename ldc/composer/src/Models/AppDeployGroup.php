<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppDeployGroup extends Model
{
    // 发布任务
    /**
     * @example
     *
     * @var AppDeployTask
     */
    public $deployTask;

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
    protected $_name = [
        'deployTask' => 'deploy_task',
        'postTasks'  => 'post_tasks',
        'preTasks'   => 'pre_tasks',
    ];

    public function validate()
    {
        Model::validateRequired('deployTask', $this->deployTask, true);
        Model::validateRequired('postTasks', $this->postTasks, true);
        Model::validateRequired('preTasks', $this->preTasks, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deployTask) {
            $res['deploy_task'] = null !== $this->deployTask ? $this->deployTask->toMap() : null;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDeployGroup
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['deploy_task'])) {
            $model->deployTask = AppDeployTask::fromMap($map['deploy_task']);
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

        return $model;
    }
}
