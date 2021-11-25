// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CreateUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 登录名称
    @NameInMap("login_id")
    public String loginId;

    // 非登录账号无需密码
    @NameInMap("password")
    public String password;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 用户类型
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 用户名称
    @NameInMap("user_name")
    public String userName;

    // 手机号码
    @NameInMap("telphone")
    public String telphone;

    // 用户邮箱
    @NameInMap("email")
    public String email;

    // 创建者,一般是C创建B类账号。非提其他主体创建，可以不传
    @NameInMap("creator_user_id")
    public Long creatorUserId;

    public static CreateUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserRequest self = new CreateUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUserRequest setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public CreateUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public CreateUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateUserRequest setTelphone(String telphone) {
        this.telphone = telphone;
        return this;
    }
    public String getTelphone() {
        return this.telphone;
    }

    public CreateUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateUserRequest setCreatorUserId(Long creatorUserId) {
        this.creatorUserId = creatorUserId;
        return this;
    }
    public Long getCreatorUserId() {
        return this.creatorUserId;
    }

}
