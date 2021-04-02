// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class Device extends TeaModel {
    // 设备实体唯一Id
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 数据模型Id
    @NameInMap("device_data_model_id")
    @Validation(required = true)
    public String deviceDataModelId;

    // 场景码
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
    // 
    // 
    @NameInMap("device_iccid")
    public String deviceIccid;

    // 设备扩展信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 设备链上Id
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 上链哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 上链时间
    @NameInMap("tx_time")
    @Validation(required = true)
    public Long txTime;

    // 设备类型编码，必填，对应资管平台中的设备类型 
    // 
    // 枚举值：
    // 
    // 车辆 1000 
    // 车辆 四轮车 1001 
    // 车辆 四轮车 纯电四轮车 1002 
    // 车辆 四轮车 混动四轮车 1003 
    // 车辆 四轮车 燃油四轮车 1004 
    // 车辆 两轮车 1011 
    // 车辆 两轮车 两轮单车 1012 
    // 车辆 两轮车 两轮助力车 1013 
    // 
    // 换电柜 2000 
    // 换电柜 二轮车换电柜 2001 
    // 
    // 电池 3000 
    // 电池 磷酸铁电池 3001 
    // 电池 三元锂电池 3002 
    // 
    // 回收设备 4000 
    // 
    // 垃圾分类回收 4001 
    // 
    // 洗车机 5000
    @NameInMap("device_type_code")
    @Validation(required = true)
    public Long deviceTypeCode;

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

    public Device setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
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

}
