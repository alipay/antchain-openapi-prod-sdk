// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateAcsDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备ID
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 场景码-对应acs iot管控后台项目code
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备类型编码-对应acs iot管控后台设备类型编码
    @NameInMap("class_code")
    @Validation(required = true)
    public String classCode;

    // 设备注册信息
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 设备注册信息 签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    // 设备名称
    @NameInMap("device_name")
    @Validation(required = true)
    public String deviceName;

    // 设备单价 单位：分
    @NameInMap("initial_price")
    public Long initialPrice;

    // 设备出厂时间
    @NameInMap("factory_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String factoryTime;

    // 设备投放时间
    @NameInMap("release_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String releaseTime;

    public static CreateAcsDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAcsDeviceRequest self = new CreateAcsDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAcsDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAcsDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAcsDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateAcsDeviceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateAcsDeviceRequest setClassCode(String classCode) {
        this.classCode = classCode;
        return this;
    }
    public String getClassCode() {
        return this.classCode;
    }

    public CreateAcsDeviceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateAcsDeviceRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateAcsDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateAcsDeviceRequest setInitialPrice(Long initialPrice) {
        this.initialPrice = initialPrice;
        return this;
    }
    public Long getInitialPrice() {
        return this.initialPrice;
    }

    public CreateAcsDeviceRequest setFactoryTime(String factoryTime) {
        this.factoryTime = factoryTime;
        return this;
    }
    public String getFactoryTime() {
        return this.factoryTime;
    }

    public CreateAcsDeviceRequest setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public String getReleaseTime() {
        return this.releaseTime;
    }

}
