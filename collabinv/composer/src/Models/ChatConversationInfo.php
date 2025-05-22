<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class ChatConversationInfo extends Model
{
    // 会话ID
    /**
     * @example 3330003
     *
     * @var string
     */
    public $sessionId;

    // 用户ID
    /**
     * @example 3330003
     *
     * @var string
     */
    public $userId;

    // agent ID
    /**
     * @example 3330003
     *
     * @var string
     */
    public $agentId;

    // 会话名称
    /**
     * @example 会话名称
     *
     * @var string
     */
    public $title;

    // 创建时间
    /**
     * @example 2024-11-28 15:17
     *
     * @var string
     */
    public $createDate;
    protected $_name = [
        'sessionId'  => 'session_id',
        'userId'     => 'user_id',
        'agentId'    => 'agent_id',
        'title'      => 'title',
        'createDate' => 'create_date',
    ];

    public function validate()
    {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('createDate', $this->createDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->createDate) {
            $res['create_date'] = $this->createDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChatConversationInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['agent_id'])) {
            $model->agentId = $map['agent_id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['create_date'])) {
            $model->createDate = $map['create_date'];
        }

        return $model;
    }
}
