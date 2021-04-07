// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Database extends TeaModel {
    // app_ids
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // app_service_ids
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // assignedApps
    @NameInMap("assigned_apps")
    public java.util.List<AssignedApp> assignedApps;

    // assigned_app_service_ids
    @NameInMap("assigned_app_service_ids")
    public java.util.List<String> assignedAppServiceIds;

    // autoRenew
    @NameInMap("auto_renew")
    public Boolean autoRenew;

    // auto_renew_period
    @NameInMap("auto_renew_period")
    public Long autoRenewPeriod;

    // connection_address
    @NameInMap("connection_address")
    public String connectionAddress;

    // cpu
    @NameInMap("cpu")
    public Long cpu;

    // description
    @NameInMap("description")
    public String description;

    // engine
    @NameInMap("engine")
    public String engine;

    // engine_version
    @NameInMap("engine_version")
    public String engineVersion;

    // iaasId
    @NameInMap("iaas_id")
    public String iaasId;

    // iaas_type
    @NameInMap("iaas_type")
    public String iaasType;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // master_zone_id
    @NameInMap("master_zone_id")
    public String masterZoneId;

    // max_connections
    @NameInMap("max_connections")
    public Long maxConnections;

    // max_iops
    @NameInMap("max_iops")
    public Long maxIops;

    // memory
    @NameInMap("memory")
    public Long memory;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // network_type
    @NameInMap("network_type")
    public String networkType;

    // net_type
    @NameInMap("net_type")
    public String netType;

    // port
    @NameInMap("port")
    public Long port;

    // shared_workspace_ids
    @NameInMap("shared_workspace_ids")
    public java.util.List<String> sharedWorkspaceIds;

    // spec_iaas_id
    @NameInMap("spec_iaas_id")
    public String specIaasId;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // storage
    @NameInMap("storage")
    public Long storage;

    // type
    @NameInMap("type")
    public String type;

    // utc_create
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utc_modified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // vpc_id
    @NameInMap("vpc_id")
    public String vpcId;

    // v_switch_iaas_id
    @NameInMap("v_switch_iaas_id")
    public String vSwitchIaasId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    public static Database build(java.util.Map<String, ?> map) throws Exception {
        Database self = new Database();
        return TeaModel.build(map, self);
    }

    public Database setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public Database setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public Database setAssignedApps(java.util.List<AssignedApp> assignedApps) {
        this.assignedApps = assignedApps;
        return this;
    }
    public java.util.List<AssignedApp> getAssignedApps() {
        return this.assignedApps;
    }

    public Database setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
        this.assignedAppServiceIds = assignedAppServiceIds;
        return this;
    }
    public java.util.List<String> getAssignedAppServiceIds() {
        return this.assignedAppServiceIds;
    }

    public Database setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public Database setAutoRenewPeriod(Long autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public Database setConnectionAddress(String connectionAddress) {
        this.connectionAddress = connectionAddress;
        return this;
    }
    public String getConnectionAddress() {
        return this.connectionAddress;
    }

    public Database setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public Database setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Database setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public Database setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public Database setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public Database setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public Database setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Database setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public Database setMaxConnections(Long maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Long getMaxConnections() {
        return this.maxConnections;
    }

    public Database setMaxIops(Long maxIops) {
        this.maxIops = maxIops;
        return this;
    }
    public Long getMaxIops() {
        return this.maxIops;
    }

    public Database setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public Database setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Database setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public Database setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public Database setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public Database setSharedWorkspaceIds(java.util.List<String> sharedWorkspaceIds) {
        this.sharedWorkspaceIds = sharedWorkspaceIds;
        return this;
    }
    public java.util.List<String> getSharedWorkspaceIds() {
        return this.sharedWorkspaceIds;
    }

    public Database setSpecIaasId(String specIaasId) {
        this.specIaasId = specIaasId;
        return this;
    }
    public String getSpecIaasId() {
        return this.specIaasId;
    }

    public Database setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Database setStorage(Long storage) {
        this.storage = storage;
        return this;
    }
    public Long getStorage() {
        return this.storage;
    }

    public Database setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Database setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public Database setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public Database setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public Database setVSwitchIaasId(String vSwitchIaasId) {
        this.vSwitchIaasId = vSwitchIaasId;
        return this;
    }
    public String getVSwitchIaasId() {
        return this.vSwitchIaasId;
    }

    public Database setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
