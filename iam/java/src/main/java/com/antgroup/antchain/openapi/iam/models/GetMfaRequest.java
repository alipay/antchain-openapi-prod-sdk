// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetMfaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户 id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static GetMfaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMfaRequest self = new GetMfaRequest();
        return TeaModel.build(map, self);
    }

    public GetMfaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMfaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
