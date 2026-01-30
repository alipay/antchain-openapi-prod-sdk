<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class GetAntchainAtoFundOrderfulfillmentRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 租赁订单所属商家租户id
    /**
     * @var string
     */
    public $merchantTenantId;

    // 期数
    // 如果填入，获取term_idx下的履约记录
    // 如果不填入，获取order_id下的所有履约记录
    /**
     * @var int
     */
    public $termIdx;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantTenantId'  => 'merchant_tenant_id',
        'termIdx'           => 'term_idx',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateMaxLength('orderId', $this->orderId, 49);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 49);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantTenantId', $this->merchantTenantId, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->merchantTenantId) {
            $res['merchant_tenant_id'] = $this->merchantTenantId;
        }
        if (null !== $this->termIdx) {
            $res['term_idx'] = $this->termIdx;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAntchainAtoFundOrderfulfillmentRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['merchant_tenant_id'])) {
            $model->merchantTenantId = $map['merchant_tenant_id'];
        }
        if (isset($map['term_idx'])) {
            $model->termIdx = $map['term_idx'];
        }

        return $model;
    }
}
