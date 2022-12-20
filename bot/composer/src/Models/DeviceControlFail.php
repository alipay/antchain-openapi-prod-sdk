<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class DeviceControlFail extends Model
{
    // 设备did
    /**
     * @example 123
     *
     * @var string
     */
    public $deviceDid;

    // 操作失败code
    /**
     * @example bad_param
     *
     * @var string
     */
    public $code;

    // 操作失败信息
    /**
     * @example 参数错误
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'deviceDid' => 'device_did',
        'code'      => 'code',
        'message'   => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
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
     * @return DeviceControlFail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
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
