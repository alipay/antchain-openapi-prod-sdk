<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\QFTEST\Models;

use AlibabaCloud\Tea\Model;

class AgentChatData extends Model
{
    // 会话id
    //
    /**
     * @example 202509230001000000051455
     *
     * @var string
     */
    public $sessionId;

    // 消息id
    //
    /**
     * @example 202509230003000000046715
     *
     * @var string
     */
    public $messageId;

    // 是否已完成
    /**
     * @example false
     *
     * @var bool
     */
    public $finished;

    // text: 文本 mage: 图片 stream：流式文本
    /**
     * @example card
     *
     * @var string
     */
    public $contentType;

    // 内容
    /**
     * @example {"title":"整体数据一览","type":"card","message":[{"task_name":"预算消耗","task_value":"12664.16","meta":{"type":"AreaChart"},"data":[{"title":"2023-08-01","value":"13800.92"}]}]}
     *
     * @var string
     */
    public $content;
    protected $_name = [
        'sessionId'   => 'session_id',
        'messageId'   => 'message_id',
        'finished'    => 'finished',
        'contentType' => 'content_type',
        'content'     => 'content',
    ];

    public function validate()
    {
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('messageId', $this->messageId, true);
        Model::validateRequired('finished', $this->finished, true);
        Model::validateRequired('contentType', $this->contentType, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        if (null !== $this->finished) {
            $res['finished'] = $this->finished;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AgentChatData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }
        if (isset($map['finished'])) {
            $model->finished = $map['finished'];
        }
        if (isset($map['content_type'])) {
            $model->contentType = $map['content_type'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }

        return $model;
    }
}
