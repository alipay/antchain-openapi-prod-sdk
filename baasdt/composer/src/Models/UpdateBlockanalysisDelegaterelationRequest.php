<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class UpdateBlockanalysisDelegaterelationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 集群ID
    /**
     * @var string
     */
    public $productInstanceId;

    // 被代理的租户ID
    /**
     * @var string
     */
    public $delegatedTenantId;

    // 代理租户ID
    /**
     * @var string
     */
    public $optTenantId;

    // 操作类型，ADD表示添加，SUB表示撤销
    /**
     * @var string
     */
    public $optType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'delegatedTenantId' => 'delegated_tenant_id',
        'optTenantId'       => 'opt_tenant_id',
        'optType'           => 'opt_type',
    ];

    public function validate()
    {
        Model::validateRequired('delegatedTenantId', $this->delegatedTenantId, true);
        Model::validateRequired('optTenantId', $this->optTenantId, true);
        Model::validateRequired('optType', $this->optType, true);
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
        if (null !== $this->delegatedTenantId) {
            $res['delegated_tenant_id'] = $this->delegatedTenantId;
        }
        if (null !== $this->optTenantId) {
            $res['opt_tenant_id'] = $this->optTenantId;
        }
        if (null !== $this->optType) {
            $res['opt_type'] = $this->optType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateBlockanalysisDelegaterelationRequest
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
        if (isset($map['delegated_tenant_id'])) {
            $model->delegatedTenantId = $map['delegated_tenant_id'];
        }
        if (isset($map['opt_tenant_id'])) {
            $model->optTenantId = $map['opt_tenant_id'];
        }
        if (isset($map['opt_type'])) {
            $model->optType = $map['opt_type'];
        }

        return $model;
    }
}
