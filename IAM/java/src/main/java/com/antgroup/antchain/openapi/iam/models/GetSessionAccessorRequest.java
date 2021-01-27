// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetSessionAccessorRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 登录态
    @NameInMap("authorization")
    @Validation(required = true)
    public String authorization;

    // 用户所属租户
    @NameInMap("user_tenant")
    @Validation(required = true)
    public String userTenant;

    public static GetSessionAccessorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSessionAccessorRequest self = new GetSessionAccessorRequest();
        return TeaModel.build(map, self);
    }

    public GetSessionAccessorRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetSessionAccessorRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

    public GetSessionAccessorRequest setUserTenant(String userTenant) {
        this.userTenant = userTenant;
        return this;
    }
    public String getUserTenant() {
        return this.userTenant;
    }

}
