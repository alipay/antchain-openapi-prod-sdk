<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecDeviceThingserviceRequest extends Model
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

    // 签名
    /**
     * @var string
     */
    public $signature;

    // 服务调用标识符
    /**
     * @var string
     */
    public $serviceIdentifier;

    // 服务调用参数
    // key-value，json字符串
    /**
     * @var string
     */
    public $serviceArgs;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceDid'         => 'device_did',
        'signature'         => 'signature',
        'serviceIdentifier' => 'service_identifier',
        'serviceArgs'       => 'service_args',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('serviceIdentifier', $this->serviceIdentifier, true);
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
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->serviceIdentifier) {
            $res['service_identifier'] = $this->serviceIdentifier;
        }
        if (null !== $this->serviceArgs) {
            $res['service_args'] = $this->serviceArgs;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecDeviceThingserviceRequest
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
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['service_identifier'])) {
            $model->serviceIdentifier = $map['service_identifier'];
        }
        if (isset($map['service_args'])) {
            $model->serviceArgs = $map['service_args'];
        }

        return $model;
    }
}
