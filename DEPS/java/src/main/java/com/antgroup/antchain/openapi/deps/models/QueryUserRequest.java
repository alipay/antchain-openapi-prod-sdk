// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryUserRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 没传递该参数时，返回当前登录用户信息
    @NameInMap("login_name")
    public String loginName;

    public static QueryUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserRequest self = new QueryUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserRequest setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

}
