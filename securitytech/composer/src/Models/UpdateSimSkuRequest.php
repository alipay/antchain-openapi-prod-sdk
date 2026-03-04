<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class UpdateSimSkuRequest extends Model
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

    // 设备编号
    /**
     * @var string
     */
    public $deviceId;

    // 登录态token
    /**
     * @var string
     */
    public $token;

    // 更改价格的skuId
    /**
     * @var string
     */
    public $skuId;

    // sku门店价格，单位元
    /**
     * @var string
     */
    public $storeAmount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'token'             => 'token',
        'skuId'             => 'sku_id',
        'storeAmount'       => 'store_amount',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('skuId', $this->skuId, true);
        Model::validateRequired('storeAmount', $this->storeAmount, true);
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
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->storeAmount) {
            $res['store_amount'] = $this->storeAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateSimSkuRequest
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
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['store_amount'])) {
            $model->storeAmount = $map['store_amount'];
        }

        return $model;
    }
}
