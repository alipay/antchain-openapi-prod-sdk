<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class StartThingsdidRegisterRequest extends Model
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

    // 信物链交易唯一ID，代表需要标识的操作ID
    /**
     * @var string
     */
    public $nonce;

    // 注册信物链身份实体请求结构体
    /**
     * @var ThingsDidRegisterReq
     */
    public $registerReq;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'nonce'             => 'nonce',
        'registerReq'       => 'register_req',
    ];

    public function validate()
    {
        Model::validateRequired('nonce', $this->nonce, true);
        Model::validateRequired('registerReq', $this->registerReq, true);
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
        if (null !== $this->registerReq) {
            $res['register_req'] = null !== $this->registerReq ? $this->registerReq->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartThingsdidRegisterRequest
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
        if (isset($map['register_req'])) {
            $model->registerReq = ThingsDidRegisterReq::fromMap($map['register_req']);
        }

        return $model;
    }
}
