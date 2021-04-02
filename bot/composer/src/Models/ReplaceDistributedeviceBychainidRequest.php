<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ReplaceDistributedeviceBychainidRequest extends Model
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

    // 发行设备Id
    /**
     * @var string
     */
    public $distributeDeviceId;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'chainDeviceId'      => 'chain_device_id',
        'distributeDeviceId' => 'distribute_device_id',
    ];

    public function validate()
    {
        Model::validateRequired('chainDeviceId', $this->chainDeviceId, true);
        Model::validateRequired('distributeDeviceId', $this->distributeDeviceId, true);
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
        if (null !== $this->distributeDeviceId) {
            $res['distribute_device_id'] = $this->distributeDeviceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ReplaceDistributedeviceBychainidRequest
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
        if (isset($map['distribute_device_id'])) {
            $model->distributeDeviceId = $map['distribute_device_id'];
        }

        return $model;
    }
}
