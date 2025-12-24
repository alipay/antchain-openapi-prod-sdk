<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerFundmngorderRequest extends Model
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

    //
    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 登录账号租户的角色
    // ROLE_MERCHANT(0, "商户"),
    // ROLE_FINANCIER(1, "资金方"),
    // ROLE_MIX(2, "商户资金方"),
    // DATA_PROVIDER(3, "数据提供者"),
    // ROLE_GUARANTOR(4, "担保方"),;
    /**
     * @var int
     */
    public $tenantRole;

    // 资方的社会统一信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商户的社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // traceid
    /**
     * @var string
     */
    public $traceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundTenantId'      => 'fund_tenant_id',
        'tenantRole'        => 'tenant_role',
        'fundId'            => 'fund_id',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
        'orderId'           => 'order_id',
        'traceId'           => 'trace_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('traceId', $this->traceId, true);
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
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }
        if (null !== $this->tenantRole) {
            $res['tenant_role'] = $this->tenantRole;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerFundmngorderRequest
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
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }
        if (isset($map['tenant_role'])) {
            $model->tenantRole = $map['tenant_role'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }

        return $model;
    }
}
