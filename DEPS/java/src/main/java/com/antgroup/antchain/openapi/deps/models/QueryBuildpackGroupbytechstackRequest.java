// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackGroupbytechstackRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static QueryBuildpackGroupbytechstackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackGroupbytechstackRequest self = new QueryBuildpackGroupbytechstackRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackGroupbytechstackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
