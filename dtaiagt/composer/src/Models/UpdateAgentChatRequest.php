<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class UpdateAgentChatRequest extends Model
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

    // chat id
    //
    /**
     * @var string
     */
    public $chatId;

    // session_id
    /**
     * @var string
     */
    public $sessionId;

    // 用户反馈[up_vote, down_vote, cancel_up, cancel_down]
    //
    /**
     * @var string
     */
    public $userFeedback;

    // 用户建议
    //
    /**
     * @var string
     */
    public $userFeedRemark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'chatId'            => 'chat_id',
        'sessionId'         => 'session_id',
        'userFeedback'      => 'user_feedback',
        'userFeedRemark'    => 'user_feed_remark',
    ];

    public function validate()
    {
        Model::validateRequired('chatId', $this->chatId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('userFeedback', $this->userFeedback, true);
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
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->userFeedback) {
            $res['user_feedback'] = $this->userFeedback;
        }
        if (null !== $this->userFeedRemark) {
            $res['user_feed_remark'] = $this->userFeedRemark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAgentChatRequest
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
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['user_feedback'])) {
            $model->userFeedback = $map['user_feedback'];
        }
        if (isset($map['user_feed_remark'])) {
            $model->userFeedRemark = $map['user_feed_remark'];
        }

        return $model;
    }
}
