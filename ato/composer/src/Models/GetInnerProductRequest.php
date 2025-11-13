<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class GetInnerProductRequest extends Model
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

    // 商户在数科的租户id
    /**
     * @var string
     */
    public $merchantTenantId;

    // 商户统一社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 商品id
    /**
     * @var string
     */
    public $productId;

    // 商品版本
    /**
     * @var string
     */
    public $productVersion;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'merchantTenantId'  => 'merchant_tenant_id',
        'merchantId'        => 'merchant_id',
        'productId'         => 'product_id',
        'productVersion'    => 'product_version',
    ];

    public function validate()
    {
        Model::validateRequired('merchantTenantId', $this->merchantTenantId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('productId', $this->productId, true);
        Model::validateRequired('productVersion', $this->productVersion, true);
        Model::validateMaxLength('merchantTenantId', $this->merchantTenantId, 32);
        Model::validateMaxLength('merchantId', $this->merchantId, 199);
        Model::validateMaxLength('productId', $this->productId, 32);
        Model::validateMaxLength('productVersion', $this->productVersion, 32);
        Model::validateMinLength('merchantTenantId', $this->merchantTenantId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('productId', $this->productId, 1);
        Model::validateMinLength('productVersion', $this->productVersion, 1);
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
        if (null !== $this->merchantTenantId) {
            $res['merchant_tenant_id'] = $this->merchantTenantId;
        }
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->productId) {
            $res['product_id'] = $this->productId;
        }
        if (null !== $this->productVersion) {
            $res['product_version'] = $this->productVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetInnerProductRequest
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
        if (isset($map['merchant_tenant_id'])) {
            $model->merchantTenantId = $map['merchant_tenant_id'];
        }
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['product_id'])) {
            $model->productId = $map['product_id'];
        }
        if (isset($map['product_version'])) {
            $model->productVersion = $map['product_version'];
        }

        return $model;
    }
}
