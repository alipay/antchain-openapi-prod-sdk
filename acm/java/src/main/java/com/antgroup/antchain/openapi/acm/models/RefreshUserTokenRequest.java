// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class RefreshUserTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 登录凭证
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    public static RefreshUserTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshUserTokenRequest self = new RefreshUserTokenRequest();
        return TeaModel.build(map, self);
    }

    public RefreshUserTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefreshUserTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
