<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class AiAgentChatHistoryBO extends Model {
    protected $_name = [
        'clientId' => 'client_id',
        'clientType' => 'client_type',
        'conversationContent' => 'conversation_content',
        'conversationType' => 'conversation_type',
        'sessionId' => 'session_id',
        'time' => 'time',
    ];
    public function validate() {
        Model::validateRequired('clientId', $this->clientId, true);
        Model::validateRequired('clientType', $this->clientType, true);
        Model::validateRequired('conversationContent', $this->conversationContent, true);
        Model::validateRequired('conversationType', $this->conversationType, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('time', $this->time, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->clientId) {
            $res['client_id'] = $this->clientId;
        }
        if (null !== $this->clientType) {
            $res['client_type'] = $this->clientType;
        }
        if (null !== $this->conversationContent) {
            $res['conversation_content'] = $this->conversationContent;
        }
        if (null !== $this->conversationType) {
            $res['conversation_type'] = $this->conversationType;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AiAgentChatHistoryBO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['client_id'])){
            $model->clientId = $map['client_id'];
        }
        if(isset($map['client_type'])){
            $model->clientType = $map['client_type'];
        }
        if(isset($map['conversation_content'])){
            $model->conversationContent = $map['conversation_content'];
        }
        if(isset($map['conversation_type'])){
            $model->conversationType = $map['conversation_type'];
        }
        if(isset($map['session_id'])){
            $model->sessionId = $map['session_id'];
        }
        if(isset($map['time'])){
            $model->time = $map['time'];
        }
        return $model;
    }
    // 客户端ID
    /**
     * @example 00:ba:cc
     * @var string
     */
    public $clientId;

    // 客户端类型
    /**
     * @example ESP32
     * @var string
     */
    public $clientType;

    // 对话内容
    /**
     * @example ...对话内容
     * @var string
     */
    public $conversationContent;

    // 对话类型
    /**
     * @example request
     * @var string
     */
    public $conversationType;

    // 会话ID
    /**
     * @example 7468486322254688256
     * @var string
     */
    public $sessionId;

    // 对话时间（格式化后的时间）
    /**
     * @example 2026-06-24 21:32:59
     * @var string
     */
    public $time;

}
