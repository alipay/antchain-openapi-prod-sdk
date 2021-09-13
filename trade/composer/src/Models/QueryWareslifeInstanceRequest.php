<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class QueryWareslifeInstanceRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商品code
    /**
     * @var string[]
     */
    public $productCodes;
    protected $_name = [
        'authToken'    => 'auth_token',
        'tenantId'     => 'tenant_id',
        'productCodes' => 'product_codes',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCodes', $this->productCodes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->productCodes) {
            $res['product_codes'] = $this->productCodes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWareslifeInstanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product_codes'])) {
            if (!empty($map['product_codes'])) {
                $model->productCodes = $map['product_codes'];
            }
        }

        return $model;
    }
}
