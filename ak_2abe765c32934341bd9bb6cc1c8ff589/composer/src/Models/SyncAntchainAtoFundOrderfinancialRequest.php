<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class SyncAntchainAtoFundOrderfinancialRequest extends Model
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

    // 订单号
    /**
     * @var string
     */
    public $orderId;

    // 商户在数科的租户ID
    /**
     * @var string
     */
    public $merchantTenantId;

    // 订单融资唯一标识
    /**
     * @var string
     */
    public $applicationId;

    // 订单融资状态：1-成功；2-失败
    /**
     * @var int
     */
    public $status;

    // 融资结果描述，长度不超过64
    /**
     * @var string
     */
    public $reason;

    // 额外信息
    /**
     * @var string
     */
    public $extras;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'merchantTenantId'  => 'merchant_tenant_id',
        'applicationId'     => 'application_id',
        'status'            => 'status',
        'reason'            => 'reason',
        'extras'            => 'extras',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('applicationId', $this->applicationId, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 50);
        Model::validateMaxLength('applicationId', $this->applicationId, 128);
        Model::validateMaxLength('reason', $this->reason, 64);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantTenantId', $this->merchantTenantId, 1);
        Model::validateMinLength('applicationId', $this->applicationId, 1);
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
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->extras) {
            $res['extras'] = $this->extras;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncAntchainAtoFundOrderfinancialRequest
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
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['extras'])) {
            $model->extras = $map['extras'];
        }

        return $model;
    }
}
