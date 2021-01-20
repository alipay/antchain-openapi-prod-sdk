<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Pair;
use AntChain\Deps\Models\OpsActionPolicy;

class ArrangementInfo extends Model {
    protected $_name = [
        'arrangementType' => 'arrangement_type',
        'envConfig' => 'env_config',
        'name' => 'name',
        'processDefinitionId' => 'process_definition_id',
        'workspaceId' => 'workspace_id',
        'opsActionPolicies' => 'ops_action_policies',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->arrangementType) {
            $res['arrangement_type'] = $this->arrangementType;
        }
        if (null !== $this->envConfig) {
            $res['env_config'] = [];
            if(null !== $this->envConfig && is_array($this->envConfig)){
                $n = 0;
                foreach($this->envConfig as $item){
                    $res['env_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->processDefinitionId) {
            $res['process_definition_id'] = $this->processDefinitionId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->opsActionPolicies) {
            $res['ops_action_policies'] = [];
            if(null !== $this->opsActionPolicies && is_array($this->opsActionPolicies)){
                $n = 0;
                foreach($this->opsActionPolicies as $item){
                    $res['ops_action_policies'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ArrangementInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['arrangement_type'])){
            $model->arrangementType = $map['arrangement_type'];
        }
        if(isset($map['env_config'])){
            if(!empty($map['env_config'])){
                $model->envConfig = [];
                $n = 0;
                foreach($map['env_config'] as $item) {
                    $model->envConfig[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['process_definition_id'])){
            $model->processDefinitionId = $map['process_definition_id'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['ops_action_policies'])){
            if(!empty($map['ops_action_policies'])){
                $model->opsActionPolicies = [];
                $n = 0;
                foreach($map['ops_action_policies'] as $item) {
                    $model->opsActionPolicies[$n++] = null !== $item ? OpsActionPolicy::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 类型
    /**
     * @example ONLINE_SERVICE
     * @var string
     */
    public $arrangementType;

    // 环境变量
    /**
     * @example 
     * @var Pair[]
     */
    public $envConfig;

    // 发布概览名称
    /**
     * @example test
     * @var string
     */
    public $name;

    // 发布进程ID
    /**
     * @example 123
     * @var string
     */
    public $processDefinitionId;

    // 环境 ID
    /**
     * @example 123
     * @var string
     */
    public $workspaceId;

    // 策略
    /**
     * @example 
     * @var OpsActionPolicy[]
     */
    public $opsActionPolicies;

}
