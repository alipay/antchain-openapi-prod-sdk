<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceDisableData extends Model
{
    // 设备sn号
    /**
     * @example sn123
     *
     * @var string
     */
    public $deviceSn;

    // 厂商
    /**
     * @example telpo
     *
     * @var string
     */
    public $corpName;
    protected $_name = [
        'deviceSn' => 'device_sn',
        'corpName' => 'corp_name',
    ];

    public function validate()
    {
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('corpName', $this->corpName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->corpName) {
            $res['corp_name'] = $this->corpName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceDisableData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['corp_name'])) {
            $model->corpName = $map['corp_name'];
        }

        return $model;
    }
}
