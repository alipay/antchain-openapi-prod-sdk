<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EmpowerDeviceInfo extends Model
{
    // 设备ID
    /**
     * @example 00000001
     *
     * @var string
     */
    public $deviceId;

    // ACCEPTED(接受)/REVOKED(撤销)
    /**
     * @example ACCEPTED
     *
     * @var string
     */
    public $authStatus;

    // 移除授权时间，毫秒级时间戳
    /**
     * @example 1781690409
     *
     * @var int
     */
    public $removeTime;
    protected $_name = [
        'deviceId'   => 'device_id',
        'authStatus' => 'auth_status',
        'removeTime' => 'remove_time',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('authStatus', $this->authStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->removeTime) {
            $res['remove_time'] = $this->removeTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EmpowerDeviceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['remove_time'])) {
            $model->removeTime = $map['remove_time'];
        }

        return $model;
    }
}
