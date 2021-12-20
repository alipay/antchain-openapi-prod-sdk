<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ZJLM\Models;

use AlibabaCloud\Tea\Model;

class QueryTraceapiRequest extends Model
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

    // 商品编码
    /**
     * @var string
     */
    public $sku;

    // 11
    /**
     * @var string
     */
    public $shopId;

    // 11
    /**
     * @var string
     */
    public $tagKey;

    // 222
    /**
     * @var string
     */
    public $tenantCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sku'               => 'sku',
        'shopId'            => 'shop_id',
        'tagKey'            => 'tag_key',
        'tenantCode'        => 'tenant_code',
    ];

    public function validate()
    {
        Model::validateRequired('sku', $this->sku, true);
        Model::validateRequired('shopId', $this->shopId, true);
        Model::validateRequired('tenantCode', $this->tenantCode, true);
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
        if (null !== $this->sku) {
            $res['sku'] = $this->sku;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->tagKey) {
            $res['tag_key'] = $this->tagKey;
        }
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTraceapiRequest
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
        if (isset($map['sku'])) {
            $model->sku = $map['sku'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['tag_key'])) {
            $model->tagKey = $map['tag_key'];
        }
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }

        return $model;
    }
}
