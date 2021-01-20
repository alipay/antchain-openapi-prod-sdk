// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryBuildpackFindosbycurrentcloudRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static QueryBuildpackFindosbycurrentcloudRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackFindosbycurrentcloudRequest self = new QueryBuildpackFindosbycurrentcloudRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackFindosbycurrentcloudRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
