<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicDeviceRegisterResult extends Model
{
    // 设备did
    /**
     * @example did:private:12dsadadadf
     *
     * @var string
     */
    public $deviceDid;

    // 设备密钥
    /**
     * @example 12321321
     *
     * @var string
     */
    public $privateKey;

    // 设备名称
    /**
     * @example test
     *
     * @var string
     */
    public $deviceName;

    // 设备sn
    /**
     * @example 12321321
     *
     * @var string
     */
    public $deviceSn;
    protected $_name = [
        'deviceDid'  => 'device_did',
        'privateKey' => 'private_key',
        'deviceName' => 'device_name',
        'deviceSn'   => 'device_sn',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('privateKey', $this->privateKey, true);
        Model::validateRequired('deviceName', $this->deviceName, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->privateKey) {
            $res['private_key'] = $this->privateKey;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicDeviceRegisterResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['private_key'])) {
            $model->privateKey = $map['private_key'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }

        return $model;
    }
}
