// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class SpannerClusterInfo extends TeaModel {
    // 容器的CPU个数
    @NameInMap("container_cpu")
    @Validation(required = true)
    public Long containerCpu;

    // 容器是否独占CPU
    @NameInMap("container_cpu_exclusive")
    @Validation(required = true)
    public Boolean containerCpuExclusive;

    // 容器所在物理机节点的标签
    @NameInMap("container_device_type")
    @Validation(required = true)
    public String containerDeviceType;

    // 容器的磁盘大小
    @NameInMap("container_disk")
    @Validation(required = true)
    public Long containerDisk;

    // 容器的内存大小(G)
    @NameInMap("container_mem")
    @Validation(required = true)
    public Long containerMem;

    // 容器网络
    @NameInMap("container_network")
    @Validation(required = true)
    public String containerNetwork;

    // 创建时间
    @NameInMap("created_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createdTime;

    // 扩展属性，json字符串
    @NameInMap("extend_properties")
    public String extendProperties;

    // ID 
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 修改时间
    @NameInMap("modified_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String modifiedTime;

    // 集群名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 集群的状态： 1 运行状态  2 维护状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 集群单元信息
    @NameInMap("unit_infos")
    @Validation(required = true)
    public java.util.List<SpannerClusterUnitInfo> unitInfos;

    // 0 表示集群单元类型为容器
    @NameInMap("unit_type")
    @Validation(required = true)
    public Long unitType;

    // 已使用的端口
    @NameInMap("used_ports")
    public java.util.List<Long> usedPorts;

    // internet/intranet/multidomain/office
    @NameInMap("address_type")
    @Validation(required = true)
    public String addressType;

    public static SpannerClusterInfo build(java.util.Map<String, ?> map) throws Exception {
        SpannerClusterInfo self = new SpannerClusterInfo();
        return TeaModel.build(map, self);
    }

    public SpannerClusterInfo setContainerCpu(Long containerCpu) {
        this.containerCpu = containerCpu;
        return this;
    }
    public Long getContainerCpu() {
        return this.containerCpu;
    }

    public SpannerClusterInfo setContainerCpuExclusive(Boolean containerCpuExclusive) {
        this.containerCpuExclusive = containerCpuExclusive;
        return this;
    }
    public Boolean getContainerCpuExclusive() {
        return this.containerCpuExclusive;
    }

    public SpannerClusterInfo setContainerDeviceType(String containerDeviceType) {
        this.containerDeviceType = containerDeviceType;
        return this;
    }
    public String getContainerDeviceType() {
        return this.containerDeviceType;
    }

    public SpannerClusterInfo setContainerDisk(Long containerDisk) {
        this.containerDisk = containerDisk;
        return this;
    }
    public Long getContainerDisk() {
        return this.containerDisk;
    }

    public SpannerClusterInfo setContainerMem(Long containerMem) {
        this.containerMem = containerMem;
        return this;
    }
    public Long getContainerMem() {
        return this.containerMem;
    }

    public SpannerClusterInfo setContainerNetwork(String containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }
    public String getContainerNetwork() {
        return this.containerNetwork;
    }

    public SpannerClusterInfo setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public SpannerClusterInfo setExtendProperties(String extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }
    public String getExtendProperties() {
        return this.extendProperties;
    }

    public SpannerClusterInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SpannerClusterInfo setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public SpannerClusterInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SpannerClusterInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public SpannerClusterInfo setUnitInfos(java.util.List<SpannerClusterUnitInfo> unitInfos) {
        this.unitInfos = unitInfos;
        return this;
    }
    public java.util.List<SpannerClusterUnitInfo> getUnitInfos() {
        return this.unitInfos;
    }

    public SpannerClusterInfo setUnitType(Long unitType) {
        this.unitType = unitType;
        return this;
    }
    public Long getUnitType() {
        return this.unitType;
    }

    public SpannerClusterInfo setUsedPorts(java.util.List<Long> usedPorts) {
        this.usedPorts = usedPorts;
        return this;
    }
    public java.util.List<Long> getUsedPorts() {
        return this.usedPorts;
    }

    public SpannerClusterInfo setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

}
