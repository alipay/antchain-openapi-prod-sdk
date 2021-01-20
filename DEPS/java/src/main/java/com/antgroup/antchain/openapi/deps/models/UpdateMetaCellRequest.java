// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateMetaCellRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // request
    @NameInMap("request")
    public String request;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static UpdateMetaCellRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCellRequest self = new UpdateMetaCellRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMetaCellRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public UpdateMetaCellRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
