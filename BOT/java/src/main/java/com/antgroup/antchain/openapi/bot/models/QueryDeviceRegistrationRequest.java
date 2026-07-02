// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDeviceRegistrationRequest extends TeaModel {
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

    // 可信根派生公钥
    @NameInMap("device_public_key")
    @Validation(required = true)
    public String devicePublicKey;

    public static QueryDeviceRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRegistrationRequest self = new QueryDeviceRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRegistrationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceRegistrationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceRegistrationRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public QueryDeviceRegistrationRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryDeviceRegistrationRequest setDevicePublicKey(String devicePublicKey) {
        this.devicePublicKey = devicePublicKey;
        return this;
    }
    public String getDevicePublicKey() {
        return this.devicePublicKey;
    }

}
