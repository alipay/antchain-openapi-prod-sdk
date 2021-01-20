// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AddMetaMasterzonerelRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // request
    @NameInMap("request")
    public String request;

    // workspace
    @NameInMap("workspace")
    public String workspace;

    public static AddMetaMasterzonerelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddMetaMasterzonerelRequest self = new AddMetaMasterzonerelRequest();
        return TeaModel.build(map, self);
    }

    public AddMetaMasterzonerelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddMetaMasterzonerelRequest setRequest(String request) {
        this.request = request;
        return this;
    }
    public String getRequest() {
        return this.request;
    }

    public AddMetaMasterzonerelRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
