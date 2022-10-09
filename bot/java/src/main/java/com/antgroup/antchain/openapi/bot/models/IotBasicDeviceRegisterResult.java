// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicDeviceRegisterResult extends TeaModel {
    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备密钥
    @NameInMap("private_key")
    @Validation(required = true)
    public String privateKey;

    // 设备名称
    @NameInMap("device_name")
    @Validation(required = true)
    public String deviceName;

    // 设备sn
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    public static IotBasicDeviceRegisterResult build(java.util.Map<String, ?> map) throws Exception {
        IotBasicDeviceRegisterResult self = new IotBasicDeviceRegisterResult();
        return TeaModel.build(map, self);
    }

    public IotBasicDeviceRegisterResult setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public IotBasicDeviceRegisterResult setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public IotBasicDeviceRegisterResult setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public IotBasicDeviceRegisterResult setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

}
