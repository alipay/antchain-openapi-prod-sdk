// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateUserRegisterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 默认登录名称
    @NameInMap("login_id")
    @Validation(required = true)
    public String loginId;

    // 用户邮箱
    @NameInMap("email")
    public String email;

    // 用户手机号码
    @NameInMap("telphone")
    public String telphone;

    // 云蚂侧用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public Long userId;

    // 来源 ： 1 APP注册，2 PC注册，3 后台添加
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static CreateUserRegisterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRegisterRequest self = new CreateUserRegisterRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRegisterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUserRegisterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUserRegisterRequest setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public CreateUserRegisterRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRegisterRequest setTelphone(String telphone) {
        this.telphone = telphone;
        return this;
    }
    public String getTelphone() {
        return this.telphone;
    }

    public CreateUserRegisterRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public CreateUserRegisterRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
