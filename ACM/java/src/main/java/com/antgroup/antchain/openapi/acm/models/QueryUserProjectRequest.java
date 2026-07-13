// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryUserProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static QueryUserProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserProjectRequest self = new QueryUserProjectRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryUserProjectRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
