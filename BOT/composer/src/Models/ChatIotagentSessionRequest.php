<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\FileInfo;

class ChatIotagentSessionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'sessionId' => 'session_id',
        'userId' => 'user_id',
        'type' => 'type',
        'query' => 'query',
        'attachFiles' => 'attach_files',
        'extraParams' => 'extra_params',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('type', $this->type, true);
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
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->attachFiles) {
            $res['attach_files'] = [];
            if(null !== $this->attachFiles && is_array($this->attachFiles)){
                $n = 0;
                foreach($this->attachFiles as $item){
                    $res['attach_files'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extraParams) {
            $res['extra_params'] = $this->extraParams;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ChatIotagentSessionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['query'])){
            $model->query = $map['query'];
        }
        if(isset($map['attach_files'])){
            if(!empty($map['attach_files'])){
                $model->attachFiles = [];
                $n = 0;
                foreach($map['attach_files'] as $item) {
                    $model->attachFiles[$n++] = null !== $item ? FileInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['extra_params'])){
            $model->extraParams = $map['extra_params'];
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

    // 智能体id
    /**
     * @var string
     */
    public $agentId;

    // 会话id
    /**
     * @var string
     */
    public $sessionId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 会话类型
    /**
     * @var string
     */
    public $type;

    // 问题
    /**
     * @var string
     */
    public $query;

    // 附件
    /**
     * @var FileInfo[]
     */
    public $attachFiles;

    // josn字符串
    /**
     * @var string
     */
    public $extraParams;

}
