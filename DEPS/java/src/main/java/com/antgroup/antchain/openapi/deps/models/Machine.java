// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Machine extends TeaModel {
    // 机器名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所属发布服务id
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // 包版本
    @NameInMap("service_package_version")
    @Validation(required = true)
    public String servicePackageVersion;

    // 应用服务分组集合 ID
    @NameInMap("service_group_collection_id")
    @Validation(required = true)
    public String serviceGroupCollectionId;

    // 发布分组 ID
    @NameInMap("service_group_id")
    @Validation(required = true)
    public String serviceGroupId;

    // 概览 ID
    @NameInMap("arrangement_id")
    @Validation(required = true)
    public String arrangementId;

    // 服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // paas 服务 ID
    @NameInMap("paas_service_id")
    @Validation(required = true)
    public String paasServiceId;

    // paas 状态
    @NameInMap("paas_state")
    @Validation(required = true)
    public String paasState;

    // 关联目标 ID
    @NameInMap("ref_target_id")
    @Validation(required = true)
    public String refTargetId;

    // 目标 iaas id
    @NameInMap("target_iaas_id")
    @Validation(required = true)
    public String targetIaasId;

    // 内网 IP
    @NameInMap("inner_ip")
    @Validation(required = true)
    public String innerIp;

    // 公网 IP
    @NameInMap("public_ip")
    @Validation(required = true)
    public String publicIp;

    // 主机名
    @NameInMap("host_name")
    @Validation(required = true)
    public String hostName;

    // 主机域名
    @NameInMap("host_domain")
    @Validation(required = true)
    public String hostDomain;

    // 安全组ID
    @NameInMap("security_domain_id")
    @Validation(required = true)
    public String securityDomainId;

    // 安全组创建人 ID
    @NameInMap("security_domain_creator_id")
    @Validation(required = true)
    public String securityDomainCreatorId;

    // 安全组名
    @NameInMap("security_domain_name")
    @Validation(required = true)
    public String securityDomainName;

    // 默认执行账号
    @NameInMap("default_execute_account")
    @Validation(required = true)
    public String defaultExecuteAccount;

    // 可用区 ID
    @NameInMap("zone_id")
    @Validation(required = true)
    public String zoneId;

    // 部署单元 ID
    @NameInMap("cell_id")
    @Validation(required = true)
    public String cellId;

    // 用户名
    @NameInMap("username")
    @Validation(required = true)
    public String username;

    // 加密密码
    @NameInMap("encoded_pwd")
    @Validation(required = true)
    public String encodedPwd;

    // 加密秘钥
    @NameInMap("encoded_secrey_key")
    @Validation(required = true)
    public String encodedSecreyKey;

    // 公钥
    @NameInMap("public_key")
    @Validation(required = true)
    public String publicKey;

    // star manage ip
    @NameInMap("star_manager_ip")
    @Validation(required = true)
    public String starManagerIp;

    // star manager port
    @NameInMap("star_manager_port")
    @Validation(required = true)
    public Long starManagerPort;

    // 初始化脚本 url
    @NameInMap("script_url")
    @Validation(required = true)
    public String scriptUrl;

    // 特殊初始化脚本 url
    @NameInMap("special_script_url")
    @Validation(required = true)
    public String specialScriptUrl;

    // 代理 url
    @NameInMap("agent_url")
    @Validation(required = true)
    public String agentUrl;

    // 代理设置 url
    @NameInMap("agent_setup_url")
    @Validation(required = true)
    public String agentSetupUrl;

    // 机器初始 url
    @NameInMap("machine_init_url")
    @Validation(required = true)
    public String machineInitUrl;

    // 特殊机器初始 url
    @NameInMap("special_machine_init_url")
    @Validation(required = true)
    public String specialMachineInitUrl;

    // 控制类型
    @NameInMap("control_type")
    @Validation(required = true)
    public String controlType;

    // 控制对象
    @NameInMap("control_target")
    @Validation(required = true)
    public String controlTarget;

    // 是否需要初始化
    @NameInMap("need_initialize")
    @Validation(required = true)
    public Boolean needInitialize;

    // SLB 信息
    @NameInMap("slb_info_list")
    @Validation(required = true)
    public java.util.List<SLBInfo> slbInfoList;

    // 子任务 id 
    @NameInMap("task_ids")
    @Validation(required = true)
    public java.util.List<String> taskIds;

    // 环境变量
    @NameInMap("env_config")
    @Validation(required = true)
    public java.util.List<Pair> envConfig;

    // pd id
    @NameInMap("process_definition_id")
    @Validation(required = true)
    public String processDefinitionId;

    // 父节点 id
    @NameInMap("parent_id")
    @Validation(required = true)
    public String parentId;

    // 父节点类型
    @NameInMap("parent_entity_type")
    @Validation(required = true)
    public String parentEntityType;

    // 流程节点 ID
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    // 状态
    @NameInMap("state")
    @Validation(required = true)
    public String state;

    // 开始时间
    @NameInMap("started_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String startedTime;

    // 结束时间
    @NameInMap("finished_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String finishedTime;

    // 是否可独立执行
    @NameInMap("standalone_executable")
    @Validation(required = true)
    public Boolean standaloneExecutable;

    // ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static Machine build(java.util.Map<String, ?> map) throws Exception {
        Machine self = new Machine();
        return TeaModel.build(map, self);
    }

    public Machine setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Machine setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public Machine setServicePackageVersion(String servicePackageVersion) {
        this.servicePackageVersion = servicePackageVersion;
        return this;
    }
    public String getServicePackageVersion() {
        return this.servicePackageVersion;
    }

    public Machine setServiceGroupCollectionId(String serviceGroupCollectionId) {
        this.serviceGroupCollectionId = serviceGroupCollectionId;
        return this;
    }
    public String getServiceGroupCollectionId() {
        return this.serviceGroupCollectionId;
    }

    public Machine setServiceGroupId(String serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public String getServiceGroupId() {
        return this.serviceGroupId;
    }

    public Machine setArrangementId(String arrangementId) {
        this.arrangementId = arrangementId;
        return this;
    }
    public String getArrangementId() {
        return this.arrangementId;
    }

    public Machine setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public Machine setPaasServiceId(String paasServiceId) {
        this.paasServiceId = paasServiceId;
        return this;
    }
    public String getPaasServiceId() {
        return this.paasServiceId;
    }

    public Machine setPaasState(String paasState) {
        this.paasState = paasState;
        return this;
    }
    public String getPaasState() {
        return this.paasState;
    }

    public Machine setRefTargetId(String refTargetId) {
        this.refTargetId = refTargetId;
        return this;
    }
    public String getRefTargetId() {
        return this.refTargetId;
    }

    public Machine setTargetIaasId(String targetIaasId) {
        this.targetIaasId = targetIaasId;
        return this;
    }
    public String getTargetIaasId() {
        return this.targetIaasId;
    }

    public Machine setInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }
    public String getInnerIp() {
        return this.innerIp;
    }

    public Machine setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public Machine setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public Machine setHostDomain(String hostDomain) {
        this.hostDomain = hostDomain;
        return this;
    }
    public String getHostDomain() {
        return this.hostDomain;
    }

    public Machine setSecurityDomainId(String securityDomainId) {
        this.securityDomainId = securityDomainId;
        return this;
    }
    public String getSecurityDomainId() {
        return this.securityDomainId;
    }

    public Machine setSecurityDomainCreatorId(String securityDomainCreatorId) {
        this.securityDomainCreatorId = securityDomainCreatorId;
        return this;
    }
    public String getSecurityDomainCreatorId() {
        return this.securityDomainCreatorId;
    }

    public Machine setSecurityDomainName(String securityDomainName) {
        this.securityDomainName = securityDomainName;
        return this;
    }
    public String getSecurityDomainName() {
        return this.securityDomainName;
    }

    public Machine setDefaultExecuteAccount(String defaultExecuteAccount) {
        this.defaultExecuteAccount = defaultExecuteAccount;
        return this;
    }
    public String getDefaultExecuteAccount() {
        return this.defaultExecuteAccount;
    }

    public Machine setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public Machine setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public Machine setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public Machine setEncodedPwd(String encodedPwd) {
        this.encodedPwd = encodedPwd;
        return this;
    }
    public String getEncodedPwd() {
        return this.encodedPwd;
    }

    public Machine setEncodedSecreyKey(String encodedSecreyKey) {
        this.encodedSecreyKey = encodedSecreyKey;
        return this;
    }
    public String getEncodedSecreyKey() {
        return this.encodedSecreyKey;
    }

    public Machine setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public Machine setStarManagerIp(String starManagerIp) {
        this.starManagerIp = starManagerIp;
        return this;
    }
    public String getStarManagerIp() {
        return this.starManagerIp;
    }

    public Machine setStarManagerPort(Long starManagerPort) {
        this.starManagerPort = starManagerPort;
        return this;
    }
    public Long getStarManagerPort() {
        return this.starManagerPort;
    }

    public Machine setScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
        return this;
    }
    public String getScriptUrl() {
        return this.scriptUrl;
    }

    public Machine setSpecialScriptUrl(String specialScriptUrl) {
        this.specialScriptUrl = specialScriptUrl;
        return this;
    }
    public String getSpecialScriptUrl() {
        return this.specialScriptUrl;
    }

    public Machine setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
        return this;
    }
    public String getAgentUrl() {
        return this.agentUrl;
    }

    public Machine setAgentSetupUrl(String agentSetupUrl) {
        this.agentSetupUrl = agentSetupUrl;
        return this;
    }
    public String getAgentSetupUrl() {
        return this.agentSetupUrl;
    }

    public Machine setMachineInitUrl(String machineInitUrl) {
        this.machineInitUrl = machineInitUrl;
        return this;
    }
    public String getMachineInitUrl() {
        return this.machineInitUrl;
    }

    public Machine setSpecialMachineInitUrl(String specialMachineInitUrl) {
        this.specialMachineInitUrl = specialMachineInitUrl;
        return this;
    }
    public String getSpecialMachineInitUrl() {
        return this.specialMachineInitUrl;
    }

    public Machine setControlType(String controlType) {
        this.controlType = controlType;
        return this;
    }
    public String getControlType() {
        return this.controlType;
    }

    public Machine setControlTarget(String controlTarget) {
        this.controlTarget = controlTarget;
        return this;
    }
    public String getControlTarget() {
        return this.controlTarget;
    }

    public Machine setNeedInitialize(Boolean needInitialize) {
        this.needInitialize = needInitialize;
        return this;
    }
    public Boolean getNeedInitialize() {
        return this.needInitialize;
    }

    public Machine setSlbInfoList(java.util.List<SLBInfo> slbInfoList) {
        this.slbInfoList = slbInfoList;
        return this;
    }
    public java.util.List<SLBInfo> getSlbInfoList() {
        return this.slbInfoList;
    }

    public Machine setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public Machine setEnvConfig(java.util.List<Pair> envConfig) {
        this.envConfig = envConfig;
        return this;
    }
    public java.util.List<Pair> getEnvConfig() {
        return this.envConfig;
    }

    public Machine setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    public Machine setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public Machine setParentEntityType(String parentEntityType) {
        this.parentEntityType = parentEntityType;
        return this;
    }
    public String getParentEntityType() {
        return this.parentEntityType;
    }

    public Machine setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public Machine setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public Machine setStartedTime(String startedTime) {
        this.startedTime = startedTime;
        return this;
    }
    public String getStartedTime() {
        return this.startedTime;
    }

    public Machine setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
        return this;
    }
    public String getFinishedTime() {
        return this.finishedTime;
    }

    public Machine setStandaloneExecutable(Boolean standaloneExecutable) {
        this.standaloneExecutable = standaloneExecutable;
        return this;
    }
    public Boolean getStandaloneExecutable() {
        return this.standaloneExecutable;
    }

    public Machine setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
