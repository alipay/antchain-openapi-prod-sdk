// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_ids
    @NameInMap("app_ids")
    public java.util.List<String> appIds;

    // app_service_ids
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // connection_addresses
    @NameInMap("connection_addresses")
    public java.util.List<String> connectionAddresses;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // engines
    @NameInMap("engines")
    public java.util.List<String> engines;

    // engine_versions
    @NameInMap("engine_versions")
    public java.util.List<String> engineVersions;

    // include_shared
    @NameInMap("include_shared")
    public Boolean includeShared;

    // master_ids
    @NameInMap("master_ids")
    public java.util.List<String> masterIds;

    // max_cpu
    @NameInMap("max_cpu")
    public Long maxCpu;

    // max_max_connections
    @NameInMap("max_max_connections")
    public Long maxMaxConnections;

    // max_max_iops
    @NameInMap("max_max_iops")
    public Long maxMaxIops;

    // max_memory
    @NameInMap("max_memory")
    public Long maxMemory;

    // max_port
    @NameInMap("max_port")
    public Long maxPort;

    // max_storage
    @NameInMap("max_storage")
    public Long maxStorage;

    // min_cpu
    @NameInMap("min_cpu")
    public Long minCpu;

    // min_max_connections
    @NameInMap("min_max_connections")
    public Long minMaxConnections;

    // min_max_iops
    @NameInMap("min_max_iops")
    public Long minMaxIops;

    // min_memory
    @NameInMap("min_memory")
    public Long minMemory;

    // min_port
    @NameInMap("min_port")
    public Long minPort;

    // min_storage
    @NameInMap("min_storage")
    public Long minStorage;

    // name
    @NameInMap("name")
    public String name;

    // network_type
    @NameInMap("network_type")
    public String networkType;

    // net_type
    @NameInMap("net_type")
    public String netType;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // spec_iaas_ids
    @NameInMap("spec_iaas_ids")
    public java.util.List<String> specIaasIds;

    // statuses
    @NameInMap("statuses")
    public java.util.List<String> statuses;

    // types
    @NameInMap("types")
    public java.util.List<String> types;

    // vpc_ids
    @NameInMap("vpc_ids")
    public java.util.List<String> vpcIds;

    // v_switch_iaas_ids
    @NameInMap("v_switch_iaas_ids")
    public java.util.List<String> vSwitchIaasIds;

    // workspace_ids
    @NameInMap("workspace_ids")
    public java.util.List<String> workspaceIds;

    public static QueryDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseRequest self = new QueryDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatabaseRequest setAppIds(java.util.List<String> appIds) {
        this.appIds = appIds;
        return this;
    }
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    public QueryDatabaseRequest setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public QueryDatabaseRequest setConnectionAddresses(java.util.List<String> connectionAddresses) {
        this.connectionAddresses = connectionAddresses;
        return this;
    }
    public java.util.List<String> getConnectionAddresses() {
        return this.connectionAddresses;
    }

    public QueryDatabaseRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDatabaseRequest setEngines(java.util.List<String> engines) {
        this.engines = engines;
        return this;
    }
    public java.util.List<String> getEngines() {
        return this.engines;
    }

    public QueryDatabaseRequest setEngineVersions(java.util.List<String> engineVersions) {
        this.engineVersions = engineVersions;
        return this;
    }
    public java.util.List<String> getEngineVersions() {
        return this.engineVersions;
    }

    public QueryDatabaseRequest setIncludeShared(Boolean includeShared) {
        this.includeShared = includeShared;
        return this;
    }
    public Boolean getIncludeShared() {
        return this.includeShared;
    }

    public QueryDatabaseRequest setMasterIds(java.util.List<String> masterIds) {
        this.masterIds = masterIds;
        return this;
    }
    public java.util.List<String> getMasterIds() {
        return this.masterIds;
    }

    public QueryDatabaseRequest setMaxCpu(Long maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public Long getMaxCpu() {
        return this.maxCpu;
    }

    public QueryDatabaseRequest setMaxMaxConnections(Long maxMaxConnections) {
        this.maxMaxConnections = maxMaxConnections;
        return this;
    }
    public Long getMaxMaxConnections() {
        return this.maxMaxConnections;
    }

    public QueryDatabaseRequest setMaxMaxIops(Long maxMaxIops) {
        this.maxMaxIops = maxMaxIops;
        return this;
    }
    public Long getMaxMaxIops() {
        return this.maxMaxIops;
    }

    public QueryDatabaseRequest setMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }
    public Long getMaxMemory() {
        return this.maxMemory;
    }

    public QueryDatabaseRequest setMaxPort(Long maxPort) {
        this.maxPort = maxPort;
        return this;
    }
    public Long getMaxPort() {
        return this.maxPort;
    }

    public QueryDatabaseRequest setMaxStorage(Long maxStorage) {
        this.maxStorage = maxStorage;
        return this;
    }
    public Long getMaxStorage() {
        return this.maxStorage;
    }

    public QueryDatabaseRequest setMinCpu(Long minCpu) {
        this.minCpu = minCpu;
        return this;
    }
    public Long getMinCpu() {
        return this.minCpu;
    }

    public QueryDatabaseRequest setMinMaxConnections(Long minMaxConnections) {
        this.minMaxConnections = minMaxConnections;
        return this;
    }
    public Long getMinMaxConnections() {
        return this.minMaxConnections;
    }

    public QueryDatabaseRequest setMinMaxIops(Long minMaxIops) {
        this.minMaxIops = minMaxIops;
        return this;
    }
    public Long getMinMaxIops() {
        return this.minMaxIops;
    }

    public QueryDatabaseRequest setMinMemory(Long minMemory) {
        this.minMemory = minMemory;
        return this;
    }
    public Long getMinMemory() {
        return this.minMemory;
    }

    public QueryDatabaseRequest setMinPort(Long minPort) {
        this.minPort = minPort;
        return this;
    }
    public Long getMinPort() {
        return this.minPort;
    }

    public QueryDatabaseRequest setMinStorage(Long minStorage) {
        this.minStorage = minStorage;
        return this;
    }
    public Long getMinStorage() {
        return this.minStorage;
    }

    public QueryDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDatabaseRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public QueryDatabaseRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public QueryDatabaseRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDatabaseRequest setSpecIaasIds(java.util.List<String> specIaasIds) {
        this.specIaasIds = specIaasIds;
        return this;
    }
    public java.util.List<String> getSpecIaasIds() {
        return this.specIaasIds;
    }

    public QueryDatabaseRequest setStatuses(java.util.List<String> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    public QueryDatabaseRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public QueryDatabaseRequest setVpcIds(java.util.List<String> vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public java.util.List<String> getVpcIds() {
        return this.vpcIds;
    }

    public QueryDatabaseRequest setVSwitchIaasIds(java.util.List<String> vSwitchIaasIds) {
        this.vSwitchIaasIds = vSwitchIaasIds;
        return this;
    }
    public java.util.List<String> getVSwitchIaasIds() {
        return this.vSwitchIaasIds;
    }

    public QueryDatabaseRequest setWorkspaceIds(java.util.List<String> workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

}
