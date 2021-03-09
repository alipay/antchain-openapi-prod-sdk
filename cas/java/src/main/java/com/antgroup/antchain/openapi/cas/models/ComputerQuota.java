// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ComputerQuota extends TeaModel {
    // cpu shared
    @NameInMap("cpu_shared")
    public Long cpuShared;

    // cpu
    @NameInMap("cpu")
    public Long cpu;

    // memory
    @NameInMap("memory")
    public Long memory;

    // disk
    @NameInMap("disk")
    public Long disk;

    public static ComputerQuota build(java.util.Map<String, ?> map) throws Exception {
        ComputerQuota self = new ComputerQuota();
        return TeaModel.build(map, self);
    }

    public ComputerQuota setCpuShared(Long cpuShared) {
        this.cpuShared = cpuShared;
        return this;
    }
    public Long getCpuShared() {
        return this.cpuShared;
    }

    public ComputerQuota setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public ComputerQuota setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public ComputerQuota setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

}
