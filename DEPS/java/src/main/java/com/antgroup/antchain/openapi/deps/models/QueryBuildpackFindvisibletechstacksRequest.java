// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindvisibletechstacksRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static QueryBuildpackFindvisibletechstacksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindvisibletechstacksRequest self = new QueryBuildpackFindvisibletechstacksRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindvisibletechstacksRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
