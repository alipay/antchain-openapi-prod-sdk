// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ReplaceDistributedeviceBychainidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上设备Id
    @NameInMap("chain_device_id")
    @Validation(required = true)
    public String chainDeviceId;

    // 发行设备Id
    @NameInMap("distribute_device_id")
    @Validation(required = true)
    public String distributeDeviceId;

    public static ReplaceDistributedeviceBychainidRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDistributedeviceBychainidRequest self = new ReplaceDistributedeviceBychainidRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceDistributedeviceBychainidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReplaceDistributedeviceBychainidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReplaceDistributedeviceBychainidRequest setChainDeviceId(String chainDeviceId) {
        this.chainDeviceId = chainDeviceId;
        return this;
    }
    public String getChainDeviceId() {
        return this.chainDeviceId;
    }

    public ReplaceDistributedeviceBychainidRequest setDistributeDeviceId(String distributeDeviceId) {
        this.distributeDeviceId = distributeDeviceId;
        return this;
    }
    public String getDistributeDeviceId() {
        return this.distributeDeviceId;
    }

}
