<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class QueryMessagesRequest extends Model
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

    // 查询条件
    /**
     * @var SearchCondition
     */
    public $searchCondition;

    // 请求ID
    /**
     * @var string
     */
    public $requestId;

    // team_hash_id
    /**
     * @var string
     */
    public $teamHashId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'searchCondition'   => 'search_condition',
        'requestId'         => 'request_id',
        'teamHashId'        => 'team_hash_id',
    ];

    public function validate()
    {
        Model::validateRequired('searchCondition', $this->searchCondition, true);
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
        if (null !== $this->searchCondition) {
            $res['search_condition'] = null !== $this->searchCondition ? $this->searchCondition->toMap() : null;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->teamHashId) {
            $res['team_hash_id'] = $this->teamHashId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryMessagesRequest
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
        if (isset($map['search_condition'])) {
            $model->searchCondition = SearchCondition::fromMap($map['search_condition']);
        }
        if (isset($map['request_id'])) {
            $model->requestId = $map['request_id'];
        }
        if (isset($map['team_hash_id'])) {
            $model->teamHashId = $map['team_hash_id'];
        }

        return $model;
    }
}
