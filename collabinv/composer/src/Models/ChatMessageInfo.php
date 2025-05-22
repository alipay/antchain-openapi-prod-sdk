<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COLLABINV\Models;

use AlibabaCloud\Tea\Model;

class ChatMessageInfo extends Model
{
    // 会话ID
    /**
     * @example 3330003
     *
     * @var string
     */
    public $sessionId;

    // 提问内容
    /**
     * @example 提问内容
     *
     * @var string
     */
    public $query;

    // 恢复内容
    /**
     * @example 恢复内容
     *
     * @var string
     */
    public $answer;

    // 创建时间
    /**
     * @example 2025-04-24 17:54:23
     *
     * @var string
     */
    public $createDate;
    protected $_name = [
        'sessionId'  => 'session_id',
        'query'      => 'query',
        'answer'     => 'answer',
        'createDate' => 'create_date',
    ];

    public function validate()
    {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('createDate', $this->createDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->createDate) {
            $res['create_date'] = $this->createDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChatMessageInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }
        if (isset($map['create_date'])) {
            $model->createDate = $map['create_date'];
        }

        return $model;
    }
}
