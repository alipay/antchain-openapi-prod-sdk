// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DepsDatabase extends TeaModel {
    // 服务实例列表
    @NameInMap("app_services")
    public java.util.List<AppService> appServices;

    // 连接地址
    @NameInMap("connection_address")
    public String connectionAddress;

    // CPU
    @NameInMap("cpu")
    public Long cpu;

    // 数据库类型，取值 MYSQL, OCEANBASE
    @NameInMap("engine")
    public String engine;

    // 数据库版本，取值 MYSQL5, MYSQL6, MYSQL7, OCEANBASE1_4, 分别对应Mysql5.5, 5.6, 5.7, Ocea
    @NameInMap("engine_version")
    public String engineVersion;

    // iaaS在创建该资源时为其分配的唯一标示，创建中或创建失败时为空
    @NameInMap("iaas_id")
    public String iaasId;

    // 资源唯一标识
    @NameInMap("id")
    public String id;

    // 最大连接数
    @NameInMap("max_connections")
    public Long maxConnections;

    // 最大IOPS
    @NameInMap("max_iops")
    public Long maxIops;

    // 内存大小，单位：MB
    @NameInMap("memory")
    public Long memory;

    // 资源名称
    @NameInMap("name")
    public String name;

    // 网络类型，Classic或VPC
    @NameInMap("network_type")
    public String networkType;

    // 网络连接类型，取值 Internet：外网，Intranet：内网
    @NameInMap("net_type")
    public String netType;

    // 连接端口
    @NameInMap("port")
    public Long port;

    // 资源所属的地域id
    @NameInMap("region")
    public String region;

    // 数据库实例规格
    @NameInMap("spec_iaas_id")
    public String specIaasId;

    // 
    //                     
    //               资源状态，取值 CREATING：正在创建，CREATEFAILED：创建失败，RUNNING: 运行中，REBOOTING: 重启，REBOOT_FAILED: 重启失败，
    //               DELETING：正在删除，DELETED：删除成功，DELETE_FAILED：删除失败，RESOURCE_IMPORTING：资源导入中，RESOURCE_IMPORT_FAILED：资源导入失败，
    //               RESOURCE_REMOVING：资源删除中，RESOURCE_REMOVE_FAILED：资源删除失败，DBINSTANCECLASSCHANGING：修改规格中，
    //               MODIFY_SPEC_FAILED：修改规格失败
    //                 
    @NameInMap("status")
    public String status;

    // 存储空间GB
    @NameInMap("storage")
    public Long storage;

    public static DepsDatabase build(java.util.Map<String, ?> map) throws Exception {
        DepsDatabase self = new DepsDatabase();
        return TeaModel.build(map, self);
    }

    public DepsDatabase setAppServices(java.util.List<AppService> appServices) {
        this.appServices = appServices;
        return this;
    }
    public java.util.List<AppService> getAppServices() {
        return this.appServices;
    }

    public DepsDatabase setConnectionAddress(String connectionAddress) {
        this.connectionAddress = connectionAddress;
        return this;
    }
    public String getConnectionAddress() {
        return this.connectionAddress;
    }

    public DepsDatabase setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public DepsDatabase setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DepsDatabase setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DepsDatabase setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public DepsDatabase setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DepsDatabase setMaxConnections(Long maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public Long getMaxConnections() {
        return this.maxConnections;
    }

    public DepsDatabase setMaxIops(Long maxIops) {
        this.maxIops = maxIops;
        return this;
    }
    public Long getMaxIops() {
        return this.maxIops;
    }

    public DepsDatabase setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public DepsDatabase setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DepsDatabase setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DepsDatabase setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public DepsDatabase setPort(Long port) {
        this.port = port;
        return this;
    }
    public Long getPort() {
        return this.port;
    }

    public DepsDatabase setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DepsDatabase setSpecIaasId(String specIaasId) {
        this.specIaasId = specIaasId;
        return this;
    }
    public String getSpecIaasId() {
        return this.specIaasId;
    }

    public DepsDatabase setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DepsDatabase setStorage(Long storage) {
        this.storage = storage;
        return this;
    }
    public Long getStorage() {
        return this.storage;
    }

}
