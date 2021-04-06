// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class CheckLoginIdRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 登录id
    @NameInMap("login_name")
    @Validation(required = true)
    public String loginName;

    public static CheckLoginIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLoginIdRequest self = new CheckLoginIdRequest();
        return TeaModel.build(map, self);
    }

    public CheckLoginIdRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckLoginIdRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
