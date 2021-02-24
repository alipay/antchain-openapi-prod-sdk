// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CreateRbbUserRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户邮箱，非必填
    @NameInMap("email")
    @Validation(maxLength = 128, minLength = 3)
    public String email;

    // 用户姓名、真实名称，不要求全局唯一
    @NameInMap("full_name")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String fullName;

    // 用户密码
    @NameInMap("password")
    @Validation(required = true, maxLength = 200, minLength = 8)
    public String password;

    // 用户电话号码，非必填
    @NameInMap("phone")
    @Validation(maxLength = 64, minLength = 4)
    public String phone;

    // 用户所属租户编码
    @NameInMap("tenant_code")
    @Validation(maxLength = 64, minLength = 2)
    public String tenantCode;

    // 用户名，必须全局唯一
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户属性扩展字段，json格式，可以为空
    @NameInMap("user_property_json")
    public String userPropertyJson;

    public static CreateRbbUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRbbUserRequest self = new CreateRbbUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateRbbUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRbbUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRbbUserRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateRbbUserRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public CreateRbbUserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateRbbUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateRbbUserRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public CreateRbbUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateRbbUserRequest setUserPropertyJson(String userPropertyJson) {
        this.userPropertyJson = userPropertyJson;
        return this;
    }
    public String getUserPropertyJson() {
        return this.userPropertyJson;
    }

}
