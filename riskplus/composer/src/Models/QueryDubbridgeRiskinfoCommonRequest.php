<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryDubbridgeRiskinfoCommonRequest extends Model
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

    // 查询id
    /**
     * @var string
     */
    public $queryId;

    // 查询id类型
    /**
     * @var string
     */
    public $idType;

    // 用户id
    /**
     * @var string
     */
    public $openId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'queryId'           => 'query_id',
        'idType'            => 'id_type',
        'openId'            => 'open_id',
    ];

    public function validate()
    {
        Model::validateRequired('queryId', $this->queryId, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('openId', $this->openId, true);
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
        if (null !== $this->queryId) {
            $res['query_id'] = $this->queryId;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->openId) {
            $res['open_id'] = $this->openId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDubbridgeRiskinfoCommonRequest
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
        if (isset($map['query_id'])) {
            $model->queryId = $map['query_id'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['open_id'])) {
            $model->openId = $map['open_id'];
        }

        return $model;
    }
}
