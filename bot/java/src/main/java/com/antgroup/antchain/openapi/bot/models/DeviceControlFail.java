// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceControlFail extends TeaModel {
    // 设备did
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 操作失败code
    /**
     * <strong>example:</strong>
     * <p>bad_param</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 操作失败信息
    /**
     * <strong>example:</strong>
     * <p>参数错误</p>
     */
    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static DeviceControlFail build(java.util.Map<String, ?> map) throws Exception {
        DeviceControlFail self = new DeviceControlFail();
        return TeaModel.build(map, self);
    }

    public DeviceControlFail setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public DeviceControlFail setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeviceControlFail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
