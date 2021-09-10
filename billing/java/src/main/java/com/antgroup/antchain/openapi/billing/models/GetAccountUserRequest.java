// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.billing.models;

import com.aliyun.tea.*;

public class GetAccountUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // alipay托管子户ID
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    public static GetAccountUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountUserRequest self = new GetAccountUserRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetAccountUserRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

}
