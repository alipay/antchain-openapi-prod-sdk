// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Computer extends TeaModel {
    // 服务实例列表
    @NameInMap("app_services")
    public java.util.List<AppService> appServices;

    // 服务器所属的cell ID
    @NameInMap("cell_id")
    public String cellId;

    // 类型:POD/DOCKER_VM
    @NameInMap("computer_type")
    public String computerType;

    // CPU核数
    @NameInMap("cpu")
    public Long cpu;

    // 弹性ip地址
    @NameInMap("elastic_ip")
    public String elasticIp;

    // iaas_id
    @NameInMap("iaas_id")
    public String iaasId;

    // 计算资源唯一标识
    @NameInMap("id")
    public String id;

    // 内网ip地址
    @NameInMap("inner_ip")
    public String innerIp;

    // 内存大小，单位：MB
    @NameInMap("memory")
    public Long memory;

    // 资源名称
    @NameInMap("name")
    public String name;

    // 公网ip地址
    @NameInMap("public_ip")
    public String publicIp;

    // 资源所属的地域id
    @NameInMap("region")
    public String region;

    // 资源状态，取值：
    //                     CREATING：创建中；
    //                     CREATE_FAILED：创建失败；
    //                     CREATED：已创建；
    //                     STARTING：开机中；
    //                     START_FAILED：开机失败；
    //                     UNALLOCATED：待分配；
    //                     INITIALIZING：初始化中；
    //                     INITIALIZE_FAILED：初始化失败；
    //                     OFFLINE：已下线；
    //                     READY：待部署；
    //                     DEPLOYING：部署中；
    //                     DEPLOY_FAILED：部署失败；
    //                     DEPLOYED：已部署；
    //                     RELEASING：释放中；
    //                     RELEASE_FAILED：释放失败；
    //                     STOPPING：关机中；
    //                     STOP_FAILED：关机失败；
    //                     STOPPED：已关机；
    //                     REBOOTING：重启中；
    //                     REBOOT_FAILED：重启失败；
    //                     DISK_INITIALIZING：初始化磁盘中；
    //                     SPEC_CHANGING：变配中；
    //                     LOCKED：被锁定；
    //                     EXPIRED：已过期；
    //                     TO_EXPIR：即将过期；
    //                     DELETING：删除中；
    //                     DELETE_FAILED：删除失败；
    //                     DELETED：删除成功
    //                 
    @NameInMap("status")
    public String status;

    // 资源所属的可用区id
    @NameInMap("zone")
    public String zone;

    // 机器是否镜像化
    @NameInMap("deploy_mode")
    public String deployMode;

    public static Computer build(java.util.Map<String, ?> map) throws Exception {
        Computer self = new Computer();
        return TeaModel.build(map, self);
    }

    public Computer setAppServices(java.util.List<AppService> appServices) {
        this.appServices = appServices;
        return this;
    }
    public java.util.List<AppService> getAppServices() {
        return this.appServices;
    }

    public Computer setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public Computer setComputerType(String computerType) {
        this.computerType = computerType;
        return this;
    }
    public String getComputerType() {
        return this.computerType;
    }

    public Computer setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public Computer setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }
    public String getElasticIp() {
        return this.elasticIp;
    }

    public Computer setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public Computer setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Computer setInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }
    public String getInnerIp() {
        return this.innerIp;
    }

    public Computer setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public Computer setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Computer setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public Computer setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Computer setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Computer setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public Computer setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

}
