// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDistributedeviceBychainperipheralidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上外围设备Id
    // 
    @NameInMap("chain_peripheral_id")
    @Validation(required = true)
    public String chainPeripheralId;

    public static CreateDistributedeviceBychainperipheralidRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDistributedeviceBychainperipheralidRequest self = new CreateDistributedeviceBychainperipheralidRequest();
        return TeaModel.build(map, self);
    }

    public CreateDistributedeviceBychainperipheralidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDistributedeviceBychainperipheralidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDistributedeviceBychainperipheralidRequest setChainPeripheralId(String chainPeripheralId) {
        this.chainPeripheralId = chainPeripheralId;
        return this;
    }
    public String getChainPeripheralId() {
        return this.chainPeripheralId;
    }

}
