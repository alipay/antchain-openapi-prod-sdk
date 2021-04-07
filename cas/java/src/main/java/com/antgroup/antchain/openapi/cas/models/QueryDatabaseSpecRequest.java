// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDatabaseSpecRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // custom_storage
    @NameInMap("custom_storage")
    public Boolean customStorage;

    // engines
    @NameInMap("engines")
    public java.util.List<String> engines;

    // engine_versions
    @NameInMap("engine_versions")
    public java.util.List<String> engineVersions;

    // iaas_ids
    @NameInMap("iaas_ids")
    public java.util.List<String> iaasIds;

    // ids
    @NameInMap("ids")
    public java.util.List<String> ids;

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

    // pageSize
    @NameInMap("page_size")
    public Long pageSize;

    // types
    @NameInMap("types")
    public java.util.List<String> types;

    // provider_ids
    @NameInMap("provider_ids")
    public java.util.List<String> providerIds;

    // enable
    @NameInMap("enable")
    public Boolean enable;

    // iaas_types
    @NameInMap("iaas_types")
    public java.util.List<String> iaasTypes;

    public static QueryDatabaseSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatabaseSpecRequest self = new QueryDatabaseSpecRequest();
        return TeaModel.build(map, self);
    }

    public QueryDatabaseSpecRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDatabaseSpecRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryDatabaseSpecRequest setCustomStorage(Boolean customStorage) {
        this.customStorage = customStorage;
        return this;
    }
    public Boolean getCustomStorage() {
        return this.customStorage;
    }

    public QueryDatabaseSpecRequest setEngines(java.util.List<String> engines) {
        this.engines = engines;
        return this;
    }
    public java.util.List<String> getEngines() {
        return this.engines;
    }

    public QueryDatabaseSpecRequest setEngineVersions(java.util.List<String> engineVersions) {
        this.engineVersions = engineVersions;
        return this;
    }
    public java.util.List<String> getEngineVersions() {
        return this.engineVersions;
    }

    public QueryDatabaseSpecRequest setIaasIds(java.util.List<String> iaasIds) {
        this.iaasIds = iaasIds;
        return this;
    }
    public java.util.List<String> getIaasIds() {
        return this.iaasIds;
    }

    public QueryDatabaseSpecRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

    public QueryDatabaseSpecRequest setMaxCpu(Long maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public Long getMaxCpu() {
        return this.maxCpu;
    }

    public QueryDatabaseSpecRequest setMaxMaxConnections(Long maxMaxConnections) {
        this.maxMaxConnections = maxMaxConnections;
        return this;
    }
    public Long getMaxMaxConnections() {
        return this.maxMaxConnections;
    }

    public QueryDatabaseSpecRequest setMaxMaxIops(Long maxMaxIops) {
        this.maxMaxIops = maxMaxIops;
        return this;
    }
    public Long getMaxMaxIops() {
        return this.maxMaxIops;
    }

    public QueryDatabaseSpecRequest setMaxMemory(Long maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }
    public Long getMaxMemory() {
        return this.maxMemory;
    }

    public QueryDatabaseSpecRequest setMinCpu(Long minCpu) {
        this.minCpu = minCpu;
        return this;
    }
    public Long getMinCpu() {
        return this.minCpu;
    }

    public QueryDatabaseSpecRequest setMinMaxConnections(Long minMaxConnections) {
        this.minMaxConnections = minMaxConnections;
        return this;
    }
    public Long getMinMaxConnections() {
        return this.minMaxConnections;
    }

    public QueryDatabaseSpecRequest setMinMaxIops(Long minMaxIops) {
        this.minMaxIops = minMaxIops;
        return this;
    }
    public Long getMinMaxIops() {
        return this.minMaxIops;
    }

    public QueryDatabaseSpecRequest setMinMemory(Long minMemory) {
        this.minMemory = minMemory;
        return this;
    }
    public Long getMinMemory() {
        return this.minMemory;
    }

    public QueryDatabaseSpecRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDatabaseSpecRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public QueryDatabaseSpecRequest setProviderIds(java.util.List<String> providerIds) {
        this.providerIds = providerIds;
        return this;
    }
    public java.util.List<String> getProviderIds() {
        return this.providerIds;
    }

    public QueryDatabaseSpecRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public QueryDatabaseSpecRequest setIaasTypes(java.util.List<String> iaasTypes) {
        this.iaasTypes = iaasTypes;
        return this;
    }
    public java.util.List<String> getIaasTypes() {
        return this.iaasTypes;
    }

}
