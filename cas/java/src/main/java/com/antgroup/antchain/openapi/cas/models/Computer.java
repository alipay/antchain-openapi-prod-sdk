// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class Computer extends TeaModel {
    // app_id
    @NameInMap("app_id")
    public String appId;

    // appServiceIds
    @NameInMap("app_service_ids")
    public java.util.List<String> appServiceIds;

    // assignedAppServiceIds
    @NameInMap("assigned_app_service_ids")
    public java.util.List<String> assignedAppServiceIds;

    // 是否自动续费
    @NameInMap("auto_renew")
    public Boolean autoRenew;

    // 每次自动续费的时长，当参数AutoRenew取值True时为必填。
    @NameInMap("auto_renew_period")
    public Long autoRenewPeriod;

    // bandwidth
    @NameInMap("bandwidth")
    public Long bandwidth;

    // common_image
    @NameInMap("common_image")
    public Boolean commonImage;

    // vCPU数。
    @NameInMap("cpu")
    public Long cpu;

    // cpu_shared
    @NameInMap("cpu_shared")
    public Boolean cpuShared;

    // 实例创建时间
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTime;

    // data_disk
    @NameInMap("data_disks")
    public java.util.List<Disk> dataDisks;

    // 这是SIGMA模式下的专用字段，阿里云模式下无意义
    @NameInMap("deploy_mode")
    public String deployMode;

    // 服务器描述
    @NameInMap("description")
    public String description;

    // elastic_ip
    @NameInMap("elastic_ip")
    public String elasticIp;

    // 过期时间
    @NameInMap("expired_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expiredTime;

    // ecs iaas id
    @NameInMap("iaas_id")
    public String iaasId;

    // iaasStatus
    @NameInMap("iaas_status")
    public String iaasStatus;

    // iaasType
    @NameInMap("iaas_type")
    public String iaasType;

    // 主机id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // image_iaas_id
    @NameInMap("image_iaas_id")
    public String imageIaasId;

    // image_id
    @NameInMap("image_id")
    public String imageId;

    // image_name
    @NameInMap("image_name")
    public String imageName;

    // initialized
    @NameInMap("initialized")
    public Boolean initialized;

    // instanceChargeType
    @NameInMap("instance_charge_type")
    public String instanceChargeType;

    // io_optimized
    @NameInMap("io_optimized")
    public Boolean ioOptimized;

    // last_ops_order_id
    @NameInMap("last_ops_order_id")
    public String lastOpsOrderId;

    // last_ops_type
    @NameInMap("last_ops_type")
    public String lastOpsType;

    // memory
    @NameInMap("memory")
    public Long memory;

    // name
    @NameInMap("name")
    public String name;

    // networkType
    @NameInMap("network_type")
    public String networkType;

    // Options字段
    @NameInMap("options")
    public java.util.List<MapStringToStringEntity> options;

    // os
    @NameInMap("os")
    public String os;

    // os_bit
    @NameInMap("os_bit")
    public Long osBit;

    // os_version
    @NameInMap("os_version")
    public String osVersion;

    // paas_status
    @NameInMap("paas_status")
    public String paasStatus;

    // password
    @NameInMap("password")
    public String password;

    // private_ip
    @NameInMap("private_ip")
    public String privateIp;

    // providerId
    @NameInMap("provider_id")
    public String providerId;

    // public_ip
    @NameInMap("public_ip")
    public String publicIp;

    // regionId
    @NameInMap("region_id")
    public String regionId;

    // serial_number
    @NameInMap("serial_number")
    public String serialNumber;

    // spec_iaas_id
    @NameInMap("spec_iaas_id")
    public String specIaasId;

    // 实例状态。
    @NameInMap("status")
    public String status;

    // system_disk
    @NameInMap("system_disk")
    public Disk systemDisk;

    // Tags
    @NameInMap("tags")
    public java.util.List<MapStringToStringEntity> tags;

    // tenantId
    @NameInMap("tenant_id")
    public String tenantId;

    // tenantId2
    @NameInMap("tenant_id2")
    public String tenantId2;

    // CPU线程数。
    @NameInMap("threads_per_core")
    public Long threadsPerCore;

    // utcCreate
    @NameInMap("utc_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcCreate;

    // utcModified
    @NameInMap("utc_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String utcModified;

    // vpcId
    @NameInMap("vpc_id")
    public String vpcId;

    // vSwitchIaasId
    @NameInMap("v_switch_iaas_id")
    public String vSwitchIaasId;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // zoneId
    @NameInMap("zone_id")
    public String zoneId;

    public static Computer build(java.util.Map<String, ?> map) throws Exception {
        Computer self = new Computer();
        return TeaModel.build(map, self);
    }

    public Computer setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public Computer setAppServiceIds(java.util.List<String> appServiceIds) {
        this.appServiceIds = appServiceIds;
        return this;
    }
    public java.util.List<String> getAppServiceIds() {
        return this.appServiceIds;
    }

    public Computer setAssignedAppServiceIds(java.util.List<String> assignedAppServiceIds) {
        this.assignedAppServiceIds = assignedAppServiceIds;
        return this;
    }
    public java.util.List<String> getAssignedAppServiceIds() {
        return this.assignedAppServiceIds;
    }

    public Computer setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public Computer setAutoRenewPeriod(Long autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public Computer setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public Computer setCommonImage(Boolean commonImage) {
        this.commonImage = commonImage;
        return this;
    }
    public Boolean getCommonImage() {
        return this.commonImage;
    }

    public Computer setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public Computer setCpuShared(Boolean cpuShared) {
        this.cpuShared = cpuShared;
        return this;
    }
    public Boolean getCpuShared() {
        return this.cpuShared;
    }

    public Computer setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public Computer setDataDisks(java.util.List<Disk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<Disk> getDataDisks() {
        return this.dataDisks;
    }

    public Computer setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public Computer setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Computer setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
        return this;
    }
    public String getElasticIp() {
        return this.elasticIp;
    }

    public Computer setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public Computer setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public Computer setIaasStatus(String iaasStatus) {
        this.iaasStatus = iaasStatus;
        return this;
    }
    public String getIaasStatus() {
        return this.iaasStatus;
    }

    public Computer setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public Computer setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Computer setImageIaasId(String imageIaasId) {
        this.imageIaasId = imageIaasId;
        return this;
    }
    public String getImageIaasId() {
        return this.imageIaasId;
    }

    public Computer setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public Computer setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public Computer setInitialized(Boolean initialized) {
        this.initialized = initialized;
        return this;
    }
    public Boolean getInitialized() {
        return this.initialized;
    }

    public Computer setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public Computer setIoOptimized(Boolean ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    public Computer setLastOpsOrderId(String lastOpsOrderId) {
        this.lastOpsOrderId = lastOpsOrderId;
        return this;
    }
    public String getLastOpsOrderId() {
        return this.lastOpsOrderId;
    }

    public Computer setLastOpsType(String lastOpsType) {
        this.lastOpsType = lastOpsType;
        return this;
    }
    public String getLastOpsType() {
        return this.lastOpsType;
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

    public Computer setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public Computer setOptions(java.util.List<MapStringToStringEntity> options) {
        this.options = options;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getOptions() {
        return this.options;
    }

    public Computer setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public Computer setOsBit(Long osBit) {
        this.osBit = osBit;
        return this;
    }
    public Long getOsBit() {
        return this.osBit;
    }

    public Computer setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public Computer setPaasStatus(String paasStatus) {
        this.paasStatus = paasStatus;
        return this;
    }
    public String getPaasStatus() {
        return this.paasStatus;
    }

    public Computer setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public Computer setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public Computer setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public Computer setPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }
    public String getPublicIp() {
        return this.publicIp;
    }

    public Computer setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public Computer setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public Computer setSpecIaasId(String specIaasId) {
        this.specIaasId = specIaasId;
        return this;
    }
    public String getSpecIaasId() {
        return this.specIaasId;
    }

    public Computer setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Computer setSystemDisk(Disk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public Disk getSystemDisk() {
        return this.systemDisk;
    }

    public Computer setTags(java.util.List<MapStringToStringEntity> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getTags() {
        return this.tags;
    }

    public Computer setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Computer setTenantId2(String tenantId2) {
        this.tenantId2 = tenantId2;
        return this;
    }
    public String getTenantId2() {
        return this.tenantId2;
    }

    public Computer setThreadsPerCore(Long threadsPerCore) {
        this.threadsPerCore = threadsPerCore;
        return this;
    }
    public Long getThreadsPerCore() {
        return this.threadsPerCore;
    }

    public Computer setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

    public Computer setUtcModified(String utcModified) {
        this.utcModified = utcModified;
        return this;
    }
    public String getUtcModified() {
        return this.utcModified;
    }

    public Computer setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public Computer setVSwitchIaasId(String vSwitchIaasId) {
        this.vSwitchIaasId = vSwitchIaasId;
        return this;
    }
    public String getVSwitchIaasId() {
        return this.vSwitchIaasId;
    }

    public Computer setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public Computer setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
