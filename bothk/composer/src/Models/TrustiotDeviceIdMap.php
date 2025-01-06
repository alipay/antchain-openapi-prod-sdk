<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOTHK\Models;

use AlibabaCloud\Tea\Model;

class TrustiotDeviceIdMap extends Model
{
    // 可信设备ID
    /**
     * @example 7006413673662394390
     *
     * @var int
     */
    public $trustiotDeviceId;

    // 设备ID
    /**
     * @example 1122
     *
     * @var string
     */
    public $deviceId;
    protected $_name = [
        'trustiotDeviceId' => 'trustiot_device_id',
        'deviceId'         => 'device_id',
    ];

    public function validate()
    {
        Model::validateRequired('trustiotDeviceId', $this->trustiotDeviceId, true);
        Model::validateRequired('deviceId', $this->deviceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->trustiotDeviceId) {
            $res['trustiot_device_id'] = $this->trustiotDeviceId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrustiotDeviceIdMap
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trustiot_device_id'])) {
            $model->trustiotDeviceId = $map['trustiot_device_id'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }

        return $model;
    }
}
