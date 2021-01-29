// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateComputerRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 实例描述
    @NameInMap("description")
    public String description;

    // 镜像文件ID，启动实例时选择的镜像资源。
    @NameInMap("image_id")
    @Validation(required = true)
    public String imageId;

    // 创建的实例数量。默认为 1 台
    @NameInMap("instance_count")
    public Long instanceCount;

    // 实例名称前缀。可包含小写字母(a-z)，数字(0-9) 和中划线(-)，以字母开头，中划线不能结尾或连续使用，2 ~ 40 个字符。
    @NameInMap("name")
    public String name;

    // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。特殊符号可以是：
    // ()`~!@#^&*-_+=|{}[]:;'<>,.?/
    // 其中，Windows实例不能以斜线号（/）为密码首字符。
    @NameInMap("paasword")
    @Validation(maxLength = 30, minLength = 8)
    public String paasword;

    // 实例所在地域
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    // image 或者 package
    @NameInMap("deploy_type")
    public String deployType;

    // 新创建实例所属于的安全组ID，同一个安全组内的实例之间可以互相访问。
    @NameInMap("security_group_id")
    @Validation(required = true)
    public String securityGroupId;

    // 实例的资源规格。
    @NameInMap("spec_id")
    @Validation(required = true)
    public String specId;

    // 单位 G。系统盘大小，需根据选择的 image 类型决定。
    @NameInMap("system_disk_size")
    @Validation(required = true)
    public String systemDiskSize;

    // 系统盘类型
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

    // 实例所在可用区
    @NameInMap("zone")
    @Validation(required = true)
    public String zone;

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

    public CreateComputerRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateComputerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateComputerRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
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

    public CreateComputerRequest setPaasword(String paasword) {
        this.paasword = paasword;
        return this;
    }
    public String getPaasword() {
        return this.paasword;
    }

    public CreateComputerRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateComputerRequest setDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }
    public String getDeployType() {
        return this.deployType;
    }

    public CreateComputerRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateComputerRequest setSpecId(String specId) {
        this.specId = specId;
        return this;
    }
    public String getSpecId() {
        return this.specId;
    }

    public CreateComputerRequest setSystemDiskSize(String systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public String getSystemDiskSize() {
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

    public CreateComputerRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
