// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateUserTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 登录账号，邮箱
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    public static CreateUserTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserTokenRequest self = new CreateUserTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUserTokenRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateUserTokenRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
