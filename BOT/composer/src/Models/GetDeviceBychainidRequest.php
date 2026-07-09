<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GetDeviceBychainidRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 链上设备Id
    /**
     * @var string
     */
    public $chainDeviceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chainDeviceId'     => 'chain_device_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainDeviceId', $this->chainDeviceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->chainDeviceId) {
            $res['chain_device_id'] = $this->chainDeviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetDeviceBychainidRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['chain_device_id'])) {
            $model->chainDeviceId = $map['chain_device_id'];
        }

        return $model;
    }
}
