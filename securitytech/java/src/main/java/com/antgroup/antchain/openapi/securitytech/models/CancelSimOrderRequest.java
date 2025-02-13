// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CancelSimOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备编号
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

    public static CancelSimOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelSimOrderRequest self = new CancelSimOrderRequest();
        return TeaModel.build(map, self);
    }

    public CancelSimOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelSimOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelSimOrderRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CancelSimOrderRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CancelSimOrderRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
