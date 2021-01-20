// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class MachineGroup extends TeaModel {
    // 机器名
    @NameInMap("name")
    public String name;

    // 所属发布服务 ID
    @NameInMap("service_id")
    public String serviceId;

    // 所属发布服务分组 ID
    @NameInMap("service_group_id")
    public String serviceGroupId;

    // 发布服务分组集合 ID
    @NameInMap("service_group_collection_id")
    public String serviceGroupCollectionId;

    // 概览 ID
    @NameInMap("arrangement_id")
    public String arrangementId;

    // 服务类型
    @NameInMap("service_type")
    public String serviceType;

    // paas 服务 ID
    @NameInMap("paas_service_id")
    public String paasServiceId;

    // 是否 beta 分组
    @NameInMap("need_beta")
    public Boolean needBeta;

    // 是否需要确认
    @NameInMap("need_confirm")
    public Boolean needConfirm;

    // 是否需要分组预确认
    @NameInMap("need_reserve")
    public Boolean needReserve;

    // 是否需要引流确认
    @NameInMap("need_confirm_traffic")
    public Boolean needConfirmTraffic;

    // 机器信息组
    @NameInMap("machines")
    public java.util.List<Machine> machines;

    // pd id
    @NameInMap("process_definition_id")
    public String processDefinitionId;

    // 父节点 ID
    @NameInMap("parent_id")
    public String parentId;

    // 父节点类型
    @NameInMap("parent_entity_type")
    public String parentEntityType;

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

    // 是否可以独立执行
    @NameInMap("standalone_executable")
    public Boolean standaloneExecutable;

    // ID
    @NameInMap("id")
    public String id;

    public static MachineGroup build(java.util.Map<String, ?> map) throws Exception {
        MachineGroup self = new MachineGroup();
        return TeaModel.build(map, self);
    }

    public MachineGroup setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MachineGroup setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public MachineGroup setServiceGroupId(String serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public String getServiceGroupId() {
        return this.serviceGroupId;
    }

    public MachineGroup setServiceGroupCollectionId(String serviceGroupCollectionId) {
        this.serviceGroupCollectionId = serviceGroupCollectionId;
        return this;
    }
    public String getServiceGroupCollectionId() {
        return this.serviceGroupCollectionId;
    }

    public MachineGroup setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public MachineGroup setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public MachineGroup setPaasServiceId(String paasServiceId) {
        this.paasServiceId = paasServiceId;
        return this;
    }
    public String getPaasServiceId() {
        return this.paasServiceId;
    }

    public MachineGroup setNeedBeta(Boolean needBeta) {
        this.needBeta = needBeta;
        return this;
    }
    public Boolean getNeedBeta() {
        return this.needBeta;
    }

    public MachineGroup setNeedConfirm(Boolean needConfirm) {
        this.needConfirm = needConfirm;
        return this;
    }
    public Boolean getNeedConfirm() {
        return this.needConfirm;
    }

    public MachineGroup setNeedReserve(Boolean needReserve) {
        this.needReserve = needReserve;
        return this;
    }
    public Boolean getNeedReserve() {
        return this.needReserve;
    }

    public MachineGroup setNeedConfirmTraffic(Boolean needConfirmTraffic) {
        this.needConfirmTraffic = needConfirmTraffic;
        return this;
    }
    public Boolean getNeedConfirmTraffic() {
        return this.needConfirmTraffic;
    }

    public MachineGroup setMachines(java.util.List<Machine> machines) {
        this.machines = machines;
        return this;
    }
    public java.util.List<Machine> getMachines() {
        return this.machines;
    }

    public MachineGroup setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public MachineGroup setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public MachineGroup setParentEntityType(String parentEntityType) {
        this.parentEntityType = parentEntityType;
        return this;
    }
    public String getParentEntityType() {
        return this.parentEntityType;
    }

    public MachineGroup setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public MachineGroup setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public MachineGroup setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public MachineGroup setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public MachineGroup setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public MachineGroup setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
