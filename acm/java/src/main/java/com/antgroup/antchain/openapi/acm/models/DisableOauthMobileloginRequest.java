// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class DisableOauthMobileloginRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 三方授权凭证
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    public static DisableOauthMobileloginRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableOauthMobileloginRequest self = new DisableOauthMobileloginRequest();
        return TeaModel.build(map, self);
    }

    public DisableOauthMobileloginRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DisableOauthMobileloginRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
