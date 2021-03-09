// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ComputerSpec extends TeaModel {
    // cpu个数
    @NameInMap("cpu")
    public Long cpu;

    // 可以挂载的磁盘类型
    @NameInMap("disk_spec_ids")
    public java.util.List<String> diskSpecIds;

    // 服务器规格名称
    @NameInMap("group")
    @Validation(required = true)
    public String group;

    // 是否有IO优化
    @NameInMap("io_optimized")
    public Boolean ioOptimized;

    // 内存大小
    @NameInMap("memory")
    public Long memory;

    // description
    @NameInMap("description")
    public String description;

    // enable
    @NameInMap("enable")
    public Boolean enable;

    // iaasId
    @NameInMap("iaas_id")
    public String iaasId;

    // COMPUTER_ECS
    @NameInMap("iaas_type")
    public String iaasType;

    // id
    @NameInMap("id")
    public String id;

    // name
    @NameInMap("name")
    public String name;

    // providerId
    @NameInMap("provider_id")
    public String providerId;

    public static ComputerSpec build(java.util.Map<String, ?> map) throws Exception {
        ComputerSpec self = new ComputerSpec();
        return TeaModel.build(map, self);
    }

    public ComputerSpec setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public ComputerSpec setDiskSpecIds(java.util.List<String> diskSpecIds) {
        this.diskSpecIds = diskSpecIds;
        return this;
    }
    public java.util.List<String> getDiskSpecIds() {
        return this.diskSpecIds;
    }

    public ComputerSpec setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ComputerSpec setIoOptimized(Boolean ioOptimized) {
        this.ioOptimized = ioOptimized;
        return this;
    }
    public Boolean getIoOptimized() {
        return this.ioOptimized;
    }

    public ComputerSpec setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public ComputerSpec setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ComputerSpec setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ComputerSpec setIaasId(String iaasId) {
        this.iaasId = iaasId;
        return this;
    }
    public String getIaasId() {
        return this.iaasId;
    }

    public ComputerSpec setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public ComputerSpec setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ComputerSpec setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ComputerSpec setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

}
