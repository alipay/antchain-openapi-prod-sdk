// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ConfirmSimLoginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备编号
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 登录态token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 登录销售id
    @NameInMap("sales_id")
    @Validation(required = true)
    public String salesId;

    // 选择登录门店id
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 门店品牌id
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    public static ConfirmSimLoginRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmSimLoginRequest self = new ConfirmSimLoginRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmSimLoginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmSimLoginRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ConfirmSimLoginRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ConfirmSimLoginRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ConfirmSimLoginRequest setSalesId(String salesId) {
        this.salesId = salesId;
        return this;
    }
    public String getSalesId() {
        return this.salesId;
    }

    public ConfirmSimLoginRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public ConfirmSimLoginRequest setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

}
