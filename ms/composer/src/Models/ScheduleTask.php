<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class ScheduleTask extends Model
{
    // 系统名称
    /**
     * @example undefined
     *
     * @var string
     */
    public $appName;

    // cron 表达式
    /**
     * @example undefined
     *
     * @var string
     */
    public $cronexp;

    // 任务拆分个数
    /**
     * @example undefined
     *
     * @var int
     */
    public $divideCount;

    // 任务id
    /**
     * @example undefined
     *
     * @var string
     */
    public $id;

    // 任务加载上限
    /**
     * @example undefined
     *
     * @var int
     */
    public $maxLoad;

    // 任务名称
    /**
     * @example undefined
     *
     * @var string
     */
    public $name;

    // 调度任务优先级
    /**
     * @example undefined
     *
     * @var string
     */
    public $priority;

    // 关联的策略名称
    /**
     * @example undefined
     *
     * @var string
     */
    public $strategyName;

    // 调度任务关联的机房信息
    /**
     * @example undefined
     *
     * @var TaskIdc[]
     */
    public $taskIdcs;

    // 调度任务类型
    /**
     * @example undefined
     *
     * @var string
     */
    public $taskType;
    protected $_name = [
        'appName'      => 'app_name',
        'cronexp'      => 'cronexp',
        'divideCount'  => 'divide_count',
        'id'           => 'id',
        'maxLoad'      => 'max_load',
        'name'         => 'name',
        'priority'     => 'priority',
        'strategyName' => 'strategy_name',
        'taskIdcs'     => 'task_idcs',
        'taskType'     => 'task_type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->cronexp) {
            $res['cronexp'] = $this->cronexp;
        }
        if (null !== $this->divideCount) {
            $res['divide_count'] = $this->divideCount;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
            $res['task_idcs'] = [];
            if (null !== $this->taskIdcs && \is_array($this->taskIdcs)) {
                $n = 0;
                foreach ($this->taskIdcs as $item) {
                    $res['task_idcs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->taskType) {
            $res['task_type'] = $this->taskType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ScheduleTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['cronexp'])) {
            $model->cronexp = $map['cronexp'];
        }
        if (isset($map['divide_count'])) {
            $model->divideCount = $map['divide_count'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
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
            if (!empty($map['task_idcs'])) {
                $model->taskIdcs = [];
                $n               = 0;
                foreach ($map['task_idcs'] as $item) {
                    $model->taskIdcs[$n++] = null !== $item ? TaskIdc::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['task_type'])) {
            $model->taskType = $map['task_type'];
        }

        return $model;
    }
}
