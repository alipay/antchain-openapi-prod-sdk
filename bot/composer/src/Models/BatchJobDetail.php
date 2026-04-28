<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BatchJobDetail extends Model
{
    // 批次Id
    /**
     * @example ""
     *
     * @var string
     */
    public $batchId;

    // 批次名称
    /**
     * @example ""
     *
     * @var string
     */
    public $batchName;

    // 批次状态
    /**
     * @example ""
     *
     * @var string
     */
    public $status;

    // 租户Id
    /**
     * @example ""
     *
     * @var int
     */
    public $tenantId;

    // 触发模式
    /**
     * @example ""
     *
     * @var string
     */
    public $triggerMode;

    // 定时执行时间戳
    /**
     * @example 1765794345159
     *
     * @var int
     */
    public $scheduledTime;

    // 实际开始时间戳
    /**
     * @example 1765794345159
     *
     * @var int
     */
    public $actualStartTime;

    // 实际结束时间戳
    /**
     * @example 1765794345159
     *
     * @var int
     */
    public $actualEndTime;

    // 总设备数
    /**
     * @example 1
     *
     * @var int
     */
    public $totalCount;

    // 成功数
    /**
     * @example 1
     *
     * @var int
     */
    public $successCount;

    // 失败数
    /**
     * @example 1
     *
     * @var int
     */
    public $failedCount;

    // 操作人
    /**
     * @example ""
     *
     * @var string
     */
    public $operator;
    protected $_name = [
        'batchId'         => 'batch_id',
        'batchName'       => 'batch_name',
        'status'          => 'status',
        'tenantId'        => 'tenant_id',
        'triggerMode'     => 'trigger_mode',
        'scheduledTime'   => 'scheduled_time',
        'actualStartTime' => 'actual_start_time',
        'actualEndTime'   => 'actual_end_time',
        'totalCount'      => 'total_count',
        'successCount'    => 'success_count',
        'failedCount'     => 'failed_count',
        'operator'        => 'operator',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->batchName) {
            $res['batch_name'] = $this->batchName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->triggerMode) {
            $res['trigger_mode'] = $this->triggerMode;
        }
        if (null !== $this->scheduledTime) {
            $res['scheduled_time'] = $this->scheduledTime;
        }
        if (null !== $this->actualStartTime) {
            $res['actual_start_time'] = $this->actualStartTime;
        }
        if (null !== $this->actualEndTime) {
            $res['actual_end_time'] = $this->actualEndTime;
        }
        if (null !== $this->totalCount) {
            $res['total_count'] = $this->totalCount;
        }
        if (null !== $this->successCount) {
            $res['success_count'] = $this->successCount;
        }
        if (null !== $this->failedCount) {
            $res['failed_count'] = $this->failedCount;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchJobDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['batch_name'])) {
            $model->batchName = $map['batch_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['trigger_mode'])) {
            $model->triggerMode = $map['trigger_mode'];
        }
        if (isset($map['scheduled_time'])) {
            $model->scheduledTime = $map['scheduled_time'];
        }
        if (isset($map['actual_start_time'])) {
            $model->actualStartTime = $map['actual_start_time'];
        }
        if (isset($map['actual_end_time'])) {
            $model->actualEndTime = $map['actual_end_time'];
        }
        if (isset($map['total_count'])) {
            $model->totalCount = $map['total_count'];
        }
        if (isset($map['success_count'])) {
            $model->successCount = $map['success_count'];
        }
        if (isset($map['failed_count'])) {
            $model->failedCount = $map['failed_count'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
