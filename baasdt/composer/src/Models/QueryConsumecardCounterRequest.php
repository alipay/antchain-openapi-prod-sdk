<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryConsumecardCounterRequest extends Model
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

    // 基础结构体
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 查询的类别（0 商家，1 商品）
    /**
     * @var int
     */
    public $type;

    // 查询的id（type：0 为accountId 1为goodsId）
    /**
     * @var string
     */
    public $queryId;

    // 查询的时间戳对应的counter
    /**
     * @var int
     */
    public $queryTimeInMills;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'type'              => 'type',
        'queryId'           => 'query_id',
        'queryTimeInMills'  => 'query_time_in_mills',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('queryId', $this->queryId, true);
        Model::validateRequired('queryTimeInMills', $this->queryTimeInMills, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->queryId) {
            $res['query_id'] = $this->queryId;
        }
        if (null !== $this->queryTimeInMills) {
            $res['query_time_in_mills'] = $this->queryTimeInMills;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryConsumecardCounterRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['query_id'])) {
            $model->queryId = $map['query_id'];
        }
        if (isset($map['query_time_in_mills'])) {
            $model->queryTimeInMills = $map['query_time_in_mills'];
        }

        return $model;
    }
}
