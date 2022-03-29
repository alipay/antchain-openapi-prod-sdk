<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SloSpec extends Model
{
    // 是否开启
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enable;

    // 是否是常驻任务
    /**
     * @example true, false
     *
     * @var bool
     */
    public $longRunningTask;

    // 默认可接受执行时间
    /**
     * @example 10
     *
     * @var int
     */
    public $defaultAcceptableExecutionInterval;
    protected $_name = [
        'enable'                             => 'enable',
        'longRunningTask'                    => 'long_running_task',
        'defaultAcceptableExecutionInterval' => 'default_acceptable_execution_interval',
    ];

    public function validate()
    {
        Model::validateRequired('enable', $this->enable, true);
        Model::validateRequired('longRunningTask', $this->longRunningTask, true);
        Model::validateRequired('defaultAcceptableExecutionInterval', $this->defaultAcceptableExecutionInterval, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->longRunningTask) {
            $res['long_running_task'] = $this->longRunningTask;
        }
        if (null !== $this->defaultAcceptableExecutionInterval) {
            $res['default_acceptable_execution_interval'] = $this->defaultAcceptableExecutionInterval;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SloSpec
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enable'])) {
            $model->enable = $map['enable'];
        }
        if (isset($map['long_running_task'])) {
            $model->longRunningTask = $map['long_running_task'];
        }
        if (isset($map['default_acceptable_execution_interval'])) {
            $model->defaultAcceptableExecutionInterval = $map['default_acceptable_execution_interval'];
        }

        return $model;
    }
}
