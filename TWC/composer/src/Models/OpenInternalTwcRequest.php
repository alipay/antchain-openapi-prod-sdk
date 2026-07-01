<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class OpenInternalTwcRequest extends Model
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

    // 授权开通的租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 授权开通的产品码
    /**
     * @var string
     */
    public $product;

    // 授权开通的行业类型（版权/租赁）
    /**
     * @var string
     */
    public $customerBizId;

    // 授权码
    /**
     * @var string
     */
    public $authCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'product'           => 'product',
        'customerBizId'     => 'customer_biz_id',
        'authCode'          => 'auth_code',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('product', $this->product, true);
        Model::validateRequired('customerBizId', $this->customerBizId, true);
        Model::validateRequired('authCode', $this->authCode, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->product) {
            $res['product'] = $this->product;
        }
        if (null !== $this->customerBizId) {
            $res['customer_biz_id'] = $this->customerBizId;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenInternalTwcRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['product'])) {
            $model->product = $map['product'];
        }
        if (isset($map['customer_biz_id'])) {
            $model->customerBizId = $map['customer_biz_id'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }

        return $model;
    }
}
