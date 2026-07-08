// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class DeviceInfo extends TeaModel {
    // 设备指纹
    /**
     * <strong>example:</strong>
     * <p>eYOIkkL8SJv0Vr6YxZqaLQ/deHNIc00rQr8zp8Upj6djHBW9oC9RJcdG</p>
     */
    @NameInMap("device_fingerprint")
    public String deviceFingerprint;

    // 设备制造商
    /**
     * <strong>example:</strong>
     * <p>xiaomi</p>
     */
    @NameInMap("device_brand")
    public String deviceBrand;

    // 设备具体型号
    /**
     * <strong>example:</strong>
     * <p>2210132C</p>
     */
    @NameInMap("device_model")
    public String deviceModel;

    // 操作系统类型
    /**
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("os")
    public String os;

    // 操作系统版本
    /**
     * <strong>example:</strong>
     * <p>android 16</p>
     */
    @NameInMap("os_version")
    public String osVersion;

    // 设备rom版本
    /**
     * <strong>example:</strong>
     * <p>3.0.3.0.WMBCNXM</p>
     */
    @NameInMap("rom_model")
    public String romModel;

    // 设备硬盘信息
    /**
     * <strong>example:</strong>
     * <p>246455967744</p>
     */
    @NameInMap("hard_disk")
    public String hardDisk;

    // 内存容量
    /**
     * <strong>example:</strong>
     * <p>7603436</p>
     */
    @NameInMap("memory")
    public String memory;

    // 设备网络ip
    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("camera_info")
    public String cameraInfo;

    // 网关入口ip
    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("gateway_ip")
    public String gatewayIp;

    public static DeviceInfo build(java.util.Map<String, ?> map) throws Exception {
        DeviceInfo self = new DeviceInfo();
        return TeaModel.build(map, self);
    }

    public DeviceInfo setDeviceFingerprint(String deviceFingerprint) {
        this.deviceFingerprint = deviceFingerprint;
        return this;
    }
    public String getDeviceFingerprint() {
        return this.deviceFingerprint;
    }

    public DeviceInfo setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    public DeviceInfo setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public DeviceInfo setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DeviceInfo setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public DeviceInfo setRomModel(String romModel) {
        this.romModel = romModel;
        return this;
    }
    public String getRomModel() {
        return this.romModel;
    }

    public DeviceInfo setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }
    public String getHardDisk() {
        return this.hardDisk;
    }

    public DeviceInfo setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public DeviceInfo setCameraInfo(String cameraInfo) {
        this.cameraInfo = cameraInfo;
        return this;
    }
    public String getCameraInfo() {
        return this.cameraInfo;
    }

    public DeviceInfo setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
        return this;
    }
    public String getGatewayIp() {
        return this.gatewayIp;
    }

}
