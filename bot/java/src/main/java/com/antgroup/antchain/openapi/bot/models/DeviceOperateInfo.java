// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceOperateInfo extends TeaModel {
    // 蚂蚁链iot平台设备ID
    /**
     * <strong>example:</strong>
     * <p>213</p>
     */
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备签名
    /**
     * <strong>example:</strong>
     * <p>sua8e</p>
     */
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static DeviceOperateInfo build(java.util.Map<String, ?> map) throws Exception {
        DeviceOperateInfo self = new DeviceOperateInfo();
        return TeaModel.build(map, self);
    }

    public DeviceOperateInfo setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public DeviceOperateInfo setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
