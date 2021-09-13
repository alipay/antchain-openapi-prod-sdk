<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TRADE\Models;

use AlibabaCloud\Tea\Model;

class ExistPricePersonalizedRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 商品code
    /**
     * @var string
     */
    public $productCode;

    // 收费项编码，只有当商品存在多收费项的时候需要传入
    /**
     * @var string
     */
    public $priceObjectCode;
    protected $_name = [
        'authToken'       => 'auth_token',
        'tenantId'        => 'tenant_id',
        'productCode'     => 'product_code',
        'priceObjectCode' => 'price_object_code',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->priceObjectCode) {
            $res['price_object_code'] = $this->priceObjectCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExistPricePersonalizedRequest
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
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['price_object_code'])) {
            $model->priceObjectCode = $map['price_object_code'];
        }

        return $model;
    }
}
