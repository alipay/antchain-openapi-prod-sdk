// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SigncontractAiotdatalinkAntfinanceassistantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝用户UID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static SigncontractAiotdatalinkAntfinanceassistantRequest build(java.util.Map<String, ?> map) throws Exception {
        SigncontractAiotdatalinkAntfinanceassistantRequest self = new SigncontractAiotdatalinkAntfinanceassistantRequest();
        return TeaModel.build(map, self);
    }

    public SigncontractAiotdatalinkAntfinanceassistantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SigncontractAiotdatalinkAntfinanceassistantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SigncontractAiotdatalinkAntfinanceassistantRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
