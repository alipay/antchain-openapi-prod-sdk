<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\ArrangementInfo;
use AntChain\Deps\Models\Pair;

class OpsProcessDefinition extends Model {
    protected $_name = [
        'description' => 'description',
        'instruction' => 'instruction',
        'name' => 'name',
        'opsType' => 'ops_type',
        'planId' => 'plan_id',
        'type' => 'type',
        'arrangements' => 'arrangements',
        'envConfig' => 'env_config',
        'supportedTransitions' => 'supported_transitions',
        'nodeId' => 'node_id',
        'state' => 'state',
        'startedTime' => 'started_time',
        'finishedTime' => 'finished_time',
        'standaloneExecutable' => 'standalone_executable',
        'id' => 'id',
    ];
    public function validate() {
        Model::validatePattern('startedTime', $this->startedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('finishedTime', $this->finishedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->instruction) {
            $res['instruction'] = $this->instruction;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->opsType) {
            $res['ops_type'] = $this->opsType;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->arrangements) {
            $res['arrangements'] = [];
            if(null !== $this->arrangements && is_array($this->arrangements)){
                $n = 0;
                foreach($this->arrangements as $item){
                    $res['arrangements'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
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
        if (null !== $this->supportedTransitions) {
            $res['supported_transitions'] = $this->supportedTransitions;
        }
        if (null !== $this->nodeId) {
            $res['node_id'] = $this->nodeId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->startedTime) {
            $res['started_time'] = $this->startedTime;
        }
        if (null !== $this->finishedTime) {
            $res['finished_time'] = $this->finishedTime;
        }
        if (null !== $this->standaloneExecutable) {
            $res['standalone_executable'] = $this->standaloneExecutable;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsProcessDefinition
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['instruction'])){
            $model->instruction = $map['instruction'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['ops_type'])){
            $model->opsType = $map['ops_type'];
        }
        if(isset($map['plan_id'])){
            $model->planId = $map['plan_id'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['arrangements'])){
            if(!empty($map['arrangements'])){
                $model->arrangements = [];
                $n = 0;
                foreach($map['arrangements'] as $item) {
                    $model->arrangements[$n++] = null !== $item ? ArrangementInfo::fromMap($item) : $item;
                }
            }
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
        if(isset($map['supported_transitions'])){
            if(!empty($map['supported_transitions'])){
                $model->supportedTransitions = $map['supported_transitions'];
            }
        }
        if(isset($map['node_id'])){
            $model->nodeId = $map['node_id'];
        }
        if(isset($map['state'])){
            $model->state = $map['state'];
        }
        if(isset($map['started_time'])){
            $model->startedTime = $map['started_time'];
        }
        if(isset($map['finished_time'])){
            $model->finishedTime = $map['finished_time'];
        }
        if(isset($map['standalone_executable'])){
            $model->standaloneExecutable = $map['standalone_executable'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // 描述
    /**
     * @example aa
     * @var string
     */
    public $description;

    // 指令名称
    /**
     * @example aa
     * @var string
     */
    public $instruction;

    // 进程名
    /**
     * @example aa
     * @var string
     */
    public $name;

    // 运维类型
    /**
     * @example APP_OPERATION
     * @var string
     */
    public $opsType;

    // 发布单ID
    /**
     * @example 123
     * @var string
     */
    public $planId;

    // 类型
    /**
     * @example BASIC_OPS
     * @var string
     */
    public $type;

    // 概览信息
    /**
     * @example 
     * @var ArrangementInfo[]
     */
    public $arrangements;

    // 环境变量
    /**
     * @example 
     * @var Pair[]
     */
    public $envConfig;

    // 支持的状态转换列表
    /**
     * @example 
     * @var string[]
     */
    public $supportedTransitions;

    // 节点ID
    /**
     * @example 123
     * @var string
     */
    public $nodeId;

    // 状态
    /**
     * @example FAILED
     * @var string
     */
    public $state;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $startedTime;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $finishedTime;

    // 可独立执行
    /**
     * @example true, false
     * @var bool
     */
    public $standaloneExecutable;

    // ID
    /**
     * @example 123
     * @var string
     */
    public $id;

}
