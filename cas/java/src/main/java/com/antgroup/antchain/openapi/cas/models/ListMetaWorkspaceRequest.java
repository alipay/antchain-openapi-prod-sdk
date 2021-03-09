// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListMetaWorkspaceRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    public static ListMetaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaWorkspaceRequest self = new ListMetaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaWorkspaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

}
