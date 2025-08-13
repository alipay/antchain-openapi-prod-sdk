// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotBasicDeviceRegisterFail extends TeaModel {
    // 设备名称
    /**
     * <strong>example:</strong>
     * <p>12321321</p>
     */
    @NameInMap("device_name")
    @Validation(required = true)
    public String deviceName;

    // 设备sn
    /**
     * <strong>example:</strong>
     * <p>2088xx</p>
     */
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 错误编码
    /**
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 错误描述
    /**
     * <strong>example:</strong>
     * <p>message</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static IotBasicDeviceRegisterFail build(java.util.Map<String, ?> map) throws Exception {
        IotBasicDeviceRegisterFail self = new IotBasicDeviceRegisterFail();
        return TeaModel.build(map, self);
    }

    public IotBasicDeviceRegisterFail setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public IotBasicDeviceRegisterFail setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public IotBasicDeviceRegisterFail setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IotBasicDeviceRegisterFail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
