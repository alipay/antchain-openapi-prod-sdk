<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotxOtaTaskPermanentCancelItem extends Model {
    protected $_name = [
        'channel' => 'channel',
        'jobId' => 'job_id',
        'taskId' => 'task_id',
        'firmwareId' => 'firmware_id',
        'moduleName' => 'module_name',
    ];
    public function validate() {
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('jobId', $this->jobId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('firmwareId', $this->firmwareId, true);
        Model::validateRequired('moduleName', $this->moduleName, true);
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
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return IotxOtaTaskPermanentCancelItem
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
        if(isset($map['module_name'])){
            $model->moduleName = $map['module_name'];
        }
        return $model;
    }
    // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
    /**
     * @example TUYA_4G
     * @var string
     */
    public $channel;

    // OTA 批次 ID
    /**
     * @example HudGu1xGv6n69AD3bWt8020200
     * @var string
     */
    public $jobId;

    // OTA 任务 ID
    /**
     * @example 11117c96d904415fa1570736703d3f0c
     * @var string
     */
    public $taskId;

    // 固件包 ID
    /**
     * @example c5755816b95e4bc9b67c49a6a03eefc8
     * @var string
     */
    public $firmwareId;

    // OTA 模块名，用于日志和取消标记补充
    /**
     * @example BLE
     * @var string
     */
    public $moduleName;

}
