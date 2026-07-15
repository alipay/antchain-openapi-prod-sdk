<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotxOtaTaskPermanentCancelResult extends Model {
    protected $_name = [
        'channel' => 'channel',
        'jobId' => 'job_id',
        'taskId' => 'task_id',
        'firmwareId' => 'firmware_id',
        'success' => 'success',
        'errorCode' => 'error_code',
        'errorMessage' => 'error_message',
    ];
    public function validate() {
        Model::validateRequired('firmwareId', $this->firmwareId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->errorCode) {
            $res['error_code'] = $this->errorCode;
        }
        if (null !== $this->errorMessage) {
            $res['error_message'] = $this->errorMessage;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IotxOtaTaskPermanentCancelResult
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['channel'])){
            $model->channel = $map['channel'];
        }
        if(isset($map['job_id'])){
            $model->jobId = $map['job_id'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
        }
        if(isset($map['success'])){
            $model->success = $map['success'];
        }
        if(isset($map['error_code'])){
            $model->errorCode = $map['error_code'];
        }
        if(isset($map['error_message'])){
            $model->errorMessage = $map['error_message'];
        }
        return $model;
    }
    // 通道
    /**
     * @example EKYT_BLE
     * @var string
     */
    public $channel;

    // OTA批次id
    /**
     * @example 7d715afe5a374179892078a9a11f16ab
     * @var string
     */
    public $jobId;

    // OTA任务ID
    /**
     * @example 11117c96d904415fa1570736703d3f0c
     * @var string
     */
    public $taskId;

    // OTA固件包ID
    /**
     * @example 25c3f69752244678a84f663e4d48a56a
     * @var string
     */
    public $firmwareId;

    // 是否成功
    /**
     * @example true
     * @var bool
     */
    public $success;

    // 失败错误码
    /**
     * @example SYSTEM_ERROR
     * @var string
     */
    public $errorCode;

    // 错误信息
    /**
     * @example 错误信息
     * @var string
     */
    public $errorMessage;

}
