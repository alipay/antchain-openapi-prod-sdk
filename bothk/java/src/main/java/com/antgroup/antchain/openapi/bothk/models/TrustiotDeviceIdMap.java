// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class TrustiotDeviceIdMap extends TeaModel {
    // 可信设备ID
    @NameInMap("trustiot_device_id")
    @Validation(required = true)
    public Long trustiotDeviceId;

    // 设备ID
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 设备注册的上链哈希
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    public static TrustiotDeviceIdMap build(java.util.Map<String, ?> map) throws Exception {
        TrustiotDeviceIdMap self = new TrustiotDeviceIdMap();
        return TeaModel.build(map, self);
    }

    public TrustiotDeviceIdMap setTrustiotDeviceId(Long trustiotDeviceId) {
        this.trustiotDeviceId = trustiotDeviceId;
        return this;
    }
    public Long getTrustiotDeviceId() {
        return this.trustiotDeviceId;
    }

    public TrustiotDeviceIdMap setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public TrustiotDeviceIdMap setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

}
