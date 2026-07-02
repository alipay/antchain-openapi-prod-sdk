// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class JtDevice extends TeaModel {
    // 设备ID
    /**
     * <strong>example:</strong>
     * <p>STRING 123ABC</p>
     */
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 场景码
    /**
     * <strong>example:</strong>
     * <p>123ABC</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 可信设备ID
    /**
     * <strong>example:</strong>
     * <p>7006071575276187649</p>
     */
    @NameInMap("trustiot_device_id")
    @Validation(required = true)
    public Long trustiotDeviceId;

    // 设备注册时间
    /**
     * <strong>example:</strong>
     * <p>1686497064968</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public Long gmtCreate;

    // 设备是否在线
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("online")
    @Validation(required = true)
    public Boolean online;

    // 设备型号
    /**
     * <strong>example:</strong>
     * <p>丰图T8</p>
     */
    @NameInMap("device_model")
    public String deviceModel;

    // 终端型号
    /**
     * <strong>example:</strong>
     * <p>型号A</p>
     */
    @NameInMap("terminal_type")
    public String terminalType;

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

    public JtDevice setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
