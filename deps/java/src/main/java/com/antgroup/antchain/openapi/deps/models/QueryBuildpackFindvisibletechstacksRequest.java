// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindvisibletechstacksRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

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

    public QueryBuildpackFindvisibletechstacksRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
