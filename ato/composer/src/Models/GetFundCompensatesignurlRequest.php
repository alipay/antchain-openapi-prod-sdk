<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class GetFundCompensatesignurlRequest extends Model
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

    // 资方社会统一信用代码
    /**
     * @var string
     */
    public $fundId;

    // 商户租户id
    /**
     * @var string
     */
    public $merchantTenantId;

    // 商户社会统一信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 签约串类型
    // TRANSFER:转账代偿签约串
    // WITHHOLD:代扣代偿签约串
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fundId'            => 'fund_id',
        'merchantTenantId'  => 'merchant_tenant_id',
        'merchantId'        => 'merchant_id',
        'type'              => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('fundId', $this->fundId, true);
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->fundId) {
            $res['fund_id'] = $this->fundId;
        }
        if (null !== $this->merchantTenantId) {
            $res['merchant_tenant_id'] = $this->merchantTenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetFundCompensatesignurlRequest
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
        if (isset($map['fund_id'])) {
            $model->fundId = $map['fund_id'];
        }
        if (isset($map['merchant_tenant_id'])) {
            $model->merchantTenantId = $map['merchant_tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
