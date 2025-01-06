// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class RegByDeviceIdParm extends TeaModel {
    // 一般是业务上唯一的设备ID/资产编码
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 物模型事件ID
    @NameInMap("device_data_model_id")
    public String deviceDataModelId;

    // 固定填写RAW_DATA
    @NameInMap("device_feature")
    public String deviceFeature;

    // true : 设备ID已存在时返回存在的设备关联字段; false : 设备ID已存在时直接抛出异常；
    @NameInMap("with_exist_device_id")
    public Boolean withExistDeviceId;

    // 设备类型编码，联系蚂蚁侧获取设备类型编码
    @NameInMap("device_type_code")
    @Validation(required = true)
    public Long deviceTypeCode;

    // 设备单价 单位：分
    @NameInMap("initial_price")
    public Long initialPrice;

    // 出厂时间
    @NameInMap("factory_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String factoryTime;

    // 投放时间
    @NameInMap("release_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String releaseTime;

    // 额外信息，联系蚂蚁侧获取参数格式
    @NameInMap("extra_info")
    public String extraInfo;

    // 资产所有人标识（统一社会信用代码）
    @NameInMap("owner")
    public String owner;

    // 资产所有人名称
    @NameInMap("owner_name")
    public String ownerName;

    // 设备IMEI
    @NameInMap("device_imei")
    public String deviceImei;

    // 设备名称/设备型号
    @NameInMap("device_name")
    public String deviceName;

    // 生产厂商名
    @NameInMap("corp_name")
    public String corpName;

    public static RegByDeviceIdParm build(java.util.Map<String, ?> map) throws Exception {
        RegByDeviceIdParm self = new RegByDeviceIdParm();
        return TeaModel.build(map, self);
    }

    public RegByDeviceIdParm setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RegByDeviceIdParm setDeviceDataModelId(String deviceDataModelId) {
        this.deviceDataModelId = deviceDataModelId;
        return this;
    }
    public String getDeviceDataModelId() {
        return this.deviceDataModelId;
    }

    public RegByDeviceIdParm setDeviceFeature(String deviceFeature) {
        this.deviceFeature = deviceFeature;
        return this;
    }
    public String getDeviceFeature() {
        return this.deviceFeature;
    }

    public RegByDeviceIdParm setWithExistDeviceId(Boolean withExistDeviceId) {
        this.withExistDeviceId = withExistDeviceId;
        return this;
    }
    public Boolean getWithExistDeviceId() {
        return this.withExistDeviceId;
    }

    public RegByDeviceIdParm setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public RegByDeviceIdParm setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public RegByDeviceIdParm setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public RegByDeviceIdParm setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public RegByDeviceIdParm setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RegByDeviceIdParm setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public RegByDeviceIdParm setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public RegByDeviceIdParm setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

    public RegByDeviceIdParm setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RegByDeviceIdParm setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
