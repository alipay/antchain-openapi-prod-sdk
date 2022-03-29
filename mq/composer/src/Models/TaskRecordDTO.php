<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class TaskRecordDTO extends Model
{
    // 结束时间
    //
    //
    /**
     * @example 2018-10-10T10:10:00
     *
     * @var string
     */
    public $end;

    // 任务分区名
    /**
     * @example EC_UPDATE_RQGJE
     *
     * @var string
     */
    public $name;

    // 开始时间
    //
    //
    /**
     * @example 2018-10-10T10:10:00
     *
     * @var string
     */
    public $start;

    // 耗时 s
    //
    //
    /**
     * @example 60
     *
     * @var string
     */
    public $time;

    // 任务进度
    //
    //
    /**
     * @example 60
     *
     * @var string
     */
    public $progress;

    // 执行成功，执行失败，执行中
    /**
     * @example 执行成功
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'end'      => 'end',
        'name'     => 'name',
        'start'    => 'start',
        'time'     => 'time',
        'progress' => 'progress',
        'type'     => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('start', $this->start, true);
        Model::validateRequired('progress', $this->progress, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->end) {
            $res['end'] = $this->end;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->start) {
            $res['start'] = $this->start;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->progress) {
            $res['progress'] = $this->progress;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskRecordDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['end'])) {
            $model->end = $map['end'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['start'])) {
            $model->start = $map['start'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['progress'])) {
            $model->progress = $map['progress'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
