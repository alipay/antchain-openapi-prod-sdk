<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GrantDeviceInfo extends Model
{
    // 授权ID
    /**
     * @example 00000001
     *
     * @var string
     */
    public $deviceId;

    // 授权ID
    /**
     * @example m6XFxJeTpllXZQ3BEZCyhovWZjoiCqqW
     *
     * @var string
     */
    public $authRecordId;
    protected $_name = [
        'deviceId'     => 'device_id',
        'authRecordId' => 'auth_record_id',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('authRecordId', $this->authRecordId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->authRecordId) {
            $res['auth_record_id'] = $this->authRecordId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrantDeviceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['auth_record_id'])) {
            $model->authRecordId = $map['auth_record_id'];
        }

        return $model;
    }
}
