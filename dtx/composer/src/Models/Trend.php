<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class Trend extends Model
{
    // 分支事务数趋势图
    /**
     * @example
     *
     * @var ActionTrend[]
     */
    public $actionTrend;

    // 主事务数趋势图
    /**
     * @example
     *
     * @var ActivityTrend[]
     */
    public $activityTrend;

    // 事务失败数趋势图
    /**
     * @example
     *
     * @var ExceptionTrend[]
     */
    public $exceptionTrend;
    protected $_name = [
        'actionTrend'    => 'action_trend',
        'activityTrend'  => 'activity_trend',
        'exceptionTrend' => 'exception_trend',
    ];

    public function validate()
    {
        Model::validateRequired('actionTrend', $this->actionTrend, true);
        Model::validateRequired('activityTrend', $this->activityTrend, true);
        Model::validateRequired('exceptionTrend', $this->exceptionTrend, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionTrend) {
            $res['action_trend'] = [];
            if (null !== $this->actionTrend && \is_array($this->actionTrend)) {
                $n = 0;
                foreach ($this->actionTrend as $item) {
                    $res['action_trend'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->activityTrend) {
            $res['activity_trend'] = [];
            if (null !== $this->activityTrend && \is_array($this->activityTrend)) {
                $n = 0;
                foreach ($this->activityTrend as $item) {
                    $res['activity_trend'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->exceptionTrend) {
            $res['exception_trend'] = [];
            if (null !== $this->exceptionTrend && \is_array($this->exceptionTrend)) {
                $n = 0;
                foreach ($this->exceptionTrend as $item) {
                    $res['exception_trend'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Trend
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_trend'])) {
            if (!empty($map['action_trend'])) {
                $model->actionTrend = [];
                $n                  = 0;
                foreach ($map['action_trend'] as $item) {
                    $model->actionTrend[$n++] = null !== $item ? ActionTrend::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['activity_trend'])) {
            if (!empty($map['activity_trend'])) {
                $model->activityTrend = [];
                $n                    = 0;
                foreach ($map['activity_trend'] as $item) {
                    $model->activityTrend[$n++] = null !== $item ? ActivityTrend::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['exception_trend'])) {
            if (!empty($map['exception_trend'])) {
                $model->exceptionTrend = [];
                $n                     = 0;
                foreach ($map['exception_trend'] as $item) {
                    $model->exceptionTrend[$n++] = null !== $item ? ExceptionTrend::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
