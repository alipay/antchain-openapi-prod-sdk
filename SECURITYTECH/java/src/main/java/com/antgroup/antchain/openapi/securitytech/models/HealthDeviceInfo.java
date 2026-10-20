// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class HealthDeviceInfo extends TeaModel {
    // 品牌方渠道标识
    /**
     * <strong>example:</strong>
     * <p>YIHU</p>
     */
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    // 设备唯一id
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("tuid")
    public String tuid;

    // 设备sn号
    @NameInMap("sn")
    public String sn;

    // 设备类型 WATCH-手表
    /**
     * <strong>example:</strong>
     * <p>WATCH</p>
     */
    @NameInMap("device_type")
    public String deviceType;

    // 设备型号
    @NameInMap("device_model")
    public String deviceModel;

    // 设备名称
    /**
     * <strong>example:</strong>
     * <p>爸爸的手表</p>
     */
    @NameInMap("device_name")
    public String deviceName;

    // 设备状态：0-未激活 1-在线 2-离线
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Long status;

    // 电量百分比（0~100）
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("battery")
    public Long battery;

    // 佩戴状态：true-已佩戴 false-未佩戴
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("wear")
    public Boolean wear;

    // 预留可扩展字段json
    @NameInMap("extra_info")
    public String extraInfo;

    public static HealthDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
        HealthDeviceInfo self = new HealthDeviceInfo();
        return TeaModel.build(map, self);
    }

    public HealthDeviceInfo setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public HealthDeviceInfo setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public HealthDeviceInfo setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public HealthDeviceInfo setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public HealthDeviceInfo setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public HealthDeviceInfo setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public HealthDeviceInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public HealthDeviceInfo setBattery(Long battery) {
        this.battery = battery;
        return this;
    }
    public Long getBattery() {
        return this.battery;
    }

    public HealthDeviceInfo setWear(Boolean wear) {
        this.wear = wear;
        return this;
    }
    public Boolean getWear() {
        return this.wear;
    }

    public HealthDeviceInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
