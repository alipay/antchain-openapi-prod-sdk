// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bothk.models;

import com.aliyun.tea.*;

public class RegByDeviceParm extends TeaModel {
    // 一般是业务上唯一的设备ID/资产编码
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 物模型事件ID
    @NameInMap("device_data_model_id")
    public String deviceDataModelId;

    // 设备端经过蚂蚁SDK或模组初始化得到的注册信息
    @NameInMap("device_reg_content")
    @Validation(required = true)
    public String deviceRegContent;

    // 蚂蚁侧SDK或模组对device_reg_content的签名
    @NameInMap("device_reg_signature")
    @Validation(required = true)
    public String deviceRegSignature;

    // sdk版本号，由蚂蚁侧提供
    @NameInMap("sdk_id")
    @Validation(required = true)
    public String sdkId;

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

    // 设备名称/型号
    @NameInMap("device_name")
    public String deviceName;

    // 设备IMEI
    @NameInMap("device_imei")
    public String deviceImei;

    public static RegByDeviceParm build(java.util.Map<String, ?> map) throws Exception {
        RegByDeviceParm self = new RegByDeviceParm();
        return TeaModel.build(map, self);
    }

    public RegByDeviceParm setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RegByDeviceParm setDeviceDataModelId(String deviceDataModelId) {
        this.deviceDataModelId = deviceDataModelId;
        return this;
    }
    public String getDeviceDataModelId() {
        return this.deviceDataModelId;
    }

    public RegByDeviceParm setDeviceRegContent(String deviceRegContent) {
        this.deviceRegContent = deviceRegContent;
        return this;
    }
    public String getDeviceRegContent() {
        return this.deviceRegContent;
    }

    public RegByDeviceParm setDeviceRegSignature(String deviceRegSignature) {
        this.deviceRegSignature = deviceRegSignature;
        return this;
    }
    public String getDeviceRegSignature() {
        return this.deviceRegSignature;
    }

    public RegByDeviceParm setSdkId(String sdkId) {
        this.sdkId = sdkId;
        return this;
    }
    public String getSdkId() {
        return this.sdkId;
    }

    public RegByDeviceParm setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public RegByDeviceParm setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public RegByDeviceParm setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public RegByDeviceParm setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public RegByDeviceParm setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public RegByDeviceParm setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public RegByDeviceParm setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

    public RegByDeviceParm setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RegByDeviceParm setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

}
