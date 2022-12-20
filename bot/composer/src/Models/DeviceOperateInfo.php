<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceOperateInfo extends Model
{
    // 蚂蚁链iot平台设备ID
    /**
     * @example 213
     *
     * @var string
     */
    public $deviceDid;

    // 设备签名
    /**
     * @example sua8e
     *
     * @var string
     */
    public $signature;
    protected $_name = [
        'deviceDid' => 'device_did',
        'signature' => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('signature', $this->signature, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeviceOperateInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
