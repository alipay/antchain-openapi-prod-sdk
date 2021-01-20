// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class OpsProcessDefinition extends TeaModel {
    // 描述
    @NameInMap("description")
    public String description;

    // 指令名称
    @NameInMap("instruction")
    public String instruction;

    // 进程名
    @NameInMap("name")
    public String name;

    // 运维类型
    @NameInMap("ops_type")
    public String opsType;

    // 发布单ID
    @NameInMap("plan_id")
    public String planId;

    // 类型
    @NameInMap("type")
    public String type;

    // 概览信息
    @NameInMap("arrangements")
    public java.util.List<ArrangementInfo> arrangements;

    // 环境变量
    @NameInMap("env_config")
    public java.util.List<Pair> envConfig;

    // 支持的状态转换列表
    @NameInMap("supported_transitions")
    public java.util.List<String> supportedTransitions;

    // 节点ID
    @NameInMap("node_id")
    public String nodeId;

    // 状态
    @NameInMap("state")
    public String state;

    // 开始时间
    @NameInMap("started_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String startedTime;

    // 结束时间
    @NameInMap("finished_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String finishedTime;

    // 可独立执行
    @NameInMap("standalone_executable")
    public Boolean standaloneExecutable;

    // ID
    @NameInMap("id")
    public String id;

    public static OpsProcessDefinition build(java.util.Map<String, ?> map) throws Exception {
        OpsProcessDefinition self = new OpsProcessDefinition();
        return TeaModel.build(map, self);
    }

    public OpsProcessDefinition setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OpsProcessDefinition setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public OpsProcessDefinition setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpsProcessDefinition setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public OpsProcessDefinition setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public OpsProcessDefinition setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public OpsProcessDefinition setArrangements(java.util.List<ArrangementInfo> arrangements) {
        this.arrangements = arrangements;
        return this;
    }
    public java.util.List<ArrangementInfo> getArrangements() {
        return this.arrangements;
    }

    public OpsProcessDefinition setEnvConfig(java.util.List<Pair> envConfig) {
        this.envConfig = envConfig;
        return this;
    }
    public java.util.List<Pair> getEnvConfig() {
        return this.envConfig;
    }

    public OpsProcessDefinition setSupportedTransitions(java.util.List<String> supportedTransitions) {
        this.supportedTransitions = supportedTransitions;
        return this;
    }
    public java.util.List<String> getSupportedTransitions() {
        return this.supportedTransitions;
    }

    public OpsProcessDefinition setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public OpsProcessDefinition setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public OpsProcessDefinition setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public OpsProcessDefinition setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public OpsProcessDefinition setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public OpsProcessDefinition setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
