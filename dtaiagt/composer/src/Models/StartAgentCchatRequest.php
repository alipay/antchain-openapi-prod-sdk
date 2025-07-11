<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class StartAgentCchatRequest extends Model
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

    // 请求内容，内容为 AgentChatReq 对象的json字符串
    /**
     * @var string
     */
    public $agentChatRequest;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentChatRequest'  => 'agent_chat_request',
    ];

    public function validate()
    {
        Model::validateRequired('agentChatRequest', $this->agentChatRequest, true);
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
        if (null !== $this->agentChatRequest) {
            $res['agent_chat_request'] = $this->agentChatRequest;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAgentCchatRequest
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
        if (isset($map['agent_chat_request'])) {
            $model->agentChatRequest = $map['agent_chat_request'];
        }

        return $model;
    }
}
