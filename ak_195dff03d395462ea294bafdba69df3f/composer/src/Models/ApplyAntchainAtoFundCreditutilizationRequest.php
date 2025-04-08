<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class ApplyAntchainAtoFundCreditutilizationRequest extends Model
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

    // 订单列表
    /**
     * @var CreditUtilizationOrder[]
     */
    public $orderList;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商户统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 授信Id
    /**
     * @var string
     */
    public $grantingId;

    // 用信授权id
    /**
     * @var string
     */
    public $utilizationAuthId;

    // 用信id, 需保证唯一性
    /**
     * @var string
     */
    public $utilizationId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderList'         => 'order_list',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
        'fundId'            => 'fund_id',
        'grantingId'        => 'granting_id',
        'utilizationAuthId' => 'utilization_auth_id',
        'utilizationId'     => 'utilization_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderList', $this->orderList, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('grantingId', $this->grantingId, true);
        Model::validateRequired('utilizationAuthId', $this->utilizationAuthId, true);
        Model::validateRequired('utilizationId', $this->utilizationId, true);
        Model::validateMaxLength('tenantId', $this->tenantId, 20);
        Model::validateMaxLength('merchantId', $this->merchantId, 200);
        Model::validateMaxLength('fundId', $this->fundId, 200);
        Model::validateMaxLength('grantingId', $this->grantingId, 20);
        Model::validateMaxLength('utilizationAuthId', $this->utilizationAuthId, 20);
        Model::validateMaxLength('utilizationId', $this->utilizationId, 20);
        Model::validateMinLength('tenantId', $this->tenantId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('fundId', $this->fundId, 1);
        Model::validateMinLength('grantingId', $this->grantingId, 10);
        Model::validateMinLength('utilizationAuthId', $this->utilizationAuthId, 10);
        Model::validateMinLength('utilizationId', $this->utilizationId, 10);
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
        if (null !== $this->orderList) {
            $res['order_list'] = [];
            if (null !== $this->orderList && \is_array($this->orderList)) {
                $n = 0;
                foreach ($this->orderList as $item) {
                    $res['order_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->grantingId) {
            $res['granting_id'] = $this->grantingId;
        }
        if (null !== $this->utilizationAuthId) {
            $res['utilization_auth_id'] = $this->utilizationAuthId;
        }
        if (null !== $this->utilizationId) {
            $res['utilization_id'] = $this->utilizationId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplyAntchainAtoFundCreditutilizationRequest
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
        if (isset($map['order_list'])) {
            if (!empty($map['order_list'])) {
                $model->orderList = [];
                $n                = 0;
                foreach ($map['order_list'] as $item) {
                    $model->orderList[$n++] = null !== $item ? CreditUtilizationOrder::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['granting_id'])) {
            $model->grantingId = $map['granting_id'];
        }
        if (isset($map['utilization_auth_id'])) {
            $model->utilizationAuthId = $map['utilization_auth_id'];
        }
        if (isset($map['utilization_id'])) {
            $model->utilizationId = $map['utilization_id'];
        }

        return $model;
    }
}
