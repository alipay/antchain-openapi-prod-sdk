// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetMfaStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static GetMfaStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMfaStatusRequest self = new GetMfaStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetMfaStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetMfaStatusRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
