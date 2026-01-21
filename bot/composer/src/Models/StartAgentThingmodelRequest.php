<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class StartAgentThingmodelRequest extends Model
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

    // 请求内容，内容为 AgentThingModelReq 对象的json字符串
    /**
     * @var string
     */
    public $agentThingModelRequest;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'agentThingModelRequest' => 'agent_thing_model_request',
    ];

    public function validate()
    {
        Model::validateRequired('agentThingModelRequest', $this->agentThingModelRequest, true);
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
        if (null !== $this->agentThingModelRequest) {
            $res['agent_thing_model_request'] = $this->agentThingModelRequest;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StartAgentThingmodelRequest
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
        if (isset($map['agent_thing_model_request'])) {
            $model->agentThingModelRequest = $map['agent_thing_model_request'];
        }

        return $model;
    }
}
