<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DistributeDevice extends Model
{
    // 链上设备Id  （deviceType=DEVICE 时有值)
    /**
     * @example 4533
     *
     * @var string
     */
    public $chainDeviceId;

    // 设备id
    /**
     * @example 1122
     *
     * @var string
     */
    public $deviceId;

    // 发行设备Id
    /**
     * @example 4455
     *
     * @var string
     */
    public $distributeDeviceId;

    // 场景码
    /**
     * @example SCENE
     *
     * @var string
     */
    public $scene;

    // 设备类型 DEVICE : 设备 、PERIPHERAL : 外围设备
    /**
     * @example PERIPHERAL
     *
     * @var string
     */
    public $deviceType;

    // 链上外围设备Id（deviceType=PERIPHERAL 时有值)
    /**
     * @example 123123
     *
     * @var string
     */
    public $chainPeripheralId;
    protected $_name = [
        'chainDeviceId'      => 'chain_device_id',
        'deviceId'           => 'device_id',
        'distributeDeviceId' => 'distribute_device_id',
        'scene'              => 'scene',
        'deviceType'         => 'device_type',
        'chainPeripheralId'  => 'chain_peripheral_id',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('distributeDeviceId', $this->distributeDeviceId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceType', $this->deviceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->distributeDeviceId) {
            $res['distribute_device_id'] = $this->distributeDeviceId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->chainPeripheralId) {
            $res['chain_peripheral_id'] = $this->chainPeripheralId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DistributeDevice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['distribute_device_id'])) {
            $model->distributeDeviceId = $map['distribute_device_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['chain_peripheral_id'])) {
            $model->chainPeripheralId = $map['chain_peripheral_id'];
        }

        return $model;
    }
}
