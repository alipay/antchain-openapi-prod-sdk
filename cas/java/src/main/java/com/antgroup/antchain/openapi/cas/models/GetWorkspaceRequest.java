// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetWorkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static GetWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceRequest self = new GetWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetWorkspaceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
