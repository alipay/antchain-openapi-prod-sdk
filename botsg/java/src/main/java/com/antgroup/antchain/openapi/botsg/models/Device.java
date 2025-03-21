// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.botsg.models;

import com.aliyun.tea.*;

public class Device extends TeaModel {
    // 设备ID，一般是设备的出厂编码或业务上的资产ID
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 	
    // 物模型事件ID
    @NameInMap("device_data_model_id")
    @Validation(required = true)
    public String deviceDataModelId;

    // 场景码
    // 
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // imei号
    @NameInMap("device_imei")
    @Validation(required = true)
    public String deviceImei;

    // 设备名称
    @NameInMap("device_name")
    public String deviceName;

    // 设备厂商名称
    @NameInMap("corp_name")
    public String corpName;

    // 设备ICCID
    @NameInMap("device_iccid")
    public String deviceIccid;

    // 设备扩展信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 设备类型编码
    @NameInMap("device_type_code")
    @Validation(required = true)
    public String deviceTypeCode;

    // 单价
    @NameInMap("initial_price")
    @Validation(required = true)
    public Long initialPrice;

    // 投放时间
    @NameInMap("release_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String releaseTime;

    // 出厂时间
    @NameInMap("factory_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String factoryTime;

    // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
    @NameInMap("device_status")
    public String deviceStatus;

    // 可信设备ID
    @NameInMap("trustiot_device_id")
    @Validation(required = true)
    public Long trustiotDeviceId;

    // 设备链上Id
    // 
    @NameInMap("chain_device_id")
    public String chainDeviceId;

    // 上链哈希
    // 
    @NameInMap("tx_hash")
    public String txHash;

    // 上链时间
    // 
    @NameInMap("tx_time")
    public Long txTime;

    public static Device build(java.util.Map<String, ?> map) throws Exception {
        Device self = new Device();
        return TeaModel.build(map, self);
    }

    public Device setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public Device setDeviceDataModelId(String deviceDataModelId) {
        this.deviceDataModelId = deviceDataModelId;
        return this;
    }
    public String getDeviceDataModelId() {
        return this.deviceDataModelId;
    }

    public Device setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public Device setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

    public Device setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public Device setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public Device setDeviceIccid(String deviceIccid) {
        this.deviceIccid = deviceIccid;
        return this;
    }
    public String getDeviceIccid() {
        return this.deviceIccid;
    }

    public Device setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public Device setDeviceTypeCode(String deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public String getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public Device setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public Device setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public Device setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public Device setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public Device setTrustiotDeviceId(Long trustiotDeviceId) {
        this.trustiotDeviceId = trustiotDeviceId;
        return this;
    }
    public Long getTrustiotDeviceId() {
        return this.trustiotDeviceId;
    }

    public Device setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public Device setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public Device setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

}
