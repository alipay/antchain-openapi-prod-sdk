// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ReplaceDistributedeviceBychainperipheralidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发行外围设备Id
    // 
    // 
    @NameInMap("distribute_device_id")
    @Validation(required = true)
    public String distributeDeviceId;

    // 链上外围设备ID
    @NameInMap("chain_peripheral_id")
    @Validation(required = true)
    public String chainPeripheralId;

    public static ReplaceDistributedeviceBychainperipheralidRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDistributedeviceBychainperipheralidRequest self = new ReplaceDistributedeviceBychainperipheralidRequest();
        return TeaModel.build(map, self);
    }

    public ReplaceDistributedeviceBychainperipheralidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReplaceDistributedeviceBychainperipheralidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReplaceDistributedeviceBychainperipheralidRequest setDistributeDeviceId(String distributeDeviceId) {
        this.distributeDeviceId = distributeDeviceId;
        return this;
    }
    public String getDistributeDeviceId() {
        return this.distributeDeviceId;
    }

    public ReplaceDistributedeviceBychainperipheralidRequest setChainPeripheralId(String chainPeripheralId) {
        this.chainPeripheralId = chainPeripheralId;
        return this;
    }
    public String getChainPeripheralId() {
        return this.chainPeripheralId;
    }

}
