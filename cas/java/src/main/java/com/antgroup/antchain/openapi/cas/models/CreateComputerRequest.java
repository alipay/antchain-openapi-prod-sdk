// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // app id
    @NameInMap("app_id")
    public String appId;

    // app service id
    @NameInMap("app_service_id")
    public String appServiceId;

    // 是否自动续费
    @NameInMap("auto_renew")
    public Boolean autoRenew;

    // 每次自动续费的时长，当参数AutoRenew取值True时为必填取值范围：
    //    1
    //      2
    //      3
    //       6
    //      12
    //     
    @NameInMap("auto_renew_period")
    public Long autoRenewPeriod;

    // cell id
    @NameInMap("cell_id")
    public String cellId;

    // 通用镜像文件ID，启动实例时选择的镜像资源。
    // 
    @NameInMap("common_image_sequence")
    public String commonImageSequence;

    // AKE模式下可以指定此值
    @NameInMap("cpu_shared")
    public Boolean cpuShared;

    // 数据盘信息
    @NameInMap("data_disks")
    public java.util.List<DataDisk> dataDisks;

    // sigma模式取值，公有云模式下无意义
    @NameInMap("deploy_mode")
    public String deployMode;

    // 实例描述
    // 
    @NameInMap("description")
    public String description;

    // 是否使用全局唯一名称
    @NameInMap("distinct_name")
    public Boolean distinctName;

    // 自定义镜像文件ID，启动实例时选择的镜像资源。
    // 
    @NameInMap("image_sequence")
    public String imageSequence;

    // 计费方式，默认按量计费
    @NameInMap("instance_charge_type")
    public String instanceChargeType;

    // 创建的实例数量。默认为 1 台
    @NameInMap("instance_count")
    public Long instanceCount;

    // 实例名称前缀。可包含小写字母(a-z)，数字(0-9) 和中划线(-)，以字母开头，中划线不能结尾或连续使用，2 ~ 40 个字符。
    @NameInMap("name")
    @Validation(maxLength = 40, minLength = 2)
    public String name;

    // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。特殊符号可以是： ()`~!@#^&*-_+=|{}[]:;'<>,.?/ 其中，Windows实例不能以斜线号（/）为密码首字符。
    @NameInMap("password")
    @Validation(maxLength = 30, minLength = 8)
    public String password;

    // 购买资源的时长，单位为：月。当参数 InstanceChargeType 取值为 PrePaid 时才生效且为必选值。取值范围：1 - 9
    //      12
    //      24
    //      36
    //      48
    //      60
    // 
    @NameInMap("period")
    public Long period;

    //  购买资源的时长。可选值Week | Month。
    //  PeriodUnit 为 Week 时：
    //  Period 取值 {“1”, “2”, “3”, “4”}
    // AutoRenewPeriod 取值 {“1”, “2”, “3”}
    //  Period 取值 { “1”, “2”, “3”, “4”, “5”, “6”, “7”, “8”, “9”, “12”, “24”, “36”,”48”,”60”}
    //    AutoRenewPeriod 取值 {“1”, “2”, “3”, “6”, “12”}
    //     默认值：Month
    @NameInMap("period_unit")
    public String periodUnit;

    // 新创建实例所属于的安全组/域序列号，同一个安全组内的实例之间可以互相访问。
    @NameInMap("security_group_sequence")
    @Validation(required = true)
    public String securityGroupSequence;

    // 实例的资源规格。
    // 
    @NameInMap("spec_id")
    @Validation(required = true)
    public String specId;

    // 单位 G。系统盘大小，需根据选择的 image 类型决定。
    @NameInMap("system_disk_size")
    @Validation(required = true)
    public Long systemDiskSize;

    // 系统盘类型
    // 
    @NameInMap("system_disk_type")
    @Validation(required = true)
    public String systemDiskType;

    // VPC类型的实例，需要指定虚拟交换机ID。
    @NameInMap("v_switch_id")
    public String vSwitchId;

    // 实例所在工作空间
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // workspace_id
    @NameInMap("workspace_id")
    public String workspaceId;

    // 实例所在可用区的 zone identity
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

    // zone_id如果为空，则zone必填，建议使用zone_id
    @NameInMap("zone_id")
    public String zoneId;

    // 公有云上标签
    @NameInMap("tags")
    public java.util.List<MapStringToStringEntity> tags;

    public static CreateComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputerRequest self = new CreateComputerRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateComputerRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateComputerRequest setAppServiceId(String appServiceId) {
        this.appServiceId = appServiceId;
        return this;
    }
    public String getAppServiceId() {
        return this.appServiceId;
    }

    public CreateComputerRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateComputerRequest setAutoRenewPeriod(Long autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Long getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateComputerRequest setCellId(String cellId) {
        this.cellId = cellId;
        return this;
    }
    public String getCellId() {
        return this.cellId;
    }

    public CreateComputerRequest setCommonImageSequence(String commonImageSequence) {
        this.commonImageSequence = commonImageSequence;
        return this;
    }
    public String getCommonImageSequence() {
        return this.commonImageSequence;
    }

    public CreateComputerRequest setCpuShared(Boolean cpuShared) {
        this.cpuShared = cpuShared;
        return this;
    }
    public Boolean getCpuShared() {
        return this.cpuShared;
    }

    public CreateComputerRequest setDataDisks(java.util.List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    public CreateComputerRequest setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateComputerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateComputerRequest setDistinctName(Boolean distinctName) {
        this.distinctName = distinctName;
        return this;
    }
    public Boolean getDistinctName() {
        return this.distinctName;
    }

    public CreateComputerRequest setImageSequence(String imageSequence) {
        this.imageSequence = imageSequence;
        return this;
    }
    public String getImageSequence() {
        return this.imageSequence;
    }

    public CreateComputerRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateComputerRequest setInstanceCount(Long instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    public CreateComputerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComputerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateComputerRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public CreateComputerRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateComputerRequest setSecurityGroupSequence(String securityGroupSequence) {
        this.securityGroupSequence = securityGroupSequence;
        return this;
    }
    public String getSecurityGroupSequence() {
        return this.securityGroupSequence;
    }

    public CreateComputerRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public CreateComputerRequest setSystemDiskSize(Long systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Long getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateComputerRequest setSystemDiskType(String systemDiskType) {
        this.systemDiskType = systemDiskType;
        return this;
    }
    public String getSystemDiskType() {
        return this.systemDiskType;
    }

    public CreateComputerRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateComputerRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public CreateComputerRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateComputerRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public CreateComputerRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CreateComputerRequest setTags(java.util.List<MapStringToStringEntity> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<MapStringToStringEntity> getTags() {
        return this.tags;
    }

}
