// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceDisableData extends TeaModel {
    // 设备sn号
    /**
     * <strong>example:</strong>
     * <p>sn123</p>
     */
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 厂商
    /**
     * <strong>example:</strong>
     * <p>telpo</p>
     */
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    public static DeviceDisableData build(java.util.Map<String, ?> map) throws Exception {
        DeviceDisableData self = new DeviceDisableData();
        return TeaModel.build(map, self);
    }

    public DeviceDisableData setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public DeviceDisableData setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
