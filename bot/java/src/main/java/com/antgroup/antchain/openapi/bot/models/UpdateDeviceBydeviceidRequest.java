// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateDeviceBydeviceidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备ID
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 设备imei号
    @NameInMap("device_imei")
    public String deviceImei;

    // 设备数据模型Id
    @NameInMap("data_model_id")
    public String dataModelId;

    // 设备ICCID
    @NameInMap("device_iccid")
    public String deviceIccid;

    // 设备类型码
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

    // 设备型号
    @NameInMap("device_name")
    public String deviceName;

    // 拓展信息
    @NameInMap("extra_info")
    public String extraInfo;

    // 资产所有人标识（统一社会信用代码）
    @NameInMap("owner")
    public String owner;

    // 资产所有人名称
    @NameInMap("owner_name")
    public String ownerName;

    public static UpdateDeviceBydeviceidRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceBydeviceidRequest self = new UpdateDeviceBydeviceidRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceBydeviceidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDeviceBydeviceidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDeviceBydeviceidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateDeviceBydeviceidRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateDeviceBydeviceidRequest setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

    public UpdateDeviceBydeviceidRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public UpdateDeviceBydeviceidRequest setDeviceIccid(String deviceIccid) {
        this.deviceIccid = deviceIccid;
        return this;
    }
    public String getDeviceIccid() {
        return this.deviceIccid;
    }

    public UpdateDeviceBydeviceidRequest setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public UpdateDeviceBydeviceidRequest setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public UpdateDeviceBydeviceidRequest setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public UpdateDeviceBydeviceidRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

    public UpdateDeviceBydeviceidRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UpdateDeviceBydeviceidRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public UpdateDeviceBydeviceidRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateDeviceBydeviceidRequest setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }
    public String getOwnerName() {
        return this.ownerName;
    }

}
