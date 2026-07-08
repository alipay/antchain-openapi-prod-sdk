// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class DeviceRiskInfo extends TeaModel {
    // 设备是否root
    @NameInMap("is_device_rooted")
    public Boolean isDeviceRooted;

    // 设备是否hook
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_device_hooked")
    public Boolean isDeviceHooked;

    // 设备是否使用定制rom
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_custom_rom")
    public Boolean isCustomRom;

    // 设备是否是云手机
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_cloud_phone")
    public Boolean isCloudPhone;

    // 是否为模拟器
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_emulator")
    public Boolean isEmulator;

    // 设备是否支持虚拟摄像头
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("has_virtual_camera")
    public Boolean hasVirtualCamera;

    // 设备是否使用虚拟摄像头
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_using_virtual_camera")
    public Boolean isUsingVirtualCamera;

    // 设备是否有重打包风险
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("has_repack_risk")
    public Boolean hasRepackRisk;

    // 设备是否多开
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_multi_instance")
    public Boolean isMultiInstance;

    // 设备是否开启虚拟定位
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_fake_location")
    public Boolean isFakeLocation;

    // 有其他注入行为
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("has_other_injection")
    public Boolean hasOtherInjection;

    // 设备是否有其他自动化工具
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("has_atuomation_tools")
    public Boolean hasAtuomationTools;

    // 风险sdk的JSON格式数据
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("risk_sdk_json")
    public String riskSdkJson;

    public static DeviceRiskInfo build(java.util.Map<String, ?> map) throws Exception {
        DeviceRiskInfo self = new DeviceRiskInfo();
        return TeaModel.build(map, self);
    }

    public DeviceRiskInfo setIsDeviceRooted(Boolean isDeviceRooted) {
        this.isDeviceRooted = isDeviceRooted;
        return this;
    }
    public Boolean getIsDeviceRooted() {
        return this.isDeviceRooted;
    }

    public DeviceRiskInfo setIsDeviceHooked(Boolean isDeviceHooked) {
        this.isDeviceHooked = isDeviceHooked;
        return this;
    }
    public Boolean getIsDeviceHooked() {
        return this.isDeviceHooked;
    }

    public DeviceRiskInfo setIsCustomRom(Boolean isCustomRom) {
        this.isCustomRom = isCustomRom;
        return this;
    }
    public Boolean getIsCustomRom() {
        return this.isCustomRom;
    }

    public DeviceRiskInfo setIsCloudPhone(Boolean isCloudPhone) {
        this.isCloudPhone = isCloudPhone;
        return this;
    }
    public Boolean getIsCloudPhone() {
        return this.isCloudPhone;
    }

    public DeviceRiskInfo setIsEmulator(Boolean isEmulator) {
        this.isEmulator = isEmulator;
        return this;
    }
    public Boolean getIsEmulator() {
        return this.isEmulator;
    }

    public DeviceRiskInfo setHasVirtualCamera(Boolean hasVirtualCamera) {
        this.hasVirtualCamera = hasVirtualCamera;
        return this;
    }
    public Boolean getHasVirtualCamera() {
        return this.hasVirtualCamera;
    }

    public DeviceRiskInfo setIsUsingVirtualCamera(Boolean isUsingVirtualCamera) {
        this.isUsingVirtualCamera = isUsingVirtualCamera;
        return this;
    }
    public Boolean getIsUsingVirtualCamera() {
        return this.isUsingVirtualCamera;
    }

    public DeviceRiskInfo setHasRepackRisk(Boolean hasRepackRisk) {
        this.hasRepackRisk = hasRepackRisk;
        return this;
    }
    public Boolean getHasRepackRisk() {
        return this.hasRepackRisk;
    }

    public DeviceRiskInfo setIsMultiInstance(Boolean isMultiInstance) {
        this.isMultiInstance = isMultiInstance;
        return this;
    }
    public Boolean getIsMultiInstance() {
        return this.isMultiInstance;
    }

    public DeviceRiskInfo setIsFakeLocation(Boolean isFakeLocation) {
        this.isFakeLocation = isFakeLocation;
        return this;
    }
    public Boolean getIsFakeLocation() {
        return this.isFakeLocation;
    }

    public DeviceRiskInfo setHasOtherInjection(Boolean hasOtherInjection) {
        this.hasOtherInjection = hasOtherInjection;
        return this;
    }
    public Boolean getHasOtherInjection() {
        return this.hasOtherInjection;
    }

    public DeviceRiskInfo setHasAtuomationTools(Boolean hasAtuomationTools) {
        this.hasAtuomationTools = hasAtuomationTools;
        return this;
    }
    public Boolean getHasAtuomationTools() {
        return this.hasAtuomationTools;
    }

    public DeviceRiskInfo setRiskSdkJson(String riskSdkJson) {
        this.riskSdkJson = riskSdkJson;
        return this;
    }
    public String getRiskSdkJson() {
        return this.riskSdkJson;
    }

}
