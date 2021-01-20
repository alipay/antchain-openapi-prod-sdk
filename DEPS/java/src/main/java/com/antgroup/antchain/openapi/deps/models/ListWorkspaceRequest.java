// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListWorkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static ListWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRequest self = new ListWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
