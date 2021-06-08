// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备Id
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 数据模型id
    @NameInMap("device_data_model_id")
    @Validation(required = true)
    public String deviceDataModelId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备imei
    @NameInMap("device_imei")
    @Validation(required = true)
    public String deviceImei;

    // 设备名称
    @NameInMap("device_name")
    public String deviceName;

    // 厂商名称
    @NameInMap("corp_name")
    public String corpName;

    // 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
    @NameInMap("device_feature")
    @Validation(required = true)
    public String deviceFeature;

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

    // 设备单价 单位：分
    @NameInMap("initial_price")
    @Validation(required = true)
    public Long initialPrice;

    // 出厂时间
    @NameInMap("factory_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String factoryTime;

    // 投放时间
    @NameInMap("release_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String releaseTime;

    // 设备类型，需要提前约定好
    @NameInMap("device_type_id")
    public String deviceTypeId;

    // 可信根派生公钥
    @NameInMap("device_public_key")
    public String devicePublicKey;

    public static ImportDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportDeviceRequest self = new ImportDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ImportDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ImportDeviceRequest setDeviceDataModelId(String deviceDataModelId) {
        this.deviceDataModelId = deviceDataModelId;
        return this;
    }
    public String getDeviceDataModelId() {
        return this.deviceDataModelId;
    }

    public ImportDeviceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ImportDeviceRequest setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

    public ImportDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ImportDeviceRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ImportDeviceRequest setDeviceFeature(String deviceFeature) {
        this.deviceFeature = deviceFeature;
        return this;
    }
    public String getDeviceFeature() {
        return this.deviceFeature;
    }

    public ImportDeviceRequest setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public ImportDeviceRequest setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public ImportDeviceRequest setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public ImportDeviceRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public ImportDeviceRequest setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
        return this;
    }
    public String getDeviceTypeId() {
        return this.deviceTypeId;
    }

    public ImportDeviceRequest setDevicePublicKey(String devicePublicKey) {
        this.devicePublicKey = devicePublicKey;
        return this;
    }
    public String getDevicePublicKey() {
        return this.devicePublicKey;
    }

}
