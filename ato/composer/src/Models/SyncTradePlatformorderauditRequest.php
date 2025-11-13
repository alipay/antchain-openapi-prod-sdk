<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncTradePlatformorderauditRequest extends Model
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

    // 商家id
    /**
     * @var string
     */
    public $merchantId;

    // 平台订单id
    /**
     * @var string
     */
    public $platformOrderId;

    // APPROVED同意REJECTED拒绝
    /**
     * @var string
     */
    public $operation;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'platformOrderId'   => 'platform_order_id',
        'operation'         => 'operation',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('platformOrderId', $this->platformOrderId, true);
        Model::validateRequired('operation', $this->operation, true);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->platformOrderId) {
            $res['platform_order_id'] = $this->platformOrderId;
        }
        if (null !== $this->operation) {
            $res['operation'] = $this->operation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncTradePlatformorderauditRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['platform_order_id'])) {
            $model->platformOrderId = $map['platform_order_id'];
        }
        if (isset($map['operation'])) {
            $model->operation = $map['operation'];
        }

        return $model;
    }
}
