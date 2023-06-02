// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ResetOperatorPasswordRequest extends TeaModel {
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

    // 登录凭证状态，取值范围：NORMAL, EXPIRED
    // 
    // 默认为 NORMAL，设为 EXPIRED 用户登录时会要求重置密码
    @NameInMap("status")
    public String status;

    public static ResetOperatorPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetOperatorPasswordRequest self = new ResetOperatorPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ResetOperatorPasswordRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ResetOperatorPasswordRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public ResetOperatorPasswordRequest setNewEncryptedPassword(String newEncryptedPassword) {
        this.newEncryptedPassword = newEncryptedPassword;
        return this;
    }
    public String getNewEncryptedPassword() {
        return this.newEncryptedPassword;
    }

    public ResetOperatorPasswordRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
