<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DetailAgentChatRequest extends Model
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

    // agent_code
    /**
     * @var string
     */
    public $agentCode;

    // session_id
    /**
     * @var string
     */
    public $sessionId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentCode'         => 'agent_code',
        'sessionId'         => 'session_id',
    ];

    public function validate()
    {
        Model::validateRequired('agentCode', $this->agentCode, true);
        Model::validateRequired('sessionId', $this->sessionId, true);
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
        if (null !== $this->agentCode) {
            $res['agent_code'] = $this->agentCode;
        }
        if (null !== $this->sessionId) {
            $res['session_id'] = $this->sessionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DetailAgentChatRequest
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
        if (isset($map['agent_code'])) {
            $model->agentCode = $map['agent_code'];
        }
        if (isset($map['session_id'])) {
            $model->sessionId = $map['session_id'];
        }

        return $model;
    }
}
