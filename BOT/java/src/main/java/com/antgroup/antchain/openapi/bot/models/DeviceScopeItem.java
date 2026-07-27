// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DeviceScopeItem extends TeaModel {
    // 场景码
    /**
     * <strong>example:</strong>
     * <p>SCENE_001</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 客户侧 deviceId 列表
    /**
     * <strong>example:</strong>
     * <p>DEV001</p>
     */
    @NameInMap("device_list")
    @Validation(required = true)
    public java.util.List<String> deviceList;

    public static DeviceScopeItem build(java.util.Map<String, ?> map) throws Exception {
        DeviceScopeItem self = new DeviceScopeItem();
        return TeaModel.build(map, self);
    }

    public DeviceScopeItem setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DeviceScopeItem setDeviceList(java.util.List<String> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<String> getDeviceList() {
        return this.deviceList;
    }

}
