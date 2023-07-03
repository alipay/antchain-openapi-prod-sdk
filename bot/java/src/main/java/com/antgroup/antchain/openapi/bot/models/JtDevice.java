// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class JtDevice extends TeaModel {
    // 设备ID
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 可信设备ID
    @NameInMap("trustiot_device_id")
    @Validation(required = true)
    public Long trustiotDeviceId;

    // 设备注册时间
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 设备是否在线
    @NameInMap("online")
    @Validation(required = true)
    public Boolean online;

    // 设备型号
    @NameInMap("device_model")
    public String deviceModel;

    public static JtDevice build(java.util.Map<String, ?> map) throws Exception {
        JtDevice self = new JtDevice();
        return TeaModel.build(map, self);
    }

    public JtDevice setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public JtDevice setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public JtDevice setTrustiotDeviceId(Long trustiotDeviceId) {
        this.trustiotDeviceId = trustiotDeviceId;
        return this;
    }
    public Long getTrustiotDeviceId() {
        return this.trustiotDeviceId;
    }

    public JtDevice setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public JtDevice setOnline(Boolean online) {
        this.online = online;
        return this;
    }
    public Boolean getOnline() {
        return this.online;
    }

    public JtDevice setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

}
