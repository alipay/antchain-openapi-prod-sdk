// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class QueryDemoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 输入
    @NameInMap("message")
    public String message;

    public static QueryDemoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoRequest self = new QueryDemoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
