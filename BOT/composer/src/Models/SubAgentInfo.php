<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SubAgentInfo extends Model {
    protected $_name = [
        'agentId' => 'agent_id',
        'agentName' => 'agent_name',
        'modelProvider' => 'model_provider',
        'modelId' => 'model_id',
        'skills' => 'skills',
        'mcps' => 'mcps',
        'instanceId' => 'instance_id',
    ];
    public function validate() {
        Model::validateRequired('agentId', $this->agentId, true);
        Model::validateRequired('agentName', $this->agentName, true);
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
        if (null !== $this->modelProvider) {
            $res['model_provider'] = $this->modelProvider;
        }
        if (null !== $this->modelId) {
            $res['model_id'] = $this->modelId;
        }
        if (null !== $this->skills) {
            $res['skills'] = $this->skills;
        }
        if (null !== $this->mcps) {
            $res['mcps'] = $this->mcps;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SubAgentInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['agent_id'])){
            $model->agentId = $map['agent_id'];
        }
        if(isset($map['agent_name'])){
            $model->agentName = $map['agent_name'];
        }
        if(isset($map['model_provider'])){
            $model->modelProvider = $map['model_provider'];
        }
        if(isset($map['model_id'])){
            $model->modelId = $map['model_id'];
        }
        if(isset($map['skills'])){
            if(!empty($map['skills'])){
                $model->skills = $map['skills'];
            }
        }
        if(isset($map['mcps'])){
            if(!empty($map['mcps'])){
                $model->mcps = $map['mcps'];
            }
        }
        if(isset($map['instance_id'])){
            $model->instanceId = $map['instance_id'];
        }
        return $model;
    }
    // 智能体ID
    /**
     * @example 智能体ID
     * @var string
     */
    public $agentId;

    // 智能体名称
    /**
     * @example 碳矩阵智能体
     * @var string
     */
    public $agentName;

    // 模型提供方
    /**
     * @example aliyun
     * @var string
     */
    public $modelProvider;

    // 模型
    /**
     * @example qwen-plus
     * @var string
     */
    public $modelId;

    // skill信息
    /**
     * @example undefined
     * @var string[]
     */
    public $skills;

    // mcp功能
    /**
     * @example undefined
     * @var string[]
     */
    public $mcps;

    // 实例id
    /**
     * @example 实例id
     * @var string
     */
    public $instanceId;

}
