// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceBydeviceidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 厂商名
    @NameInMap("corp_name")
    public String corpName;

    // 数据模型Id
    @NameInMap("device_data_model_id")
    @Validation(required = true)
    public String deviceDataModelId;

    // 设备Id
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 设备imei号
    @NameInMap("device_imei")
    public String deviceImei;

    // 设备名称
    @NameInMap("device_name")
    public String deviceName;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
    @NameInMap("device_feature")
    public String deviceFeature;

    // 当用已发行设备发行时返回已发行id或返回错误
    @NameInMap("with_exist_device_id")
    public Boolean withExistDeviceId;

    // 设备类型编码
    @NameInMap("device_type_code")
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

    // 额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 资产所有人标识（统一社会信用代码）
    @NameInMap("owner")
    public String owner;

    // 资产所有人名称
    @NameInMap("owner_name")
    public String ownerName;

    public static CreateDistributedeviceBydeviceidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceBydeviceidRequest self = new CreateDistributedeviceBydeviceidRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceBydeviceidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributedeviceBydeviceidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributedeviceBydeviceidRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateDistributedeviceBydeviceidRequest setDeviceDataModelId(String deviceDataModelId) {
        this.deviceDataModelId = deviceDataModelId;
        return this;
    }
    public String getDeviceDataModelId() {
        return this.deviceDataModelId;
    }

    public CreateDistributedeviceBydeviceidRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateDistributedeviceBydeviceidRequest setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

    public CreateDistributedeviceBydeviceidRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateDistributedeviceBydeviceidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateDistributedeviceBydeviceidRequest setDeviceFeature(String deviceFeature) {
        this.deviceFeature = deviceFeature;
        return this;
    }
    public String getDeviceFeature() {
        return this.deviceFeature;
    }

    public CreateDistributedeviceBydeviceidRequest setWithExistDeviceId(Boolean withExistDeviceId) {
        this.withExistDeviceId = withExistDeviceId;
        return this;
    }
    public Boolean getWithExistDeviceId() {
        return this.withExistDeviceId;
    }

    public CreateDistributedeviceBydeviceidRequest setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public CreateDistributedeviceBydeviceidRequest setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public CreateDistributedeviceBydeviceidRequest setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public CreateDistributedeviceBydeviceidRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public CreateDistributedeviceBydeviceidRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateDistributedeviceBydeviceidRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateDistributedeviceBydeviceidRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

}
