<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ThoughtChainDisplayUnit extends Model
{
    // 思维链模块id
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $id;

    // 思维链模块状态：success or fail
    //
    /**
     * @example success
     *
     * @var string
     */
    public $status;

    // 思维链模块额外信息
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $resultMsg;

    // 思维链模块耗时
    //
    /**
     * @example
     *
     * @var int
     */
    public $latency;

    // 思维链模块时间戳 (思维链本身的时间戳)
    //
    /**
     * @example
     *
     * @var int
     */
    public $timestamp;

    // 思维链对应操作开始执行时间戳 (optional)
    //
    /**
     * @example
     *
     * @var int
     */
    public $startTimestamp;

    // 思维链对应操作开始输出时间戳 (optional)
    //
    /**
     * @example
     *
     * @var int
     */
    public $outputTimestamp;

    // 思维链对应操作结束执行时间戳 (optional)
    //
    /**
     * @example
     *
     * @var int
     */
    public $endTimestamp;

    // 思维链对应过程总模型token耗费 (optional)
    //
    /**
     * @example
     *
     * @var int
     */
    public $tokenCost;

    // 思维链对应过程输入模型token耗费 (optional)
    //
    /**
     * @example
     *
     * @var int
     */
    public $inputTokenCost;

    // 思维链对应过程输出模型token耗费 (optional)
    //
    /**
     * @example
     *
     * @var int
     */
    public $outputTokenCost;

    // 思维链模块显示名称
    //
    /**
     * @example "知识查询"
     *
     * @var string
     */
    public $displayName;

    // 思维链模块是否为进行中阶段的输出
    //
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isRunning;

    // 思维链模块类型：DECISION or GENERATE
    //
    /**
     * @example DECISION
     *
     * @var string
     */
    public $type;

    // 思维链模块子类型：content_search 知识查询 / llm 大模型 / tool 工具 / workflow 工作流 / end 结束 / parameter 参数处理
    //
    /**
     * @example content_search
     *
     * @var string
     */
    public $subType;

    // 思维链模块子类型关联id。如果是工具，那就是 platform_api_plugin 表的 id；如果是工作流，那就是 platform_intent 表的 id
    //
    /**
     * @example
     *
     * @var int
     */
    public $refResourceId;

    // 思维链模块子类型关联code，一般是工具或工作流类型对应的code
    //
    /**
     * @example search_tool
     *
     * @var string
     */
    public $refResourceCode;

    // 思维链模块子类型关联图标
    //
    /**
     * @example "icon.png"
     *
     * @var string
     */
    public $refResourceIcon;

    // 思维链模块子类型为工作流时的版本，仅当子类型为工作流时赋值
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $refWorkflowBuildVersion;

    // 思维链模块子类型为工作流时的运行实例id，仅当子类型为工作流且 refWorkflowBuildVersion 以 NEW 开头时赋值
    //
    /**
     * @example 1
     *
     * @var string
     */
    public $refWorkflowRuntimeInstanceId;

    // 思维链模块入参信息，JSON字符串格式
    //
    /**
     * @example "{"key":"value"}"
     *
     * @var string
     */
    public $inputJsonString;

    // 思维链模块出参信息，JSON字符串格式
    //
    /**
     * @example "{"result":"ok"}"
     *
     * @var string
     */
    public $outputJsonString;

    // 思维链模块额外消息信息 (如内置工具过程展现内容)，JSON字符串格式
    //
    /**
     * @example "{"info":"detail"}"
     *
     * @var string
     */
    public $extraInfoJsonString;
    protected $_name = [
        'id'                           => 'id',
        'status'                       => 'status',
        'resultMsg'                    => 'result_msg',
        'latency'                      => 'latency',
        'timestamp'                    => 'timestamp',
        'startTimestamp'               => 'start_timestamp',
        'outputTimestamp'              => 'output_timestamp',
        'endTimestamp'                 => 'end_timestamp',
        'tokenCost'                    => 'token_cost',
        'inputTokenCost'               => 'input_token_cost',
        'outputTokenCost'              => 'output_token_cost',
        'displayName'                  => 'display_name',
        'isRunning'                    => 'is_running',
        'type'                         => 'type',
        'subType'                      => 'sub_type',
        'refResourceId'                => 'ref_resource_id',
        'refResourceCode'              => 'ref_resource_code',
        'refResourceIcon'              => 'ref_resource_icon',
        'refWorkflowBuildVersion'      => 'ref_workflow_build_version',
        'refWorkflowRuntimeInstanceId' => 'ref_workflow_runtime_instance_id',
        'inputJsonString'              => 'input_json_string',
        'outputJsonString'             => 'output_json_string',
        'extraInfoJsonString'          => 'extra_info_json_string',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
        Model::validateRequired('latency', $this->latency, true);
        Model::validateRequired('timestamp', $this->timestamp, true);
        Model::validateRequired('startTimestamp', $this->startTimestamp, true);
        Model::validateRequired('outputTimestamp', $this->outputTimestamp, true);
        Model::validateRequired('endTimestamp', $this->endTimestamp, true);
        Model::validateRequired('tokenCost', $this->tokenCost, true);
        Model::validateRequired('inputTokenCost', $this->inputTokenCost, true);
        Model::validateRequired('outputTokenCost', $this->outputTokenCost, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('isRunning', $this->isRunning, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('subType', $this->subType, true);
        Model::validateRequired('refResourceId', $this->refResourceId, true);
        Model::validateRequired('refResourceCode', $this->refResourceCode, true);
        Model::validateRequired('refResourceIcon', $this->refResourceIcon, true);
        Model::validateRequired('refWorkflowBuildVersion', $this->refWorkflowBuildVersion, true);
        Model::validateRequired('refWorkflowRuntimeInstanceId', $this->refWorkflowRuntimeInstanceId, true);
        Model::validateRequired('inputJsonString', $this->inputJsonString, true);
        Model::validateRequired('outputJsonString', $this->outputJsonString, true);
        Model::validateRequired('extraInfoJsonString', $this->extraInfoJsonString, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->latency) {
            $res['latency'] = $this->latency;
        }
        if (null !== $this->timestamp) {
            $res['timestamp'] = $this->timestamp;
        }
        if (null !== $this->startTimestamp) {
            $res['start_timestamp'] = $this->startTimestamp;
        }
        if (null !== $this->outputTimestamp) {
            $res['output_timestamp'] = $this->outputTimestamp;
        }
        if (null !== $this->endTimestamp) {
            $res['end_timestamp'] = $this->endTimestamp;
        }
        if (null !== $this->tokenCost) {
            $res['token_cost'] = $this->tokenCost;
        }
        if (null !== $this->inputTokenCost) {
            $res['input_token_cost'] = $this->inputTokenCost;
        }
        if (null !== $this->outputTokenCost) {
            $res['output_token_cost'] = $this->outputTokenCost;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->isRunning) {
            $res['is_running'] = $this->isRunning;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->subType) {
            $res['sub_type'] = $this->subType;
        }
        if (null !== $this->refResourceId) {
            $res['ref_resource_id'] = $this->refResourceId;
        }
        if (null !== $this->refResourceCode) {
            $res['ref_resource_code'] = $this->refResourceCode;
        }
        if (null !== $this->refResourceIcon) {
            $res['ref_resource_icon'] = $this->refResourceIcon;
        }
        if (null !== $this->refWorkflowBuildVersion) {
            $res['ref_workflow_build_version'] = $this->refWorkflowBuildVersion;
        }
        if (null !== $this->refWorkflowRuntimeInstanceId) {
            $res['ref_workflow_runtime_instance_id'] = $this->refWorkflowRuntimeInstanceId;
        }
        if (null !== $this->inputJsonString) {
            $res['input_json_string'] = $this->inputJsonString;
        }
        if (null !== $this->outputJsonString) {
            $res['output_json_string'] = $this->outputJsonString;
        }
        if (null !== $this->extraInfoJsonString) {
            $res['extra_info_json_string'] = $this->extraInfoJsonString;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThoughtChainDisplayUnit
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['latency'])) {
            $model->latency = $map['latency'];
        }
        if (isset($map['timestamp'])) {
            $model->timestamp = $map['timestamp'];
        }
        if (isset($map['start_timestamp'])) {
            $model->startTimestamp = $map['start_timestamp'];
        }
        if (isset($map['output_timestamp'])) {
            $model->outputTimestamp = $map['output_timestamp'];
        }
        if (isset($map['end_timestamp'])) {
            $model->endTimestamp = $map['end_timestamp'];
        }
        if (isset($map['token_cost'])) {
            $model->tokenCost = $map['token_cost'];
        }
        if (isset($map['input_token_cost'])) {
            $model->inputTokenCost = $map['input_token_cost'];
        }
        if (isset($map['output_token_cost'])) {
            $model->outputTokenCost = $map['output_token_cost'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['is_running'])) {
            $model->isRunning = $map['is_running'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['sub_type'])) {
            $model->subType = $map['sub_type'];
        }
        if (isset($map['ref_resource_id'])) {
            $model->refResourceId = $map['ref_resource_id'];
        }
        if (isset($map['ref_resource_code'])) {
            $model->refResourceCode = $map['ref_resource_code'];
        }
        if (isset($map['ref_resource_icon'])) {
            $model->refResourceIcon = $map['ref_resource_icon'];
        }
        if (isset($map['ref_workflow_build_version'])) {
            $model->refWorkflowBuildVersion = $map['ref_workflow_build_version'];
        }
        if (isset($map['ref_workflow_runtime_instance_id'])) {
            $model->refWorkflowRuntimeInstanceId = $map['ref_workflow_runtime_instance_id'];
        }
        if (isset($map['input_json_string'])) {
            $model->inputJsonString = $map['input_json_string'];
        }
        if (isset($map['output_json_string'])) {
            $model->outputJsonString = $map['output_json_string'];
        }
        if (isset($map['extra_info_json_string'])) {
            $model->extraInfoJsonString = $map['extra_info_json_string'];
        }

        return $model;
    }
}
