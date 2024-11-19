<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryWithholdCompensateaccountRequest extends Model
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

    // 商户社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 资方社会信用代码
    /**
     * @var string
     */
    public $fundId;

    // 资方租户id
    /**
     * @var string
     */
    public $fundTenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantId'        => 'merchant_id',
        'fundId'            => 'fund_id',
        'fundTenantId'      => 'fund_tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('fundTenantId', $this->fundTenantId, true);
        Model::validateMaxLength('merchantId', $this->merchantId, 64);
        Model::validateMaxLength('fundId', $this->fundId, 64);
        Model::validateMaxLength('fundTenantId', $this->fundTenantId, 64);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('fundId', $this->fundId, 1);
        Model::validateMinLength('fundTenantId', $this->fundTenantId, 1);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->fundTenantId) {
            $res['fund_tenant_id'] = $this->fundTenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryWithholdCompensateaccountRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['fund_tenant_id'])) {
            $model->fundTenantId = $map['fund_tenant_id'];
        }

        return $model;
    }
}
