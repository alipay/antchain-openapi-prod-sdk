<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class AgentChatCustomResponse extends Model
{
    // 消息id
    /**
     * @example 2025120800001
     *
     * @var string
     */
    public $messageId;

    // 内容
    /**
     * @example 好的，接下来...
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'messageId' => 'message_id',
        'content'   => 'content',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentChatCustomResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
