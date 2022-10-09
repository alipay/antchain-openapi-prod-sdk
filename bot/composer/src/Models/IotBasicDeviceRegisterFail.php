<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class IotBasicDeviceRegisterFail extends Model
{
    // 设备名称
    /**
     * @example 12321321
     *
     * @var string
     */
    public $deviceName;

    // 设备sn
    /**
     * @example 2088xx
     *
     * @var string
     */
    public $deviceSn;

    // 错误编码
    /**
     * @example code
     *
     * @var string
     */
    public $code;

    // 错误描述
    /**
     * @example message
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'deviceName' => 'device_name',
        'deviceSn'   => 'device_sn',
        'code'       => 'code',
        'message'    => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('deviceName', $this->deviceName, true);
        Model::validateRequired('deviceSn', $this->deviceSn, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->deviceSn) {
            $res['device_sn'] = $this->deviceSn;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IotBasicDeviceRegisterFail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['device_sn'])) {
            $model->deviceSn = $map['device_sn'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
