<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class StartOpenaiChatRequest extends Model
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

    // 参数内容为 ChatCompletionRequest 的 JSON 字符串
    /**
     * @var string
     */
    public $chatCompletionRequest;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'chatCompletionRequest' => 'chat_completion_request',
    ];

    public function validate()
    {
        Model::validateRequired('chatCompletionRequest', $this->chatCompletionRequest, true);
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
        if (null !== $this->chatCompletionRequest) {
            $res['chat_completion_request'] = $this->chatCompletionRequest;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartOpenaiChatRequest
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
        if (isset($map['chat_completion_request'])) {
            $model->chatCompletionRequest = $map['chat_completion_request'];
        }

        return $model;
    }
}
