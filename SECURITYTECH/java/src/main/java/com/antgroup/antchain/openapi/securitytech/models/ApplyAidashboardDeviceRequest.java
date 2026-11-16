// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ApplyAidashboardDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ai仪表产品key
    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    // 设备公钥
    @NameInMap("device_pub_key")
    @Validation(required = true)
    public String devicePubKey;

    public static ApplyAidashboardDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAidashboardDeviceRequest self = new ApplyAidashboardDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAidashboardDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyAidashboardDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyAidashboardDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ApplyAidashboardDeviceRequest setDevicePubKey(String devicePubKey) {
        this.devicePubKey = devicePubKey;
        return this;
    }
    public String getDevicePubKey() {
        return this.devicePubKey;
    }

}
