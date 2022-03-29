<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class JobRecordDTO extends Model
{
    // 结束时间
    /**
     * @example 2018-10-10T10:10:00
     *
     * @var string
     */
    public $end;

    // 任务执行id
    /**
     * @example 123234-34232-13414
     *
     * @var string
     */
    public $id;

    // 执行总进度
    //
    // 总的进度为100，这里的进度条如何配置需要，前端同学定一下，我来改
    /**
     * @example 60
     *
     * @var int
     */
    public $progress;

    // 任务执行状态
    /**
     * @example 执行成功
     *
     * @var string
     */
    public $runType;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00
     *
     * @var string
     */
    public $start;

    // 任务执行记录集合
    /**
     * @example
     *
     * @var TaskRecordDTO[]
     */
    public $taskRecords;

    // 执行耗时
    /**
     * @example 60
     *
     * @var int
     */
    public $time;

    // 触发类型
    /**
     * @example 自动
     *
     * @var string
     */
    public $triggerType;

    // 分区信息
    /**
     * @example dt=20201021
     *
     * @var string
     */
    public $partition;

    // 触发上下文
    /**
     * @example {"sourcePartition":"dt=20220101", "sinkPartition": "xxd"}
     *
     * @var string
     */
    public $context;
    protected $_name = [
        'end'         => 'end',
        'id'          => 'id',
        'progress'    => 'progress',
        'runType'     => 'run_type',
        'start'       => 'start',
        'taskRecords' => 'task_records',
        'time'        => 'time',
        'triggerType' => 'trigger_type',
        'partition'   => 'partition',
        'context'     => 'context',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('progress', $this->progress, true);
        Model::validateRequired('runType', $this->runType, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('taskRecords', $this->taskRecords, true);
        Model::validateRequired('triggerType', $this->triggerType, true);
        Model::validateRequired('partition', $this->partition, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->progress) {
            $res['progress'] = $this->progress;
        }
        if (null !== $this->runType) {
            $res['run_type'] = $this->runType;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->taskRecords) {
            $res['task_records'] = [];
            if (null !== $this->taskRecords && \is_array($this->taskRecords)) {
                $n = 0;
                foreach ($this->taskRecords as $item) {
                    $res['task_records'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->triggerType) {
            $res['trigger_type'] = $this->triggerType;
        }
        if (null !== $this->partition) {
            $res['partition'] = $this->partition;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JobRecordDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['progress'])) {
            $model->progress = $map['progress'];
        }
        if (isset($map['run_type'])) {
            $model->runType = $map['run_type'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['task_records'])) {
            if (!empty($map['task_records'])) {
                $model->taskRecords = [];
                $n                  = 0;
                foreach ($map['task_records'] as $item) {
                    $model->taskRecords[$n++] = null !== $item ? TaskRecordDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['trigger_type'])) {
            $model->triggerType = $map['trigger_type'];
        }
        if (isset($map['partition'])) {
            $model->partition = $map['partition'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }

        return $model;
    }
}
