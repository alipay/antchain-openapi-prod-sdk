// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝用户UID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest build(java.util.Map<String, ?> map) throws Exception {
        SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest self = new SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest();
        return TeaModel.build(map, self);
    }

    public SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
