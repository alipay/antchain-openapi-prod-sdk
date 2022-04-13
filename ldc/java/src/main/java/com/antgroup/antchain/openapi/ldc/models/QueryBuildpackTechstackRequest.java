// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryBuildpackTechstackRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryBuildpackTechstackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBuildpackTechstackRequest self = new QueryBuildpackTechstackRequest();
        return TeaModel.build(map, self);
    }

    public QueryBuildpackTechstackRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
