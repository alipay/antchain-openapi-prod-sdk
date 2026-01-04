<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class StopAgentChatRequest extends Model
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

    // chat_id
    /**
     * @var string
     */
    public $chatId;

    // agent_id
    /**
     * @var string
     */
    public $agentId;

    // 会话ID，非必填，拓展用
    /**
     * @var string
     */
    public $sessionId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chatId'            => 'chat_id',
        'agentId'           => 'agent_id',
        'sessionId'         => 'session_id',
    ];

    public function validate()
    {
        Model::validateRequired('chatId', $this->chatId, true);
        Model::validateRequired('agentId', $this->agentId, true);
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
        if (null !== $this->chatId) {
            $res['chat_id'] = $this->chatId;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StopAgentChatRequest
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
        if (isset($map['chat_id'])) {
            $model->chatId = $map['chat_id'];
        }
        if (isset($map['agent_id'])) {
            $model->agentId = $map['agent_id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }

        return $model;
    }
}
