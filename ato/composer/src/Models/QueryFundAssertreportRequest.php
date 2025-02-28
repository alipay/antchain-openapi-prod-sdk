<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryFundAssertreportRequest extends Model
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

    // 授权id
    /**
     * @var string
     */
    public $authId;

    // 资方统一社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户的租户id
    /**
     * @var string
     */
    public $tenantId;

    // 商家统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authId'            => 'auth_id',
        'fundId'            => 'fund_id',
        'tenantId'          => 'tenant_id',
        'merchantId'        => 'merchant_id',
    ];

    public function validate()
    {
        Model::validateRequired('authId', $this->authId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
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
        if (null !== $this->authId) {
            $res['auth_id'] = $this->authId;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryFundAssertreportRequest
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
        if (isset($map['auth_id'])) {
            $model->authId = $map['auth_id'];
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

        return $model;
    }
}
