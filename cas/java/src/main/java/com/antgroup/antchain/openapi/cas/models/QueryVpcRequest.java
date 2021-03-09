// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryVpcRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // vpc id
    @NameInMap("id")
    public String id;

    // workspace name
    @NameInMap("workspace")
    public String workspace;

    public static QueryVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryVpcRequest self = new QueryVpcRequest();
        return TeaModel.build(map, self);
    }

    public QueryVpcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryVpcRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryVpcRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
