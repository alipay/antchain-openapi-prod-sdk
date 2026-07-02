// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DistributeDevice extends TeaModel {
    // 链上设备Id  （deviceType=DEVICE 时有值)
    /**
     * <strong>example:</strong>
     * <p>4533</p>
     */
    @NameInMap("chain_device_id")
    public String chainDeviceId;

    // 设备id
    /**
     * <strong>example:</strong>
     * <p>1122</p>
     */
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 发行设备Id
    /**
     * <strong>example:</strong>
     * <p>4455</p>
     */
    @NameInMap("distribute_device_id")
    @Validation(required = true)
    public String distributeDeviceId;

    // 场景码
    /**
     * <strong>example:</strong>
     * <p>SCENE</p>
     */
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备类型 DEVICE : 设备 、PERIPHERAL : 外围设备
    /**
     * <strong>example:</strong>
     * <p>PERIPHERAL</p>
     */
    @NameInMap("device_type")
    @Validation(required = true)
    public String deviceType;

    // 链上外围设备Id（deviceType=PERIPHERAL 时有值)
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("chain_peripheral_id")
    public String chainPeripheralId;

    // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("device_status")
    public String deviceStatus;

    public static DistributeDevice build(java.util.Map<String, ?> map) throws Exception {
        DistributeDevice self = new DistributeDevice();
        return TeaModel.build(map, self);
    }

    public DistributeDevice setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public DistributeDevice setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DistributeDevice setDistributeDeviceId(String distributeDeviceId) {
        this.distributeDeviceId = distributeDeviceId;
        return this;
    }
    public String getDistributeDeviceId() {
        return this.distributeDeviceId;
    }

    public DistributeDevice setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DistributeDevice setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public DistributeDevice setChainPeripheralId(String chainPeripheralId) {
        this.chainPeripheralId = chainPeripheralId;
        return this;
    }
    public String getChainPeripheralId() {
        return this.chainPeripheralId;
    }

    public DistributeDevice setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

}
