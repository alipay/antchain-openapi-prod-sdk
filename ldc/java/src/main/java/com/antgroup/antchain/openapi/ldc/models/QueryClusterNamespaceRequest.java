// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class QueryClusterNamespaceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    public static QueryClusterNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterNamespaceRequest self = new QueryClusterNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterNamespaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
