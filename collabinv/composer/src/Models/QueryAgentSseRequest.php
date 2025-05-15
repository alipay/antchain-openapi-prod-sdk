<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class QueryAgentSseRequest extends Model
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

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 会话id
    /**
     * @var string
     */
    public $sessionId;

    // 查询词条
    /**
     * @var string
     */
    public $query;

    // 会话存活时长，单位毫秒，默认5分钟，最大不超过10分钟
    /**
     * @var int
     */
    public $aliveTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'sessionId'         => 'session_id',
        'query'             => 'query',
        'aliveTime'         => 'alive_time',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('query', $this->query, true);
        Model::validateRequired('aliveTime', $this->aliveTime, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->aliveTime) {
            $res['alive_time'] = $this->aliveTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAgentSseRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['alive_time'])) {
            $model->aliveTime = $map['alive_time'];
        }

        return $model;
    }
}
