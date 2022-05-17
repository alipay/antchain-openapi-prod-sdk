// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitEcsUsageGet extends TeaModel {
    // cpu平均利用率
    @NameInMap("average_cpu")
    @Validation(required = true)
    public Long averageCpu;

    // 内存平均利用率
    @NameInMap("average_mem")
    @Validation(required = true)
    public Long averageMem;

    // 磁盘平均利用率
    @NameInMap("average_disk")
    @Validation(required = true)
    public Long averageDisk;

    public static AppPortraitEcsUsageGet build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitEcsUsageGet self = new AppPortraitEcsUsageGet();
        return TeaModel.build(map, self);
    }

    public AppPortraitEcsUsageGet setAverageCpu(Long averageCpu) {
        this.averageCpu = averageCpu;
        return this;
    }
    public Long getAverageCpu() {
        return this.averageCpu;
    }

    public AppPortraitEcsUsageGet setAverageMem(Long averageMem) {
        this.averageMem = averageMem;
        return this;
    }
    public Long getAverageMem() {
        return this.averageMem;
    }

    public AppPortraitEcsUsageGet setAverageDisk(Long averageDisk) {
        this.averageDisk = averageDisk;
        return this;
    }
    public Long getAverageDisk() {
        return this.averageDisk;
    }

}
