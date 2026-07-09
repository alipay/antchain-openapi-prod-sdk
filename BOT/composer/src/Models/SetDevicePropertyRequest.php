<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SetDevicePropertyRequest extends Model
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

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // json格式属性信息，由标识符与属性值（key:value）构成，多个属性用英文逗号隔开。
    /**
     * @var string
     */
    public $property;

    // 签名，用设备秘钥进行签名，只对deviceDid加签
    /**
     * @var string
     */
    public $signature;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceDid'         => 'device_did',
        'property'          => 'property',
        'signature'         => 'signature',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('property', $this->property, true);
        Model::validateRequired('signature', $this->signature, true);
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
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->property) {
            $res['property'] = $this->property;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SetDevicePropertyRequest
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
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['property'])) {
            $model->property = $map['property'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }

        return $model;
    }
}
