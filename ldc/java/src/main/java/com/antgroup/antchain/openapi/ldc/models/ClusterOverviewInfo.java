// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ClusterOverviewInfo extends TeaModel {
    // available cpu core
    @NameInMap("available_c_p_u")
    public Long availableCPU;

    // available disk
    @NameInMap("available_disk")
    public Long availableDisk;

    // available memory
    @NameInMap("available_memory")
    public Long availableMemory;

    // available Node Number
    @NameInMap("available_node_number")
    public Long availableNodeNumber;

    // total cpu core number
    @NameInMap("total_c_p_u")
    public Long totalCPU;

    // total disk
    @NameInMap("total_disk")
    public Long totalDisk;

    // total memory
    @NameInMap("total_memory")
    public Long totalMemory;

    // total node number
    @NameInMap("total_node_number")
    public Long totalNodeNumber;

    public static ClusterOverviewInfo build(java.util.Map<String, ?> map) throws Exception {
        ClusterOverviewInfo self = new ClusterOverviewInfo();
        return TeaModel.build(map, self);
    }

    public ClusterOverviewInfo setAvailableCPU(Long availableCPU) {
        this.availableCPU = availableCPU;
        return this;
    }
    public Long getAvailableCPU() {
        return this.availableCPU;
    }

    public ClusterOverviewInfo setAvailableDisk(Long availableDisk) {
        this.availableDisk = availableDisk;
        return this;
    }
    public Long getAvailableDisk() {
        return this.availableDisk;
    }

    public ClusterOverviewInfo setAvailableMemory(Long availableMemory) {
        this.availableMemory = availableMemory;
        return this;
    }
    public Long getAvailableMemory() {
        return this.availableMemory;
    }

    public ClusterOverviewInfo setAvailableNodeNumber(Long availableNodeNumber) {
        this.availableNodeNumber = availableNodeNumber;
        return this;
    }
    public Long getAvailableNodeNumber() {
        return this.availableNodeNumber;
    }

    public ClusterOverviewInfo setTotalCPU(Long totalCPU) {
        this.totalCPU = totalCPU;
        return this;
    }
    public Long getTotalCPU() {
        return this.totalCPU;
    }

    public ClusterOverviewInfo setTotalDisk(Long totalDisk) {
        this.totalDisk = totalDisk;
        return this;
    }
    public Long getTotalDisk() {
        return this.totalDisk;
    }

    public ClusterOverviewInfo setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Long getTotalMemory() {
        return this.totalMemory;
    }

    public ClusterOverviewInfo setTotalNodeNumber(Long totalNodeNumber) {
        this.totalNodeNumber = totalNodeNumber;
        return this;
    }
    public Long getTotalNodeNumber() {
        return this.totalNodeNumber;
    }

}
