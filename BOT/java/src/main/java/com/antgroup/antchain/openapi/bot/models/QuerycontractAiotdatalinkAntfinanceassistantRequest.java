// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QuerycontractAiotdatalinkAntfinanceassistantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝用户UID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static QuerycontractAiotdatalinkAntfinanceassistantRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerycontractAiotdatalinkAntfinanceassistantRequest self = new QuerycontractAiotdatalinkAntfinanceassistantRequest();
        return TeaModel.build(map, self);
    }

    public QuerycontractAiotdatalinkAntfinanceassistantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerycontractAiotdatalinkAntfinanceassistantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerycontractAiotdatalinkAntfinanceassistantRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
