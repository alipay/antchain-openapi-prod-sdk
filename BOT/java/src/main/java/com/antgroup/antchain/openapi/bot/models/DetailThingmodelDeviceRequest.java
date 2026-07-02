// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class DetailThingmodelDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 设备ID（当device_imei号为空时，会根据scene+device_id查询设备记录，获取device_imei）
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 设备imei号
    @NameInMap("device_imei")
    public String deviceImei;

    public static DetailThingmodelDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailThingmodelDeviceRequest self = new DetailThingmodelDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DetailThingmodelDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailThingmodelDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailThingmodelDeviceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DetailThingmodelDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DetailThingmodelDeviceRequest setDeviceImei(String deviceImei) {
        this.deviceImei = deviceImei;
        return this;
    }
    public String getDeviceImei() {
        return this.deviceImei;
    }

}
