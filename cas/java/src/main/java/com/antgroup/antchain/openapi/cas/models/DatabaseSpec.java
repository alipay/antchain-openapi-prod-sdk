// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DatabaseSpec extends TeaModel {
    // cpu
    @NameInMap("cpu")
    public Long cpu;

    // custom_storage
    @NameInMap("custom_storage")
    public Boolean customStorage;

    // engine
    @NameInMap("engine")
    public String engine;

    // engine_version
    @NameInMap("engine_version")
    public java.util.List<String> engineVersion;

    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    // id
    @NameInMap("id")
    public String id;

    // max_connections
    @NameInMap("max_connections")
    public Long maxConnections;

    // max_iops
    @NameInMap("max_iops")
    public Long maxIops;

    // max_storage
    @NameInMap("max_storage")
    public Long maxStorage;

    // memory
    @NameInMap("memory")
    public Long memory;

    // min_storage
    @NameInMap("min_storage")
    public Long minStorage;

    // name
    @NameInMap("name")
    public String name;

    // supported_storages
    @NameInMap("supported_storages")
    public java.util.List<Long> supportedStorages;

    // type
    @NameInMap("type")
    public String type;

    public static DatabaseSpec build(java.util.Map<String, ?> map) throws Exception {
        DatabaseSpec self = new DatabaseSpec();
        return TeaModel.build(map, self);
    }

    public DatabaseSpec setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public DatabaseSpec setCustomStorage(Boolean customStorage) {
        this.customStorage = customStorage;
        return this;
    }
    public Boolean getCustomStorage() {
        return this.customStorage;
    }

    public DatabaseSpec setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DatabaseSpec setEngineVersion(java.util.List<String> engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public java.util.List<String> getEngineVersion() {
        return this.engineVersion;
    }

    public DatabaseSpec setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public DatabaseSpec setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DatabaseSpec setMaxConnections(Long maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Long getMaxConnections() {
        return this.maxConnections;
    }

    public DatabaseSpec setMaxIops(Long maxIops) {
        this.maxIops = maxIops;
        return this;
    }
    public Long getMaxIops() {
        return this.maxIops;
    }

    public DatabaseSpec setMaxStorage(Long maxStorage) {
        this.maxStorage = maxStorage;
        return this;
    }
    public Long getMaxStorage() {
        return this.maxStorage;
    }

    public DatabaseSpec setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public DatabaseSpec setMinStorage(Long minStorage) {
        this.minStorage = minStorage;
        return this;
    }
    public Long getMinStorage() {
        return this.minStorage;
    }

    public DatabaseSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DatabaseSpec setSupportedStorages(java.util.List<Long> supportedStorages) {
        this.supportedStorages = supportedStorages;
        return this;
    }
    public java.util.List<Long> getSupportedStorages() {
        return this.supportedStorages;
    }

    public DatabaseSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
