// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CheckLoginnameRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 邮箱名称
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    public static CheckLoginnameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLoginnameRequest self = new CheckLoginnameRequest();
        return TeaModel.build(map, self);
    }

    public CheckLoginnameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckLoginnameRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
