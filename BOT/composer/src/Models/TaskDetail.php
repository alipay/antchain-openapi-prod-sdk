<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class TaskDetail extends Model
{
    // 批次id
    /**
     * @example ""
     *
     * @var string
     */
    public $batchId;

    // tuid
    /**
     * @example ""
     *
     * @var string
     */
    public $tuid;

    // device_name
    /**
     * @example ""
     *
     * @var string
     */
    public $deviceName;

    // 状态
    /**
     * @example ""
     *
     * @var string
     */
    public $status;

    // 调用时间
    /**
     * @example 1765794345159
     *
     * @var int
     */
    public $invokeTime;

    // 错误信息
    /**
     * @example ""
     *
     * @var string
     */
    public $errorMsg;

    // 重试次数
    /**
     * @example 1
     *
     * @var int
     */
    public $retryCount;
    protected $_name = [
        'batchId'    => 'batch_id',
        'tuid'       => 'tuid',
        'deviceName' => 'device_name',
        'status'     => 'status',
        'invokeTime' => 'invoke_time',
        'errorMsg'   => 'error_msg',
        'retryCount' => 'retry_count',
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
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->invokeTime) {
            $res['invoke_time'] = $this->invokeTime;
        }
        if (null !== $this->errorMsg) {
            $res['error_msg'] = $this->errorMsg;
        }
        if (null !== $this->retryCount) {
            $res['retry_count'] = $this->retryCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['batch_id'])) {
            $model->batchId = $map['batch_id'];
        }
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['invoke_time'])) {
            $model->invokeTime = $map['invoke_time'];
        }
        if (isset($map['error_msg'])) {
            $model->errorMsg = $map['error_msg'];
        }
        if (isset($map['retry_count'])) {
            $model->retryCount = $map['retry_count'];
        }

        return $model;
    }
}
