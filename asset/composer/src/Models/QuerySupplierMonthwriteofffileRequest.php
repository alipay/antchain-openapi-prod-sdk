<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class QuerySupplierMonthwriteofffileRequest extends Model
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

    // 云站租户 id
    /**
     * @var string
     */
    public $cloudTenantId;

    // 请求唯一id
    //
    /**
     * @var string
     */
    public $requestUniqueId;

    // 202408
    /**
     * @var string
     */
    public $billingMonth;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'cloudTenantId'     => 'cloud_tenant_id',
        'requestUniqueId'   => 'request_unique_id',
        'billingMonth'      => 'billing_month',
    ];

    public function validate()
    {
        Model::validateRequired('cloudTenantId', $this->cloudTenantId, true);
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
        if (null !== $this->cloudTenantId) {
            $res['cloud_tenant_id'] = $this->cloudTenantId;
        }
        if (null !== $this->requestUniqueId) {
            $res['request_unique_id'] = $this->requestUniqueId;
        }
        if (null !== $this->billingMonth) {
            $res['billing_month'] = $this->billingMonth;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySupplierMonthwriteofffileRequest
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
        if (isset($map['cloud_tenant_id'])) {
            $model->cloudTenantId = $map['cloud_tenant_id'];
        }
        if (isset($map['request_unique_id'])) {
            $model->requestUniqueId = $map['request_unique_id'];
        }
        if (isset($map['billing_month'])) {
            $model->billingMonth = $map['billing_month'];
        }

        return $model;
    }
}
