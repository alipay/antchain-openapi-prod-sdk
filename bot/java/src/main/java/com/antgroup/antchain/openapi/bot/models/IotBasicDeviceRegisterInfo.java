// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicDeviceRegisterInfo extends TeaModel {
    // 设备规格
    @NameInMap("device_specs")
    @Validation(required = true)
    public String deviceSpecs;

    // 设备型号
    @NameInMap("device_model")
    @Validation(required = true)
    public String deviceModel;

    // 设备名称
    @NameInMap("device_name")
    @Validation(required = true)
    public String deviceName;

    // 设备sn
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备标签
    @NameInMap("nick_name")
    public String nickName;

    // 安装位置
    @NameInMap("location")
    public String location;

    // 设备扩展信息
    @NameInMap("device_ext")
    public String deviceExt;

    // 设备安全认证ID
    @NameInMap("sec_id")
    public String secId;

    public static IotBasicDeviceRegisterInfo build(java.util.Map<String, ?> map) throws Exception {
        IotBasicDeviceRegisterInfo self = new IotBasicDeviceRegisterInfo();
        return TeaModel.build(map, self);
    }

    public IotBasicDeviceRegisterInfo setDeviceSpecs(String deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
        return this;
    }
    public String getDeviceSpecs() {
        return this.deviceSpecs;
    }

    public IotBasicDeviceRegisterInfo setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public IotBasicDeviceRegisterInfo setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public IotBasicDeviceRegisterInfo setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public IotBasicDeviceRegisterInfo setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public IotBasicDeviceRegisterInfo setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public IotBasicDeviceRegisterInfo setDeviceExt(String deviceExt) {
        this.deviceExt = deviceExt;
        return this;
    }
    public String getDeviceExt() {
        return this.deviceExt;
    }

    public IotBasicDeviceRegisterInfo setSecId(String secId) {
        this.secId = secId;
        return this;
    }
    public String getSecId() {
        return this.secId;
    }

}
