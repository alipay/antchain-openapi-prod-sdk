// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDeviceBychainidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上设备Id
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    public static GetDeviceBychainidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBychainidRequest self = new GetDeviceBychainidRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceBychainidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDeviceBychainidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDeviceBychainidRequest setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

}
