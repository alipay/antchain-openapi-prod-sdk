// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class InitMfaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户 id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static InitMfaRequest build(java.util.Map<String, ?> map) throws Exception {
        InitMfaRequest self = new InitMfaRequest();
        return TeaModel.build(map, self);
    }

    public InitMfaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitMfaRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
