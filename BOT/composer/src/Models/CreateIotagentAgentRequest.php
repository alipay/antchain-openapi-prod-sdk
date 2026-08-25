<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\BOT\Models\SkillInfo;
use AntChain\BOT\Models\McpInfo;

class CreateIotagentAgentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'agentName' => 'agent_name',
        'instanceId' => 'instance_id',
        'systemPrompt' => 'system_prompt',
        'modelProvider' => 'model_provider',
        'modelId' => 'model_id',
        'skills' => 'skills',
        'mcps' => 'mcps',
    ];
    public function validate() {
        Model::validateRequired('agentName', $this->agentName, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('modelProvider', $this->modelProvider, true);
        Model::validateRequired('modelId', $this->modelId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->agentName) {
            $res['agent_name'] = $this->agentName;
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
        if (null !== $this->skills) {
            $res['skills'] = [];
            if(null !== $this->skills && is_array($this->skills)){
                $n = 0;
                foreach($this->skills as $item){
                    $res['skills'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->mcps) {
            $res['mcps'] = [];
            if(null !== $this->mcps && is_array($this->mcps)){
                $n = 0;
                foreach($this->mcps as $item){
                    $res['mcps'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateIotagentAgentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['agent_name'])){
            $model->agentName = $map['agent_name'];
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
        if(isset($map['skills'])){
            if(!empty($map['skills'])){
                $model->skills = [];
                $n = 0;
                foreach($map['skills'] as $item) {
                    $model->skills[$n++] = null !== $item ? SkillInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['mcps'])){
            if(!empty($map['mcps'])){
                $model->mcps = [];
                $n = 0;
                foreach($map['mcps'] as $item) {
                    $model->mcps[$n++] = null !== $item ? McpInfo::fromMap($item) : $item;
                }
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

    // 智能体名称
    /**
     * @var string
     */
    public $agentName;

    // 实例Id
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

    // 模型名称
    /**
     * @var string
     */
    public $modelId;

    // sklil内容
    /**
     * @var SkillInfo[]
     */
    public $skills;

    // mcp配置
    /**
     * @var McpInfo[]
     */
    public $mcps;

}
