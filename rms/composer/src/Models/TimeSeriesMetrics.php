<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TimeSeriesMetrics extends Model
{
    // 开始时间, 毫秒时间戳
    /**
     * @example 1574664720333
     *
     * @var int
     */
    public $startTime;

    // 结束时间, 毫秒时间戳
    /**
     * @example 1574670361400
     *
     * @var int
     */
    public $endTime;

    // 标识 metrics，类似 sql 查询条件
    /**
     * @example [{"key": "app", "value": "foo"}]
     *
     * @var KeyValuePair[]
     */
    public $tags;

    // 指标的分类
    /**
     * @example db
     *
     * @var string
     */
    public $type;

    // Metrics 多个 point 的集合
    /**
     * @example {"values":[{"timestamp":1574664720333,"value":[{"key":"callCount","value":102},{"key":"errorCount","value":1},{"key":"rps","value":12.01}]}]}
     *
     * @var TimeSeriesMetricsPoint[]
     */
    public $values;
    protected $_name = [
        'startTime' => 'start_time',
        'endTime'   => 'end_time',
        'tags'      => 'tags',
        'type'      => 'type',
        'values'    => 'values',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->tags) {
            $res['tags'] = [];
            if (null !== $this->tags && \is_array($this->tags)) {
                $n = 0;
                foreach ($this->tags as $item) {
                    $res['tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->values) {
            $res['values'] = [];
            if (null !== $this->values && \is_array($this->values)) {
                $n = 0;
                foreach ($this->values as $item) {
                    $res['values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TimeSeriesMetrics
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = [];
                $n           = 0;
                foreach ($map['tags'] as $item) {
                    $model->tags[$n++] = null !== $item ? KeyValuePair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = [];
                $n             = 0;
                foreach ($map['values'] as $item) {
                    $model->values[$n++] = null !== $item ? TimeSeriesMetricsPoint::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
