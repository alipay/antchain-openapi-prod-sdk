<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RedeemInnerFundmngmerchantperformanceRequest extends Model
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

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 融资单的资方社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 订单所属商户的社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 赎回方式
    //
    // ONLINE("ONLINE", "线上"),
    // OFFLINE("OFFLINE", "线下"),;
    /**
     * @var string
     */
    public $redeemWay;

    // 赎回原因
    // ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
    // RENTING_OUT_REDEEM("RENTING_OUT_REDEEM", "退租赎回"),
    // RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
    // "租转售赎回");
    /**
     * @var string
     */
    public $redeemReason;

    // 赎回金额,单位为分,取消并赎回时必填
    /**
     * @var int
     */
    public $redeemAmount;

    // 赎回类型，为空默认为 TRANSFER
    // 转账代偿：TRANSFER
    // 代扣代偿：WITHHOLD
    /**
     * @var string
     */
    public $redeemType;

    // traceid
    /**
     * @var string
     */
    public $traceId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundTenantId'      => 'fund_tenant_id',
        'tenantId'          => 'tenant_id',
        'fundId'            => 'fund_id',
        'merchantId'        => 'merchant_id',
        'orderId'           => 'order_id',
        'redeemWay'         => 'redeem_way',
        'redeemReason'      => 'redeem_reason',
        'redeemAmount'      => 'redeem_amount',
        'redeemType'        => 'redeem_type',
        'traceId'           => 'trace_id',
    ];

    public function validate()
    {
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('redeemWay', $this->redeemWay, true);
        Model::validateRequired('redeemReason', $this->redeemReason, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->redeemWay) {
            $res['redeem_way'] = $this->redeemWay;
        }
        if (null !== $this->redeemReason) {
            $res['redeem_reason'] = $this->redeemReason;
        }
        if (null !== $this->redeemAmount) {
            $res['redeem_amount'] = $this->redeemAmount;
        }
        if (null !== $this->redeemType) {
            $res['redeem_type'] = $this->redeemType;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RedeemInnerFundmngmerchantperformanceRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['redeem_way'])) {
            $model->redeemWay = $map['redeem_way'];
        }
        if (isset($map['redeem_reason'])) {
            $model->redeemReason = $map['redeem_reason'];
        }
        if (isset($map['redeem_amount'])) {
            $model->redeemAmount = $map['redeem_amount'];
        }
        if (isset($map['redeem_type'])) {
            $model->redeemType = $map['redeem_type'];
        }
        if (isset($map['trace_id'])) {
            $model->traceId = $map['trace_id'];
        }

        return $model;
    }
}
