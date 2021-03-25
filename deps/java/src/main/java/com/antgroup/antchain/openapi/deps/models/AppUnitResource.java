// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppUnitResource extends TeaModel {
    // 应用 ID
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 单元id
    @NameInMap("unit_id")
    @Validation(required = true)
    public String unitId;

    // 机器数
    @NameInMap("machine_count")
    @Validation(required = true)
    public Long machineCount;

    // 已挂载机器数
    @NameInMap("mounted_machine_count")
    @Validation(required = true)
    public Long mountedMachineCount;

    // 负载均衡数
    @NameInMap("slb_count")
    @Validation(required = true)
    public Long slbCount;

    // 负载均衡权重
    @NameInMap("slb_weight")
    @Validation(required = true)
    public Long slbWeight;

    public static AppUnitResource build(java.util.Map<String, ?> map) throws Exception {
        AppUnitResource self = new AppUnitResource();
        return TeaModel.build(map, self);
    }

    public AppUnitResource setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppUnitResource setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

    public AppUnitResource setMachineCount(Long machineCount) {
        this.machineCount = machineCount;
        return this;
    }
    public Long getMachineCount() {
        return this.machineCount;
    }

    public AppUnitResource setMountedMachineCount(Long mountedMachineCount) {
        this.mountedMachineCount = mountedMachineCount;
        return this;
    }
    public Long getMountedMachineCount() {
        return this.mountedMachineCount;
    }

    public AppUnitResource setSlbCount(Long slbCount) {
        this.slbCount = slbCount;
        return this;
    }
    public Long getSlbCount() {
        return this.slbCount;
    }

    public AppUnitResource setSlbWeight(Long slbWeight) {
        this.slbWeight = slbWeight;
        return this;
    }
    public Long getSlbWeight() {
        return this.slbWeight;
    }

}
