<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryDeviceRegistrationRequest extends Model
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

    // 设备Id，由接入方提供，场景内唯一
    /**
     * @var string
     */
    public $deviceId;

    // 场景号
    /**
     * @var string
     */
    public $scene;

    // 可信根派生公钥
    /**
     * @var string
     */
    public $devicePublicKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'scene'             => 'scene',
        'devicePublicKey'   => 'device_public_key',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('devicePublicKey', $this->devicePublicKey, true);
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
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->devicePublicKey) {
            $res['device_public_key'] = $this->devicePublicKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeviceRegistrationRequest
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
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['device_public_key'])) {
            $model->devicePublicKey = $map['device_public_key'];
        }

        return $model;
    }
}
