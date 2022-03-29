// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class CreateSofamqAdminuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 登录名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 用户密码
    @NameInMap("password")
    @Validation(required = true)
    public String password;

    // 用户类型
    @NameInMap("user_type")
    @Validation(required = true)
    public Long userType;

    public static CreateSofamqAdminuserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSofamqAdminuserRequest self = new CreateSofamqAdminuserRequest();
        return TeaModel.build(map, self);
    }

    public CreateSofamqAdminuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateSofamqAdminuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateSofamqAdminuserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateSofamqAdminuserRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateSofamqAdminuserRequest setUserType(Long userType) {
        this.userType = userType;
        return this;
    }
    public Long getUserType() {
        return this.userType;
    }

}
