// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CreateOperatorNormalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 租户唯一标识
    @NameInMap("tenant")
    @Validation(required = true)
    public String tenant;

    // 操作员唯一登录名
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    // 操作员真实姓名
    @NameInMap("real_name")
    @Validation(required = true)
    public String realName;

    // 手机号
    @NameInMap("mobile")
    public String mobile;

    public static CreateOperatorNormalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOperatorNormalRequest self = new CreateOperatorNormalRequest();
        return TeaModel.build(map, self);
    }

    public CreateOperatorNormalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOperatorNormalRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public CreateOperatorNormalRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public CreateOperatorNormalRequest setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public CreateOperatorNormalRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

}
