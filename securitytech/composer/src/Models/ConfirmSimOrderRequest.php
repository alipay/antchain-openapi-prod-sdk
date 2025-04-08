<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ConfirmSimOrderRequest extends Model
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

    // 设备id
    /**
     * @var string
     */
    public $deviceId;

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // 登录态token
    /**
     * @var string
     */
    public $token;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'orderId'           => 'order_id',
        'token'             => 'token',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('token', $this->token, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmSimOrderRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }

        return $model;
    }
}
