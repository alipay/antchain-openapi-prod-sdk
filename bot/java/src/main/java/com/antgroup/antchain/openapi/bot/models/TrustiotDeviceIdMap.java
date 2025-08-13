// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TrustiotDeviceIdMap extends TeaModel {
    // 可信设备ID
    /**
     * <strong>example:</strong>
     * <p>7006413673662394390</p>
     */
    @NameInMap("trustiot_device_id")
    @Validation(required = true)
    public Long trustiotDeviceId;

    // 设备ID	
    /**
     * <strong>example:</strong>
     * <p>1122</p>
     */
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 设备注册的上链哈希
    /**
     * <strong>example:</strong>
     * <p>ba9de337190b017ea6255bffa226ea5ed91cbb03babb42e5a35d652ca30cdce1</p>
     */
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
