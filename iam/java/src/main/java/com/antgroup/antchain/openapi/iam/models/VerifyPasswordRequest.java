// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class VerifyPasswordRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 加密过的密码值，使用AccessSecret进行3DES加密
    @NameInMap("encrypted_password")
    @Validation(required = true)
    public String encryptedPassword;

    // 登录名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    public static VerifyPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyPasswordRequest self = new VerifyPasswordRequest();
        return TeaModel.build(map, self);
    }

    public VerifyPasswordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyPasswordRequest setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public VerifyPasswordRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
