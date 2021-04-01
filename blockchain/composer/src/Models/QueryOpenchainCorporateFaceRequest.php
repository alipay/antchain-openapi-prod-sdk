<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryOpenchainCorporateFaceRequest extends Model
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

    // 认证id
    /**
     * @var string
     */
    public $certifyId;

    // 租户code
    /**
     * @var string
     */
    public $tenantId;

    // 商户code
    /**
     * @var string
     */
    public $merchantCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'certifyId'         => 'certify_id',
        'tenantId'          => 'tenant_id',
        'merchantCode'      => 'merchant_code',
    ];

    public function validate()
    {
        Model::validateRequired('certifyId', $this->certifyId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('merchantCode', $this->merchantCode, true);
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
        if (null !== $this->certifyId) {
            $res['certify_id'] = $this->certifyId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->merchantCode) {
            $res['merchant_code'] = $this->merchantCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpenchainCorporateFaceRequest
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
        if (isset($map['certify_id'])) {
            $model->certifyId = $map['certify_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['merchant_code'])) {
            $model->merchantCode = $map['merchant_code'];
        }

        return $model;
    }
}
