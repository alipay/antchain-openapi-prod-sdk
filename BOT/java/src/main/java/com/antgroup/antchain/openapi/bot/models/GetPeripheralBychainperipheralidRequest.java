// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetPeripheralBychainperipheralidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链上外围设备Id
    @NameInMap("chain_peripheral_id")
    @Validation(required = true)
    public String chainPeripheralId;

    public static GetPeripheralBychainperipheralidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPeripheralBychainperipheralidRequest self = new GetPeripheralBychainperipheralidRequest();
        return TeaModel.build(map, self);
    }

    public GetPeripheralBychainperipheralidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetPeripheralBychainperipheralidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetPeripheralBychainperipheralidRequest setChainPeripheralId(String chainPeripheralId) {
        this.chainPeripheralId = chainPeripheralId;
        return this;
    }
    public String getChainPeripheralId() {
        return this.chainPeripheralId;
    }

}
