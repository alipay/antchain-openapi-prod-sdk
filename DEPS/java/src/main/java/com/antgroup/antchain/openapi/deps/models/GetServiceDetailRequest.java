// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class GetServiceDetailRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // id
    @NameInMap("id")
    public String id;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static GetServiceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDetailRequest self = new GetServiceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceDetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetServiceDetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetServiceDetailRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
