// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceInfos extends TeaModel {
    // tuid
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("tuid")
    public String tuid;

    // 设备状态
    /**
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("device_status")
    public String deviceStatus;

    // ota version
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("device_ota_version")
    public String deviceOtaVersion;

    public static DeviceInfos build(java.util.Map<String, ?> map) throws Exception {
        DeviceInfos self = new DeviceInfos();
        return TeaModel.build(map, self);
    }

    public DeviceInfos setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public DeviceInfos setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public DeviceInfos setDeviceOtaVersion(String deviceOtaVersion) {
        this.deviceOtaVersion = deviceOtaVersion;
        return this;
    }
    public String getDeviceOtaVersion() {
        return this.deviceOtaVersion;
    }

}
