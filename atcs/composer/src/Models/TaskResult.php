<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATCS\Models;

use AlibabaCloud\Tea\Model;

class TaskResult extends Model
{
    // 任务标识
    /**
     * @example 20260204XXXX
     *
     * @var string
     */
    public $taskId;

    // 任务状态，PENDING/待处理，PROGRESS/进行中，COMPLETED/已完成，FAILED/失败，CANCELED/已取消
    /**
     * @example PENDING
     *
     * @var string
     */
    public $taskStatus;

    // 任务提交时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $taskSubmitTime;

    // 交易hash，链上查询使用
    /**
     * @example 0x31b214c9b1ca12609befdd98f7ad6aa47a2d17444825117f56bbf8aa9ab34bb1
     *
     * @var string
     */
    public $txHash;
    protected $_name = [
        'taskId'         => 'task_id',
        'taskStatus'     => 'task_status',
        'taskSubmitTime' => 'task_submit_time',
        'txHash'         => 'tx_hash',
    ];

    public function validate()
    {
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('taskStatus', $this->taskStatus, true);
        Model::validateRequired('taskSubmitTime', $this->taskSubmitTime, true);
        Model::validatePattern('taskSubmitTime', $this->taskSubmitTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->taskStatus) {
            $res['task_status'] = $this->taskStatus;
        }
        if (null !== $this->taskSubmitTime) {
            $res['task_submit_time'] = $this->taskSubmitTime;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['task_id'])) {
            $model->taskId = $map['task_id'];
        }
        if (isset($map['task_status'])) {
            $model->taskStatus = $map['task_status'];
        }
        if (isset($map['task_submit_time'])) {
            $model->taskSubmitTime = $map['task_submit_time'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }

        return $model;
    }
}
