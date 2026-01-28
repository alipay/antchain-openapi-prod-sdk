// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DeviceGeneration extends TeaModel {
    // 设备内部编号，注册设备后获取
    /**
     * <strong>example:</strong>
     * <p>0340340000000707</p>
     */
    @NameInMap("device_no")
    @Validation(required = true)
    public String deviceNo;

    // 逆变器发电量列表
    @NameInMap("inverter_generations")
    @Validation(required = true)
    public java.util.List<InverterGeneration> inverterGenerations;

    public static DeviceGeneration build(java.util.Map<String, ?> map) throws Exception {
        DeviceGeneration self = new DeviceGeneration();
        return TeaModel.build(map, self);
    }

    public DeviceGeneration setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
        return this;
    }
    public String getDeviceNo() {
        return this.deviceNo;
    }

    public DeviceGeneration setInverterGenerations(java.util.List<InverterGeneration> inverterGenerations) {
        this.inverterGenerations = inverterGenerations;
        return this;
    }
    public java.util.List<InverterGeneration> getInverterGenerations() {
        return this.inverterGenerations;
    }

}
