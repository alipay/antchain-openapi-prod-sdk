// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryResourcemetaNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // workspace name
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static QueryResourcemetaNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcemetaNodeRequest self = new QueryResourcemetaNodeRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourcemetaNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryResourcemetaNodeRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
