// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceIdentity extends TeaModel {
    // EKYT 全局唯一设备 ID
    /**
     * <strong>example:</strong>
     * <p>FF9999995FF1020260610262F9D641B9</p>
     */
    @NameInMap("tuid")
    public String tuid;

    // 可信唯一产品标识
    /**
     * <strong>example:</strong>
     * <p>5C7ku13XSCK1a7AKzR</p>
     */
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 可信唯一设备标识
    /**
     * <strong>example:</strong>
     * <p>device_7480821483460534272</p>
     */
    @NameInMap("trust_device_id")
    public String trustDeviceId;

    // 设备名称
    /**
     * <strong>example:</strong>
     * <p>02:27:06:a6:10:ae</p>
     */
    @NameInMap("device_name")
    public String deviceName;

    public static DeviceIdentity build(java.util.Map<String, ?> map) throws Exception {
        DeviceIdentity self = new DeviceIdentity();
        return TeaModel.build(map, self);
    }

    public DeviceIdentity setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public DeviceIdentity setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public DeviceIdentity setTrustDeviceId(String trustDeviceId) {
        this.trustDeviceId = trustDeviceId;
        return this;
    }
    public String getTrustDeviceId() {
        return this.trustDeviceId;
    }

    public DeviceIdentity setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
