<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IOTAGENT\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IOTAGENT\Models\SkillInfo;
use AntChain\IOTAGENT\Models\McpInfo;
use AntChain\IOTAGENT\Models\SubAgentInfo;

class AgentInfo extends Model {
    protected $_name = [
        'agentId' => 'agent_id',
        'agentName' => 'agent_name',
        'systemPrompt' => 'system_prompt',
        'modelProvider' => 'model_provider',
        'modelId' => 'model_id',
        'skills' => 'skills',
        'mcps' => 'mcps',
        'subAgents' => 'sub_agents',
        'subAgentInfoList' => 'sub_agent_info_list',
        'instanceId' => 'instance_id',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('agentName', $this->agentName, true);
        Model::validateRequired('systemPrompt', $this->systemPrompt, true);
        Model::validateRequired('modelProvider', $this->modelProvider, true);
        Model::validateRequired('modelId', $this->modelId, true);
        Model::validateRequired('skills', $this->skills, true);
        Model::validateRequired('mcps', $this->mcps, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->agentId) {
            $res['agent_id'] = $this->agentId;
        }
        if (null !== $this->agentName) {
            $res['agent_name'] = $this->agentName;
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
        if (null !== $this->subAgents) {
            $res['sub_agents'] = $this->subAgents;
        }
        if (null !== $this->subAgentInfoList) {
            $res['sub_agent_info_list'] = [];
            if(null !== $this->subAgentInfoList && is_array($this->subAgentInfoList)){
                $n = 0;
                foreach($this->subAgentInfoList as $item){
                    $res['sub_agent_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AgentInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['agent_name'])){
            $model->agentName = $map['agent_name'];
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
        if(isset($map['sub_agents'])){
            if(!empty($map['sub_agents'])){
                $model->subAgents = $map['sub_agents'];
            }
        }
        if(isset($map['sub_agent_info_list'])){
            if(!empty($map['sub_agent_info_list'])){
                $model->subAgentInfoList = [];
                $n = 0;
                foreach($map['sub_agent_info_list'] as $item) {
                    $model->subAgentInfoList[$n++] = null !== $item ? SubAgentInfo::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        return $model;
    }
    // 智能体id
    /**
     * @example 11223344556778899
     * @var string
     */
    public $agentId;

    // 智能体名字
    /**
     * @example 碳矩阵智能体
     * @var string
     */
    public $agentName;

    // 系统提示词
    /**
     * @example 你是碳矩阵智能助手
     * @var string
     */
    public $systemPrompt;

    // 模型提供方
    /**
     * @example aliyun
     * @var string
     */
    public $modelProvider;

    // 模型
    /**
     * @example 11223344556778899
     * @var string
     */
    public $modelId;

    // skills信息
    /**
     * @example undefined
     * @var SkillInfo[]
     */
    public $skills;

    // mcp信息
    /**
     * @example undefined
     * @var McpInfo[]
     */
    public $mcps;

    // 子智能体id
    /**
     * @example undefined
     * @var string[]
     */
    public $subAgents;

    // 子智能体详情
    /**
     * @example undefined
     * @var SubAgentInfo[]
     */
    public $subAgentInfoList;

    // 实例id
    /**
     * @example 11223344556778899
     * @var string
     */
    public $instanceId;

}
