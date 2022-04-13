// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class CreateSpannerClusterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 容器的CPU个数(Core)
    @NameInMap("container_cpu")
    @Validation(required = true)
    public Long containerCpu;

    // 容器是否独占CPU
    @NameInMap("container_cpu_exclusive")
    @Validation(required = true)
    public Boolean containerCpuExclusive;

    // 容器所在的物理机节点标签
    @NameInMap("container_device_type")
    @Validation(required = true)
    public String containerDeviceType;

    // 容器的磁盘大小(G)
    @NameInMap("container_disk")
    @Validation(required = true)
    public Long containerDisk;

    // 容器的内存大小（G）
    @NameInMap("container_mem")
    @Validation(required = true)
    public Long containerMem;

    // 容器网络
    @NameInMap("container_network")
    @Validation(required = true)
    public String containerNetwork;

    // 集群名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 集群单元类型，默认为 0 : 
    // 0 - 容器
    @NameInMap("unit_type")
    public Long unitType;

    // 工作空间组
    @NameInMap("workspace_group")
    @Validation(required = true)
    public String workspaceGroup;

    // 集群网络类型，internet/intranet/multidomain/office
    @NameInMap("address_type")
    @Validation(required = true)
    public String addressType;

    public static CreateSpannerClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpannerClusterRequest self = new CreateSpannerClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpannerClusterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSpannerClusterRequest setContainerCpu(Long containerCpu) {
        this.containerCpu = containerCpu;
        return this;
    }
    public Long getContainerCpu() {
        return this.containerCpu;
    }

    public CreateSpannerClusterRequest setContainerCpuExclusive(Boolean containerCpuExclusive) {
        this.containerCpuExclusive = containerCpuExclusive;
        return this;
    }
    public Boolean getContainerCpuExclusive() {
        return this.containerCpuExclusive;
    }

    public CreateSpannerClusterRequest setContainerDeviceType(String containerDeviceType) {
        this.containerDeviceType = containerDeviceType;
        return this;
    }
    public String getContainerDeviceType() {
        return this.containerDeviceType;
    }

    public CreateSpannerClusterRequest setContainerDisk(Long containerDisk) {
        this.containerDisk = containerDisk;
        return this;
    }
    public Long getContainerDisk() {
        return this.containerDisk;
    }

    public CreateSpannerClusterRequest setContainerMem(Long containerMem) {
        this.containerMem = containerMem;
        return this;
    }
    public Long getContainerMem() {
        return this.containerMem;
    }

    public CreateSpannerClusterRequest setContainerNetwork(String containerNetwork) {
        this.containerNetwork = containerNetwork;
        return this;
    }
    public String getContainerNetwork() {
        return this.containerNetwork;
    }

    public CreateSpannerClusterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSpannerClusterRequest setUnitType(Long unitType) {
        this.unitType = unitType;
        return this;
    }
    public Long getUnitType() {
        return this.unitType;
    }

    public CreateSpannerClusterRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateSpannerClusterRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

}
