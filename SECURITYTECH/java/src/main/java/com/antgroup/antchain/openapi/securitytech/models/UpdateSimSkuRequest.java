// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UpdateSimSkuRequest extends TeaModel {
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

    // 更改价格的skuId
    @NameInMap("sku_id")
    @Validation(required = true)
    public String skuId;

    // sku门店价格，单位元
    @NameInMap("store_amount")
    @Validation(required = true)
    public String storeAmount;

    public static UpdateSimSkuRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSimSkuRequest self = new UpdateSimSkuRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSimSkuRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateSimSkuRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateSimSkuRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateSimSkuRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UpdateSimSkuRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public UpdateSimSkuRequest setStoreAmount(String storeAmount) {
        this.storeAmount = storeAmount;
        return this;
    }
    public String getStoreAmount() {
        return this.storeAmount;
    }

}
