<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_f0f16236ed254bd499e3fe0f9600e0d5\Models;

use AlibabaCloud\Tea\Model;

class GetMaxCopilotFinRequest extends Model
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

    // user_id
    /**
     * @var string
     */
    public $userId;

    // 会话id
    /**
     * @var string
     */
    public $sessionId;

    // 消息id
    /**
     * @var string
     */
    public $messageId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'userId'            => 'user_id',
        'sessionId'         => 'session_id',
        'messageId'         => 'message_id',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
        Model::validateRequired('messageId', $this->messageId, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMaxCopilotFinRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }
        if (isset($map['message_id'])) {
            $model->messageId = $map['message_id'];
        }

        return $model;
    }
}
