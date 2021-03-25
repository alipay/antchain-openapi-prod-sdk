// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindwritabletechstacksRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

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

    public QueryBuildpackFindwritabletechstacksRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

}
