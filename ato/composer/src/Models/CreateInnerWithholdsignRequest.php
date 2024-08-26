<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInnerWithholdsignRequest extends Model
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

    // 商户租户id
    /**
     * @var string
     */
    public $merchantTenantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 用户支付宝2088uid
    /**
     * @var string
     */
    public $alipayUserId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantTenantId'  => 'merchant_tenant_id',
        'orderId'           => 'order_id',
        'alipayUserId'      => 'alipay_user_id',
    ];

    public function validate()
    {
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 64);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('alipayUserId', $this->alipayUserId, 64);
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
        if (null !== $this->merchantTenantId) {
            $res['merchant_tenant_id'] = $this->merchantTenantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->alipayUserId) {
            $res['alipay_user_id'] = $this->alipayUserId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInnerWithholdsignRequest
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
        if (isset($map['merchant_tenant_id'])) {
            $model->merchantTenantId = $map['merchant_tenant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['alipay_user_id'])) {
            $model->alipayUserId = $map['alipay_user_id'];
        }

        return $model;
    }
}
