// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetRequestRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    public static GetRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRequestRequest self = new GetRequestRequest();
        return TeaModel.build(map, self);
    }

    public GetRequestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRequestRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public GetRequestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
