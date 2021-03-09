// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class LbCluster extends TeaModel {
    // container_cpu
    @NameInMap("container_cpu")
    public Long containerCpu;

    // container_cpu_exclusive
    @NameInMap("container_cpu_exclusive")
    public Boolean containerCpuExclusive;

    // container_device_type
    @NameInMap("container_device_type")
    public String containerDeviceType;

    // container_disk
    @NameInMap("container_disk")
    public Long containerDisk;

    // container_mem
    @NameInMap("container_mem")
    public Long containerMem;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // image
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    // name
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // status
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // unit_infos
    @NameInMap("unit_infos")
    public java.util.List<AcsClusterUnit> unitInfos;

    // unit_type
    @NameInMap("unit_type")
    public Long unitType;

    // used_ports
    @NameInMap("used_ports")
    public java.util.List<Long> usedPorts;

    public static LbCluster build(java.util.Map<String, ?> map) throws Exception {
        LbCluster self = new LbCluster();
        return TeaModel.build(map, self);
    }

    public LbCluster setContainerCpu(Long containerCpu) {
        this.containerCpu = containerCpu;
        return this;
    }
    public Long getContainerCpu() {
        return this.containerCpu;
    }

    public LbCluster setContainerCpuExclusive(Boolean containerCpuExclusive) {
        this.containerCpuExclusive = containerCpuExclusive;
        return this;
    }
    public Boolean getContainerCpuExclusive() {
        return this.containerCpuExclusive;
    }

    public LbCluster setContainerDeviceType(String containerDeviceType) {
        this.containerDeviceType = containerDeviceType;
        return this;
    }
    public String getContainerDeviceType() {
        return this.containerDeviceType;
    }

    public LbCluster setContainerDisk(Long containerDisk) {
        this.containerDisk = containerDisk;
        return this;
    }
    public Long getContainerDisk() {
        return this.containerDisk;
    }

    public LbCluster setContainerMem(Long containerMem) {
        this.containerMem = containerMem;
        return this;
    }
    public Long getContainerMem() {
        return this.containerMem;
    }

    public LbCluster setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LbCluster setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public LbCluster setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LbCluster setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public LbCluster setUnitInfos(java.util.List<AcsClusterUnit> unitInfos) {
        this.unitInfos = unitInfos;
        return this;
    }
    public java.util.List<AcsClusterUnit> getUnitInfos() {
        return this.unitInfos;
    }

    public LbCluster setUnitType(Long unitType) {
        this.unitType = unitType;
        return this;
    }
    public Long getUnitType() {
        return this.unitType;
    }

    public LbCluster setUsedPorts(java.util.List<Long> usedPorts) {
        this.usedPorts = usedPorts;
        return this;
    }
    public java.util.List<Long> getUsedPorts() {
        return this.usedPorts;
    }

}
