<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OpsComputerTask extends Model
{
    // 任务描述
    /**
     * @example
     *
     * @var string
     */
    public $description;

    // 执行详情。如果任务成功，为执行日志；如果任务失败，为错误信息
    /**
     * @example
     *
     * @var string
     */
    public $executeDetails;

    // 任务结束时间
    /**
     * @example
     *
     * @var string
     */
    public $finishTime;

    // 任务名称
    /**
     * @example
     *
     * @var string
     */
    public $name;

    // 任务开始时间
    /**
     * @example
     *
     * @var string
     */
    public $startTime;

    // 任务状态。取值列表： EXECUTING：执行中； SUCCESS：执行成功； FAILED：执行失败
    /**
     * @example
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'description'    => 'description',
        'executeDetails' => 'execute_details',
        'finishTime'     => 'finish_time',
        'name'           => 'name',
        'startTime'      => 'start_time',
        'status'         => 'status',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->executeDetails) {
            $res['execute_details'] = $this->executeDetails;
        }
        if (null !== $this->finishTime) {
            $res['finish_time'] = $this->finishTime;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsComputerTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['execute_details'])) {
            $model->executeDetails = $map['execute_details'];
        }
        if (isset($map['finish_time'])) {
            $model->finishTime = $map['finish_time'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
