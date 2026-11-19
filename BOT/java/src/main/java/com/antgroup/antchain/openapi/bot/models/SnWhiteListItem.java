// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SnWhiteListItem extends TeaModel {
    // 场景码（APPID)
    /**
     * <strong>example:</strong>
     * <p>TEST-0001</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备 SN
    /**
     * <strong>example:</strong>
     * <p>9912191</p>
     */
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    public static SnWhiteListItem build(java.util.Map<String, ?> map) throws Exception {
        SnWhiteListItem self = new SnWhiteListItem();
        return TeaModel.build(map, self);
    }

    public SnWhiteListItem setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SnWhiteListItem setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
