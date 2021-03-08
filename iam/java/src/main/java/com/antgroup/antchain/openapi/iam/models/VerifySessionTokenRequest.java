// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class VerifySessionTokenRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // token值
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static VerifySessionTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySessionTokenRequest self = new VerifySessionTokenRequest();
        return TeaModel.build(map, self);
    }

    public VerifySessionTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifySessionTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
