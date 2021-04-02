<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateThingsdidTenantRequest extends Model
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

    // 交易唯一ID
    /**
     * @var string
     */
    public $nonce;

    // 实体更新访问权限参与方的请求结构体
    /**
     * @var DidUpdateTenantReq
     */
    public $updateTenantReq;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'nonce'             => 'nonce',
        'updateTenantReq'   => 'update_tenant_req',
    ];

    public function validate()
    {
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('updateTenantReq', $this->updateTenantReq, true);
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
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }
        if (null !== $this->updateTenantReq) {
            $res['update_tenant_req'] = null !== $this->updateTenantReq ? $this->updateTenantReq->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateThingsdidTenantRequest
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
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }
        if (isset($map['update_tenant_req'])) {
            $model->updateTenantReq = DidUpdateTenantReq::fromMap($map['update_tenant_req']);
        }

        return $model;
    }
}
