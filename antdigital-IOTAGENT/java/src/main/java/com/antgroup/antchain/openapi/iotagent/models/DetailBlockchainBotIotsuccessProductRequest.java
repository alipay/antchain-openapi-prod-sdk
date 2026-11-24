// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class DetailBlockchainBotIotsuccessProductRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("product_key")
    @Validation(required = true)
    public String productKey;

    public static DetailBlockchainBotIotsuccessProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailBlockchainBotIotsuccessProductRequest self = new DetailBlockchainBotIotsuccessProductRequest();
        return TeaModel.build(map, self);
    }

    public DetailBlockchainBotIotsuccessProductRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailBlockchainBotIotsuccessProductRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailBlockchainBotIotsuccessProductRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
