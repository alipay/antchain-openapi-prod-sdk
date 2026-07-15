<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\DeviceLocator;

class ExecElectrocarOtataskcancelRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceLocator' => 'device_locator',
        'channel' => 'channel',
        'jobId' => 'job_id',
        'firmwareId' => 'firmware_id',
        'cancelReason' => 'cancel_reason',
    ];
    public function validate() {
        Model::validateRequired('deviceLocator', $this->deviceLocator, true);
        Model::validateRequired('channel', $this->channel, true);
        Model::validateRequired('jobId', $this->jobId, true);
        Model::validateRequired('firmwareId', $this->firmwareId, true);
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
        if (null !== $this->firmwareId) {
            $res['firmware_id'] = $this->firmwareId;
        }
        if (null !== $this->cancelReason) {
            $res['cancel_reason'] = $this->cancelReason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecElectrocarOtataskcancelRequest
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
        if(isset($map['firmware_id'])){
            $model->firmwareId = $map['firmware_id'];
        }
        if(isset($map['cancel_reason'])){
            $model->cancelReason = $map['cancel_reason'];
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

    // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE。
    /**
     * @var string
     */
    public $channel;

    // OTA 批次 ID；4G 通道为 Hub jobId，本地通道为本地批次主键字符串。
    /**
     * @var string
     */
    public $jobId;

    // 固件包 ID；4G 通道取消时用于透传 Hub，本地通道用于进一步限定目标任务。
    /**
     * @var string
     */
    public $firmwareId;

    // 取消原因，不传时本地通道默认记录为用户取消
    /**
     * @var string
     */
    public $cancelReason;

}
