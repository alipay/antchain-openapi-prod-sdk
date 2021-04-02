<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class StartTenantBindinfoRequest extends Model
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

    // 参考结构体
    /**
     * @var TenantBindInfoReq
     */
    public $bindInfoReq;

    // 交易唯一ID
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bindInfoReq'       => 'bind_info_req',
        'nonce'             => 'nonce',
    ];

    public function validate()
    {
        Model::validateRequired('bindInfoReq', $this->bindInfoReq, true);
        Model::validateRequired('nonce', $this->nonce, true);
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
        if (null !== $this->bindInfoReq) {
            $res['bind_info_req'] = null !== $this->bindInfoReq ? $this->bindInfoReq->toMap() : null;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartTenantBindinfoRequest
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
        if (isset($map['bind_info_req'])) {
            $model->bindInfoReq = TenantBindInfoReq::fromMap($map['bind_info_req']);
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
