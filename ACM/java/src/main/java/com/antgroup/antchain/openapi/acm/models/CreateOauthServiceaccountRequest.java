// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateOauthServiceaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 三方授权凭证
    @NameInMap("access_token")
    @Validation(required = true)
    public String accessToken;

    // 服务账号描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 服务账号别名
    @NameInMap("alias")
    @Validation(required = true)
    public String alias;

    public static CreateOauthServiceaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOauthServiceaccountRequest self = new CreateOauthServiceaccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateOauthServiceaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOauthServiceaccountRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateOauthServiceaccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOauthServiceaccountRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

}
