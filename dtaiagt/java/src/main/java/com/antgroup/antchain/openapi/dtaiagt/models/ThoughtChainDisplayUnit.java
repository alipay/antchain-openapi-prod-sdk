// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class ThoughtChainDisplayUnit extends TeaModel {
    // 思维链模块id
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 思维链模块状态：success or fail
    // 
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 思维链模块额外信息
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    // 思维链模块耗时
    // 
    @NameInMap("latency")
    @Validation(required = true)
    public Long latency;

    // 思维链模块时间戳 (思维链本身的时间戳)
    // 
    @NameInMap("timestamp")
    @Validation(required = true)
    public Long timestamp;

    // 思维链对应操作开始执行时间戳 (optional)
    // 
    @NameInMap("start_timestamp")
    @Validation(required = true)
    public Long startTimestamp;

    // 思维链对应操作开始输出时间戳 (optional)
    // 
    @NameInMap("output_timestamp")
    @Validation(required = true)
    public Long outputTimestamp;

    // 思维链对应操作结束执行时间戳 (optional)
    // 
    @NameInMap("end_timestamp")
    @Validation(required = true)
    public Long endTimestamp;

    // 思维链对应过程总模型token耗费 (optional)
    // 
    @NameInMap("token_cost")
    @Validation(required = true)
    public Long tokenCost;

    // 思维链对应过程输入模型token耗费 (optional)
    // 
    @NameInMap("input_token_cost")
    @Validation(required = true)
    public Long inputTokenCost;

    // 思维链对应过程输出模型token耗费 (optional)
    // 
    @NameInMap("output_token_cost")
    @Validation(required = true)
    public Long outputTokenCost;

    // 思维链模块显示名称
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;知识查询&quot; </p>
     */
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 思维链模块是否为进行中阶段的输出
    // 
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_running")
    @Validation(required = true)
    public Boolean isRunning;

    // 思维链模块类型：DECISION or GENERATE
    // 
    /**
     * <strong>example:</strong>
     * <p>DECISION</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 思维链模块子类型：content_search 知识查询 / llm 大模型 / tool 工具 / workflow 工作流 / end 结束 / parameter 参数处理
    // 
    /**
     * <strong>example:</strong>
     * <p>content_search</p>
     */
    @NameInMap("sub_type")
    @Validation(required = true)
    public String subType;

    // 思维链模块子类型关联id。如果是工具，那就是 platform_api_plugin 表的 id；如果是工作流，那就是 platform_intent 表的 id
    // 
    @NameInMap("ref_resource_id")
    @Validation(required = true)
    public Long refResourceId;

    // 思维链模块子类型关联code，一般是工具或工作流类型对应的code
    // 
    /**
     * <strong>example:</strong>
     * <p>search_tool</p>
     */
    @NameInMap("ref_resource_code")
    @Validation(required = true)
    public String refResourceCode;

    // 思维链模块子类型关联图标
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;icon.png&quot; </p>
     */
    @NameInMap("ref_resource_icon")
    @Validation(required = true)
    public String refResourceIcon;

    // 思维链模块子类型为工作流时的版本，仅当子类型为工作流时赋值
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ref_workflow_build_version")
    @Validation(required = true)
    public String refWorkflowBuildVersion;

    // 思维链模块子类型为工作流时的运行实例id，仅当子类型为工作流且 refWorkflowBuildVersion 以 NEW 开头时赋值
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ref_workflow_runtime_instance_id")
    @Validation(required = true)
    public String refWorkflowRuntimeInstanceId;

    // 思维链模块入参信息，JSON字符串格式
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;{&quot;key&quot;:&quot;value&quot;}&quot; </p>
     */
    @NameInMap("input_json_string")
    @Validation(required = true)
    public String inputJsonString;

    // 思维链模块出参信息，JSON字符串格式
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;{&quot;result&quot;:&quot;ok&quot;}&quot; </p>
     */
    @NameInMap("output_json_string")
    @Validation(required = true)
    public String outputJsonString;

    // 思维链模块额外消息信息 (如内置工具过程展现内容)，JSON字符串格式
    // 
    /**
     * <strong>example:</strong>
     * <p>&quot;{&quot;info&quot;:&quot;detail&quot;}&quot; </p>
     */
    @NameInMap("extra_info_json_string")
    @Validation(required = true)
    public String extraInfoJsonString;

    public static ThoughtChainDisplayUnit build(java.util.Map<String, ?> map) throws Exception {
        ThoughtChainDisplayUnit self = new ThoughtChainDisplayUnit();
        return TeaModel.build(map, self);
    }

    public ThoughtChainDisplayUnit setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ThoughtChainDisplayUnit setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ThoughtChainDisplayUnit setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ThoughtChainDisplayUnit setLatency(Long latency) {
        this.latency = latency;
        return this;
    }
    public Long getLatency() {
        return this.latency;
    }

    public ThoughtChainDisplayUnit setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public ThoughtChainDisplayUnit setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public ThoughtChainDisplayUnit setOutputTimestamp(Long outputTimestamp) {
        this.outputTimestamp = outputTimestamp;
        return this;
    }
    public Long getOutputTimestamp() {
        return this.outputTimestamp;
    }

    public ThoughtChainDisplayUnit setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public ThoughtChainDisplayUnit setTokenCost(Long tokenCost) {
        this.tokenCost = tokenCost;
        return this;
    }
    public Long getTokenCost() {
        return this.tokenCost;
    }

    public ThoughtChainDisplayUnit setInputTokenCost(Long inputTokenCost) {
        this.inputTokenCost = inputTokenCost;
        return this;
    }
    public Long getInputTokenCost() {
        return this.inputTokenCost;
    }

    public ThoughtChainDisplayUnit setOutputTokenCost(Long outputTokenCost) {
        this.outputTokenCost = outputTokenCost;
        return this;
    }
    public Long getOutputTokenCost() {
        return this.outputTokenCost;
    }

    public ThoughtChainDisplayUnit setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ThoughtChainDisplayUnit setIsRunning(Boolean isRunning) {
        this.isRunning = isRunning;
        return this;
    }
    public Boolean getIsRunning() {
        return this.isRunning;
    }

    public ThoughtChainDisplayUnit setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ThoughtChainDisplayUnit setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public ThoughtChainDisplayUnit setRefResourceId(Long refResourceId) {
        this.refResourceId = refResourceId;
        return this;
    }
    public Long getRefResourceId() {
        return this.refResourceId;
    }

    public ThoughtChainDisplayUnit setRefResourceCode(String refResourceCode) {
        this.refResourceCode = refResourceCode;
        return this;
    }
    public String getRefResourceCode() {
        return this.refResourceCode;
    }

    public ThoughtChainDisplayUnit setRefResourceIcon(String refResourceIcon) {
        this.refResourceIcon = refResourceIcon;
        return this;
    }
    public String getRefResourceIcon() {
        return this.refResourceIcon;
    }

    public ThoughtChainDisplayUnit setRefWorkflowBuildVersion(String refWorkflowBuildVersion) {
        this.refWorkflowBuildVersion = refWorkflowBuildVersion;
        return this;
    }
    public String getRefWorkflowBuildVersion() {
        return this.refWorkflowBuildVersion;
    }

    public ThoughtChainDisplayUnit setRefWorkflowRuntimeInstanceId(String refWorkflowRuntimeInstanceId) {
        this.refWorkflowRuntimeInstanceId = refWorkflowRuntimeInstanceId;
        return this;
    }
    public String getRefWorkflowRuntimeInstanceId() {
        return this.refWorkflowRuntimeInstanceId;
    }

    public ThoughtChainDisplayUnit setInputJsonString(String inputJsonString) {
        this.inputJsonString = inputJsonString;
        return this;
    }
    public String getInputJsonString() {
        return this.inputJsonString;
    }

    public ThoughtChainDisplayUnit setOutputJsonString(String outputJsonString) {
        this.outputJsonString = outputJsonString;
        return this;
    }
    public String getOutputJsonString() {
        return this.outputJsonString;
    }

    public ThoughtChainDisplayUnit setExtraInfoJsonString(String extraInfoJsonString) {
        this.extraInfoJsonString = extraInfoJsonString;
        return this;
    }
    public String getExtraInfoJsonString() {
        return this.extraInfoJsonString;
    }

}
