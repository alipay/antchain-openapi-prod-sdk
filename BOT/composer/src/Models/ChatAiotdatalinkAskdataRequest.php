<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ChatAiotdatalinkAskdataRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId' => 'tenant_id',
        'sceneCode' => 'scene_code',
        'question' => 'question',
        'conversationId' => 'conversation_id',
        'userId' => 'user_id',
        'caller' => 'caller',
    ];
    public function validate() {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('question', $this->question, true);
        Model::validateRequired('conversationId', $this->conversationId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->conversationId) {
            $res['conversation_id'] = $this->conversationId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->caller) {
            $res['caller'] = $this->caller;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChatAiotdatalinkAskdataRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['scene_code'])){
            $model->sceneCode = $map['scene_code'];
        }
        if(isset($map['question'])){
            $model->question = $map['question'];
        }
        if(isset($map['conversation_id'])){
            $model->conversationId = $map['conversation_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['caller'])){
            $model->caller = $map['caller'];
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

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 场景编码
    /**
     * @var string
     */
    public $sceneCode;

    // 问数问题
    /**
     * @var string
     */
    public $question;

    // 会话ID
    /**
     * @var string
     */
    public $conversationId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 序列号，用于表示同一时间请求序号
    /**
     * @var string
     */
    public $caller;

}
