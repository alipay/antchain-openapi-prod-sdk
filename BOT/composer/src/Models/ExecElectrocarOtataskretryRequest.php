<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\DeviceLocator;

class ExecElectrocarOtataskretryRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceLocator' => 'device_locator',
        'channel' => 'channel',
        'jobId' => 'job_id',
        'taskId' => 'task_id',
        'transSize' => 'trans_size',
    ];
    public function validate() {
        Model::validateRequired('deviceLocator', $this->deviceLocator, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('jobId', $this->jobId, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('transSize', $this->transSize, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->deviceLocator) {
            $res['device_locator'] = null !== $this->deviceLocator ? $this->deviceLocator->toMap() : null;
        }
        if (null !== $this->channel) {
            $res['channel'] = $this->channel;
        }
        if (null !== $this->jobId) {
            $res['job_id'] = $this->jobId;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->transSize) {
            $res['trans_size'] = $this->transSize;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecElectrocarOtataskretryRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['device_locator'])){
            $model->deviceLocator = DeviceLocator::fromMap($map['device_locator']);
        }
        if(isset($map['channel'])){
            $model->channel = $map['channel'];
        }
        if(isset($map['job_id'])){
            $model->jobId = $map['job_id'];
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['trans_size'])){
            $model->transSize = $map['trans_size'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 设备定位信息
    /**
     * @var DeviceLocator
     */
    public $deviceLocator;

    // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
    /**
     * @var string
     */
    public $channel;

    // OTA 批次 ID；4G 通道重试时需要透传 Hub
    /**
     * @var string
     */
    public $jobId;

    // OTA 任务 ID；4G 通道为 Hub taskId，本地通道为本地任务主键字符串
    /**
     * @var string
     */
    public $taskId;

    // BLE 分包大小，单位 B
    /**
     * @var int
     */
    public $transSize;

}
