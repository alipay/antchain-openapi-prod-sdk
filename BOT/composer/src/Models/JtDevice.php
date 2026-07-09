<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class JtDevice extends Model
{
    // 设备ID
    /**
     * @example STRING 123ABC
     *
     * @var string
     */
    public $deviceId;

    // 场景码
    /**
     * @example 123ABC
     *
     * @var string
     */
    public $scene;

    // 可信设备ID
    /**
     * @example 7006071575276187649
     *
     * @var int
     */
    public $trustiotDeviceId;

    // 设备注册时间
    /**
     * @example 1686497064968
     *
     * @var int
     */
    public $gmtCreate;

    // 设备是否在线
    /**
     * @example true, false
     *
     * @var bool
     */
    public $online;

    // 设备型号
    /**
     * @example 丰图T8
     *
     * @var string
     */
    public $deviceModel;

    // 终端型号
    /**
     * @example 型号A
     *
     * @var string
     */
    public $terminalType;
    protected $_name = [
        'deviceId'         => 'device_id',
        'scene'            => 'scene',
        'trustiotDeviceId' => 'trustiot_device_id',
        'gmtCreate'        => 'gmt_create',
        'online'           => 'online',
        'deviceModel'      => 'device_model',
        'terminalType'     => 'terminal_type',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('trustiotDeviceId', $this->trustiotDeviceId, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('online', $this->online, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->trustiotDeviceId) {
            $res['trustiot_device_id'] = $this->trustiotDeviceId;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->online) {
            $res['online'] = $this->online;
        }
        if (null !== $this->deviceModel) {
            $res['device_model'] = $this->deviceModel;
        }
        if (null !== $this->terminalType) {
            $res['terminal_type'] = $this->terminalType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return JtDevice
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['trustiot_device_id'])) {
            $model->trustiotDeviceId = $map['trustiot_device_id'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['online'])) {
            $model->online = $map['online'];
        }
        if (isset($map['device_model'])) {
            $model->deviceModel = $map['device_model'];
        }
        if (isset($map['terminal_type'])) {
            $model->terminalType = $map['terminal_type'];
        }

        return $model;
    }
}
