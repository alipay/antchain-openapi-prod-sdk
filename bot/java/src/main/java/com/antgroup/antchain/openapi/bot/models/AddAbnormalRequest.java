// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AddAbnormalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备Id，由接入方提供，场景内唯一 
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 场景号
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 异常类型编码KEY_NOT_FOUND、DEVICE_ID_MISMATCH 等
    @NameInMap("abnormal_code")
    @Validation(required = true)
    public String abnormalCode;

    public static AddAbnormalRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAbnormalRequest self = new AddAbnormalRequest();
        return TeaModel.build(map, self);
    }

    public AddAbnormalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAbnormalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddAbnormalRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public AddAbnormalRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public AddAbnormalRequest setAbnormalCode(String abnormalCode) {
        this.abnormalCode = abnormalCode;
        return this;
    }
    public String getAbnormalCode() {
        return this.abnormalCode;
    }

}
