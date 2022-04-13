<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsGroupTaskProgress extends Model
{
    // 任务码
    /**
     * @example DISABLE_LB_TRAFFIC
     *
     * @var string
     */
    public $actionCode;

    // 任务名称
    /**
     * @example LB摘流
     *
     * @var string
     */
    public $actionName;

    // 任务状态
    /**
     * @example SUCCEEDED
     *
     * @var string
     */
    public $state;

    // 任务开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startedTime;

    // 任务结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $finishedTime;
    protected $_name = [
        'actionCode'   => 'action_code',
        'actionName'   => 'action_name',
        'state'        => 'state',
        'startedTime'  => 'started_time',
        'finishedTime' => 'finished_time',
    ];

    public function validate()
    {
        Model::validateRequired('actionCode', $this->actionCode, true);
        Model::validateRequired('actionName', $this->actionName, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('startedTime', $this->startedTime, true);
        Model::validateRequired('finishedTime', $this->finishedTime, true);
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->actionCode) {
            $res['action_code'] = $this->actionCode;
        }
        if (null !== $this->actionName) {
            $res['action_name'] = $this->actionName;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->startedTime) {
            $res['started_time'] = $this->startedTime;
        }
        if (null !== $this->finishedTime) {
            $res['finished_time'] = $this->finishedTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsGroupTaskProgress
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['action_code'])) {
            $model->actionCode = $map['action_code'];
        }
        if (isset($map['action_name'])) {
            $model->actionName = $map['action_name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['started_time'])) {
            $model->startedTime = $map['started_time'];
        }
        if (isset($map['finished_time'])) {
            $model->finishedTime = $map['finished_time'];
        }

        return $model;
    }
}
