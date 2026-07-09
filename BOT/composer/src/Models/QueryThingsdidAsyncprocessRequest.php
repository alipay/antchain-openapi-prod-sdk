<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryThingsdidAsyncprocessRequest extends Model
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

    // 需要查询的实体Did，可为空
    /**
     * @var string
     */
    public $thingDid;

    // 随机数唯一ID, 用以标识智能合约执行的索引交易ID，需要等于需要轮询的API的nonce
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'thingDid'          => 'thing_did',
        'nonce'             => 'nonce',
    ];

    public function validate()
    {
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
        if (null !== $this->thingDid) {
            $res['thing_did'] = $this->thingDid;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryThingsdidAsyncprocessRequest
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
        if (isset($map['thing_did'])) {
            $model->thingDid = $map['thing_did'];
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
