// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetOauthServiceaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 三方授权凭证
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 服务账号ID
    @NameInMap("service_account_id")
    @Validation(required = true)
    public String serviceAccountId;

    public static GetOauthServiceaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOauthServiceaccountRequest self = new GetOauthServiceaccountRequest();
        return TeaModel.build(map, self);
    }

    public GetOauthServiceaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetOauthServiceaccountRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public GetOauthServiceaccountRequest setServiceAccountId(String serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
        return this;
    }
    public String getServiceAccountId() {
        return this.serviceAccountId;
    }

}
