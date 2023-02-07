// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class AppPortraitEcsUsageGet extends TeaModel {
    // cpu平均利用率
    @NameInMap("average_cpu")
    @Validation(required = true)
    public String averageCpu;

    // 内存平均利用率
    @NameInMap("average_mem")
    @Validation(required = true)
    public String averageMem;

    // 磁盘平均利用率
    @NameInMap("average_disk")
    @Validation(required = true)
    public String averageDisk;

    // 建议1：xxxxx
    @NameInMap("tips")
    @Validation(required = true)
    public String tips;

    public static AppPortraitEcsUsageGet build(java.util.Map<String, ?> map) throws Exception {
        AppPortraitEcsUsageGet self = new AppPortraitEcsUsageGet();
        return TeaModel.build(map, self);
    }

    public AppPortraitEcsUsageGet setAverageCpu(String averageCpu) {
        this.averageCpu = averageCpu;
        return this;
    }
    public String getAverageCpu() {
        return this.averageCpu;
    }

    public AppPortraitEcsUsageGet setAverageMem(String averageMem) {
        this.averageMem = averageMem;
        return this;
    }
    public String getAverageMem() {
        return this.averageMem;
    }

    public AppPortraitEcsUsageGet setAverageDisk(String averageDisk) {
        this.averageDisk = averageDisk;
        return this;
    }
    public String getAverageDisk() {
        return this.averageDisk;
    }

    public AppPortraitEcsUsageGet setTips(String tips) {
        this.tips = tips;
        return this;
    }
    public String getTips() {
        return this.tips;
    }

}
