<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceInfos extends Model
{
    // tuid
    /**
     * @example ""
     *
     * @var string
     */
    public $tuid;

    // 设备状态
    /**
     * @example online
     *
     * @var string
     */
    public $deviceStatus;

    // ota version
    /**
     * @example ""
     *
     * @var string
     */
    public $deviceOtaVersion;
    protected $_name = [
        'tuid'             => 'tuid',
        'deviceStatus'     => 'device_status',
        'deviceOtaVersion' => 'device_ota_version',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tuid) {
            $res['tuid'] = $this->tuid;
        }
        if (null !== $this->deviceStatus) {
            $res['device_status'] = $this->deviceStatus;
        }
        if (null !== $this->deviceOtaVersion) {
            $res['device_ota_version'] = $this->deviceOtaVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceInfos
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tuid'])) {
            $model->tuid = $map['tuid'];
        }
        if (isset($map['device_status'])) {
            $model->deviceStatus = $map['device_status'];
        }
        if (isset($map['device_ota_version'])) {
            $model->deviceOtaVersion = $map['device_ota_version'];
        }

        return $model;
    }
}
