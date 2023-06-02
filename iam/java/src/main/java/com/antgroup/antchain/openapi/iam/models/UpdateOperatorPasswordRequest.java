// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class UpdateOperatorPasswordRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 登录名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 加密过的新密码值，使用AccessSecret进行3DES加密
    @NameInMap("new_encrypted_password")
    @Validation(required = true)
    public String newEncryptedPassword;

    // 加密过的旧密码值，使用AccessSecret进行DES加密
    @NameInMap("old_encrypted_password")
    @Validation(required = true)
    public String oldEncryptedPassword;

    public static UpdateOperatorPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperatorPasswordRequest self = new UpdateOperatorPasswordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOperatorPasswordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateOperatorPasswordRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public UpdateOperatorPasswordRequest setNewEncryptedPassword(String newEncryptedPassword) {
        this.newEncryptedPassword = newEncryptedPassword;
        return this;
    }
    public String getNewEncryptedPassword() {
        return this.newEncryptedPassword;
    }

    public UpdateOperatorPasswordRequest setOldEncryptedPassword(String oldEncryptedPassword) {
        this.oldEncryptedPassword = oldEncryptedPassword;
        return this;
    }
    public String getOldEncryptedPassword() {
        return this.oldEncryptedPassword;
    }

}
