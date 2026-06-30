// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ConfirmSimOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备id
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 登录态token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static ConfirmSimOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSimOrderRequest self = new ConfirmSimOrderRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmSimOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmSimOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmSimOrderRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ConfirmSimOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ConfirmSimOrderRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
