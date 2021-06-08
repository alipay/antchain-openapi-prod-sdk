// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OnlineDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备链上ID
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    public static OnlineDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        OnlineDeviceRequest self = new OnlineDeviceRequest();
        return TeaModel.build(map, self);
    }

    public OnlineDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OnlineDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OnlineDeviceRequest setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

}
