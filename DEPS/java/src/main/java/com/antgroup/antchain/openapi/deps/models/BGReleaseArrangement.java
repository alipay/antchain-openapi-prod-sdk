// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class BGReleaseArrangement extends TeaModel {
    // 活跃单元 ID
    @NameInMap("active_unit_id")
    public String activeUnitId;

    // 非活跃单元 ID
    @NameInMap("deactivated_unit_id")
    public String deactivatedUnitId;

    // 灰度进程ID
    @NameInMap("gray_traffic_process_id")
    public String grayTrafficProcessId;

    // 回滚进程ID
    @NameInMap("rollback_process_id")
    public String rollbackProcessId;

    // 发布应用信息集合
    @NameInMap("service_info_collection")
    public java.util.List<ServiceInfo> serviceInfoCollection;

    // 类型
    @NameInMap("step_type")
    public String stepType;

    // 单元类型
    @NameInMap("unit_type")
    public String unitType;

    // 名称
    @NameInMap("name")
    public String name;

    // 类型
    @NameInMap("arrangement_type")
    public String arrangementType;

    // 环境变量
    @NameInMap("env_config")
    public java.util.List<Pair> envConfig;

    // 合法状态列表
    @NameInMap("targets_legal_states")
    public java.util.List<OpsTargetLegalStates> targetsLegalStates;

    // 运维进程ID
    @NameInMap("process_definition_id")
    public String processDefinitionId;

    // 父运维进程ID
    @NameInMap("parent_id")
    public String parentId;

    // 父进程类型
    @NameInMap("parent_entity_type")
    public String parentEntityType;

    // 支持的转换类型
    @NameInMap("supported_transitions")
    public java.util.List<String> supportedTransitions;

    // 流程节点 ID
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

    // 是否可以独立运行
    @NameInMap("standalone_executable")
    public Boolean standaloneExecutable;

    // ID
    @NameInMap("id")
    public String id;

    public static BGReleaseArrangement build(java.util.Map<String, ?> map) throws Exception {
        BGReleaseArrangement self = new BGReleaseArrangement();
        return TeaModel.build(map, self);
    }

    public BGReleaseArrangement setActiveUnitId(String activeUnitId) {
        this.activeUnitId = activeUnitId;
        return this;
    }
    public String getActiveUnitId() {
        return this.activeUnitId;
    }

    public BGReleaseArrangement setDeactivatedUnitId(String deactivatedUnitId) {
        this.deactivatedUnitId = deactivatedUnitId;
        return this;
    }
    public String getDeactivatedUnitId() {
        return this.deactivatedUnitId;
    }

    public BGReleaseArrangement setGrayTrafficProcessId(String grayTrafficProcessId) {
        this.grayTrafficProcessId = grayTrafficProcessId;
        return this;
    }
    public String getGrayTrafficProcessId() {
        return this.grayTrafficProcessId;
    }

    public BGReleaseArrangement setRollbackProcessId(String rollbackProcessId) {
        this.rollbackProcessId = rollbackProcessId;
        return this;
    }
    public String getRollbackProcessId() {
        return this.rollbackProcessId;
    }

    public BGReleaseArrangement setServiceInfoCollection(java.util.List<ServiceInfo> serviceInfoCollection) {
        this.serviceInfoCollection = serviceInfoCollection;
        return this;
    }
    public java.util.List<ServiceInfo> getServiceInfoCollection() {
        return this.serviceInfoCollection;
    }

    public BGReleaseArrangement setStepType(String stepType) {
        this.stepType = stepType;
        return this;
    }
    public String getStepType() {
        return this.stepType;
    }

    public BGReleaseArrangement setUnitType(String unitType) {
        this.unitType = unitType;
        return this;
    }
    public String getUnitType() {
        return this.unitType;
    }

    public BGReleaseArrangement setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BGReleaseArrangement setArrangementType(String arrangementType) {
        this.arrangementType = arrangementType;
        return this;
    }
    public String getArrangementType() {
        return this.arrangementType;
    }

    public BGReleaseArrangement setEnvConfig(java.util.List<Pair> envConfig) {
        this.envConfig = envConfig;
        return this;
    }
    public java.util.List<Pair> getEnvConfig() {
        return this.envConfig;
    }

    public BGReleaseArrangement setTargetsLegalStates(java.util.List<OpsTargetLegalStates> targetsLegalStates) {
        this.targetsLegalStates = targetsLegalStates;
        return this;
    }
    public java.util.List<OpsTargetLegalStates> getTargetsLegalStates() {
        return this.targetsLegalStates;
    }

    public BGReleaseArrangement setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public BGReleaseArrangement setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public BGReleaseArrangement setParentEntityType(String parentEntityType) {
        this.parentEntityType = parentEntityType;
        return this;
    }
    public String getParentEntityType() {
        return this.parentEntityType;
    }

    public BGReleaseArrangement setSupportedTransitions(java.util.List<String> supportedTransitions) {
        this.supportedTransitions = supportedTransitions;
        return this;
    }
    public java.util.List<String> getSupportedTransitions() {
        return this.supportedTransitions;
    }

    public BGReleaseArrangement setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public BGReleaseArrangement setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public BGReleaseArrangement setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public BGReleaseArrangement setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public BGReleaseArrangement setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public BGReleaseArrangement setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
