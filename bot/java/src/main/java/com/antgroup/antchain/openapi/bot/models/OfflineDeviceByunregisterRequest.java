// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OfflineDeviceByunregisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通过链上设备ID注销设备
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    public static OfflineDeviceByunregisterRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineDeviceByunregisterRequest self = new OfflineDeviceByunregisterRequest();
        return TeaModel.build(map, self);
    }

    public OfflineDeviceByunregisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OfflineDeviceByunregisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OfflineDeviceByunregisterRequest setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

}
