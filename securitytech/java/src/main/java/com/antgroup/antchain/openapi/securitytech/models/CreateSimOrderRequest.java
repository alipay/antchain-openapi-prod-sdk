// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CreateSimOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备编号
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // sku id
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    // 车辆sn号
    @NameInMap("sn")
    public String sn;

    // 颜色
    @NameInMap("color")
    @Validation(required = true)
    public String color;

    // 登录态token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 扩展信息
    @NameInMap("extra_info")
    public String extraInfo;

    public static CreateSimOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimOrderRequest self = new CreateSimOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSimOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSimOrderRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public CreateSimOrderRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public CreateSimOrderRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public CreateSimOrderRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateSimOrderRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateSimOrderRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
