<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class FaultToleranceConfigs extends Model
{
    // 异常类型值
    /**
     * @example ["500","401"]
     *
     * @var string[]
     */
    public $exceptionTypes;

    // 时间窗口
    /**
     * @example 10
     *
     * @var int
     */
    public $timeWindow;

    // 时间窗口内最少调用次数
    /**
     * @example 10
     *
     * @var int
     */
    public $leastWindowCount;

    // 最大隔离数量
    /**
     * @example 10
     *
     * @var int
     */
    public $maxIpCount;

    // 异常比例倍数
    /**
     * @example 2
     *
     * @var int
     */
    public $exceptionRateMultiple;

    // 异常比例阈值
    /**
     * @example 20
     *
     * @var int
     */
    public $leastExceptionRate;
    protected $_name = [
        'exceptionTypes'        => 'exception_types',
        'timeWindow'            => 'time_window',
        'leastWindowCount'      => 'least_window_count',
        'maxIpCount'            => 'max_ip_count',
        'exceptionRateMultiple' => 'exception_rate_multiple',
        'leastExceptionRate'    => 'least_exception_rate',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->exceptionTypes) {
            $res['exception_types'] = $this->exceptionTypes;
        }
        if (null !== $this->timeWindow) {
            $res['time_window'] = $this->timeWindow;
        }
        if (null !== $this->leastWindowCount) {
            $res['least_window_count'] = $this->leastWindowCount;
        }
        if (null !== $this->maxIpCount) {
            $res['max_ip_count'] = $this->maxIpCount;
        }
        if (null !== $this->exceptionRateMultiple) {
            $res['exception_rate_multiple'] = $this->exceptionRateMultiple;
        }
        if (null !== $this->leastExceptionRate) {
            $res['least_exception_rate'] = $this->leastExceptionRate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaultToleranceConfigs
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['exception_types'])) {
            if (!empty($map['exception_types'])) {
                $model->exceptionTypes = $map['exception_types'];
            }
        }
        if (isset($map['time_window'])) {
            $model->timeWindow = $map['time_window'];
        }
        if (isset($map['least_window_count'])) {
            $model->leastWindowCount = $map['least_window_count'];
        }
        if (isset($map['max_ip_count'])) {
            $model->maxIpCount = $map['max_ip_count'];
        }
        if (isset($map['exception_rate_multiple'])) {
            $model->exceptionRateMultiple = $map['exception_rate_multiple'];
        }
        if (isset($map['least_exception_rate'])) {
            $model->leastExceptionRate = $map['least_exception_rate'];
        }

        return $model;
    }
}
