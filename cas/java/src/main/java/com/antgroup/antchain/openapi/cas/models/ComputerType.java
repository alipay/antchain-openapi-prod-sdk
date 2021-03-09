// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ComputerType extends TeaModel {
    // cpu core count
    @NameInMap("cpu_core_count")
    public Long cpuCoreCount;

    // instance type id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 实例规格族
    @NameInMap("instance_type_family")
    public String instanceTypeFamily;

    // memory size
    @NameInMap("memory_size")
    public Long memorySize;

    // 实例状态，可能值： Available：资源充足 Sold...
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static ComputerType build(java.util.Map<String, ?> map) throws Exception {
        ComputerType self = new ComputerType();
        return TeaModel.build(map, self);
    }

    public ComputerType setCpuCoreCount(Long cpuCoreCount) {
        this.cpuCoreCount = cpuCoreCount;
        return this;
    }
    public Long getCpuCoreCount() {
        return this.cpuCoreCount;
    }

    public ComputerType setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ComputerType setInstanceTypeFamily(String instanceTypeFamily) {
        this.instanceTypeFamily = instanceTypeFamily;
        return this;
    }
    public String getInstanceTypeFamily() {
        return this.instanceTypeFamily;
    }

    public ComputerType setMemorySize(Long memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Long getMemorySize() {
        return this.memorySize;
    }

    public ComputerType setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
