// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceLocator extends TeaModel {
    // 设备唯一标识定位方式：TUID / TRUST_DEVICE_ID / TRUST_PRODUCT_DEVICE
    /**
     * <strong>example:</strong>
     * <p>TUID</p>
     */
    @NameInMap("locator_type")
    @Validation(required = true)
    public String locatorType;

    // EKYT 全局唯一设备 ID
    /**
     * <strong>example:</strong>
     * <p>FF9999995FF1020260610262F9D641B9</p>
     */
    @NameInMap("tuid")
    public String tuid;

    // 可信物联设备唯一标识
    /**
     * <strong>example:</strong>
     * <p>device_7470008018051342336</p>
     */
    @NameInMap("trust_device_id")
    public String trustDeviceId;

    // 可信物联产品唯一标识
    /**
     * <strong>example:</strong>
     * <p>5C7ku13XSCK1a7AKzR</p>
     */
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 设备名称
    /**
     * <strong>example:</strong>
     * <p>863091061327685</p>
     */
    @NameInMap("device_name")
    public String deviceName;

    public static DeviceLocator build(java.util.Map<String, ?> map) throws Exception {
        DeviceLocator self = new DeviceLocator();
        return TeaModel.build(map, self);
    }

    public DeviceLocator setLocatorType(String locatorType) {
        this.locatorType = locatorType;
        return this;
    }
    public String getLocatorType() {
        return this.locatorType;
    }

    public DeviceLocator setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public DeviceLocator setTrustDeviceId(String trustDeviceId) {
        this.trustDeviceId = trustDeviceId;
        return this;
    }
    public String getTrustDeviceId() {
        return this.trustDeviceId;
    }

    public DeviceLocator setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public DeviceLocator setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
