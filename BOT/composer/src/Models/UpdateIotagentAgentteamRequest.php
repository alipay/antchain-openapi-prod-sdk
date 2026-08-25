<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateIotagentAgentteamRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentId' => 'agent_id',
        'instanceId' => 'instance_id',
        'systemPrompt' => 'system_prompt',
        'modelProvider' => 'model_provider',
        'modelId' => 'model_id',
        'subAgents' => 'sub_agents',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('modelProvider', $this->modelProvider, true);
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('subAgents', $this->subAgents, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->systemPrompt) {
            $res['system_prompt'] = $this->systemPrompt;
        }
        if (null !== $this->modelProvider) {
            $res['model_provider'] = $this->modelProvider;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->subAgents) {
            $res['sub_agents'] = $this->subAgents;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateIotagentAgentteamRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        if(isset($map['system_prompt'])){
            $model->systemPrompt = $map['system_prompt'];
        }
        if(isset($map['model_provider'])){
            $model->modelProvider = $map['model_provider'];
        }
        if(isset($map['model_id'])){
            $model->modelId = $map['model_id'];
        }
        if(isset($map['sub_agents'])){
            if(!empty($map['sub_agents'])){
                $model->subAgents = $map['sub_agents'];
            }
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 智能体ID
    /**
     * @var string
     */
    public $agentId;

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 系统提示词
    /**
     * @var string
     */
    public $systemPrompt;

    // 模型提供方
    /**
     * @var string
     */
    public $modelProvider;

    // 模型
    /**
     * @var string
     */
    public $modelId;

    // 子智能体ids
    /**
     * @var string[]
     */
    public $subAgents;

}
