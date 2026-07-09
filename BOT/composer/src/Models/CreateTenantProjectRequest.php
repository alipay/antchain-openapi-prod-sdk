<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateTenantProjectRequest extends Model
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

    // 参考结构体
    /**
     * @var TenantProjectCreateReq
     */
    public $projectCreateReq;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'nonce'             => 'nonce',
        'projectCreateReq'  => 'project_create_req',
    ];

    public function validate()
    {
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('projectCreateReq', $this->projectCreateReq, true);
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
        if (null !== $this->projectCreateReq) {
            $res['project_create_req'] = null !== $this->projectCreateReq ? $this->projectCreateReq->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTenantProjectRequest
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
        if (isset($map['project_create_req'])) {
            $model->projectCreateReq = TenantProjectCreateReq::fromMap($map['project_create_req']);
        }

        return $model;
    }
}
