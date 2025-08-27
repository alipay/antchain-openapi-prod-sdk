<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerFundmngcreditRequest extends Model
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
    public $tenantId;

    // 商户社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 资方社会统一信用代码
    /**
     * @var string
     */
    public $fundId;

    // 订单号类型，ORDER_NO(订单id)或PACKAGE_ID(资产包id)
    /**
     * @var string
     */
    public $orderNoType;

    // 订单id或资产包id
    /**
     * @var string
     */
    public $orderNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
        'fundTenantId'      => 'fund_tenant_id',
        'fundId'            => 'fund_id',
        'orderNoType'       => 'order_no_type',
        'orderNo'           => 'order_no',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('orderNoType', $this->orderNoType, true);
        Model::validateRequired('orderNo', $this->orderNo, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->orderNoType) {
            $res['order_no_type'] = $this->orderNoType;
        }
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerFundmngcreditRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['order_no_type'])) {
            $model->orderNoType = $map['order_no_type'];
        }
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }

        return $model;
    }
}
