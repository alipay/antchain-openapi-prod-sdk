<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryThingsdidDidRequest extends Model
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

    // 查询请求结构体，参考结构体定义
    /**
     * @var DidBaseQueryReq
     */
    public $baseQueryReq;

    // 唯一交易ID
    /**
     * @var string
     */
    public $nonce;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseQueryReq'      => 'base_query_req',
        'nonce'             => 'nonce',
    ];

    public function validate()
    {
        Model::validateRequired('baseQueryReq', $this->baseQueryReq, true);
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
        if (null !== $this->baseQueryReq) {
            $res['base_query_req'] = null !== $this->baseQueryReq ? $this->baseQueryReq->toMap() : null;
        }
        if (null !== $this->nonce) {
            $res['nonce'] = $this->nonce;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryThingsdidDidRequest
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
        if (isset($map['base_query_req'])) {
            $model->baseQueryReq = DidBaseQueryReq::fromMap($map['base_query_req']);
        }
        if (isset($map['nonce'])) {
            $model->nonce = $map['nonce'];
        }

        return $model;
    }
}
