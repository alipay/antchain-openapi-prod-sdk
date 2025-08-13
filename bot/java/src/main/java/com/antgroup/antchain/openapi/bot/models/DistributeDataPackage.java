// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DistributeDataPackage extends TeaModel {
    // 原始数据
    @NameInMap("data_list")
    @Validation(required = true)
    public java.util.List<RawData> dataList;

    // 发行设备Id
    /**
     * <strong>example:</strong>
     * <p>244</p>
     */
    @NameInMap("distribute_device_id")
    @Validation(required = true)
    public String distributeDeviceId;

    // 打包时间
    @NameInMap("package_time")
    @Validation(required = true)
    public Long packageTime;

    public static DistributeDataPackage build(java.util.Map<String, ?> map) throws Exception {
        DistributeDataPackage self = new DistributeDataPackage();
        return TeaModel.build(map, self);
    }

    public DistributeDataPackage setDataList(java.util.List<RawData> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<RawData> getDataList() {
        return this.dataList;
    }

    public DistributeDataPackage setDistributeDeviceId(String distributeDeviceId) {
        this.distributeDeviceId = distributeDeviceId;
        return this;
    }
    public String getDistributeDeviceId() {
        return this.distributeDeviceId;
    }

    public DistributeDataPackage setPackageTime(Long packageTime) {
        this.packageTime = packageTime;
        return this;
    }
    public Long getPackageTime() {
        return this.packageTime;
    }

}
