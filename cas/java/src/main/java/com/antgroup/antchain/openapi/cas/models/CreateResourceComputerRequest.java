// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateResourceComputerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 实例所属的部署单元
    @NameInMap("cell")
    @Validation(required = true)
    public String cell;

    // 数据盘的云盘种类。取值范围：
    // 
    // cloud_efficiency：高效云盘
    // cloud_ssd：SSD云盘
    // ephemeral_ssd：本地SSD盘
    // cloud_essd：ESSD云盘
    // cloud：普通云盘
    // I/O优化实例的默认值为cloud_efficiency，非I/O优化实例的默认值为cloud。
    @NameInMap("data_disk_category")
    public String dataDiskCategory;

    // 数据盘的容量大小，n的取值范围为1~16，内存单位为GiB。取值范围：
    // 
    // cloud_efficiency：20~32768
    // cloud_ssd：20~32768
    // cloud_essd：20~32768
    // ephemeral_ssd：5~800
    // cloud：5~2000
    // 该参数的取值必须大于等于参数SnapshotId指定的快照的大小。
    @NameInMap("data_disk_size")
    public Long dataDiskSize;

    // 实例的描述信息
    @NameInMap("description")
    public String description;

    // 云服务器的主机名。
    // 
    // 点号（.）和短横线（-）不能作为首尾字符，更不能连续使用。
    // Windows实例：字符长度为2~15，不支持点号（.），不能全是数字。允许大小写英文字母、数字和短横线（-）。
    // 其他类型实例（Linux等）：字符长度为2~64，支持多个点号（.），点之间为一段，每段允许大小写英文字母、数字和短横线（-）。
    @NameInMap("host_name")
    @Validation(required = true)
    public String hostName;

    // 镜像文件ID，启动实例时选择的镜像资源。
    @NameInMap("image_id")
    @Validation(required = true)
    public String imageId;

    // 实例的资源规格。
    @NameInMap("instance_type")
    @Validation(required = true)
    public String instanceType;

    // 实例的密码。长度为8至30个字符，必须同时包含大小写英文字母、数字和特殊符号中的三类字符。
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // 实例所属的地域ID。
    @NameInMap("region_id")
    @Validation(required = true)
    public String regionId;

    // 系统盘的云盘种类。取值范围：
    // 
    // cloud_efficiency：高效云盘
    // cloud_ssd：SSD云盘
    // cloud：普通云盘
    @NameInMap("system_disk_category")
    @Validation(required = true)
    public String systemDiskCategory;

    // 系统盘大小，单位为GiB。取值范围：20~500
    // 
    // 该参数的取值必须大于或者等于max{20, ImageSize}。
    @NameInMap("system_disk_size")
    @Validation(required = true)
    public Long systemDiskSize;

    public static CreateResourceComputerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceComputerRequest self = new CreateResourceComputerRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceComputerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateResourceComputerRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public CreateResourceComputerRequest setDataDiskCategory(String dataDiskCategory) {
        this.dataDiskCategory = dataDiskCategory;
        return this;
    }
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    public CreateResourceComputerRequest setDataDiskSize(Long dataDiskSize) {
        this.dataDiskSize = dataDiskSize;
        return this;
    }
    public Long getDataDiskSize() {
        return this.dataDiskSize;
    }

    public CreateResourceComputerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateResourceComputerRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public CreateResourceComputerRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateResourceComputerRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateResourceComputerRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateResourceComputerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateResourceComputerRequest setSystemDiskCategory(String systemDiskCategory) {
        this.systemDiskCategory = systemDiskCategory;
        return this;
    }
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    public CreateResourceComputerRequest setSystemDiskSize(Long systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Long getSystemDiskSize() {
        return this.systemDiskSize;
    }

}
