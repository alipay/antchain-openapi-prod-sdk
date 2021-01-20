// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindwritabletechstacksRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static QueryBuildpackFindwritabletechstacksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindwritabletechstacksRequest self = new QueryBuildpackFindwritabletechstacksRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindwritabletechstacksRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
