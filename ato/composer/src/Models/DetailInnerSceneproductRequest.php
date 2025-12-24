<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class DetailInnerSceneproductRequest extends Model
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

    // 服务商租户
    /**
     * @var string
     */
    public $tenantId;

    // 场景Code
    /**
     * @var string
     */
    public $sceneCode;

    // 平台商品ID
    /**
     * @var string
     */
    public $platformProductId;

    // 业务code
    /**
     * @var string
     */
    public $businessCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'sceneCode'         => 'scene_code',
        'platformProductId' => 'platform_product_id',
        'businessCode'      => 'business_code',
    ];

    public function validate()
    {
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
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->platformProductId) {
            $res['platform_product_id'] = $this->platformProductId;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailInnerSceneproductRequest
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
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }
        if (isset($map['platform_product_id'])) {
            $model->platformProductId = $map['platform_product_id'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }

        return $model;
    }
}
