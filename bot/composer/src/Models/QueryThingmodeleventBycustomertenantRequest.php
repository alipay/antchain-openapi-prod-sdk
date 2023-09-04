<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryThingmodeleventBycustomertenantRequest extends Model
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

    // 客户的租户ID
    /**
     * @var string
     */
    public $customerTenant;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'customerTenant'    => 'customer_tenant',
    ];

    public function validate()
    {
        Model::validateRequired('customerTenant', $this->customerTenant, true);
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
        if (null !== $this->customerTenant) {
            $res['customer_tenant'] = $this->customerTenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryThingmodeleventBycustomertenantRequest
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
        if (isset($map['customer_tenant'])) {
            $model->customerTenant = $map['customer_tenant'];
        }

        return $model;
    }
}
