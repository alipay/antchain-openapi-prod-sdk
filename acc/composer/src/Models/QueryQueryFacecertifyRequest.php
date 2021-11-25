<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class QueryQueryFacecertifyRequest extends Model
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

    // 自定义唯一id
    /**
     * @var string
     */
    public $bizId;

    // 租户类型
    /**
     * @var string
     */
    public $tenantId;

    // 校验id
    /**
     * @var string
     */
    public $verifyId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'tenantId'          => 'tenant_id',
        'verifyId'          => 'verify_id',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('verifyId', $this->verifyId, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->verifyId) {
            $res['verify_id'] = $this->verifyId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryQueryFacecertifyRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['verify_id'])) {
            $model->verifyId = $map['verify_id'];
        }

        return $model;
    }
}
