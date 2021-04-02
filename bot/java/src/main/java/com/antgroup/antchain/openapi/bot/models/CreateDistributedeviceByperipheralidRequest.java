// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceByperipheralidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 厂商名称
    @NameInMap("corp_name")
    public String corpName;

    // 数据模型id
    @NameInMap("peripheral_data_model_id")
    @Validation(required = true)
    public String peripheralDataModelId;

    // 外围设备ID
    @NameInMap("peripheral_id")
    @Validation(required = true)
    public String peripheralId;

    // 外围设备名称
    // 
    @NameInMap("peripheral_name")
    public String peripheralName;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

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

    public static CreateDistributedeviceByperipheralidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceByperipheralidRequest self = new CreateDistributedeviceByperipheralidRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceByperipheralidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributedeviceByperipheralidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributedeviceByperipheralidRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateDistributedeviceByperipheralidRequest setPeripheralDataModelId(String peripheralDataModelId) {
        this.peripheralDataModelId = peripheralDataModelId;
        return this;
    }
    public String getPeripheralDataModelId() {
        return this.peripheralDataModelId;
    }

    public CreateDistributedeviceByperipheralidRequest setPeripheralId(String peripheralId) {
        this.peripheralId = peripheralId;
        return this;
    }
    public String getPeripheralId() {
        return this.peripheralId;
    }

    public CreateDistributedeviceByperipheralidRequest setPeripheralName(String peripheralName) {
        this.peripheralName = peripheralName;
        return this;
    }
    public String getPeripheralName() {
        return this.peripheralName;
    }

    public CreateDistributedeviceByperipheralidRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateDistributedeviceByperipheralidRequest setDeviceTypeCode(Long deviceTypeCode) {
        this.deviceTypeCode = deviceTypeCode;
        return this;
    }
    public Long getDeviceTypeCode() {
        return this.deviceTypeCode;
    }

    public CreateDistributedeviceByperipheralidRequest setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public CreateDistributedeviceByperipheralidRequest setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public CreateDistributedeviceByperipheralidRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

}
