<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SKINTELLIDOCTOR\Models;

use AlibabaCloud\Tea\Model;

class QueryAntdigitalIntellidoctorKnowledgeagentSseRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId' => 'user_id',
        'sessionId' => 'session_id',
        'msgId' => 'msg_id',
        'query' => 'query',
    ];
    public function validate() {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('msgId', $this->msgId, true);
        Model::validateRequired('query', $this->query, true);
    }
    public function toMap() {
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
        if (null !== $this->msgId) {
            $res['msg_id'] = $this->msgId;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntdigitalIntellidoctorKnowledgeagentSseRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['msg_id'])){
            $model->msgId = $map['msg_id'];
        }
        if(isset($map['query'])){
            $model->query = $map['query'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 用户id
    /**
     * @var string
     */
    public $userId;

    // 会话id
    /**
     * @var string
     */
    public $sessionId;

    // 当前轮次消息id
    /**
     * @var string
     */
    public $msgId;

    // 问题
    /**
     * @var string
     */
    public $query;

}
